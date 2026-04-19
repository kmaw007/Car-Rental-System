package carrental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Administrator extends Staff {
    private String accessLevel;
    private String department;


    public void manageVehicleCategory(VehicleCategory category) {}
    public List<BranchLocation> viewAllBranches() { return new ArrayList<>(); }

    public Object generateReservationReport(String branchID, Date startDate, Date endDate) { return null; }
    public Object generateRevenueReport(String branchID, Date startDate, Date endDate) { return null; }
}


