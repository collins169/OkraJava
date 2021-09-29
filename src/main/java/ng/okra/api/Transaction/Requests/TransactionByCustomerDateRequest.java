package ng.okra.api.Transaction.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Transaction by customer date request.
 */
public class TransactionByCustomerDateRequest extends TransactionByDateRequest{
    @SerializedName("customerId")
    private String customerId;

    /**
     * Gets customer id.
     *
     * @return the customer id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets customer id.
     *
     * @param customerId the customer id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "TransactionByCustomerDate{" +
                "customerId='" + customerId + '\'' +
                '}';
    }
}
