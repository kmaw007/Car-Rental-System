package carrental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private String customerID;
    private String name;
    private String email;
    private String phone;
    private String password; 
    private Date dateOfBirth; 
    private String licenseNumber;
    private Date licenseExpiry;

    private List<Reservation> reservations = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    public Customer register(String name, String email, String phone, String password, Date dateOfBirth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public List<Vehicle> searchVehicles(String categoryID, String branchID, Date startDate, Date endDate) { 
        return new ArrayList<>(); 
    }

    public Reservation makeReservation(Vehicle vehicle, Date startDate, Date endDate) { 
        Reservation res = new Reservation();
        return res.create(this, vehicle, startDate, endDate);
    }
    
    public Review submitReview(String rentalContractID, Integer rating, String comment) { 
        return new Review().submit(this.customerID, rentalContractID, rating, comment); 
    }
}

