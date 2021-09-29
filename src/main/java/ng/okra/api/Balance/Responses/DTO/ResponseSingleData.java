package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;

/**
 * The type Response single data.
 */
public class ResponseSingleData {
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("balance")
    private Balance balance;

    /**
     * Gets pagination.
     *
     * @return the pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * Sets pagination.
     *
     * @param pagination the pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Balance getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ResponseSingleData{" +
                "pagination=" + pagination +
                ", balance=" + balance +
                '}';
    }
}
