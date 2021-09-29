package ng.okra.api.Auth.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.CommonCustomer;
import ng.okra.api.Common.Responses.DTO.Bank;

import java.util.Date;

/**
 * The type Call back auth.
 */
public class CallBackAuth{
    /**
     * The Id.
     */
    @SerializedName("_id")
    public String _id;

    /**
     * The Record.
     */
    @SerializedName("record")
    public String record;

    /**
     * The __ v.
     */
    @SerializedName("__v")
    public long __v;

    /**
     * The Bank.
     */
    @SerializedName("bank")
    public Bank bank;

    /**
     * The Created at.
     */
    @SerializedName("created_at")
    public Date createdAt;

    /**
     * The Customer.
     */
    @SerializedName("customer")
    public CommonCustomer customer;

    /**
     * The Env.
     */
    @SerializedName("env")
    public String env;

    /**
     * The Last updated.
     */
    @SerializedName("last_updated")
    public Date lastUpdated;

    /**
     * The Owner.
     */
    @SerializedName("owner")
    public String owner;

    /**
     * The Validated.
     */
    @SerializedName("validated")
    public boolean validated;

    /**
     * The Id.
     */
    @SerializedName("id")
    public String id;

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
     * Gets record.
     *
     * @return the record
     */
    public String getRecord() {
        return record;
    }

    /**
     * Sets record.
     *
     * @param record the record
     */
    public void setRecord(String record) {
        this.record = record;
    }

    /**
     * Gets __ v.
     *
     * @return the __ v
     */
    public long get__v() {
        return __v;
    }

    /**
     * Sets __ v.
     *
     * @param __v the __ v
     */
    public void set__v(long __v) {
        this.__v = __v;
    }

    /**
     * Gets bank.
     *
     * @return the bank
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * Sets bank.
     *
     * @param bank the bank
     */
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets customer.
     *
     * @return the customer
     */
    public CommonCustomer getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(CommonCustomer customer) {
        this.customer = customer;
    }

    /**
     * Gets env.
     *
     * @return the env
     */
    public String getEnv() {
        return env;
    }

    /**
     * Sets env.
     *
     * @param env the env
     */
    public void setEnv(String env) {
        this.env = env;
    }

    /**
     * Gets last updated.
     *
     * @return the last updated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets last updated.
     *
     * @param lastUpdated the last updated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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
     * Is validated boolean.
     *
     * @return the boolean
     */
    public boolean isValidated() {
        return validated;
    }

    /**
     * Sets validated.
     *
     * @param validated the validated
     */
    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CallBackAuth{" +
                "_id='" + _id + '\'' +
                ", record='" + record + '\'' +
                ", __v=" + __v +
                ", bank=" + bank +
                ", createdAt=" + createdAt +
                ", customer=" + customer +
                ", env='" + env + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", owner='" + owner + '\'' +
                ", validated=" + validated +
                ", id='" + id + '\'' +
                '}';
    }
}
