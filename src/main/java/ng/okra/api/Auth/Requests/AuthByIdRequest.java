package ng.okra.api.Auth.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Auth by id request.
 */
public class AuthByIdRequest extends PaginatedRequest {
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
        return "AuthByIdRequest{" +
                "id='" + id + '\'' +
                '}';
    }
}
