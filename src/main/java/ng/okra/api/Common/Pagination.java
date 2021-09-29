package ng.okra.api.Common;

import com.google.gson.annotations.SerializedName;

/**
 * The type Pagination.
 */
public class Pagination {
    /**
     * The Total docs.
     */
    @SerializedName("totalDocs")
    public int totalDocs;
    /**
     * The Limit.
     */
    @SerializedName("limit")
    public int limit;
    /**
     * The Has prev page.
     */
    @SerializedName("hasPrevPage")
    public boolean hasPrevPage;
    /**
     * The Has next page.
     */
    @SerializedName("hasNextPage")
    public boolean hasNextPage;
    /**
     * The Page.
     */
    @SerializedName("page")
    public int page;
    /**
     * The Total pages.
     */
    @SerializedName("totalPages")
    public int totalPages;
    /**
     * The Paging counter.
     */
    @SerializedName("pagingCounter")
    public int pagingCounter;
    /**
     * The Prev page.
     */
    @SerializedName("prevPage")
    public Object prevPage;
    /**
     * The Next page.
     */
    @SerializedName("nextPage")
    public Object nextPage;

    /**
     * Gets total docs.
     *
     * @return the total docs
     */
    public int getTotalDocs() {
        return totalDocs;
    }

    /**
     * Sets total docs.
     *
     * @param totalDocs the total docs
     */
    public void setTotalDocs(int totalDocs) {
        this.totalDocs = totalDocs;
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

    /**
     * Is has prev page boolean.
     *
     * @return the boolean
     */
    public boolean isHasPrevPage() {
        return hasPrevPage;
    }

    /**
     * Sets has prev page.
     *
     * @param hasPrevPage the has prev page
     */
    public void setHasPrevPage(boolean hasPrevPage) {
        this.hasPrevPage = hasPrevPage;
    }

    /**
     * Is has next page boolean.
     *
     * @return the boolean
     */
    public boolean isHasNextPage() {
        return hasNextPage;
    }

    /**
     * Sets has next page.
     *
     * @param hasNextPage the has next page
     */
    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

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
     * Gets total pages.
     *
     * @return the total pages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Sets total pages.
     *
     * @param totalPages the total pages
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Gets paging counter.
     *
     * @return the paging counter
     */
    public int getPagingCounter() {
        return pagingCounter;
    }

    /**
     * Sets paging counter.
     *
     * @param pagingCounter the paging counter
     */
    public void setPagingCounter(int pagingCounter) {
        this.pagingCounter = pagingCounter;
    }

    /**
     * Gets prev page.
     *
     * @return the prev page
     */
    public Object getPrevPage() {
        return prevPage;
    }

    /**
     * Sets prev page.
     *
     * @param prevPage the prev page
     */
    public void setPrevPage(Object prevPage) {
        this.prevPage = prevPage;
    }

    /**
     * Gets next page.
     *
     * @return the next page
     */
    public Object getNextPage() {
        return nextPage;
    }

    /**
     * Sets next page.
     *
     * @param nextPage the next page
     */
    public void setNextPage(Object nextPage) {
        this.nextPage = nextPage;
    }

    @Override
    public String toString() {
        return "Pagination{" +
                "totalDocs=" + totalDocs +
                ", limit=" + limit +
                ", hasPrevPage=" + hasPrevPage +
                ", hasNextPage=" + hasNextPage +
                ", page=" + page +
                ", totalPages=" + totalPages +
                ", pagingCounter=" + pagingCounter +
                ", prevPage=" + prevPage +
                ", nextPage=" + nextPage +
                '}';
    }
}
