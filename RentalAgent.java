package carrental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgent extends Staff {
    private String branchID;
    private String agentCode;

    public RentalContract processReservation(Reservation reservation, String rentalType) { 
        RentalContract contract = new RentalContract();
        return contract.generate(reservation.getReservationID(), this.staffID, rentalType);
    }
    public void checkInVehicle(String vehicleID) {}
    public DamageReport createDamageReport(String vehicleID, String description) { return new DamageReport(); }
    public List<Vehicle> viewAvailableVehicles(String branchID) { return new ArrayList<>(); }
}
