package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Payment initiate response data.
 */
public class PaymentInitiateResponseData {
    @SerializedName("payment")
    private Payment payment;
    @SerializedName("okra_wallet")
    private OkraWallet okraWallet;
    @SerializedName("callback_url")
    private String callbackUrl;
    @SerializedName("customer")
    private Customer customer;

    /**
     * Gets payment.
     *
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets payment.
     *
     * @param payment the payment
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     * Gets okra wallet.
     *
     * @return the okra wallet
     */
    public OkraWallet getOkraWallet() {
        return okraWallet;
    }

    /**
     * Sets okra wallet.
     *
     * @param okraWallet the okra wallet
     */
    public void setOkraWallet(OkraWallet okraWallet) {
        this.okraWallet = okraWallet;
    }

    /**
     * Gets callback url.
     *
     * @return the callback url
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets callback url.
     *
     * @param callbackUrl the callback url
     */
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "PaymentInitiateCallbackResponseData{" +
                "payment=" + payment +
                ", okraWallet=" + okraWallet +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", customer=" + customer +
                '}';
    }
}
