package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Payment callback response data.
 */
public class PaymentCallbackResponseData {
    @SerializedName("payment_status")
    private PaymentStatus paymentStatus;

    /**
     * Gets payment status.
     *
     * @return the payment status
     */
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets payment status.
     *
     * @param paymentStatus the payment status
     */
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PaymentCallbackResponseData{" +
                "paymentStatus=" + paymentStatus +
                '}';
    }
}
