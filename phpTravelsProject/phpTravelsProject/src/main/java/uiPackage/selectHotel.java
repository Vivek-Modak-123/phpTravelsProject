package uiPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class selectHotel {
	WebDriver driver;
	public selectHotel(WebDriver driver) {
		this.driver = driver;
}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"hyatt regency perth\"]/div/div[2]/div/div[2]/div/a")
	@CacheLookup WebElement details;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"availability\"]/div[2]/div[1]/div[2]/div/div[2]/form/div/div[4]/div/div/button")
	@CacheLookup WebElement book;
	
	@FindBy(how=How.NAME, using="firstname_1")
	@CacheLookup WebElement fname1;
	
	@FindBy(how=How.NAME, using="lastname_1")
	@CacheLookup WebElement lname1;
	
	@FindBy(how=How.NAME, using="title_2")
	@CacheLookup WebElement title;
	
	@FindBy(how=How.NAME, using="firstname_2")
	@CacheLookup WebElement fname2;
	
	@FindBy(how=How.NAME, using="lastname_2")
	@CacheLookup WebElement lname2;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"gateway_wallet-balance\"]")
	@CacheLookup WebElement pay;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[4]/div/div/div/label")
	@CacheLookup WebElement tnc;
	
	@FindBy(how=How.ID, using="booking")
	@CacheLookup WebElement confirm;
	
	@FindBy(how=How.ID, using="form")
	@CacheLookup WebElement proceed;
	
	@FindBy(how=How.XPATH, using="//body/div[1]/div[1]/div[2]/form[1]/button[1]")
	@CacheLookup WebElement paynow;
	
	  public void hotelWordPress(String fn1, String ln1, String mrs,  String fn2, String ln2) {
	    	try {
	    		JavascriptExecutor jse = (JavascriptExecutor)driver;	
	    		jse.executeScript("arguments[0].click()", details);
	    		jse.executeScript("arguments[0].click()", book);
	    		Thread.sleep(2000);
	    		fname1.sendKeys(fn1);
	    		lname1.sendKeys(ln1);
	    		Thread.sleep(1000);
	    		
	    		Select sc= new Select(title);
	    		sc.selectByValue(mrs);
	    		
	    		fname2.sendKeys(fn2);
	    		lname2.sendKeys(ln2);
	    		Thread.sleep(1000);
                jse.executeScript("arguments[0].click()", pay);
                jse.executeScript("arguments[0].click()", tnc);
	    		Thread.sleep(2000);

                jse.executeScript("arguments[0].click()", confirm);
                Thread.sleep(2000);
                jse.executeScript("arguments[0].click()", proceed);

	    		Thread.sleep(2000);
                jse.executeScript("arguments[0].click()", paynow);
	    		
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}
	
	  }	
}