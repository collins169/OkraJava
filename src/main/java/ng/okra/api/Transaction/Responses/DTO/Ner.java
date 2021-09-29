package ng.okra.api.Transaction.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Ner.
 */
public class Ner {
    @SerializedName("TRANS_TYPE")
    private String transType;

    /**
     * Gets trans type.
     *
     * @return the trans type
     */
    public String getTransType() {
        return transType;
    }

    /**
     * Sets trans type.
     *
     * @param transType the trans type
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    @Override
    public String toString() {
        return "Ner{" +
                "transType='" + transType + '\'' +
                '}';
    }
}
