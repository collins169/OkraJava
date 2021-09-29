package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Link;

/**
 * The type Payment status.
 */
public class PaymentStatus {
    @SerializedName("_id")
    private String _id;
    @SerializedName("amount")
    private long amount;
    @SerializedName("currency")
    private String currency;
    @SerializedName("customer")
    private String customer;
    @SerializedName("error")
    private Object error;
    @SerializedName("link")
    private Link link;
    @SerializedName("status")
    private String status;
    @SerializedName("response_status")
    private String responseStatus;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String get_id() {
        return _id;
    }

    /**
     * Sets id.
     *
     * @param _id the id
     */
    public void set_id(String _id) {
        this._id = _id;
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

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * Gets error.
     *
     * @return the error
     */
    public Object getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error the error
     */
    public void setError(Object error) {
        this.error = error;
    }

    /**
     * Gets link.
     *
     * @return the link
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(Link link) {
        this.link = link;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets response status.
     *
     * @return the response status
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets response status.
     *
     * @param responseStatus the response status
     */
    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public String toString() {
        return "PaymentStatus{" +
                "_id='" + _id + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", customer='" + customer + '\'' +
                ", error=" + error +
                ", link=" + link +
                ", status='" + status + '\'' +
                ", responseStatus='" + responseStatus + '\'' +
                '}';
    }
}
