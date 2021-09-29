package ng.okra.api.Auth.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Process;

/**
 * The type Status.
 */
public class Status {
    /**
     * The Transactions.
     */
    @SerializedName("transactions")
    public Object Transactions;
    /**
     * The Last callback.
     */
    @SerializedName("last_callback")
    public Object LastCallback;
    /**
     * The Process.
     */
    @SerializedName("process")
    public ng.okra.api.Common.Responses.DTO.Process Process;

    /**
     * Gets transactions.
     *
     * @return the transactions
     */
    public Object getTransactions() {
        return Transactions;
    }

    /**
     * Sets transactions.
     *
     * @param transactions the transactions
     */
    public void setTransactions(Object transactions) {
        Transactions = transactions;
    }

    /**
     * Gets last callback.
     *
     * @return the last callback
     */
    public Object getLastCallback() {
        return LastCallback;
    }

    /**
     * Sets last callback.
     *
     * @param lastCallback the last callback
     */
    public void setLastCallback(Object lastCallback) {
        LastCallback = lastCallback;
    }

    /**
     * Gets process.
     *
     * @return the process
     */
    public Process getProcess() {
        return Process;
    }

    /**
     * Sets process.
     *
     * @param process the process
     */
    public void setProcess(Process process) {
        Process = process;
    }

    @Override
    public String toString() {
        return "Status{" +
                "Transactions=" + Transactions +
                ", LastCallback=" + LastCallback +
                ", Process=" + Process +
                '}';
    }
}
