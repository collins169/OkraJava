package ng.okra.api.Auth.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Pagination;

import java.util.List;

/**
 * The type Auth callback response data.
 */
public class AuthCallbackResponseData {
    /**
     * The Pagination.
     */
    @SerializedName("pagination")
    public Pagination pagination;
    /**
     * The Auth.
     */
    @SerializedName("auths")
    public List<CallBackAuth> Auth;

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
     * Gets auth.
     *
     * @return the auth
     */
    public List<CallBackAuth> getAuth() {
        return Auth;
    }

    /**
     * Sets auth.
     *
     * @param auth the auth
     */
    public void setAuth(List<CallBackAuth> auth) {
        Auth = auth;
    }

    @Override
    public String toString() {
        return "AuthCallbackResponseData{" +
                "pagination=" + pagination +
                ", Auth=" + Auth +
                '}';
    }
}
