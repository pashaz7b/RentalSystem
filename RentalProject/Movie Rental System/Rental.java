import java.util.*;

public class Rental {
    private Movie movie;
    private Customer customer;
    private int id;
    private Date rentalDate;
    private Date returnDate;

    public Rental(Movie movie, Customer customer, int id) {
        this.movie = movie;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public int getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date date) {
        returnDate = date;
    }

    public double calculateLateFee() {
        return 0.0;
    }
}