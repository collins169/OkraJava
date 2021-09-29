package ng.okra.api.Balance.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Balance.Responses.DTO.FetchBalances;
import ng.okra.api.Balance.Responses.DTO.ResponseMultipleData;
import ng.okra.api.Common.BaseResponse;

/**
 * The type Fetch balances callback response.
 */
public class FetchBalancesCallbackResponse extends BaseResponse {
    @SerializedName("data")
    private FetchBalances data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public FetchBalances getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FetchBalances data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FetchBalancesCallbackResponse{" +
                "data=" + data +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
