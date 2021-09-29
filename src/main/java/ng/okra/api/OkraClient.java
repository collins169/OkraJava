package ng.okra.api;

import com.google.gson.Gson;
import ng.okra.api.Auth.AuthApi;
import ng.okra.api.Auth.IAuthApi;
import ng.okra.api.Auth.Requests.*;
import ng.okra.api.Auth.Responses.AuthCallbackResponse;
import ng.okra.api.Auth.Responses.FetchAuthsCallbackResponse;
import ng.okra.api.Balance.BalanceApi;
import ng.okra.api.Balance.Requests.BalanceByCustomerDateRequest;
import ng.okra.api.Balance.Requests.BalanceByCustomerRequest;
import ng.okra.api.Balance.Requests.BalanceByDateRequest;
import ng.okra.api.Balance.Requests.BalanceCheckRequest;
import ng.okra.api.Balance.Responses.BalanceMultipleCallbackResponse;
import ng.okra.api.Balance.Responses.BalanceSingleCallbackResponse;
import ng.okra.api.Balance.Responses.FetchBalancesCallbackResponse;
import ng.okra.api.Common.ApiClient;
import ng.okra.api.Income.IncomeApi;
import ng.okra.api.Income.Requests.IncomeByCustomerDateRequest;
import ng.okra.api.Income.Requests.IncomeByCustomerRequest;
import ng.okra.api.Income.Requests.IncomeByDateRequest;
import ng.okra.api.Income.Requests.IncomeRequest;
import ng.okra.api.Income.Responses.IncomeCallbackResponse;
import ng.okra.api.Payment.PaymentApi;
import ng.okra.api.Payment.Requests.PaymentCreateLinkRequest;
import ng.okra.api.Payment.Requests.PaymentInitiateRequest;
import ng.okra.api.Payment.Requests.PaymentRequest;
import ng.okra.api.Payment.Responses.PaymentCallbackResponse;
import ng.okra.api.Payment.Responses.PaymentCreateLinkResponse;
import ng.okra.api.Payment.Responses.PaymentInitiateCallbackResponse;
import ng.okra.api.Transaction.Requests.*;
import ng.okra.api.Transaction.Responses.TransCallbackResponse;
import ng.okra.api.Transaction.Responses.TransactionCallbackResponse;
import ng.okra.api.Transaction.TransactionApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * The type Okra client.
 */
public class OkraClient {

    private final ApiClient _client;
    private AuthApi authApi;
    private BalanceApi balanceApi;
    private IncomeApi incomeApi;
    private PaymentApi paymentApi;
    private TransactionApi transactionApi;

    /**
     * Instantiates a new Okra client.
     *
     * @param accessToken the access token
     * @param useSandBox  the use sand box
     */
    public OkraClient(String accessToken, boolean useSandBox) {
        if (accessToken.isEmpty())
            throw new NullPointerException("Okra api token cannot be empty");
        String baseUrl = useSandBox ? "https://api.okra.ng/sandbox/v2/" : "https://api.okra.ng/v2/";
        _client = new ApiClient(accessToken, baseUrl);
        InitializeMethods();
    }

    /**
     * Instantiates a new Okra client.
     *
     * @param accessToken the access token
     * @param baseUrl     the base url
     */
    public OkraClient(String accessToken, String baseUrl) {
        _client = new ApiClient(accessToken, baseUrl);
        InitializeMethods();
    }

    /**
     * Initialize methods.
     */
    public void InitializeMethods() {
        this.authApi = new AuthApi(_client);
        this.balanceApi = new BalanceApi(_client);
        this.incomeApi = new IncomeApi(_client);
        this.paymentApi = new PaymentApi(_client);
        this.transactionApi = new TransactionApi(_client);
    }

    /**
     * Get auth by id auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public AuthCallbackResponse GetAuthById(AuthByIdRequest request) throws ExecutionException, InterruptedException {
        return authApi.GetAuthById(request);
    }

    /**
     * Get auth by customer auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public AuthCallbackResponse GetAuthByCustomer(AuthByCustomerRequest request) throws ExecutionException, InterruptedException {
        return authApi.GetAuthByCustomer(request);
    }

    /**
     * Get auth by date auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public AuthCallbackResponse GetAuthByDate(AuthByDateRequest request) throws ExecutionException, InterruptedException {
        return authApi.GetAuthByDate(request);
    }

    /**
     * Get auth by bank auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public AuthCallbackResponse GetAuthByBank(AuthByBankRequest request) throws ExecutionException, InterruptedException {
        return authApi.GetAuthByBank(request);
    }

    /**
     * Get auth by customer date auth callback response.
     *
     * @param request the request
     * @return the auth callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public AuthCallbackResponse GetAuthByCustomerDate(AuthByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        return authApi.GetAuthByCustomerDate(request);
    }

    /**
     * Fetch auths fetch auths callback response.
     *
     * @param request the request
     * @return the fetch auths callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public FetchAuthsCallbackResponse FetchAuths(FetchAuthsRequest request) throws ExecutionException, InterruptedException {
        return authApi.FetchAuths(request);
    }

    /**
     * Get balance by id balance single callback response.
     *
     * @param id the id
     * @return the balance single callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public BalanceSingleCallbackResponse GetBalanceById(String id) throws ExecutionException, InterruptedException {
        return balanceApi.GetBalanceById(id);
    }

    /**
     * Get balance by customer balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public BalanceMultipleCallbackResponse GetBalanceByCustomer(BalanceByCustomerRequest request) throws ExecutionException, InterruptedException {
        return balanceApi.GetBalanceByCustomer(request);
    }

    /**
     * Refresh balance balance multiple callback response.
     *
     * @param accountId the account id
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public BalanceMultipleCallbackResponse RefreshBalance(String accountId) throws ExecutionException, InterruptedException {
        return balanceApi.RefreshBalance(accountId);
    }

    /**
     * Get balance by customer date balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public BalanceMultipleCallbackResponse GetBalanceByCustomerDate(BalanceByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        return balanceApi.GetBalanceByCustomerDate(request);
    }

    /**
     * Get balance by date balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public BalanceMultipleCallbackResponse GetBalanceByDate(BalanceByDateRequest request) throws ExecutionException, InterruptedException {
        return balanceApi.GetBalanceByDate(request);
    }

    /**
     * Check balance balance multiple callback response.
     *
     * @param request the request
     * @return the balance multiple callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public BalanceMultipleCallbackResponse CheckBalance(BalanceCheckRequest request) throws ExecutionException, InterruptedException {
        return balanceApi.CheckBalance(request);
    }

    /**
     * Get balances fetch balances callback response.
     *
     * @return the fetch balances callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public FetchBalancesCallbackResponse GetBalances() throws ExecutionException, InterruptedException {
        return balanceApi.GetBalances();
    }

    /**
     * Get income by id income callback response.
     *
     * @param id the id
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public IncomeCallbackResponse GetIncomeById(String id) throws ExecutionException, InterruptedException {
        return incomeApi.GetById(id);
    }

    /**
     * Get by customer income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public IncomeCallbackResponse GetByCustomer(IncomeByCustomerRequest request) throws ExecutionException, InterruptedException {
        return incomeApi.GetByCustomer(request);
    }

    /**
     * Get by customer date income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public IncomeCallbackResponse GetByCustomerDate(IncomeByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        return incomeApi.GetByCustomerDate(request);
    }

    /**
     * Get by date income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public IncomeCallbackResponse GetByDate(IncomeByDateRequest request) throws ExecutionException, InterruptedException {
        return incomeApi.GetByDate(request);
    }

    /**
     * Get incomes income callback response.
     *
     * @param request the request
     * @return the income callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public IncomeCallbackResponse GetIncomes(IncomeRequest request) throws ExecutionException, InterruptedException {
        return incomeApi.GetIncomes(request);
    }

    /**
     * Create payment link payment create link response.
     *
     * @param request the request
     * @return the payment create link response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public PaymentCreateLinkResponse CreatePaymentLink(PaymentCreateLinkRequest request) throws ExecutionException, InterruptedException {
        return paymentApi.CreatePaymentLink(request);
    }

    /**
     * Initial payment payment initiate callback response.
     *
     * @param request the request
     * @return the payment initiate callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public PaymentInitiateCallbackResponse InitialPayment(PaymentInitiateRequest request) throws ExecutionException, InterruptedException {
        return paymentApi.InitialPayment(request);
    }

    /**
     * Verify payment payment callback response.
     *
     * @param request the request
     * @return the payment callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public PaymentCallbackResponse VerifyPayment(PaymentRequest request) throws ExecutionException, InterruptedException {
        return paymentApi.VerifyPayment(request);
    }

    /**
     * Get payments payment callback response.
     *
     * @param request the request
     * @return the payment callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public PaymentCallbackResponse GetPayments(PaymentRequest request) throws ExecutionException, InterruptedException {
        return paymentApi.GetPayments(request);
    }

    /**
     * Get payments by id payment callback response.
     *
     * @param request the request
     * @return the payment callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public PaymentCallbackResponse GetPaymentsById(PaymentRequest request) throws ExecutionException, InterruptedException {
        return paymentApi.GetPaymentsById(request);
    }

    /**
     * Get transactions by id transaction callback response.
     *
     * @param id the id
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public TransactionCallbackResponse GetTransactionsById(String id) throws ExecutionException, InterruptedException {
        return transactionApi.GetById(id);
    }

    /**
     * Get by customer transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public TransactionCallbackResponse GetByCustomer(TransactionByCustomerRequest request) throws ExecutionException, InterruptedException {
        return transactionApi.GetByCustomer(request);
    }

    /**
     * Get by bank transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public TransactionCallbackResponse GetByBank(TransactionByBankRequest request) throws ExecutionException, InterruptedException {
        return transactionApi.GetByBank(request);
    }

    /**
     * Get by date transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public TransactionCallbackResponse GetByDate(TransactionByDateRequest request) throws ExecutionException, InterruptedException {
        return transactionApi.GetByDate(request);
    }

    /**
     * Get by customer date transaction callback response.
     *
     * @param request the request
     * @return the transaction callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public TransactionCallbackResponse GetByCustomerDate(TransactionByCustomerDateRequest request) throws ExecutionException, InterruptedException {
        return transactionApi.GetByCustomerDate(request);
    }

    /**
     * Get transactions trans callback response.
     *
     * @param request the request
     * @return the trans callback response
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public TransCallbackResponse GetTransactions(TransactionRequest request) throws ExecutionException, InterruptedException {
        return transactionApi.GetTransactions(request);
    }

}
