package ng.okra.api.Transaction.Responses.DTO;

import com.google.gson.annotations.SerializedName;
import ng.okra.api.Common.Responses.CommonAccount;
import ng.okra.api.Common.Responses.CommonCustomer;
import ng.okra.api.Common.Responses.DTO.Bank;

import java.util.List;

/**
 * The type Transaction.
 */
public class Transaction {
    @SerializedName("_id")
    private String _id;
    @SerializedName("notes")
    private Notes notes;
    @SerializedName("manual")
    private boolean manual;
    @SerializedName("reconciled")
    private boolean reconciled;
    @SerializedName("fetched")
    private List<String> fetched;
    @SerializedName("record")
    private List<String> record;
    @SerializedName("actions")
    private List<Object> actions;
    @SerializedName("analyzed")
    private List<String> analyzed;
    @SerializedName("ner")
    private Ner ner;
    @SerializedName("ner_v")
    private int ner_v;
    @SerializedName("location")
    private Object location;
    @SerializedName("trans_date")
    private String transDate;
    @SerializedName("cleared_date")
    private String clearedDate;
    @SerializedName("unformatted_trans_date")
    private String unformattedTransDate;
    @SerializedName("unformatted_cleared_date")
    private String unformattedClearedDate;
    @SerializedName("debit")
    private long debit;
    @SerializedName("ref")
    private String ref;
    @SerializedName("bank")
    private Bank bank;
    @SerializedName("customer")
    private CommonCustomer customer;
    @SerializedName("account")
    private CommonAccount account;
    @SerializedName("env")
    private String env;
    @SerializedName("checked")
    private List<Object> checked;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("__v")
    private String __v;
    @SerializedName("id")
    private String id;
}
