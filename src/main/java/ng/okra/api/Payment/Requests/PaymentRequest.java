package ng.okra.api.Payment.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Payment request.
 */
public class PaymentRequest {
    @SerializedName("payment_id")
    private String paymentId;

    /**
     * Gets payment id.
     *
     * @return the payment id
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets payment id.
     *
     * @param paymentId the payment id
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String toString() {
        return "PaymentVerifyRequest{" +
                "paymentId='" + paymentId + '\'' +
                '}';
    }
}
