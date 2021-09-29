package ng.okra.api.Balance;

import com.google.gson.Gson;
import ng.okra.api.Balance.Requests.BalanceByCustomerDateRequest;
import ng.okra.api.Balance.Requests.BalanceByCustomerRequest;
import ng.okra.api.Balance.Requests.BalanceByDateRequest;
import ng.okra.api.Balance.Requests.BalanceCheckRequest;
import ng.okra.api.Balance.Responses.BalanceMultipleCallbackResponse;
import ng.okra.api.Balance.Responses.BalanceSingleCallbackResponse;
import ng.okra.api.Balance.Responses.FetchBalancesCallbackResponse;
import ng.okra.api.Common.ApiClient;

import java.net.URLEncoder;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

/**
 * The type Balance api.
 */
public class BalanceApi implements IBalanceApi {
    private final ApiClient client;

    /**
     * Instantiates a new Balance api.
     *
     * @param client the client
     */
    public BalanceApi(ApiClient client) {
        this.client = client;
    }

    @Override
    public BalanceSingleCallbackResponse GetBalanceById(String id) throws ExecutionException, InterruptedException {
        BalanceSingleCallbackResponse callbackResponse = new BalanceSingleCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", id);

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/balance/getById").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), BalanceSingleCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public BalanceMultipleCallbackResponse GetBalanceByCustomer(BalanceByCustomerRequest request) throws ExecutionException, InterruptedException {
        BalanceMultipleCallbackResponse callbackResponse = new BalanceMultipleCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("customer", request.getCustomer());
        parameters.put("page", String.valueOf(request.getPage()));
        parameters.put("limit", String.valueOf(request.getLimit()));

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/balance/getByCustomer").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), BalanceMultipleCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public BalanceMultipleCallbackResponse RefreshBalance(String accountId) throws ExecutionException, InterruptedException {
        BalanceMultipleCallbackResponse callbackResponse = new BalanceMultipleCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("account_id", accountId);

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/balance/refresh").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), BalanceMultipleCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public BalanceMultipleCallbackResponse GetBalanceByCustomerDate(BalanceByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        BalanceMultipleCallbackResponse callbackResponse = new BalanceMultipleCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/balance/getByCustomerDate").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), BalanceMultipleCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public BalanceMultipleCallbackResponse GetBalanceByDate(BalanceByDateRequest request) throws ExecutionException, InterruptedException {
        BalanceMultipleCallbackResponse callbackResponse = new BalanceMultipleCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("from", request.getFrom());
        parameters.put("to", request.getTo());
        parameters.put("page", String.valueOf(request.getPage()));
        parameters.put("limit", String.valueOf(request.getLimit()));

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/balance/getByDate").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), BalanceMultipleCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public BalanceMultipleCallbackResponse CheckBalance(BalanceCheckRequest request) throws ExecutionException, InterruptedException {
        BalanceMultipleCallbackResponse callbackResponse = new BalanceMultipleCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("account_id", request.getAccountId());
        parameters.put("record_id", request.getRecordId());

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/balance/check").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), BalanceMultipleCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public FetchBalancesCallbackResponse GetBalances() throws ExecutionException, InterruptedException {
        FetchBalancesCallbackResponse callbackResponse = new FetchBalancesCallbackResponse();

        HttpResponse<String> response = client.PostForm("", "/products/balances").get();
        if(response.statusCode() == 200){
            callbackResponse = new Gson().fromJson(response.body(), FetchBalancesCallbackResponse.class);
        }
        return callbackResponse;
    }
}
