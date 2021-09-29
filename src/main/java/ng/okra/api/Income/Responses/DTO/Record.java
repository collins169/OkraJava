package ng.okra.api.Income.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Bank;

import java.util.List;

/**
 * The type Record.
 */
public class Record {
    @SerializedName("_id")
    private String _id;
    @SerializedName("billable_products")
    private List<Object> billableProducts;
    @SerializedName("bank")
    private Bank bank;
    @SerializedName("env")
    private String env;

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
     * Gets bank.
     *
     * @return the bank
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * Sets bank.
     *
     * @param bank the bank
     */
    public void setBank(Bank bank) {
        this.bank = bank;
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

    @Override
    public String toString() {
        return "Record{" +
                "_id='" + _id + '\'' +
                ", billableProducts=" + billableProducts +
                ", bank=" + bank +
                ", env='" + env + '\'' +
                '}';
    }
}
