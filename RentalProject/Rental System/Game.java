import java.util.*;

public class Game extends Item {
    private String platform;
    private String publisher;
    private boolean availableForRent;

    public Game(int id, String title, String genre, Date releaseDate, double rentalFee, String platform, String publisher) {
        super(id, title, genre, releaseDate, rentalFee);
        this.platform = platform;
        this.publisher = publisher;
        this.availableForRent = true;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public boolean isAvailableForRent() {
        return availableForRent;
    }

    public void setAvailableForRent(boolean availableForRent) {
        this.availableForRent = availableForRent;
    }

    public void rentGame() {
        if (availableForRent) {
           //.....
            availableForRent = false;
        } else {
            System.out.println("Sorry, this game is not available for rent.");
        }
    }

    public void returnGame() {
        availableForRent = true;
    }
}