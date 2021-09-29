package ng.okra.api.Account.Requests;

import com.google.gson.annotations.SerializedName;

public class AccountByCustomerDateRequest extends AccountByDateRequest{
    @SerializedName("customer")
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "AccountByCustomerDateRequest{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
