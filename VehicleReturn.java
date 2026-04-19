package carrental;

import java.util.Date;


public class VehicleReturn {
    private String returnID;
    private Date returnDate; 
    private String conditionStatus; 

    public VehicleReturn processReturn(String contractID, Date returnDate, String conditionStatus) {
        this.returnDate = returnDate;
        this.conditionStatus = conditionStatus;
        return this;
    }
}


