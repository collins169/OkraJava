package ng.okra.api.Payment.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Payment initiate request.
 */
public class PaymentInitiateRequest {
    @SerializedName("account_to_debit")
    private String accountToDebit;
    @SerializedName("account_to_credit")
    private String accountToCredit;
    @SerializedName("amount")
    private long amount;
    @SerializedName("currency")
    private String currency;

    /**
     * Gets account to debit.
     *
     * @return the account to debit
     */
    public String getAccountToDebit() {
        return accountToDebit;
    }

    /**
     * Sets account to debit.
     *
     * @param accountToDebit the account to debit
     */
    public void setAccountToDebit(String accountToDebit) {
        this.accountToDebit = accountToDebit;
    }

    /**
     * Gets account to credit.
     *
     * @return the account to credit
     */
    public String getAccountToCredit() {
        return accountToCredit;
    }

    /**
     * Sets account to credit.
     *
     * @param accountToCredit the account to credit
     */
    public void setAccountToCredit(String accountToCredit) {
        this.accountToCredit = accountToCredit;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "PaymentInitiateRequest{" +
                "accountToDebit='" + accountToDebit + '\'' +
                ", accountToCredit='" + accountToCredit + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
