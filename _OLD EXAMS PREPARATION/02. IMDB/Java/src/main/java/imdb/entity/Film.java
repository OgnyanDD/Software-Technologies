package imdb.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private  String genre;

    @Column
    @NotNull
    private  String director;

    @Column
    @NotNull
    private Integer year;

    public Film() {
    }

    public Film(@NotNull String name, @NotNull String genre, @NotNull String director, @NotNull Integer year) {
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public String getGenre() {
        return genre;
    }

    public void setGenre(@NotNull String genre) {
        this.genre = genre;
    }

    @NotNull
    public String getDirector() {
        return director;
    }

    public void setDirector(@NotNull String director) {
        this.director = director;
    }

    @NotNull
    public Integer getYear() {
        return year;
    }

    public void setYear(@NotNull Integer year) {
        this.year = year;
    }
}
