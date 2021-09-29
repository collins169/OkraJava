package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Shared.
 */
public class Shared {
    @SerializedName("success")
    private boolean success;
    @SerializedName("msg")
    private String msg;

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets msg.
     *
     * @param msg the msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Shared{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
