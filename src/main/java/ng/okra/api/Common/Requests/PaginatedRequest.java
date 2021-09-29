package ng.okra.api.Common.Requests;

import com.google.gson.annotations.SerializedName;

/**
 * The type Paginated request.
 */
public class PaginatedRequest {
    @SerializedName("page")
    private int page;
    @SerializedName("limit")
    private int limit;

    /**
     * Gets page.
     *
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * Sets page.
     *
     * @param page the page
     */
    public void setPage(int page) {
        this.page = page;
    }

    /**
     * Gets limit.
     *
     * @return the limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets limit.
     *
     * @param limit the limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PaginatedRequest{" +
                "page=" + page +
                ", limit=" + limit +
                '}';
    }
}
