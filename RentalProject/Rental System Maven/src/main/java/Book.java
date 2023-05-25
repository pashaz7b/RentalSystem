import java.util.*;

class Book extends Item {
    private String author;
    private String publisher;

    public Book(String title, String genre, Date releaseDate, double rentalFee, String author, String publisher, int id) {
        super(title, genre, releaseDate, rentalFee, id);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}