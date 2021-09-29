package ng.okra.api.Transaction.Responses;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;
import ng.okra.api.Transaction.Responses.DTO.Transaction;

import java.util.List;

/**
 * The type Transaction callback response.
 */
public class TransactionCallbackResponse {
    @SerializedName("pagination")
    private Pagination pagination;
    @SerializedName("transaction")
    private List<Transaction> transaction;

    /**
     * Gets pagination.
     *
     * @return the pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    /**
     * Sets pagination.
     *
     * @param pagination the pagination
     */
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    /**
     * Gets transaction.
     *
     * @return the transaction
     */
    public List<Transaction> getTransaction() {
        return transaction;
    }

    /**
     * Sets transaction.
     *
     * @param transaction the transaction
     */
    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "TransactionCallbackResponse{" +
                "pagination=" + pagination +
                ", transaction=" + transaction +
                '}';
    }
}
