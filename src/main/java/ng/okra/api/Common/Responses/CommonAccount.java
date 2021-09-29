package ng.okra.api.Common.Responses;


import com.google.gson.annotations.*;

/**
 * The type Common account.
 */
public class CommonAccount {
    /**
     * The Id.
     */
    @SerializedName("_id")
    public String Id;
    /**
     * The Name.
     */
    @SerializedName("name")
    public String Name;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return Id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        Id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "CommonAccount{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }
}
