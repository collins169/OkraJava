package ng.okra.api.Common.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Owner.
 */
public class Owner {
    @SerializedName("_id")
    private String _id;
    @SerializedName("name")
    private String name;

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

    @Override
    public String toString() {
        return "Owner{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
