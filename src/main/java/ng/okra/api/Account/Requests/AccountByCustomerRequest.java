package ng.okra.api.Account.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

public class AccountByCustomerRequest extends PaginatedRequest {
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
        return "AccountByCustomer{" +
                "customer='" + customer + '\'' +
                '}';
    }
}
