package uiPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signup {

	WebDriver driver;
	public signup(WebDriver driver) {
	this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small")
    @CacheLookup WebElement site;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/a[1]")
	@CacheLookup WebElement clisignup;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"cookie_stop\"]")
    @CacheLookup WebElement gotit;

	@FindBy(how=How.NAME, using="first_name")
	@CacheLookup WebElement fname;
	
	@FindBy(how=How.NAME, using="last_name")
	@CacheLookup WebElement lname;
	
	@FindBy(how=How.NAME, using="phone")
	@CacheLookup WebElement phone;
	
	@FindBy(how=How.NAME, using="email")
	@CacheLookup WebElement email;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[7]/button")
	@CacheLookup WebElement signup;
	
	public void signupWordPress(String fn, String ln, String ph, String em, String pass) throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()", site);
		Thread.sleep(2000);
		
		Set<String> mswindow = driver.getWindowHandles();
		Iterator<String> i = mswindow.iterator();
		String mainwindow = i.next();
		String mswin = i.next();
		
		driver.switchTo().window(mswin);
		
		jse.executeScript("arguments[0].click()", clisignup);
		Thread.sleep(2000);

		gotit.click();
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		Thread.sleep(2000);

		phone.sendKeys(ph);
		Thread.sleep(2000);

		email.sendKeys(em);
		Thread.sleep(2000);

		password.sendKeys(pass);
		Thread.sleep(15000);
		
		jse.executeScript("arguments[0].click()", signup);
	}
}