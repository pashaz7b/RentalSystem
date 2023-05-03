import java.util.*;

public class Movie extends Item {
    private String director;
    private List<String> cast;
    private boolean availableForRent;

    public Movie(int id, String title, String genre, Date releaseDate, double rentalFee, String director, List<String> cast) {
        super(id, title, genre, releaseDate, rentalFee);
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

    public void rentMovie() {
        if (availableForRent) {
            //...
            availableForRent = false;
        } else {
            System.out.println("Sorry, this movie is not available for rent.");
        }
    }

    public void returnMovie() {
        availableForRent = true;
    }
}