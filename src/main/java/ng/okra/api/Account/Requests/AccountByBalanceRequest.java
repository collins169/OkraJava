package ng.okra.api.Account.Requests;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Requests.PaginatedRequest;

public class AccountByBalanceRequest extends PaginatedRequest {
    @SerializedName("balance")
    private String balance;
}
