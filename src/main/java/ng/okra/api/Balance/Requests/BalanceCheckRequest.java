package ng.okra.api.Balance.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Balance check request.
 */
public class BalanceCheckRequest {
    @SerializedName("account_id")
    private String accountId;
    @SerializedName("record_id")
    private String recordId;

    /**
     * Gets account id.
     *
     * @return the account id
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets account id.
     *
     * @param accountId the account id
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Gets record id.
     *
     * @return the record id
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Sets record id.
     *
     * @param recordId the record id
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Override
    public String toString() {
        return "BalanceCheckRequest{" +
                "accountId='" + accountId + '\'' +
                ", recordId='" + recordId + '\'' +
                '}';
    }
}
