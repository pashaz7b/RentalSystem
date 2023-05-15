import java.util.*;

public class RentalStore {
    
    private List<Customer> customers = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();
    private List<Book> books= new ArrayList<>();
    private List<Game> games = new ArrayList<>();


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

    public void addBook(Book book) {
        boolean flag = false;
        for(Book b : books)
        {
            if(b.getId()==book.getId())
            {
                System.out.println("THIS BOOK HAS BEEN ADDED BEFORE!!!");
                flag = true;
                break;
            }
        }
        if(!flag){
            books.add(book);
            System.out.println("THE BOOK HAS BEEN ADDED SUCCESSFULLY!");
        }
    }

    public void addGame(Game game) {
        boolean flag = false;
        for(Game g : games)
        {
            if(g.getId()==game.getId())
            {
                System.out.println("THIS GAME HAS BEEN ADDED BEFORE!!!");
                flag = true;
                break;
            }
        }
        if(!flag){
            games.add(game);
            System.out.println("THE GAME HAS BEEN ADDED SUCCESSFULLY!");
        }
    }

    public void removeMovie(Movie movie) {
        boolean found = false;
        for (Movie m : movies)
        {
            if(m.getId()== movie.getId() && m.isAvailableForRent())
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

    public void removeBook(Book book) {
        boolean found = false;
        for (Book b : books)
        {
            if(b.getId()== book.getId() && b.isAvailableForRent())
            {
                books.remove(book);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("COULDN'T FIND THE BOOK! ");
        }
    }

    public void removeGame(Game game) {
        boolean found = false;
        for (Game g : games)
        {
            if(g.getId()== game.getId() && g.isAvailableForRent())
            {
                games.remove(game);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("COULDN'T FIND THE GAME! ");
        }
    }

    public List<Movie> getAvailableMovies() {

        List<Movie> availableMovieList = new ArrayList<>();

        for (Movie m : movies)
        {
            if(m.isAvailableForRent())
            {
                availableMovieList.add(m);
            }
        }

        return availableMovieList;
    }

    public List<Book> getAvailableBooks() {

        List<Book> availableBookList = new ArrayList<>();

        for (Book b : books)
        {
            if(b.isAvailableForRent())
            {
                availableBookList.add(b);
            }
        }

        return availableBookList;
    }

    public List<Game> getAvailableGames() {

        List<Game> availableGameList = new ArrayList<>();

        for (Game g : games)
        {
            if(g.isAvailableForRent())
            {
                availableGameList.add(g);
            }
        }

        return availableGameList;
    }

    public void rentMovie(Movie movie, Customer customer) {

        boolean existed = false;
        boolean rented = false;
        
        for (Movie m : movies)
        {
            if(m.getId()==movie.getId())
            {
                existed = true;

                if(m.isAvailableForRent()==true)
                {
                    String str1 = Integer.toString(movie.getId()) + Integer.toString(customer.getId());
                    int id = Integer.parseInt(str1);
                    Rental rental = new Rental(movie, customer, id);
                    customer.getRentals().add(rental);
                    movie.setAvailableForRent(false);
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

    public void rentBook(Book book , Customer customer) {

        boolean existed = false;
        boolean rented = false;
        
        for (Book b : books)
        {
            if(b.getId()==book.getId())
            {
                existed = true;

                if(b.isAvailableForRent()==true)
                {
                    String str1 = Integer.toString(book.getId()) + Integer.toString(customer.getId());
                    int id = Integer.parseInt(str1);
                    Rental rental = new Rental(book, customer, id);
                    customer.getRentals().add(rental);
                    book.setAvailableForRent(false);
                    rented = true;
                    System.out.println("YOU HAVE SUCCESSFULLY RENTED THIS BOOK!");
                    break;
                }

            }
        }

        if (!existed)
        {
            System.out.println("SORRY THERE IS NO BOOK WITH THIS INFORMATION");
        }
        if(existed && !rented )
        {
            System.out.println("SORRY THIS BOOK HAS BEEN RENTED");
        }
    }

    public void rentGame(Game game , Customer customer) {

        boolean existed = false;
        boolean rented = false;
        
        for (Game g : games)
        {
            if(g.getId()==game.getId())
            {
                existed = true;

                if(g.isAvailableForRent()==true)
                {
                    String str1 = Integer.toString(game.getId()) + Integer.toString(customer.getId());
                    int id = Integer.parseInt(str1);
                    Rental rental = new Rental(game , customer, id);
                    customer.getRentals().add(rental);
                    game.setAvailableForRent(false);
                    rented = true;
                    System.out.println("YOU HAVE SUCCESSFULLY RENTED THIS GAME!");
                    break;
                }

            }
        }

        if (!existed)
        {
            System.out.println("SORRY THERE IS NO GAME WITH THIS INFORMATION");
        }
        if(existed && !rented )
        {
            System.out.println("SORRY THIS GAME HAS BEEN RENTED");
        }
    }

    public void returnMovie(Rental rental) {

        int i=0;
        boolean flag = false;

        for(Customer c : customers)
        {
            if (c.getRentals().get(i).getId()==rental.getId())
            {
                rental.getMovie().setAvailableForRent(true);
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

    public void returnBook(Rental rental) {

        int i=0;
        boolean flag = false;

        for(Customer c : customers)
        {
            if (c.getRentals().get(i).getId()==rental.getId())
            {
                rental.getBook().setAvailableForRent(true);
                rental.setReturnDate(new Date());
                c.getRentals().remove(i);
                System.out.println("YOU HAVE SUCCESSFULLY RETURNED THIS BOOK!");
                flag = true;
                break;
            }
            
            i++;
        }

        if(!flag){
            System.out.println("SORRY THERE IS PROBLEM WITH YOUR ORDER");
        } 
    }

    public void returnGame(Rental rental) {

        int i=0;
        boolean flag = false;

        for(Customer c : customers)
        {
            if (c.getRentals().get(i).getId()==rental.getId())
            {
                rental.getGame().setAvailableForRent(true);
                rental.setReturnDate(new Date());
                c.getRentals().remove(i);
                System.out.println("YOU HAVE SUCCESSFULLY RETURNED THIS GAME!");
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

    public Book getBookById(int id) {

        for (Book book : books)
        {
            if (book.getId() == id) {
                System.out.println("HERE IS YOUR ORDER : ");
                return book;
            }
        }

        System.out.println("SORRY COULDN'T FIND THE BOOK");
        return null;
    }

    public Game getGameById(int id) {

        for (Game game : games)
        {
            if (game.getId() == id) {
                System.out.println("HERE IS YOUR ORDER : ");
                return game;
            }
        }

        System.out.println("SORRY COULDN'T FIND THE GAME");
        return null;
    }
}


