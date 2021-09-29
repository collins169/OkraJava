package ng.okra.api.Payment;

import com.google.gson.Gson;
import ng.okra.api.Common.ApiClient;
import ng.okra.api.Payment.Requests.PaymentCreateLinkRequest;
import ng.okra.api.Payment.Requests.PaymentInitiateRequest;
import ng.okra.api.Payment.Requests.PaymentRequest;
import ng.okra.api.Payment.Responses.PaymentCallbackResponse;
import ng.okra.api.Payment.Responses.PaymentCreateLinkResponse;
import ng.okra.api.Payment.Responses.PaymentInitiateCallbackResponse;

import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

/**
 * The type Payment api.
 */
public class PaymentApi implements IPaymentApi{

    private final ApiClient client;

    /**
     * Instantiates a new Payment api.
     *
     * @param client the client
     */
    public PaymentApi(ApiClient client) {
        this.client = client;
    }


    @Override
    public PaymentCreateLinkResponse CreatePaymentLink(PaymentCreateLinkRequest request) throws ExecutionException, InterruptedException {
        PaymentCreateLinkResponse callbackResponse = new PaymentCreateLinkResponse();
        HttpResponse<String> response = client.Post(request, "/pay/link/create").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), PaymentCreateLinkResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public PaymentInitiateCallbackResponse InitialPayment(PaymentInitiateRequest request) throws ExecutionException, InterruptedException {
        PaymentInitiateCallbackResponse callbackResponse = new PaymentInitiateCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/pay/initiate").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), PaymentInitiateCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public PaymentCallbackResponse VerifyPayment(PaymentRequest request) throws ExecutionException, InterruptedException {
        PaymentCallbackResponse callbackResponse = new PaymentCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/pay/verify").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), PaymentCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public PaymentCallbackResponse GetPayments(PaymentRequest request) throws ExecutionException, InterruptedException {
        PaymentCallbackResponse callbackResponse = new PaymentCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/pay/get").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), PaymentCallbackResponse.class);
        }
        return callbackResponse;
    }

    @Override
    public PaymentCallbackResponse GetPaymentsById(PaymentRequest request) throws ExecutionException, InterruptedException {
        PaymentCallbackResponse callbackResponse = new PaymentCallbackResponse();
        HttpResponse<String> response = client.Post(request, "/pay/get/id").get();
        if(response.statusCode() == 200 || response.statusCode() == 201){
            callbackResponse = new Gson().fromJson(response.body(), PaymentCallbackResponse.class);
        }
        return callbackResponse;
    }
}
