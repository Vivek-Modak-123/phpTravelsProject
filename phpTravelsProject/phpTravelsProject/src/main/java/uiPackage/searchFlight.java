package uiPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchFlight {

	WebDriver driver;
	public searchFlight(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	@CacheLookup WebElement flight;
	
	@FindBy(how=How.XPATH, using="//input[@id='autocomplete']")
	@CacheLookup WebElement from;
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Delhi, India')]")
	@CacheLookup WebElement fromcity;
	
	@FindBy(how=How.XPATH, using="//input[@id='autocomplete2']")
	@CacheLookup WebElement to;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"onereturn\"]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div[2]")
	@CacheLookup WebElement tocity;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"departure\"]")
	@CacheLookup WebElement departure;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[2]/div[1]/table/tbody/tr[6]/td[5]")
	@CacheLookup WebElement date;
		
	@FindBy(how=How.XPATH, using="//button[@id='flights-search']")
	@CacheLookup WebElement search;

	public void searchFlightWordPress(String fro, String desti) {
		try {
    		JavascriptExecutor jse = (JavascriptExecutor)driver;
			flight.click();
			from.sendKeys(fro);
			fromcity.click();
			Thread.sleep(1000);
			to.sendKeys(desti);
			tocity.click();
			Thread.sleep(1000);
			departure.click();
    		jse.executeScript("arguments[0].click()", date);
			Thread.sleep(1000);
			search.click();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
