package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Available balance.
 */
public class AvailableBalance {
    @SerializedName("_id")
    private String _id;
    @SerializedName("amount")
    private long amount;
    @SerializedName("owner")
    private String owner;
    @SerializedName("last_updated")
    private String lastUpdated;

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
     * Gets amount.
     *
     * @return the amount
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
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

    /**
     * Gets last updated.
     *
     * @return the last updated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets last updated.
     *
     * @param lastUpdated the last updated
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "AvaliableBalance{" +
                "_id='" + _id + '\'' +
                ", amount=" + amount +
                ", owner='" + owner + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
