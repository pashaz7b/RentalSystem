import java.util.*;

public class RentalStore {

    private List<Movie> movies = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();

    public void register(Customer customer) {
        boolean flag = false;
        for(Customer c : customers)
        {
            if(c.getId()==customer.getId())
            {
                System.out.println("AN ACCOUNT IS ALREADY REGISTERED HERE WITH THIS INFO!!!");
                flag = true;
                break;
            }
        }
        if(!flag){
            customers.add(customer);
            System.out.println("YOU HAVE BEEN REGISTERED SUCCESSFULLY!");   
        }
        
    }

    public void addMovie(Movie movie) {
        boolean flag = false;
        for(Movie m : movies)
        {
            if(m.getId()==movie.getId())
            {
                System.out.println("THIS MOVIE HAS BEEN ADDED BEFORE!!!");
                flag = true;
                break;
            }
        }
        if(!flag){
            movies.add(movie);
            System.out.println("THE MOVIE HAS BEEN ADDED SUCCESSFULLY!");
        }
       
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
                    break;
                }

            }
        }

        if (!existed)
        {
            System.out.println("SORRY THERE IS NO MOVIE WITH THIS INFORMATION");
        }
        if(existed && !rented )
        {
            System.out.println("SORRY THIS MOVIE HAS BEEN RENTED");
        }
    }

    public void returnMovie(Rental rental) {

        int i=0;
        boolean flag = false;

        for(Customer c : customers)
        {
            if (c.getRentals().get(i).getId()==rental.getId())
            {
                rental.getMovie().setAvailable(true);
                rental.setReturnDate(new Date());
                c.getRentals().remove(i);
                System.out.println("YOU HAVE SUCCESSFULLY RETURNED THIS MOVIE!");
                flag = true;
                break;
            }
            
            i++;
        }

        if(!flag){
            System.out.println("SORRY THERE IS PROBLEM WITH YOUR ORDER");
        }
        
    }

    public Customer getCustomerById(int id) {

        for (Customer customer : customers)
        {
            if (customer.getId() == id) {
                System.out.println("HERE IS YOUR ORDER :");
                return customer;
            }
        }

        System.out.println("SORRY COULDN'T FIND THE CUSTOMER");
        return null;
    }

    public Movie getMovieById(int id) {

        for (Movie movie : movies)
        {
            if (movie.getId() == id) {
                System.out.println("HERE IS YOUR ORDER : ");
                return movie;
            }
        }

        System.out.println("SORRY COULDN'T FIND THE MOVIE");
        return null;
    }
}