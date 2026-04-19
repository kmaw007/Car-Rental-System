package carrental;

import java.util.List;
import java.util.ArrayList;

public class BranchLocation {
    private String branchID;
    private String address;
    private String city;
    private String phone;

    public List<Vehicle> getAvailableVehicles() { 
        return new ArrayList<>(); 
    }
    
    public BranchLocation getBranchDetails() { 
        return this; 
    }
}