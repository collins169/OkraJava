package ng.okra.api.Transaction.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.CommonAccount;
import ng.okra.api.Common.Responses.CommonCustomer;
import ng.okra.api.Common.Responses.DTO.Account;
import ng.okra.api.Common.Responses.DTO.Bank;
import ng.okra.api.Common.Responses.DTO.Owner;

import java.util.List;

/**
 * The type Trans.
 */
public class Trans {
    @SerializedName("count")
    private String count;
    @SerializedName("status")
    private String status;
    @SerializedName("_id")
    private String _id;
    @SerializedName("account")
    private Account account;
    @SerializedName("customer")
    private CommonCustomer customer;
    @SerializedName("env")
    private String env;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("__v")
    private String __v;
    @SerializedName("bank")
    private Bank bank;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("record")
    private String record;

    /**
     * Gets count.
     *
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(String count) {
        this.count = count;
    }

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
     * Gets account.
     *
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(Account account) {
        this.account = account;
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
     * Gets owner.
     *
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Gets __ v.
     *
     * @return the __ v
     */
    public String get__v() {
        return __v;
    }

    /**
     * Sets __ v.
     *
     * @param __v the __ v
     */
    public void set__v(String __v) {
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
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    @Override
    public String toString() {
        return "Trans{" +
                "count='" + count + '\'' +
                ", status='" + status + '\'' +
                ", _id='" + _id + '\'' +
                ", account=" + account +
                ", customer=" + customer +
                ", env='" + env + '\'' +
                ", owner=" + owner +
                ", __v='" + __v + '\'' +
                ", bank=" + bank +
                ", createdAt='" + createdAt + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", record='" + record + '\'' +
                '}';
    }
}
