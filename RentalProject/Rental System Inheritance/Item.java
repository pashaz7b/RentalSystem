import java.util.*;

public class Item {
    
    private String title;
    private String genre;
    private Date releaseDate;
    protected double rentalFee;
    private int id;

    public Item( String title, String genre, Date releaseDate, double rentalFee , int id) {
        
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rentalFee = rentalFee;
        this.id = id;
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