package ng.okra.api.Income;

import com.google.gson.Gson;
import ng.okra.api.Common.ApiClient;
import ng.okra.api.Income.Requests.IncomeByCustomerDateRequest;
import ng.okra.api.Income.Requests.IncomeByCustomerRequest;
import ng.okra.api.Income.Requests.IncomeByDateRequest;
import ng.okra.api.Income.Requests.IncomeRequest;
import ng.okra.api.Income.Responses.IncomeCallbackResponse;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * The type Income api.
 */
public class IncomeApi implements IIncomeApi{

    private final ApiClient client;

    /**
     * Instantiates a new Income api.
     *
     * @param client the api client
     */
    public IncomeApi(ApiClient client) {
        this.client = client;
    }

    /**
     * Get by id income callback response.
     *
     * @param id the id
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public IncomeCallbackResponse GetById(String id) throws ExecutionException, InterruptedException {
        IncomeCallbackResponse callbackResponse = new IncomeCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("id", id);

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/income/getById").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), IncomeCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by customer income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public IncomeCallbackResponse GetByCustomer(IncomeByCustomerRequest request) throws ExecutionException, InterruptedException {
        IncomeCallbackResponse callbackResponse = new IncomeCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("customer", request.getCustomer());

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/income/getByCustomer").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), IncomeCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by customer date income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public IncomeCallbackResponse GetByCustomerDate(IncomeByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        IncomeCallbackResponse callbackResponse = new IncomeCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("customer", request.getCustomer());
        parameters.put("from", request.getFrom());
        parameters.put("to", request.getTo());

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/income/getByCustomerDate").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), IncomeCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get by date income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public IncomeCallbackResponse GetByDate(IncomeByDateRequest request) throws ExecutionException, InterruptedException {
        IncomeCallbackResponse callbackResponse = new IncomeCallbackResponse();
        Map<String, String> parameters = new HashMap<>();
        parameters.put("from", request.getFrom());
        parameters.put("to", request.getTo());

        String form = client.FormatFormData(parameters);
        HttpResponse<String> response = client.PostForm(form, "/income/getByDate").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), IncomeCallbackResponse.class);
        }
        return callbackResponse;
    }

    /**
     * Get incomes income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    @Override
    public IncomeCallbackResponse GetIncomes(IncomeRequest request) throws ExecutionException, InterruptedException {
        IncomeCallbackResponse callbackResponse = new IncomeCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/products/income/get").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), IncomeCallbackResponse.class);
        }
        return callbackResponse;
    }
}
