package ng.okra.api.Balance.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Balance by customer date request.
 */
public class BalanceByCustomerDateRequest extends BalanceByDateRequest{
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
        return "BalanceByCustomerDateRequest{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
