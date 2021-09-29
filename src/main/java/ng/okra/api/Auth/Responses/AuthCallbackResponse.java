package ng.okra.api.Auth.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Auth.Responses.DTO.AuthCallbackResponseData;
import ng.okra.api.Common.BaseResponse;

/**
 * The type Auth callback response.
 */
public class AuthCallbackResponse extends BaseResponse {
    /**
     * The Data.
     */
    @SerializedName("data")
    public AuthCallbackResponseData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public AuthCallbackResponseData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(AuthCallbackResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AuthCallbackResponse{" +
                "data=" + data +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}



