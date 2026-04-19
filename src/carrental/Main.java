package carrental;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- Starting Car Rental System Test ---");
		
		
		Customer testCustomer = new Customer();
		testCustomer.register("Mahmoud Adan", "mahmoudAden@email.com", "0501234567", "securePass123", new Date());
		System.out.println("Customer registered successfully.");
		
		Vehicle testVehicle = new Vehicle();
		Reservation testRes = testCustomer.makeReservation(testVehicle, new Date(), new Date());
		
		System.out.println("Reservation created successfully!");
		System.out.println("Your Reservation ID is: " + testRes.getReservationID());
		
		System.out.println("--- System Test Complete ---");
	}

}