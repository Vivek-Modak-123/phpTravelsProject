package frameworkPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static WebDriver driver;

public Browser() {
}
public static WebDriver getDriver(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome")) {
				
		 System.setProperty("webdriver.chrome.driver", 
		 "C:\\Users\\vivek.modak\\Documents\\chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
}
				return driver;
}
}