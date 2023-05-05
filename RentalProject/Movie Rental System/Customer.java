import java.util.*;

public class Customer {
    private String name;
    private String email;
    private String phone;
    private String address;
    private int id;
    private List<Rental> rentals;

    public Customer(String name, String email, String phone, String address, int id) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
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

    public List<Rental> getRentals() {
        return rentals;
    }
}
