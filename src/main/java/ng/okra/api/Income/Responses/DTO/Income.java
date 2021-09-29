package ng.okra.api.Income.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.CommonCustomer;
import ng.okra.api.Common.Responses.DTO.Bank;
import ng.okra.api.Common.Responses.DTO.Owner;

import java.util.List;

/**
 * The type Income.
 */
public class Income {
    @SerializedName("_id")
    private String _id;
    @SerializedName("customer")
    private CommonCustomer customer;
    @SerializedName("owner")
    private List<Owner> owner;
    @SerializedName("record")
    private List<Record> record;
    @SerializedName("__v")
    private String __v;
    @SerializedName("confidence")
    private String confidence;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("last_year_income")
    private int lastYearIncome;
    @SerializedName("max_number_of_overlapping_income_streams")
    private int maxNumberOfOverlappingIncomeStreams;
    @SerializedName("number_of_income_streams")
    private int numberOfIncomeStreams;
    @SerializedName("projected_yearly_income")
    private long projectedYearlyIncome;
    @SerializedName("streams")
    private List<Stream> streams;
    @SerializedName("env")
    private String env;
    @SerializedName("id")
    private String id;
    @SerializedName("status")
    private String status;
    @SerializedName("banks")
    private List<Bank> banks;

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
     * Gets owner.
     *
     * @return the owner
     */
    public List<Owner> getOwner() {
        return owner;
    }

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(List<Owner> owner) {
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
     * Gets confidence.
     *
     * @return the confidence
     */
    public String getConfidence() {
        return confidence;
    }

    /**
     * Sets confidence.
     *
     * @param confidence the confidence
     */
    public void setConfidence(String confidence) {
        this.confidence = confidence;
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
     * Gets last year income.
     *
     * @return the last year income
     */
    public int getLastYearIncome() {
        return lastYearIncome;
    }

    /**
     * Sets last year income.
     *
     * @param lastYearIncome the last year income
     */
    public void setLastYearIncome(int lastYearIncome) {
        this.lastYearIncome = lastYearIncome;
    }

    /**
     * Gets max number of overlapping income streams.
     *
     * @return the max number of overlapping income streams
     */
    public int getMaxNumberOfOverlappingIncomeStreams() {
        return maxNumberOfOverlappingIncomeStreams;
    }

    /**
     * Sets max number of overlapping income streams.
     *
     * @param maxNumberOfOverlappingIncomeStreams the max number of overlapping income streams
     */
    public void setMaxNumberOfOverlappingIncomeStreams(int maxNumberOfOverlappingIncomeStreams) {
        this.maxNumberOfOverlappingIncomeStreams = maxNumberOfOverlappingIncomeStreams;
    }

    /**
     * Gets number of income streams.
     *
     * @return the number of income streams
     */
    public int getNumberOfIncomeStreams() {
        return numberOfIncomeStreams;
    }

    /**
     * Sets number of income streams.
     *
     * @param numberOfIncomeStreams the number of income streams
     */
    public void setNumberOfIncomeStreams(int numberOfIncomeStreams) {
        this.numberOfIncomeStreams = numberOfIncomeStreams;
    }

    /**
     * Gets projected yearly income.
     *
     * @return the projected yearly income
     */
    public long getProjectedYearlyIncome() {
        return projectedYearlyIncome;
    }

    /**
     * Sets projected yearly income.
     *
     * @param projectedYearlyIncome the projected yearly income
     */
    public void setProjectedYearlyIncome(long projectedYearlyIncome) {
        this.projectedYearlyIncome = projectedYearlyIncome;
    }

    /**
     * Gets streams.
     *
     * @return the streams
     */
    public List<Stream> getStreams() {
        return streams;
    }

    /**
     * Sets streams.
     *
     * @param streams the streams
     */
    public void setStreams(List<Stream> streams) {
        this.streams = streams;
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
     * Gets banks.
     *
     * @return the banks
     */
    public List<Bank> getBanks() {
        return banks;
    }

    /**
     * Sets banks.
     *
     * @param banks the banks
     */
    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

    @Override
    public String toString() {
        return "Income{" +
                "_id='" + _id + '\'' +
                ", customer=" + customer +
                ", owner=" + owner +
                ", record=" + record +
                ", __v='" + __v + '\'' +
                ", confidence='" + confidence + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", lastYearIncome=" + lastYearIncome +
                ", maxNumberOfOverlappingIncomeStreams=" + maxNumberOfOverlappingIncomeStreams +
                ", numberOfIncomeStreams=" + numberOfIncomeStreams +
                ", projectedYearlyIncome=" + projectedYearlyIncome +
                ", streams=" + streams +
                ", env='" + env + '\'' +
                ", id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", banks=" + banks +
                '}';
    }
}
