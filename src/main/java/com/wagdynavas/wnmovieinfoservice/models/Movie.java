package com.wagdynavas.wnmovieinfoservice.models;


public class Movie {

    private String id;
    private String title;
    private String description;

    public Movie(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Movie() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (id != null ? !id.equals(movie.id) : movie.id != null) return false;
        if (title != null ? !title.equals(movie.title) : movie.title != null) return false;
        return description != null ? description.equals(movie.description) : movie.description == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie ["
                + ((id != null) ? "id=" + id + ", " : "")
                + ((title != null) ? "title=" + title + ", " : "")
                + ((description != null) ? "description=" + description : "")
                + "]";
    }
}
