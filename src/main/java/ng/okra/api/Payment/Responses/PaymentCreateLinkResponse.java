package ng.okra.api.Payment.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.BaseResponse;
import ng.okra.api.Payment.Responses.DTO.PaymentCreateLinkResponseData;

/**
 * The type Payment create link response.
 */
public class PaymentCreateLinkResponse extends BaseResponse {
    @SerializedName("data")
    private PaymentCreateLinkResponseData data;

    /**
     * Gets data.
     *
     * @return the data
     */
    public PaymentCreateLinkResponseData getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(PaymentCreateLinkResponseData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PaymentCreateLinkResponse{" +
                "data=" + data +
                '}';
    }
}
