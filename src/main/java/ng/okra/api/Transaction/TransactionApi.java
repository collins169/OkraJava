package ng.okra.api.Transaction;

import com.google.gson.Gson;
import ng.okra.api.Common.ApiClient;
import ng.okra.api.Transaction.Requests.*;
import ng.okra.api.Transaction.Responses.TransCallbackResponse;
import ng.okra.api.Transaction.Responses.TransactionCallbackResponse;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * The type Transaction api.
 */
public class TransactionApi implements ITransactionApi{

    private final ApiClient client;

    /**
     * Instantiates a new Transaction api.
     *
     * @param client the client
     */
    public TransactionApi(ApiClient client) {
        this.client = client;
    }


    /**
     * Get by id transaction callback response.
     *
     * @param id the id
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public TransactionCallbackResponse GetById(String id) throws ExecutionException, InterruptedException {
        TransactionCallbackResponse callbackResponse = new TransactionCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", id);

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/transactions/getById").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), TransactionCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by customer transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public TransactionCallbackResponse GetByCustomer(TransactionByCustomerRequest request) throws ExecutionException, InterruptedException {
        TransactionCallbackResponse callbackResponse = new TransactionCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("customer", request.getCustomer());
        parameters.put("limit", String.valueOf(request.getLimit()));
        parameters.put("page", String.valueOf(request.getPage()));

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/transactions/getByCustomer").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), TransactionCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by bank transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public TransactionCallbackResponse GetByBank(TransactionByBankRequest request) throws ExecutionException, InterruptedException {
        TransactionCallbackResponse callbackResponse = new TransactionCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("bank", request.getBank());
        parameters.put("limit", String.valueOf(request.getLimit()));
        parameters.put("page", String.valueOf(request.getPage()));

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/transactions/getByBank").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), TransactionCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by date transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public TransactionCallbackResponse GetByDate(TransactionByDateRequest request) throws ExecutionException, InterruptedException {
        TransactionCallbackResponse callbackResponse = new TransactionCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("from", request.getFrom());
        parameters.put("to", request.getTo());
        parameters.put("limit", String.valueOf(request.getLimit()));
        parameters.put("page", String.valueOf(request.getPage()));

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/transactions/getByDate").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), TransactionCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by customer date transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public TransactionCallbackResponse GetByCustomerDate(TransactionByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        TransactionCallbackResponse callbackResponse = new TransactionCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("from", request.getFrom());
        parameters.put("customer_id", request.getCustomerId());
        parameters.put("to", request.getTo());
        parameters.put("limit", String.valueOf(request.getLimit()));
        parameters.put("page", String.valueOf(request.getPage()));

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/transactions/getByCustomerDate").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), TransactionCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get transactions trans callback response.
     *
     * @param request the request
     * @return the trans callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public TransCallbackResponse GetTransactions(TransactionRequest request) throws ExecutionException, InterruptedException {
        TransCallbackResponse callbackResponse = new TransCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/products/transactions/get").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), TransCallbackResponse.class);
        }
        return callbackResponse;
    }
}
