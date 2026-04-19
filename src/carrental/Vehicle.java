package carrental;


public class Vehicle {
    private String vehicleID;
    private String make;
    private String model;
    private String status;
    private VehicleCategory category;

    public void addMaintenanceRecord(MaintenanceRecord record) {
        this.status = "UnderMaintenance"; 
    }
    public VehicleCategory getCategory() { return this.category; }
}

