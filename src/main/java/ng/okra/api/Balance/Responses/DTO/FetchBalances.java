package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;

import java.util.List;

/**
 * The type Fetch balances.
 */
public class FetchBalances {
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("balances")
    private List<Balance> balances;

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
        return balances;
    }

    /**
     * Sets balance.
     *
     * @param balances the balances
     */
    public void setBalance(List<Balance> balances) {
        this.balances = balances;
    }

    @Override
    public String toString() {
        return "FetchBalances{" +
                "pagination=" + pagination +
                ", balances=" + balances +
                '}';
    }
}
