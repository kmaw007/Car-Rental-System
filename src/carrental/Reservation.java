package carrental;

import java.util.Date;

public class Reservation {
    private String reservationID;
    private Date startDate;
    private Date endDate;
    private String status;

    private Customer customer;
    private Vehicle vehicle;

    public Reservation create(Customer customer, Vehicle vehicle, Date startDate, Date endDate) {
        this.reservationID = java.util.UUID.randomUUID().toString();
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "Confirmed";
        return this;
    }
    
    public Integer calculateDuration() { return 5; } // Mocked duration calculation
    public String getReservationID() { return this.reservationID; }
    public Vehicle getVehicle() { return this.vehicle; }
}
