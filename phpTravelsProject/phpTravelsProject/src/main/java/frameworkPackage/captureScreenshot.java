package frameworkPackage;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class captureScreenshot {
	public captureScreenshot() {	
	}
	public void getScreenShot(WebDriver driver, String filepath) {
		try {
			System.out.println("In get ScreenShot Method");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File (filepath));
			System.out.println("Screenshot is taken");
		}catch(WebDriverException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
