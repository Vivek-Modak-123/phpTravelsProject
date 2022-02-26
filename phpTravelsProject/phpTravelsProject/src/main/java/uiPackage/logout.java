package uiPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logout {
	WebDriver driver;
	public logout(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="/html/body/header/div[1]/div/div/div[2]/div/div/div[3]/div/button")
	@CacheLookup WebElement account;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[3]/div/ul/li[5]/a")
	@CacheLookup WebElement logout;
	
	public void logoutWordPress() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", account);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].click()", logout);
		Thread.sleep(3000);

	}



}
