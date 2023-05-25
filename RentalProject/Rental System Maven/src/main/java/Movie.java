import java.util.*;

public class Movie extends Item {
    private String director;
    private String cast;

    public Movie(String title, String genre, Date releaseDate, double rentalFee, String director, String cast,int id) {
        super(title, genre, releaseDate, rentalFee , id);
        this.director = director;
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
}