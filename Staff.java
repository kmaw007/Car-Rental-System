package carrental;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class Staff {
    protected String staffID;
    private String name;
    private String email;
    private String role;

    public Boolean login(String email, String password) { return true; }
    public void logout() {}
    public void updateProfile(String name, String email) {}
    public Staff getStaffDetails() { return this; }
    
    public class VehicleReturn {
    private String returnID;
    private Date returnDate; 
    private String conditionStatus; 

    }}