package ng.okra.api.Common.Responses.DTO;

/**
 * The type Colors.
 */
public class Colors {
    private String primary;
    private String accent;
    private String bg;
    private String button;
    private String icon;

    /**
     * Gets primary.
     *
     * @return the primary
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets primary.
     *
     * @param primary the primary
     */
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    /**
     * Gets accent.
     *
     * @return the accent
     */
    public String getAccent() {
        return accent;
    }

    /**
     * Sets accent.
     *
     * @param accent the accent
     */
    public void setAccent(String accent) {
        this.accent = accent;
    }

    /**
     * Gets bg.
     *
     * @return the bg
     */
    public String getBg() {
        return bg;
    }

    /**
     * Sets bg.
     *
     * @param bg the bg
     */
    public void setBg(String bg) {
        this.bg = bg;
    }

    /**
     * Gets button.
     *
     * @return the button
     */
    public String getButton() {
        return button;
    }

    /**
     * Sets button.
     *
     * @param button the button
     */
    public void setButton(String button) {
        this.button = button;
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

    @Override
    public String toString() {
        return "Colors{" +
                "primary='" + primary + '\'' +
                ", accent='" + accent + '\'' +
                ", bg='" + bg + '\'' +
                ", button='" + button + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
