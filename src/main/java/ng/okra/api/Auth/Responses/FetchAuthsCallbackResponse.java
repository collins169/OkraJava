package ng.okra.api.Auth.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Auth.Responses.DTO.AuthCallbackResponseData;
import ng.okra.api.Auth.Responses.DTO.FetchAuths;
import ng.okra.api.Common.BaseResponse;

/**
 * The type Fetch auths callback response.
 */
public class FetchAuthsCallbackResponse extends BaseResponse {
    /**
     * The Data.
     */
    @SerializedName("data")
    public FetchAuths data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public FetchAuths getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(FetchAuths data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FetchAuthsCallbackResponse{" +
                "data=" + data +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}



