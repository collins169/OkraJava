package ng.okra.api.Common.Responses.DTO;

import com.google.gson.annotations.SerializedName;

/**
 * The type Bank.
 */
public class Bank {
    @SerializedName("colors")
    private Colors colors;
    @SerializedName("icon")
    private String icon;
    @SerializedName("logo")
    private String logo;
    @SerializedName("name")
    private String name;
    @SerializedName("status")
    private String status;
    @SerializedName("v2Icon")
    private String v2Icon;
    @SerializedName("v2Logo")
    private String v2Logo;

    /**
     * Gets colors.
     *
     * @return the colors
     */
    public Colors getColors() {
        return colors;
    }

    /**
     * Sets colors.
     *
     * @param colors the colors
     */
    public void setColors(Colors colors) {
        this.colors = colors;
    }

    /**
     * Gets icon.
     *
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets icon.
     *
     * @param icon the icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
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
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets v 2 icon.
     *
     * @return the v 2 icon
     */
    public String getV2Icon() {
        return v2Icon;
    }

    /**
     * Sets v 2 icon.
     *
     * @param v2Icon the v 2 icon
     */
    public void setV2Icon(String v2Icon) {
        this.v2Icon = v2Icon;
    }

    /**
     * Gets v 2 logo.
     *
     * @return the v 2 logo
     */
    public String getV2Logo() {
        return v2Logo;
    }

    /**
     * Sets v 2 logo.
     *
     * @param v2Logo the v 2 logo
     */
    public void setV2Logo(String v2Logo) {
        this.v2Logo = v2Logo;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "colors=" + colors +
                ", icon='" + icon + '\'' +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", v2Icon='" + v2Icon + '\'' +
                ", v2Logo='" + v2Logo + '\'' +
                '}';
    }
}
