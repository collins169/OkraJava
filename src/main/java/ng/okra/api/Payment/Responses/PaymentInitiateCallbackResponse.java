package ng.okra.api.Payment.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.BaseResponse;
import ng.okra.api.Payment.Responses.DTO.PaymentInitiateResponseData;

/**
 * The type Payment initiate callback response.
 */
public class PaymentInitiateCallbackResponse extends BaseResponse {
    @SerializedName("data")
    private PaymentInitiateResponseData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public PaymentInitiateResponseData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(PaymentInitiateResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PaymentInitiateCallbackResponse{" +
                "data=" + data +
                '}';
    }
}
