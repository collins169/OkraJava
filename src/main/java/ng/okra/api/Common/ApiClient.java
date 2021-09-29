package ng.okra.api.Common;

import com.google.gson.Gson;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * The type Api client.
 */
public class ApiClient {

    private final String token;
    private final String baseUrl;

    /**
     * Instantiates a new Api client.
     *
     * @param token   the token
     * @param baseUrl the base url
     */
    public ApiClient(String token, String baseUrl) {
        this.token = token;
        this.baseUrl = baseUrl;
    }

    /**
     * Format form data string.
     *
     * @param parameters the parameters
     * @return the string
     */
    public String FormatFormData(Map<String, String> parameters){
        return parameters.keySet().stream()
                .map(key -> key + "=" + URLEncoder.encode(parameters.get(key), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));
    }

    /**
     * Post completable future.
     *
     * @param payload the payload
     * @param url     the url
     * @return the completable future
     */
    public CompletableFuture<HttpResponse<String>> Post (Object payload, String url){
        HttpClient client = HttpClient.newHttpClient();
        String model = new Gson().toJson(payload);
        HttpRequest request = HttpRequest.newBuilder(URI.create(baseUrl+url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .POST((model != null) ? HttpRequest.BodyPublishers.ofString(model) : HttpRequest.BodyPublishers.noBody())
                .build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Post no body completable future.
     *
     * @param url the url
     * @return the completable future
     */
    public CompletableFuture<HttpResponse<String>> PostNoBody (String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(baseUrl+url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Post form completable future.
     *
     * @param payload the payload
     * @param url     the url
     * @return the completable future
     */
    public CompletableFuture<HttpResponse<String>> PostForm (String payload, String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(baseUrl+url))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Authorization", "Bearer "+token)
                .POST((payload != null) ? HttpRequest.BodyPublishers.ofString(payload) : HttpRequest.BodyPublishers.noBody())
                .build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }


    /**
     * Get completable future.
     *
     * @param url the url
     * @return the completable future
     */
    public CompletableFuture<HttpResponse<String>> Get (String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(baseUrl+url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .GET().build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Put completable future.
     *
     * @param payload the payload
     * @param url     the url
     * @return the completable future
     */
    public CompletableFuture<HttpResponse<String>> Put (Object payload, String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(baseUrl+url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .PUT(HttpRequest.BodyPublishers.ofString(new Gson().toJson(payload)))
                .build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Delete completable future.
     *
     * @param url the url
     * @return the completable future
     */
    public CompletableFuture<HttpResponse<String>> Delete (String url){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(baseUrl+url))
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+token)
                .DELETE().build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }
}
