package ng.okra.api.Transaction.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;
import ng.okra.api.Transaction.Responses.DTO.Trans;

import java.util.List;

/**
 * The type Trans callback response.
 */
public class TransCallbackResponse {
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("trans")
    private List<Trans> trans;

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
     * Gets trans.
     *
     * @return the trans
     */
    public List<Trans> getTrans() {
        return trans;
    }

    /**
     * Sets trans.
     *
     * @param trans the trans
     */
    public void setTrans(List<Trans> trans) {
        this.trans = trans;
    }

    @Override
    public String toString() {
        return "TransCallbackResponse{" +
                "pagination=" + pagination +
                ", trans=" + trans +
                '}';
    }
}
