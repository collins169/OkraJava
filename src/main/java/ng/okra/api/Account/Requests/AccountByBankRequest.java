package ng.okra.api.Account.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

public class AccountByBankRequest extends PaginatedRequest {
    @SerializedName("bank")
    private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "AccountByBankRequest{" +
                "bank='" + bank + '\'' +
                '}';
    }
}
