package uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class bookFlight {
	
	WebDriver driver;
	public bookFlight(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\"data\"]/ul/li[1]/div/form/div/div[2]/div/button")
	@CacheLookup WebElement bookNow;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/input")
	@CacheLookup WebElement fname;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/input")
	@CacheLookup WebElement lname;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select")
	@CacheLookup WebElement nationality;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[1]/select")
	@CacheLookup WebElement month;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/select")
	@CacheLookup WebElement day;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[3]/select")
	@CacheLookup WebElement year;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/input")
	@CacheLookup WebElement passportId;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[1]/select")
	@CacheLookup WebElement imonth;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div[2]/select")
	@CacheLookup WebElement iday;

	@FindBy(how=How.XPATH,using="//*[@id=\"fadein\"]/div[2]/form/section/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div/div[1]/select")
	@CacheLookup WebElement emonth;

	public void bookFlightWordPress(String firstname, String lastname,String nation,String mon,String d,String y,String ID,String im,String id,String em,String ed) {
	try {
		bookNow.click();
		Thread.sleep(1000);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		Thread.sleep(1000);
		Select s = new Select(nationality);
		s.selectByValue(nation);
		Thread.sleep(500);
		Select m = new Select(month);
		m.selectByValue(mon);
		Select n = new Select(day);
		n.selectByValue(d);
		Select o = new Select(year);
		o.selectByValue(y);
		Thread.sleep(500);
        passportId.sendKeys(ID);
		Select e = new Select(imonth);
		e.selectByValue(im);
		Select i = new Select(iday);
		i.selectByValue(id);
		Select t = new Select(emonth);
		t.selectByValue(em);

	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}	
}