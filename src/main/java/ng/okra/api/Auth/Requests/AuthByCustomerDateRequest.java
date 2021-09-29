package ng.okra.api.Auth.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Auth by customer date request.
 */
public class AuthByCustomerDateRequest extends AuthByDateRequest {
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
        return "AuthByCustomerDateRequest{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
