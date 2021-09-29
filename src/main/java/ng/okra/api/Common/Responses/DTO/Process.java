package ng.okra.api.Common.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Process.
 */
public class Process {
    /**
     * The Running.
     */
    @SerializedName("running")
    public boolean Running;
    /**
     * The Completed.
     */
    @SerializedName("completed")
    public boolean Completed;

    /**
     * Is running boolean.
     *
     * @return the boolean
     */
    public boolean isRunning() {
        return Running;
    }

    /**
     * Sets running.
     *
     * @param running the running
     */
    public void setRunning(boolean running) {
        Running = running;
    }

    /**
     * Is completed boolean.
     *
     * @return the boolean
     */
    public boolean isCompleted() {
        return Completed;
    }

    /**
     * Sets completed.
     *
     * @param completed the completed
     */
    public void setCompleted(boolean completed) {
        Completed = completed;
    }

    @Override
    public String toString() {
        return "Process{" +
                "Running=" + Running +
                ", Completed=" + Completed +
                '}';
    }
}
