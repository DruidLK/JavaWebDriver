package testNgSTuff;

import org.testng.annotations.*;

public class FlightBookingTest {

	@Ignore
	@Test(priority=1)
	public void SignUp() {
		System.out.println("Signing Up");
	}
	
	@Test(priority=2)
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(priority=3)
	public void SearchForFlight() {
		System.out.println("Search for flight");
	}
	@Test(priority=4)
	public void Booking() {
		System.out.println("Booking the flight");
	}
}
