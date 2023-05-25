import java.util.*;

public class Rental{

    private Item item;
    private Customer customer;
    private Movie movie;
    private Game game;
    private Book book;
    private int id;
    private Date rentalDate;
    private Date returnDate;

    public Rental(Item item , Customer customer , int id){
        this.item = item;
        this.customer = new Customer(customer.getName(), customer.getEmail(), customer.getPhone(), customer.getAddress(), customer.getId());
        this.id = id;
        this.rentalDate = new Date();
    }

    public Rental(Movie movie , Customer customer , int id) {
        this.movie = movie;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public Rental(Game game , Customer customer , int id) {
        this.game = game;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public Rental(Book book , Customer customer , int id) {
        this.book = book;
        this.customer = customer;
        this.id = id;
        this.rentalDate = new Date();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public Game getGame() {
        return game;
    }

    public Book getBook() {
        return book;
    }

    public int getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }

    public double calculateFee(){
        double feePerDay = 1.2;
        return (feePerDay*(returnDate.getDate()-rentalDate.getDay()));
    }

}