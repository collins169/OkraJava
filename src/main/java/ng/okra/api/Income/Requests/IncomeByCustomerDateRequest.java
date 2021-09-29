package ng.okra.api.Income.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Income by customer date request.
 */
public class IncomeByCustomerDateRequest extends IncomeByDateRequest{
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
        return "IncomeByCustomerDateRequest{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
