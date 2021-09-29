package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Record.
 */
public class Record {
    @SerializedName("_id")
    private String _id;
    @SerializedName("status")
    private Status status;
    @SerializedName("owner")
    private String owner;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String get_id() {
        return _id;
    }

    /**
     * Sets id.
     *
     * @param _id the id
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Record{" +
                "_id='" + _id + '\'' +
                ", status=" + status +
                ", owner='" + owner + '\'' +
                '}';
    }
}
