import java.util.*;

class Book extends Item {
    private String author;
    private String publisher;
    private boolean availableForRent;

    public Book(int id, String title, String genre, Date releaseDate, double rentalFee, String author, String publisher) {
        super(id, title, genre, releaseDate, rentalFee);
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

    public void rentBook() {
        if (availableForRent) {
           //.....
            availableForRent = false;
        } else {
            System.out.println("Sorry, this book is not available for rent.");
        }
    }
    
    public void returnBook() {
        availableForRent = true;
    }
}