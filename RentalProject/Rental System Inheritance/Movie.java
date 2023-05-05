import java.util.*;

public class Movie extends Item {
    private String director;
    private List<String> cast;
    private boolean availableForRent;

    public Movie(String title, String genre, Date releaseDate, double rentalFee, String director, List<String> cast,int id) {
        super(title, genre, releaseDate, rentalFee , id);
        this.director = director;
        this.cast = cast;
        this.availableForRent = true;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getCast() {
        return cast;
    }

    public boolean isAvailableForRent() {
        return availableForRent;
    }

    public void setAvailableForRent(boolean availableForRent) {
        this.availableForRent = availableForRent;
    }

}