package ng.okra.api.Balance.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Balance.Responses.DTO.ResponseSingleData;
import ng.okra.api.Common.BaseResponse;

/**
 * The type Balance single callback response.
 */
public class BalanceSingleCallbackResponse extends BaseResponse {
    @SerializedName("data")
    private ResponseSingleData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public ResponseSingleData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(ResponseSingleData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BalanceSingleCallbackResponse{" +
                "data=" + data +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
