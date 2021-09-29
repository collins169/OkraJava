package ng.okra.api.Transaction.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;
import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Transaction by customer request.
 */
public class TransactionByCustomerRequest extends PaginatedRequest {
    @SerializedName("customer")
    private String customer;

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

    @Override
    public String toString() {
        return "TransactionByCustomerRequest{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
