package ng.okra.api.Balance;

import ng.okra.api.Balance.Requests.BalanceByCustomerDateRequest;
import ng.okra.api.Balance.Requests.BalanceByCustomerRequest;
import ng.okra.api.Balance.Requests.BalanceByDateRequest;
import ng.okra.api.Balance.Requests.BalanceCheckRequest;
import ng.okra.api.Balance.Responses.BalanceMultipleCallbackResponse;
import ng.okra.api.Balance.Responses.BalanceSingleCallbackResponse;
import ng.okra.api.Balance.Responses.FetchBalancesCallbackResponse;

import java.util.concurrent.ExecutionException;

/**
 * The interface Balance api.
 */
public interface IBalanceApi {


    /**
     * Get balance by id balance single callback response.
     *
     * @param id the id
     * @return the balance single callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    BalanceSingleCallbackResponse GetBalanceById(String id) throws ExecutionException, InterruptedException;

    /**
     * Get balance by customer balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    BalanceMultipleCallbackResponse GetBalanceByCustomer(BalanceByCustomerRequest request) throws ExecutionException, InterruptedException;

    /**
     * Refresh balance balance multiple callback response.
     *
     * @param accountId the account id
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    BalanceMultipleCallbackResponse RefreshBalance(String accountId) throws ExecutionException, InterruptedException;

    /**
     * Get balance by customer date balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    BalanceMultipleCallbackResponse GetBalanceByCustomerDate(BalanceByCustomerDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get balance by date balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    BalanceMultipleCallbackResponse GetBalanceByDate(BalanceByDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Check balance balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    BalanceMultipleCallbackResponse CheckBalance(BalanceCheckRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get balances fetch balances callback response.
     *
     * @return the fetch balances callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    FetchBalancesCallbackResponse GetBalances() throws ExecutionException, InterruptedException;
}
