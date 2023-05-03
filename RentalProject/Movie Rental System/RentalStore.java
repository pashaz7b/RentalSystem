import java.util.*;

public class RentalStore {
    private List<Movie> movies;
    private List<Customer> customers;

    public RentalStore() {
        movies = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void register(Customer customer) {
        customers.add(customer);
        System.out.println("YOU HAVE BEEN REGISTERED SUCCESSFULLY!");   
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("THE MOVIE HAS BEEN ADDED SUCCESSFULLY!");
    }

    public void removeMovie(Movie movie) {
        boolean found = false;
        for (Movie m : movies)
        {
            if(m.getId()== movie.getId() && m.isAvailable())
            {
                movies.remove(movie);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("COULDN'T FIND THE MOVIE! ");
        }
        
    }

    public List<Movie> getAvailableMovies() {

        List<Movie> availableMovieList = new ArrayList<>();

        for (Movie m : movies)
        {
            if(m.isAvailable())
            {
                availableMovieList.add(m);
            }
        }

        return availableMovieList;
    }

    public void rentMovie(Movie movie, Customer customer) {

        boolean existed = false;
        boolean rented = false;
        
        for (Movie m : movies)
        {
            if(m.getId()==movie.getId())
            {
                existed = true;

                if(m.isAvailable()==true)
                {
                    String str1 = Integer.toString(movie.getId()) + Integer.toString(customer.getId());
                    int id = Integer.parseInt(str1);
                    Rental rental = new Rental(movie, customer, id);
                    customer.getRentals().add(rental);
                    movie.setAvailable(false);
                    rented = true;
                    System.out.println("YOU HAVE SUCCESSFULLY RENTED THIS MOVIE!");
                }

            }
        }

        if (!existed)
        {
            System.out.println("SORRY THERE IS NO MOVIE WITH THIS INFORMATION");
        }
        if(existed && !rented )
        {
            System.out.println("SORRY THI MOVIE HAS BEEN RENTED");
        }


    }

    public void returnMovie(Rental rental) {

        int i=0;
        for(Customer c : customers)
        {
            if (c.getRentals().get(i).getId()==rental.getId())
            {
                rental.getMovie().setAvailable(true);
                rental.setReturnDate(new Date());
                c.getRentals().remove(i);
                System.out.println("YOU HAVA SUCCESSFULLY RETURNED THIS MOVIE!");
                break;
            }
            
            i++;
        }
        
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
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}