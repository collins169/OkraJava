package ng.okra.api.Auth.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

import java.util.Date;

/**
 * The type Auth by date request.
 */
public class AuthByDateRequest extends PaginatedRequest {
    @SerializedName("from")
    private Date from;
    @SerializedName("to")
    private Date to;

    /**
     * Gets from.
     *
     * @return the from
     */
    public Date getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from the from
     */
    public void setFrom(Date from) {
        this.from = from;
    }

    /**
     * Gets to.
     *
     * @return the to
     */
    public Date getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to the to
     */
    public void setTo(Date to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "AuthByDateRequest{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
