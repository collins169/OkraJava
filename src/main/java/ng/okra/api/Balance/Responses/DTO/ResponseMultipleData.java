package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;

import java.util.List;

/**
 * The type Response multiple data.
 */
public class ResponseMultipleData {
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("balance")
    private List<Balance> balance;

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
    public List<Balance> getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(List<Balance> balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ResponseMultipleData{" +
                "pagination=" + pagination +
                ", balance=" + balance +
                '}';
    }
}
