import java.util.*;

public class RentalStore {
    private List<Movie> availableMovies;
    private List<Customer> customers;
    private List<Rental> rentals;

    public RentalStore() {
        availableMovies = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void register(Customer customer) {
        customers.add(customer);
    }

    public void addMovie(Movie movie) {
        availableMovies.add(movie);
    }

    public void removeMovie(Movie movie) {
        availableMovies.remove(movie);
    }

    public List<Movie> getAvailableMovies() {
        return availableMovies;
    }

    public void rentMovie(Movie movie, Customer customer) {
        Rental rental = new Rental(movie, customer, rentals.size() + 1);
        rentals.add(rental);
        movie.setAvailable(false);
    }

    public void returnMovie(Rental rental) {
        rental.getMovie().setAvailable(true);
        rental.setReturnDate(new Date());
    }

    public Customer getCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public Movie getMovieById(int id) {
        for (Movie movie : availableMovies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}