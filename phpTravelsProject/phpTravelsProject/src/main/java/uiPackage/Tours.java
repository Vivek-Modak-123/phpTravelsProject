package uiPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Tours {
	
	WebDriver driver;
	public Tours(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Tours')]")
	@CacheLookup WebElement tour;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"select2-tours_city-container\"]")
	@CacheLookup WebElement citi;
	
	@FindBy(how=How.XPATH, using="//body/span[1]/span[1]/span[1]/input[1]")
	@CacheLookup WebElement city;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"date\"]")
	@CacheLookup WebElement checkin;
	
	@FindBy(how=How.XPATH, using="//td[contains(text(),'23')]")
	@CacheLookup WebElement Date;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"submit\"]")
	@CacheLookup WebElement submit;
	

	public void tourWordPress(String cit) {
		// TODO Auto-generated method stub
		try {
			tour.click();
			citi.click();
			city.sendKeys(cit);
			Thread.sleep(2000);
			city.sendKeys(Keys.ENTER);
			Thread.sleep(1500);
			checkin.click();
			Date.click();
			Thread.sleep(1500);
			submit.click();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
