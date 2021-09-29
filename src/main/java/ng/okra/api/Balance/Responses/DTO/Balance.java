package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.CommonCustomer;
import ng.okra.api.Common.Responses.DTO.Account;

import java.util.List;

/**
 * The type Balance.
 */
public class Balance {
    @SerializedName("_d")
    private String _id;
    @SerializedName("account")
    private Account account;
    @SerializedName("env")
    private String env;
    @SerializedName("__v")
    private String __v;
    @SerializedName("available_balance")
    private long availableBalance;
    @SerializedName("currency")
    private String currency;
    @SerializedName("customer")
    private CommonCustomer customer;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("ledger_balance")
    private long ledgerBalance;
    @SerializedName("owner")
    private List<String> owner;
    @SerializedName("record")
    private List<Record> record;
    @SerializedName("connected")
    private List<String> connected;
    @SerializedName("period")
    private Period period;

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
     * Gets available balance.
     *
     * @return the available balance
     */
    public long getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets available balance.
     *
     * @param availableBalance the available balance
     */
    public void setAvailableBalance(long availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
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
     * Gets ledger balance.
     *
     * @return the ledger balance
     */
    public long getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * Sets ledger balance.
     *
     * @param ledgerBalance the ledger balance
     */
    public void setLedgerBalance(long ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public List<String> getOwner() {
        return owner;
    }

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(List<String> owner) {
        this.owner = owner;
    }

    /**
     * Gets record.
     *
     * @return the record
     */
    public List<Record> getRecord() {
        return record;
    }

    /**
     * Sets record.
     *
     * @param record the record
     */
    public void setRecord(List<Record> record) {
        this.record = record;
    }

    /**
     * Gets connected.
     *
     * @return the connected
     */
    public List<String> getConnected() {
        return connected;
    }

    /**
     * Sets connected.
     *
     * @param connected the connected
     */
    public void setConnected(List<String> connected) {
        this.connected = connected;
    }

    /**
     * Gets period.
     *
     * @return the period
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets period.
     *
     * @param period the period
     */
    public void setPeriod(Period period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "_id='" + _id + '\'' +
                ", account=" + account +
                ", env='" + env + '\'' +
                ", __v='" + __v + '\'' +
                ", availableBalance=" + availableBalance +
                ", currency='" + currency + '\'' +
                ", customer=" + customer +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", ledgerBalance=" + ledgerBalance +
                ", owner=" + owner +
                ", record=" + record +
                ", connected=" + connected +
                ", period=" + period +
                '}';
    }
}
