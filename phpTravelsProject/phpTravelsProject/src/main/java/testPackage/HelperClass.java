package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import frameworkPackage.Browser;

public class HelperClass {
	
	public static WebDriver driver;
	Browser obj1;
	
	public HelperClass() {
	}
	@BeforeSuite
	public void beforeSuite() {	
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("in @BeforeMethod");
		HelperClass.driver=Browser.getDriver("Chrome");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("in @BeforeClass");
	}
	@AfterMethod
	public void close() {
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	@AfterSuite
	public void afterSuite() throws IOException, Exception{
	}

}
