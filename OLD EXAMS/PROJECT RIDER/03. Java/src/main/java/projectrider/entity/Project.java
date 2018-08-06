package projectrider.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

    @Entity
    @Table(name = "projects")
    public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String title;

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    private Integer budget;

    // press fn + ALT + INSERT to make Getter and Setter for All,
    // then above generated Getters and Setters must generate constructor, so press fn + ALT + INSERT to make Constructor
    // then generate again empty Constructor above generated before Constructor


    public Project() {
    }

    public Project(@NotNull String title, @NotNull String description, @NotNull Integer budget) {
        this.title = title;
        this.description = description;
        this.budget = budget;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NotNull String title) {
        this.title = title;
    }

    @NotNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @NotNull
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(@NotNull Integer budget) {
        this.budget = budget;
    }
}
