import java.util.*;

public class Item {

    private String title;
    private String genre;
    private Date releaseDate;
    private double rentalFee;
    private int id;
    public boolean availableForRent;

    public Item( String title, String genre, Date releaseDate, double rentalFee , int id) {

        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rentalFee = rentalFee;
        this.id = id;
        this.availableForRent = true;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public boolean isAvailable() {
        return availableForRent;
    }

    public void setAvailable(boolean available) {
        this.availableForRent = available;
    }
}