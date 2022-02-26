package testPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import frameworkPackage.captureScreenshot;
import uiPackage.Login;
import uiPackage.bookFlight;
import uiPackage.searchFlight;
import uiPackage.flightpayment;
import uiPackage.hotelBooking;
import uiPackage.selectHotel;
import uiPackage.signup;
import uiPackage.Tours;
import uiPackage.bookTrip;
import uiPackage.TourPayment;
import uiPackage.logout;

public class TestCaseClass extends HelperClass{
	public TestCaseClass() {
	}
	
	@Test(priority=1)
	public void signuppage() throws InterruptedException {
			System.out.println("Welcome to PHP Travels");
			driver.get("https://phptravels.com/demo");
			
//			SIGNUP
			signup su = PageFactory.initElements(driver, signup.class);
			su.signupWordPress("984634", "8498","phoneenumber","vivek@gmail", "Shivansh");
			System.out.println("Signup Successfully!");}
	
	@Test(priority=2)
	public void loginpage() throws InterruptedException {
			
//			LOGIN
			Login login = PageFactory.initElements(driver, Login.class);
			login.loginWordPress("user@phptravels.com", "demouser");
			Thread.sleep(1500);
			System.out.println("Login Successfully!");}
	
	
	@Test(priority=3)
	public void tourpage() throws InterruptedException {
			
//		    TOUR
			Tours T = PageFactory.initElements(driver, Tours.class);
			T.tourWordPress("Dubai");
			bookTrip bt = PageFactory.initElements(driver, bookTrip.class);
			bt.bookTripWordPress("2");
			TourPayment tp = PageFactory.initElements(driver, TourPayment.class);
			tp.TourPaymentWordPress("Umesh", "Singh", "Miss", "Kumari", "Neha");
			
			captureScreenshot screenShot= PageFactory.initElements(driver, captureScreenshot.class);
			screenShot.getScreenShot(driver, "./screenshot/tour.png");
			System.out.println("Trip Planned!!");
			System.out.println("Hope you enjoy your trip :)");
			Thread.sleep(2000);
			driver.navigate().to("https://www.phptravels.net/account/dashboard");
			}
	
			
	
	@Test(priority=4)
	public void flightpage() throws InterruptedException {

//			FLIGHT
			searchFlight sf = PageFactory.initElements(driver, searchFlight.class);
			sf.searchFlightWordPress("Delhi", "Dubai");
			bookFlight bf = PageFactory.initElements(driver, bookFlight.class);
			bf.bookFlightWordPress("Umesh", "Kumar", "IN", "11", "25", "2003", "DR635VSTG5", "03", "9", "03", "9");
			flightpayment fp = PageFactory.initElements(driver, flightpayment.class);
			fp.flightpaymentWordpress();
	
			captureScreenshot ScreenShot= PageFactory.initElements(driver, captureScreenshot.class);
			ScreenShot.getScreenShot(driver, "./ScreenShot/flightTicket.png");
			System.out.println("Flight Booked");
			System.out.println("Happy Journey from PHP Travels :)");
			Thread.sleep(2000);
	        driver.navigate().to("https://www.phptravels.net/account/dashboard");}
					

	@Test(priority=5)
	public void hotelpage() throws InterruptedException {

//			HOTEL
			hotelBooking hb = PageFactory.initElements(driver, hotelBooking.class);
			hb.hotelWordPress("Dubai");
			selectHotel selH = PageFactory.initElements(driver, selectHotel.class);
			selH.hotelWordPress("Majnu", "Kumar", "Miss", "Laila", "Kumari");
			captureScreenshot screenshot= PageFactory.initElements(driver, captureScreenshot.class);
			screenshot.getScreenShot(driver, "./screenshot/hotel.png");
			System.out.println("Hotel Booked");
			System.out.println("Hope you'll find the bed better than your home :)");
			Thread.sleep(2000);}

	@Test(priority=6)
	public void logoutpage() throws InterruptedException {

//	        logout
            logout l = PageFactory.initElements(driver, logout.class);
            l.logoutWordPress();
			System.out.println("Logged out");
			System.out.println("Hope you have a wonderful holiday");
	}
}