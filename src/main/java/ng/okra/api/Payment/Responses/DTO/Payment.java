package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Link;
import ng.okra.api.Common.Responses.DTO.Owner;

/**
 * The type Payment.
 */
public class Payment {
    @SerializedName("record")
    private String record;
    @SerializedName("amount")
    private long amount;
    @SerializedName("bank_response")
    private String bankResponse;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("credit_account")
    private String creditAccount;
    @SerializedName("currency")
    private String currency;
    @SerializedName("customer")
    private String customer;
    @SerializedName("debit_account")
    private String debitAccount;
    @SerializedName("email")
    private String email;
    @SerializedName("env")
    private String env;
    @SerializedName("error")
    private String error;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("link")
    private Link link;
    @SerializedName("meta")
    private String meta;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("ref")
    private String ref;
    @SerializedName("schedule")
    private Schedule schedule;
    @SerializedName("source")
    private String source;
    @SerializedName("status")
    private String status;
    @SerializedName("id")
    private String id;

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
     * Gets bank response.
     *
     * @return the bank response
     */
    public String getBankResponse() {
        return bankResponse;
    }

    /**
     * Sets bank response.
     *
     * @param bankResponse the bank response
     */
    public void setBankResponse(String bankResponse) {
        this.bankResponse = bankResponse;
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
     * Gets credit account.
     *
     * @return the credit account
     */
    public String getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets credit account.
     *
     * @param creditAccount the credit account
     */
    public void setCreditAccount(String creditAccount) {
        this.creditAccount = creditAccount;
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
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets customer.
     *
     * @param customer the customer
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * Gets debit account.
     *
     * @return the debit account
     */
    public String getDebitAccount() {
        return debitAccount;
    }

    /**
     * Sets debit account.
     *
     * @param debitAccount the debit account
     */
    public void setDebitAccount(String debitAccount) {
        this.debitAccount = debitAccount;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * Gets error.
     *
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error the error
     */
    public void setError(String error) {
        this.error = error;
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
     * Gets link.
     *
     * @return the link
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(Link link) {
        this.link = link;
    }

    /**
     * Gets meta.
     *
     * @return the meta
     */
    public String getMeta() {
        return meta;
    }

    /**
     * Sets meta.
     *
     * @param meta the meta
     */
    public void setMeta(String meta) {
        this.meta = meta;
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
     * Gets ref.
     *
     * @return the ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets ref.
     *
     * @param ref the ref
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Gets schedule.
     *
     * @return the schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule the schedule
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Gets source.
     *
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets source.
     *
     * @param source the source
     */
    public void setSource(String source) {
        this.source = source;
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
        return "Payment{" +
                "record='" + record + '\'' +
                ", amount=" + amount +
                ", bankResponse='" + bankResponse + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", creditAccount='" + creditAccount + '\'' +
                ", currency='" + currency + '\'' +
                ", customer='" + customer + '\'' +
                ", debitAccount='" + debitAccount + '\'' +
                ", email='" + email + '\'' +
                ", env='" + env + '\'' +
                ", error='" + error + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", link=" + link +
                ", meta='" + meta + '\'' +
                ", owner=" + owner +
                ", ref='" + ref + '\'' +
                ", schedule=" + schedule +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
