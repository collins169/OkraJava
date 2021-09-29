package ng.okra.api.Common.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.DTO.Bank;

/**
 * The type Account.
 */
public class Account {
    @SerializedName("_id")
    private String _id;
    @SerializedName("name")
    private String name;
    @SerializedName("nuban")
    private String nuban;
    @SerializedName("bank")
    private Bank bank;

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
     * Gets nuban.
     *
     * @return the nuban
     */
    public String getNuban() {
        return nuban;
    }

    /**
     * Sets nuban.
     *
     * @param nuban the nuban
     */
    public void setNuban(String nuban) {
        this.nuban = nuban;
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

    @Override
    public String toString() {
        return "Account{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", nuban='" + nuban + '\'' +
                ", bank=" + bank +
                '}';
    }
}
