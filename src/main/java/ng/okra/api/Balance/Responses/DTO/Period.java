package ng.okra.api.Balance.Responses.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Period.
 */
public class Period {
    @SerializedName("available_balance")
    private List<AvailableBalance> availableBalance;
    @SerializedName("ledger_balance")
    private List<LegerBalance> legerBalance;

    /**
     * Gets available balance.
     *
     * @return the available balance
     */
    public List<AvailableBalance> getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets available balance.
     *
     * @param availableBalance the available balance
     */
    public void setAvailableBalance(List<AvailableBalance> availableBalance) {
        this.availableBalance = availableBalance;
    }

    /**
     * Gets leger balance.
     *
     * @return the leger balance
     */
    public List<LegerBalance> getLegerBalance() {
        return legerBalance;
    }

    /**
     * Sets leger balance.
     *
     * @param legerBalance the leger balance
     */
    public void setLegerBalance(List<LegerBalance> legerBalance) {
        this.legerBalance = legerBalance;
    }

    @Override
    public String toString() {
        return "Period{" +
                "availableBalance=" + availableBalance +
                ", legerBalance=" + legerBalance +
                '}';
    }
}
