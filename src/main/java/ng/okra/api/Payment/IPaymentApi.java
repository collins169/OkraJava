package ng.okra.api.Payment;

import ng.okra.api.Payment.Requests.PaymentCreateLinkRequest;
import ng.okra.api.Payment.Requests.PaymentInitiateRequest;
import ng.okra.api.Payment.Requests.PaymentRequest;
import ng.okra.api.Payment.Responses.PaymentCallbackResponse;
import ng.okra.api.Payment.Responses.PaymentCreateLinkResponse;
import ng.okra.api.Payment.Responses.PaymentInitiateCallbackResponse;

import java.util.concurrent.ExecutionException;

/**
 * The interface Payment api.
 */
public interface IPaymentApi {

    /**
     * Create payment link payment create link response.
     *
     * @param request the request
     * @return the payment create link response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    PaymentCreateLinkResponse CreatePaymentLink(PaymentCreateLinkRequest request) throws ExecutionException, InterruptedException;

    /**
     * Initial payment payment initiate callback response.
     *
     * @param request the request
     * @return the payment initiate callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    PaymentInitiateCallbackResponse InitialPayment(PaymentInitiateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Verify payment payment callback response.
     *
     * @param request the request
     * @return the payment callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    PaymentCallbackResponse VerifyPayment(PaymentRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get payments payment callback response.
     *
     * @param request the request
     * @return the payment callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    PaymentCallbackResponse GetPayments(PaymentRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get payments by id payment callback response.
     *
     * @param request the request
     * @return the payment callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    PaymentCallbackResponse GetPaymentsById(PaymentRequest request) throws ExecutionException, InterruptedException;
}
