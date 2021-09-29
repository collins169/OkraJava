package ng.okra.api.Income.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Income by date request.
 */
public class IncomeByDateRequest extends PaginatedRequest {
    @SerializedName("from")
    private String from;
    @SerializedName("to")
    private String to;

    /**
     * Gets from.
     *
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from the from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Gets to.
     *
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to the to
     */
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "IncomeByDateRequest{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
