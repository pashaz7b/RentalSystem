import java.util.*;

public class Movie {
    private String title;
    private String genre;
    private String director;
    private String cast;
    private Date releaseDate;
    private int id;
    private boolean available;

    public Movie(String title, String genre, String director, String cast, Date releaseDate, int id) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.id = id;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        available = status;
    }
}