package carrental;

import java.util.Date;

public class RentalContract {
    private String contractID;
    private Date signedDate;
    private Float totalCost;
    private String rentalType; 
    private String terms;

    private Reservation linkedReservation;

    public Float calculateTotalCost(Integer days, Float dailyRate) {
        this.totalCost = days * dailyRate;
        return this.totalCost;
    }

    public RentalContract generate(String reservationID, String agentID, String rentalType) {
        this.contractID = java.util.UUID.randomUUID().toString();
        this.rentalType = rentalType;
        return this;
    }
}

