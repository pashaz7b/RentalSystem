import java.util.*;

public class Item {
    private int id;
    private String title;
    private String genre;
    private Date releaseDate;
    protected double rentalFee;

    public Item(int id, String title, String genre, Date releaseDate, double rentalFee) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rentalFee = rentalFee;
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
}