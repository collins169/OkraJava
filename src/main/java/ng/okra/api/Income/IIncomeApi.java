package ng.okra.api.Income;

import ng.okra.api.Income.Requests.IncomeByCustomerDateRequest;
import ng.okra.api.Income.Requests.IncomeByCustomerRequest;
import ng.okra.api.Income.Requests.IncomeByDateRequest;
import ng.okra.api.Income.Requests.IncomeRequest;
import ng.okra.api.Income.Responses.IncomeCallbackResponse;

import java.util.concurrent.ExecutionException;

/**
 * The interface Income api.
 */
public interface IIncomeApi {

    /**
     * Get by id income callback response.
     *
     * @param id the id
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    IncomeCallbackResponse GetById(String id) throws ExecutionException, InterruptedException;

    /**
     * Get by customer income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    IncomeCallbackResponse GetByCustomer(IncomeByCustomerRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get by customer date income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    IncomeCallbackResponse GetByCustomerDate(IncomeByCustomerDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get by date income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    IncomeCallbackResponse GetByDate(IncomeByDateRequest request) throws ExecutionException, InterruptedException;

    /**
     * Get incomes income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    IncomeCallbackResponse GetIncomes(IncomeRequest request) throws ExecutionException, InterruptedException;
}
