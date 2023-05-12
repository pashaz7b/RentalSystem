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


    




}
