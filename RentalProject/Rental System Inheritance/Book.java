import java.util.*;

class Book extends Item {
    private String author;
    private String publisher;
    private boolean availableForRent;

    public Book(String title, String genre, Date releaseDate, double rentalFee, String author, String publisher , int id) {
        super(title, genre, releaseDate, rentalFee , id);
        this.author = author;
        this.publisher = publisher;
        this.availableForRent = true;
    }

    public String getAuthor() {
        return author;
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
    
}