package uiPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
    @CacheLookup WebElement username;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
    @CacheLookup WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
    @CacheLookup WebElement login;
	

	public void loginWordPress(String use, String pass) {
	try {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
			username.sendKeys(use);
			Thread.sleep(2000);
			password.sendKeys(pass);
			Thread.sleep(2000);
			login.click();
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	           
}
