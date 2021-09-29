package ng.okra.api.Income.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;

import java.util.List;

/**
 * The type Income callback response data.
 */
public class IncomeCallbackResponseData {
    @SerializedName("total")
    private int total;
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("income")
    private List<Income> income;

    /**
     * Gets total.
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(int total) {
        this.total = total;
    }

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
     * Gets income.
     *
     * @return the income
     */
    public List<Income> getIncome() {
        return income;
    }

    /**
     * Sets income.
     *
     * @param income the income
     */
    public void setIncome(List<Income> income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "IncomeCallbackResponseData{" +
                "total=" + total +
                ", pagination=" + pagination +
                ", income=" + income +
                '}';
    }
}
