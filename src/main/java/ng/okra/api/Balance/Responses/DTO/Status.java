package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Process;

/**
 * The type Status.
 */
public class Status {
    @SerializedName("process")
    private Process process;

    /**
     * Gets process.
     *
     * @return the process
     */
    public Process getProcess() {
        return process;
    }

    /**
     * Sets process.
     *
     * @param process the process
     */
    public void setProcess(Process process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "Status{" +
                "process=" + process +
                '}';
    }
}
