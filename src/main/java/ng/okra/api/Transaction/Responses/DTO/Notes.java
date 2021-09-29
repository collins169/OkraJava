package ng.okra.api.Transaction.Responses.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Notes.
 */
public class Notes {
    @SerializedName("desc")
    private String desc;
    @SerializedName("topics")
    private List<Object> topics;
    @SerializedName("places")
    private List<Object> places;
    @SerializedName("people")
    private List<Object> people;
    @SerializedName("actions")
    private List<String> actions;
    @SerializedName("subjects")
    private List<String> subjects;
    @SerializedName("prepositions")
    private List<Object> prepositions;

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets topics.
     *
     * @return the topics
     */
    public List<Object> getTopics() {
        return topics;
    }

    /**
     * Sets topics.
     *
     * @param topics the topics
     */
    public void setTopics(List<Object> topics) {
        this.topics = topics;
    }

    /**
     * Gets places.
     *
     * @return the places
     */
    public List<Object> getPlaces() {
        return places;
    }

    /**
     * Sets places.
     *
     * @param places the places
     */
    public void setPlaces(List<Object> places) {
        this.places = places;
    }

    /**
     * Gets people.
     *
     * @return the people
     */
    public List<Object> getPeople() {
        return people;
    }

    /**
     * Sets people.
     *
     * @param people the people
     */
    public void setPeople(List<Object> people) {
        this.people = people;
    }

    /**
     * Gets actions.
     *
     * @return the actions
     */
    public List<String> getActions() {
        return actions;
    }

    /**
     * Sets actions.
     *
     * @param actions the actions
     */
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    /**
     * Gets subjects.
     *
     * @return the subjects
     */
    public List<String> getSubjects() {
        return subjects;
    }

    /**
     * Sets subjects.
     *
     * @param subjects the subjects
     */
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    /**
     * Gets prepositions.
     *
     * @return the prepositions
     */
    public List<Object> getPrepositions() {
        return prepositions;
    }

    /**
     * Sets prepositions.
     *
     * @param prepositions the prepositions
     */
    public void setPrepositions(List<Object> prepositions) {
        this.prepositions = prepositions;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "desc='" + desc + '\'' +
                ", topics=" + topics +
                ", places=" + places +
                ", people=" + people +
                ", actions=" + actions +
                ", subjects=" + subjects +
                ", prepositions=" + prepositions +
                '}';
    }
}
