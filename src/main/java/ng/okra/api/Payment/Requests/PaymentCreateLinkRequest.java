package ng.okra.api.Payment.Requests;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Payment create link request.
 */
public class PaymentCreateLinkRequest {
    @SerializedName("amount")
    private long amount;
    @SerializedName("name")
    private String name;
    @SerializedName("currency")
    private String currency;
    @SerializedName("note")
    private String note;
    @SerializedName("countries")
    private List<String> countries;
    @SerializedName("account")
    private String account;

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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets note.
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets note.
     *
     * @param note the note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Gets countries.
     *
     * @return the countries
     */
    public List<String> getCountries() {
        return countries;
    }

    /**
     * Sets countries.
     *
     * @param countries the countries
     */
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "PaymentCreateLinkRequest{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", note='" + note + '\'' +
                ", countries=" + countries +
                ", account='" + account + '\'' +
                '}';
    }
}
