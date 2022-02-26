package uiPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class hotelBooking {
	
	WebDriver driver;
	public hotelBooking(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")
	@CacheLookup WebElement hotel;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"select2-hotels_city-container\"]")
	@CacheLookup WebElement citi;
	
	@FindBy(how=How.XPATH, using="//body/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup WebElement city;
	
	@FindBy(how=How.XPATH, using="//input[@id='checkin']")
	@CacheLookup WebElement checkin;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]")
	@CacheLookup WebElement checkinD;
	
	@FindBy(how=How.XPATH, using="//input[@id='checkout']")
	@CacheLookup WebElement checkout;
	
	@FindBy(how=How.XPATH, using="//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[4]/td[1]")
	@CacheLookup WebElement checkoutD;
	
	@FindBy(how=How.XPATH, using="//button[@id='submit']")
	@CacheLookup WebElement submit;
	
    public void hotelWordPress(String cit) {
    	try {
    		hotel.click();
    		citi.click();
    		city.sendKeys(cit);
    		Thread.sleep(2000);
    		city.sendKeys(Keys.ENTER);
    		Thread.sleep(1000);
    		checkin.click();
    		checkinD.click();
    		Thread.sleep(2000);
    		checkout.click();
    		checkoutD.click();
    		Thread.sleep(2000);
    		submit.click();
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    }
}
