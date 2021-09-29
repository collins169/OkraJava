package ng.okra.api.Auth;

import ng.okra.api.Auth.Requests.*;
import ng.okra.api.Auth.Responses.AuthCallbackResponse;
import ng.okra.api.Auth.Responses.FetchAuthsCallbackResponse;

import java.util.concurrent.ExecutionException;

/**
 * The interface Auth api.
 */
public interface IAuthApi {

    /**
     * Get auth by id auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    AuthCallbackResponse GetAuthById(AuthByIdRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get auth by customer auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    AuthCallbackResponse GetAuthByCustomer(AuthByCustomerRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get auth by date auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    AuthCallbackResponse GetAuthByDate(AuthByDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get auth by bank auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    AuthCallbackResponse GetAuthByBank(AuthByBankRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get auth by customer date auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    AuthCallbackResponse GetAuthByCustomerDate (AuthByCustomerDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Fetch auths fetch auths callback response.
     *
     * @param request the request
     * @return the fetch auths callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    FetchAuthsCallbackResponse FetchAuths(FetchAuthsRequest request) throws ExecutionException, InterruptedException;
}
