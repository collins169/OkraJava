package ng.okra.api.Balance.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Balance.Responses.DTO.ResponseMultipleData;
import ng.okra.api.Common.BaseResponse;

/**
 * The type Balance multiple callback response.
 */
public class BalanceMultipleCallbackResponse extends BaseResponse {
    @SerializedName("data")
    private ResponseMultipleData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public ResponseMultipleData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(ResponseMultipleData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BalanceMultipleCallbackResponse{" +
                "data=" + data +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
