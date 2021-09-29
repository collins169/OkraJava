package ng.okra.api.Income.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Account;

/**
 * The type Stream.
 */
public class Stream {
    @SerializedName("_id")
    private String _id;
    @SerializedName("account")
    private Account account;
    @SerializedName("avg_monthly_income")
    private long avgMonthlyIncome;
    @SerializedName("days")
    private int days;
    @SerializedName("monthly_income")
    private long monthlyIncome;
    @SerializedName("income_type")
    private String incomeType;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String get_id() {
        return _id;
    }

    /**
     * Sets id.
     *
     * @param _id the id
     */
    public void set_id(String _id) {
        this._id = _id;
    }

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

    /**
     * Gets avg monthly income.
     *
     * @return the avg monthly income
     */
    public long getAvgMonthlyIncome() {
        return avgMonthlyIncome;
    }

    /**
     * Sets avg monthly income.
     *
     * @param avgMonthlyIncome the avg monthly income
     */
    public void setAvgMonthlyIncome(long avgMonthlyIncome) {
        this.avgMonthlyIncome = avgMonthlyIncome;
    }

    /**
     * Gets days.
     *
     * @return the days
     */
    public int getDays() {
        return days;
    }

    /**
     * Sets days.
     *
     * @param days the days
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * Gets monthly income.
     *
     * @return the monthly income
     */
    public long getMonthlyIncome() {
        return monthlyIncome;
    }

    /**
     * Sets monthly income.
     *
     * @param monthlyIncome the monthly income
     */
    public void setMonthlyIncome(long monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    /**
     * Gets income type.
     *
     * @return the income type
     */
    public String getIncomeType() {
        return incomeType;
    }

    /**
     * Sets income type.
     *
     * @param incomeType the income type
     */
    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "_id='" + _id + '\'' +
                ", account=" + account +
                ", avgMonthlyIncome=" + avgMonthlyIncome +
                ", days=" + days +
                ", monthlyIncome=" + monthlyIncome +
                ", incomeType='" + incomeType + '\'' +
                '}';
    }
}
