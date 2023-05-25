import java.util.*;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private String address;
    private int id;
    public ArrayList<Rental> rentals;

    public Customer(String name, String email, String phone, String address, int id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
        this.rentals = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

    public void addRent(Rental rental){
        if (rentals == null){
            rentals = new ArrayList<>();
        }
        rentals.add(rental);
    }

}
