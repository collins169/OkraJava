package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Schedule.
 */
public class Schedule {
    @SerializedName("start_date")
    private Object startDate;
    @SerializedName("end_date")
    private Object endDate;

    /**
     * Gets start date.
     *
     * @return the start date
     */
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Sets start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    /**
     * Gets end date.
     *
     * @return the end date
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     * Sets end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
