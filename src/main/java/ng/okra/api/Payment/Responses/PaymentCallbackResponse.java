package ng.okra.api.Payment.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.BaseResponse;
import ng.okra.api.Payment.Responses.DTO.PaymentCallbackResponseData;

/**
 * The type Payment callback response.
 */
public class PaymentCallbackResponse extends BaseResponse {
    @SerializedName("data")
    private PaymentCallbackResponseData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public PaymentCallbackResponseData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(PaymentCallbackResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PaymentCallbackResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
