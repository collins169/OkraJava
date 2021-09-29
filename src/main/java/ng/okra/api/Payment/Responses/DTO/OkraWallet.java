package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Okra wallet.
 */
public class OkraWallet {
    @SerializedName("amount")
    private long amount;
    @SerializedName("currency")
    private String currency;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("id")
    private String id;

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

    /**
     * Gets last updated.
     *
     * @return the last updated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets last updated.
     *
     * @param lastUpdated the last updated
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OkraWallet{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
