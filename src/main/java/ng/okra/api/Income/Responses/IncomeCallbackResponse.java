package ng.okra.api.Income.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.BaseResponse;
import ng.okra.api.Income.Responses.DTO.IncomeCallbackResponseData;

/**
 * The type Income callback response.
 */
public class IncomeCallbackResponse extends BaseResponse {
    @SerializedName("data")
    private IncomeCallbackResponseData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public IncomeCallbackResponseData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(IncomeCallbackResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IncomeCallbackResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
