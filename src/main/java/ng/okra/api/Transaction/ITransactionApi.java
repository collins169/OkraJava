package ng.okra.api.Transaction;

import ng.okra.api.Transaction.Requests.*;
import ng.okra.api.Transaction.Responses.TransCallbackResponse;
import ng.okra.api.Transaction.Responses.TransactionCallbackResponse;

import java.util.concurrent.ExecutionException;

/**
 * The interface Transaction api.
 */
public interface ITransactionApi {

    /**
     * Get by id transaction callback response.
     *
     * @param id the id
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    TransactionCallbackResponse GetById (String id) throws ExecutionException, InterruptedException;

    /**
     * Get by customer transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    TransactionCallbackResponse GetByCustomer (TransactionByCustomerRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get by bank transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    TransactionCallbackResponse GetByBank (TransactionByBankRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get by date transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    TransactionCallbackResponse GetByDate (TransactionByDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get by customer date transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    TransactionCallbackResponse GetByCustomerDate (TransactionByCustomerDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get transactions trans callback response.
     *
     * @param request the request
     * @return the trans callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    TransCallbackResponse GetTransactions (TransactionRequest request) throws ExecutionException, InterruptedException;
}
