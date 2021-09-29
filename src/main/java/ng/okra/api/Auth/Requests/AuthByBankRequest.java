package ng.okra.api.Auth.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Auth by bank request.
 */
public class AuthByBankRequest extends PaginatedRequest {
    @SerializedName("bank")
    private String bank;

    /**
     * Gets bank.
     *
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets bank.
     *
     * @param bank the bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "AuthByBankRequest{" +
                "bank='" + bank + '\'' +
                '}';
    }
}
