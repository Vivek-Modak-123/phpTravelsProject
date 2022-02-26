package uiPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class flightpayment {
	WebDriver driver;
	public flightpayment(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="//*[@id=\"gateway_wallet-balance\"]")
	@CacheLookup WebElement pay;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[4]/div/div/div/label")
	@CacheLookup WebElement tnc;
	
	@FindBy(how=How.ID, using="booking")
	@CacheLookup WebElement confirm;
	
	@FindBy(how=How.ID, using="form")
	@CacheLookup WebElement proceed;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"form\"]")
	@CacheLookup WebElement paynow;
	
	public void flightpaymentWordpress() {
		try {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()", pay);
         jse.executeScript("arguments[0].click()", tnc);
 		 Thread.sleep(1500);
         jse.executeScript("arguments[0].click()", confirm);
         Thread.sleep(1500);
         jse.executeScript("arguments[0].click()", proceed);
       	Thread.sleep(1500);
        jse.executeScript("arguments[0].click()", paynow);

 		
 	} catch (InterruptedException e) {
 		e.printStackTrace();
 	}

	}

}
