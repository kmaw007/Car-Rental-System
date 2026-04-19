package carrental;

import java.util.Date;

public class MaintenanceRecord {
    private Date date;
    private String description;
    private Float cost;

    public MaintenanceRecord create(Date date, String description, Float cost) {
        this.date = date;
        this.description = description;
        this.cost = cost;
        return this;
    }
}
