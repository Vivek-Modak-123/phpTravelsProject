package uiPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class bookTrip {
	
	WebDriver driver;
	public bookTrip(WebDriver driver) {
		this.driver = driver;

}
	@FindBy(how=How.XPATH, using="//*[@id=\"sheraton trip\"]/div/div[2]/div/div[2]/div/a")
	@CacheLookup WebElement details;
	
	@FindBy(how=How.XPATH, using="//select[@id='adults']")
    @CacheLookup WebElement adultno;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/section[2]/div[2]/div/div/div[2]/div/div/div/form/div[3]/button")
    @CacheLookup WebElement bookNow;
	
	public void bookTripWordPress(String num) throws InterruptedException {
		
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	jse.executeScript("arguments[0].click()", details);
	
	Select sc= new Select(adultno);
	sc.selectByValue(num);
	
	jse.executeScript("arguments[0].click()", bookNow);
		}
}
