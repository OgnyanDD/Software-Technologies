package projectrider.bindingModel;

public class ProjectBindingModel {

        private String title;

        private String description;

        private Integer budget;

    // press fn + ALT + INSERT to make Getter and Setter for All,
    // then above generated Getters and Setters must generate constructor, so press fn + ALT + INSERT to make Constructor
    // then generate again empty Constructor above generated before Constructor


    public ProjectBindingModel() {
    }

    public ProjectBindingModel(String title, String description, Integer budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}