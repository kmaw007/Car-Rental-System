package carrental;


public class DamageReport {
    private String damageID;
    private String description;
    private Float repairCost;

    public DamageReport create(String vehicleID, String description, Float repairCost) {
        this.description = description;
        this.repairCost = repairCost;
        return this;
    }
}
