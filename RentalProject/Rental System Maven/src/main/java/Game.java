import java.util.*;

public class Game extends Item {
    private String platform;
    private String publisher;

    public Game(String title, String genre, Date releaseDate, double rentalFee, String platform, String publisher , int id) {
        super(title, genre, releaseDate, rentalFee , id);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}