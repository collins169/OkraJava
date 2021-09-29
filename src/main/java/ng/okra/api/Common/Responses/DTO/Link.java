package ng.okra.api.Common.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Link.
 */
public class Link {
    @SerializedName("_id")
    private String _id;
    @SerializedName("url")
    private String url;
    @SerializedName("surl")
    private String surl;
    @SerializedName("short_url")
    private String shortUrl;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String get_id() {
        return _id;
    }

    /**
     * Sets id.
     *
     * @param _id the id
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets surl.
     *
     * @return the surl
     */
    public String getSurl() {
        return surl;
    }

    /**
     * Sets surl.
     *
     * @param surl the surl
     */
    public void setSurl(String surl) {
        this.surl = surl;
    }

    /**
     * Gets short url.
     *
     * @return the short url
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * Sets short url.
     *
     * @param shortUrl the short url
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @Override
    public String toString() {
        return "Link{" +
                "_id='" + _id + '\'' +
                ", url='" + url + '\'' +
                ", surl='" + surl + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                '}';
    }
}
