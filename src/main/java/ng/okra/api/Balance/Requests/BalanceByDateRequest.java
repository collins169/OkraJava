package ng.okra.api.Balance.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Balance by date request.
 */
public class BalanceByDateRequest extends PaginatedRequest {
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
        return "BalanceByDate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
