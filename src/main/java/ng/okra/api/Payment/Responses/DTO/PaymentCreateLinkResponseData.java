package ng.okra.api.Payment.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Owner;

import java.util.List;

/**
 * The type Payment create link response data.
 */
public class PaymentCreateLinkResponseData {
    @SerializedName("_id")
    private String _id;
    @SerializedName("schedule")
    private Schedule schedule;
    @SerializedName("whatsapp")
    private Whatsapp whatsapp;
    @SerializedName("amount")
    private long amount;
    @SerializedName("currency")
    private String currency;
    @SerializedName("type")
    private String type;
    @SerializedName("debitLater")
    private boolean debitLater;
    @SerializedName("countries")
    private List<String> countries;
    @SerializedName("unique_views")
    private List<Object> uniqueViews;
    @SerializedName("billable_products")
    private List<Object> billableProducts;
    @SerializedName("data")
    private boolean data;
    @SerializedName("archive")
    private boolean archive;
    @SerializedName("corporate")
    private Object corporate;
    @SerializedName("projects")
    private List<Object> projects;
    @SerializedName("note")
    private String note;
    @SerializedName("count")
    private int count;
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("url")
    private String url;
    @SerializedName("surl")
    private String surl;
    @SerializedName("short_url")
    private String shortUrl;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("name")
    private String name;
    @SerializedName("env")
    private String env;
    @SerializedName("account")
    private String account;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("__v")
    private int __v;
    @SerializedName("shared")
    private Shared shared;

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
     * Gets schedule.
     *
     * @return the schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule the schedule
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Gets whatsapp.
     *
     * @return the whatsapp
     */
    public Whatsapp getWhatsapp() {
        return whatsapp;
    }

    /**
     * Sets whatsapp.
     *
     * @param whatsapp the whatsapp
     */
    public void setWhatsapp(Whatsapp whatsapp) {
        this.whatsapp = whatsapp;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Is debit later boolean.
     *
     * @return the boolean
     */
    public boolean isDebitLater() {
        return debitLater;
    }

    /**
     * Sets debit later.
     *
     * @param debitLater the debit later
     */
    public void setDebitLater(boolean debitLater) {
        this.debitLater = debitLater;
    }

    /**
     * Gets countries.
     *
     * @return the countries
     */
    public List<String> getCountries() {
        return countries;
    }

    /**
     * Sets countries.
     *
     * @param countries the countries
     */
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    /**
     * Gets unique views.
     *
     * @return the unique views
     */
    public List<Object> getUniqueViews() {
        return uniqueViews;
    }

    /**
     * Sets unique views.
     *
     * @param uniqueViews the unique views
     */
    public void setUniqueViews(List<Object> uniqueViews) {
        this.uniqueViews = uniqueViews;
    }

    /**
     * Gets billable products.
     *
     * @return the billable products
     */
    public List<Object> getBillableProducts() {
        return billableProducts;
    }

    /**
     * Sets billable products.
     *
     * @param billableProducts the billable products
     */
    public void setBillableProducts(List<Object> billableProducts) {
        this.billableProducts = billableProducts;
    }

    /**
     * Is data boolean.
     *
     * @return the boolean
     */
    public boolean isData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(boolean data) {
        this.data = data;
    }

    /**
     * Is archive boolean.
     *
     * @return the boolean
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * Sets archive.
     *
     * @param archive the archive
     */
    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    /**
     * Gets corporate.
     *
     * @return the corporate
     */
    public Object getCorporate() {
        return corporate;
    }

    /**
     * Sets corporate.
     *
     * @param corporate the corporate
     */
    public void setCorporate(Object corporate) {
        this.corporate = corporate;
    }

    /**
     * Gets projects.
     *
     * @return the projects
     */
    public List<Object> getProjects() {
        return projects;
    }

    /**
     * Sets projects.
     *
     * @param projects the projects
     */
    public void setProjects(List<Object> projects) {
        this.projects = projects;
    }

    /**
     * Gets note.
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets note.
     *
     * @param note the note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets created by.
     *
     * @param createdBy the created by
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    /**
     * Gets owner.
     *
     * @return the owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets owner.
     *
     * @param owner the owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets env.
     *
     * @return the env
     */
    public String getEnv() {
        return env;
    }

    /**
     * Sets env.
     *
     * @param env the env
     */
    public void setEnv(String env) {
        this.env = env;
    }

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets created at.
     *
     * @param createdAt the created at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets last updated.
     *
     * @return the last updated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets last updated.
     *
     * @param lastUpdated the last updated
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * Gets __ v.
     *
     * @return the __ v
     */
    public int get__v() {
        return __v;
    }

    /**
     * Sets __ v.
     *
     * @param __v the __ v
     */
    public void set__v(int __v) {
        this.__v = __v;
    }

    /**
     * Gets shared.
     *
     * @return the shared
     */
    public Shared getShared() {
        return shared;
    }

    /**
     * Sets shared.
     *
     * @param shared the shared
     */
    public void setShared(Shared shared) {
        this.shared = shared;
    }

    @Override
    public String toString() {
        return "PaymentCreateLinkResponseData{" +
                "_id='" + _id + '\'' +
                ", schedule=" + schedule +
                ", whatsapp=" + whatsapp +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", type='" + type + '\'' +
                ", debitLater=" + debitLater +
                ", countries=" + countries +
                ", uniqueViews=" + uniqueViews +
                ", billableProducts=" + billableProducts +
                ", data=" + data +
                ", archive=" + archive +
                ", corporate=" + corporate +
                ", projects=" + projects +
                ", note='" + note + '\'' +
                ", count=" + count +
                ", createdBy='" + createdBy + '\'' +
                ", url='" + url + '\'' +
                ", surl='" + surl + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", owner=" + owner +
                ", name='" + name + '\'' +
                ", env='" + env + '\'' +
                ", account='" + account + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", __v=" + __v +
                ", shared=" + shared +
                '}';
    }
}
