package ng.okra.api.Transaction.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Transaction by bank request.
 */
public class TransactionByBankRequest extends PaginatedRequest {
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
        return "TransactionByBankRequest{" +
                "bank='" + bank + '\'' +
                '}';
    }
}
