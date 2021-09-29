package ng.okra.api.Common;

import com.google.gson.annotations.SerializedName;

/**
 * The type Base response.
 */
public class BaseResponse {
    /**
     * The Status.
     */
    @SerializedName("status")
    public String status;
    /**
     * The Message.
     */
    @SerializedName("message")
    public String message;

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

