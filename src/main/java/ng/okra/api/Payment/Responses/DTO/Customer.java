package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.CommonCustomer;
import ng.okra.api.Common.Responses.DTO.Account;

/**
 * The type Customer.
 */
public class Customer extends CommonCustomer {
    @SerializedName("account")
    private Account account;

    /**
     * Gets account.
     *
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", account=" + account +
                '}';
    }
}
