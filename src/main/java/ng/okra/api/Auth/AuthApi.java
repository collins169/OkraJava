package ng.okra.api.Auth;

import com.google.gson.Gson;
import ng.okra.api.Auth.Requests.*;
import ng.okra.api.Auth.Responses.AuthCallbackResponse;
import ng.okra.api.Auth.Responses.FetchAuthsCallbackResponse;
import ng.okra.api.Common.ApiClient;

import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

/**
 * The type Auth api.
 */
public class AuthApi implements IAuthApi{

    private final ApiClient client;

    /**
     * Instantiates a new Auth api.
     *
     * @param client the client
     */
    public AuthApi(ApiClient client) {
        this.client = client;
    }

    @Override
    public AuthCallbackResponse GetAuthById(AuthByIdRequest request) throws ExecutionException, InterruptedException {
        AuthCallbackResponse authCallbackResponse = new AuthCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/auth/getById").get();
        if(response.statusCode() == 200){
            authCallbackResponse = new Gson().fromJson(response.body(), AuthCallbackResponse.class);
            return authCallbackResponse;
        }
        return authCallbackResponse;
    }

    @Override
    public AuthCallbackResponse GetAuthByCustomer(AuthByCustomerRequest request) throws ExecutionException, InterruptedException {
        AuthCallbackResponse authCallbackResponse = new AuthCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/auth/getByCustomer").get();
        if(response.statusCode() == 200){
            authCallbackResponse = new Gson().fromJson(response.body(), AuthCallbackResponse.class);
            return authCallbackResponse;
        }
        return authCallbackResponse;
    }

    @Override
    public AuthCallbackResponse GetAuthByDate(AuthByDateRequest request) throws ExecutionException, InterruptedException {
        AuthCallbackResponse authCallbackResponse = new AuthCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/auth/getByDate").get();
        if(response.statusCode() == 200){
            authCallbackResponse = new Gson().fromJson(response.body(), AuthCallbackResponse.class);
            return authCallbackResponse;
        }
        return authCallbackResponse;
    }

    @Override
    public AuthCallbackResponse GetAuthByBank(AuthByBankRequest request) throws ExecutionException, InterruptedException {
        AuthCallbackResponse authCallbackResponse = new AuthCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/auth/getByBank").get();
        if(response.statusCode() == 200){
            authCallbackResponse = new Gson().fromJson(response.body(), AuthCallbackResponse.class);
            return authCallbackResponse;
        }
        return authCallbackResponse;
    }

    @Override
    public AuthCallbackResponse GetAuthByCustomerDate(AuthByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        AuthCallbackResponse authCallbackResponse = new AuthCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/auth/getByCustomerDate").get();
        if(response.statusCode() == 200){
            authCallbackResponse = new Gson().fromJson(response.body(), AuthCallbackResponse.class);
            return authCallbackResponse;
        }
        return authCallbackResponse;
    }

    @Override
    public FetchAuthsCallbackResponse FetchAuths(FetchAuthsRequest request) throws ExecutionException, InterruptedException {
        FetchAuthsCallbackResponse authCallbackResponse = new FetchAuthsCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/products/auths").get();
        if(response.statusCode() == 200){
            authCallbackResponse = new Gson().fromJson(response.body(), FetchAuthsCallbackResponse.class);
            return authCallbackResponse;
        }
        return authCallbackResponse;
    }
}
