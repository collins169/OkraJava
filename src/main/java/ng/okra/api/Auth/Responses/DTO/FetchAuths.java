package ng.okra.api.Auth.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;

import java.util.List;

/**
 * The type Fetch auths.
 */
public class FetchAuths extends AuthCallbackResponseData{
    @SerializedName("total")
    private int total;

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

    @Override
    public String toString() {
        return "FetchAuths{" +
                "pagination=" + pagination +
                ", Auth=" + Auth +
                ", total=" + total +
                '}';
    }
}
