package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Whatsapp.
 */
public class Whatsapp {
    @SerializedName("enabled")
    private boolean enabled;
    @SerializedName("users")
    private List<Object> users;
    @SerializedName("message_templates")
    private List<Object> messageTemplates;
    @SerializedName("qr")
    private List<Object> qr;

    /**
     * Is enabled boolean.
     *
     * @return the boolean
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     *
     * @param enabled the enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Gets users.
     *
     * @return the users
     */
    public List<Object> getUsers() {
        return users;
    }

    /**
     * Sets users.
     *
     * @param users the users
     */
    public void setUsers(List<Object> users) {
        this.users = users;
    }

    /**
     * Gets message templates.
     *
     * @return the message templates
     */
    public List<Object> getMessageTemplates() {
        return messageTemplates;
    }

    /**
     * Sets message templates.
     *
     * @param messageTemplates the message templates
     */
    public void setMessageTemplates(List<Object> messageTemplates) {
        this.messageTemplates = messageTemplates;
    }

    /**
     * Gets qr.
     *
     * @return the qr
     */
    public List<Object> getQr() {
        return qr;
    }

    /**
     * Sets qr.
     *
     * @param qr the qr
     */
    public void setQr(List<Object> qr) {
        this.qr = qr;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "enabled=" + enabled +
                ", users=" + users +
                ", messageTemplates=" + messageTemplates +
                ", qr=" + qr +
                '}';
    }
}
