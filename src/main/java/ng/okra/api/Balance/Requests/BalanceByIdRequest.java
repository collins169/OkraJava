package ng.okra.api.Balance.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Balance by id request.
 */
public class BalanceByIdRequest {
    @SerializedName("id")
    private String id;

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
        return "BalanceByIdRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
