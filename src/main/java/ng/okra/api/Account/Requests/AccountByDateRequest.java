package ng.okra.api.Account.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

public class AccountByDateRequest extends PaginatedRequest {
    @SerializedName("from")
    private String from;
    @SerializedName("to")
    private String to;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "AccountByDateRequest{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
