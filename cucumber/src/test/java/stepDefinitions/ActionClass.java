package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionClass extends BaseClass {

	public void CaptureScreenshot(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File(".\\screenshot\\hudini " + System.currentTimeMillis() + ".png");
		// Always end with .png in order to get the Screenshot as image
		String absolutpathlocation = destinationfile.getAbsolutePath();
		FileUtils.copyFile(srcfile, destinationfile);
		System.out.println(absolutpathlocation);
	}

	public void Dropdown(WebDriver driver, WebElement ele) {

		// Select dropdown=new Select(ele);

	}

	public void isdisplayed(WebDriver driver, WebElement ele) throws InterruptedException {
		Thread.sleep(1000);
		boolean displaying = ele.isDisplayed();
		// System.out.println(displaying);

		if (displaying = true) {
			System.out.println("Element is displaying successfully and tagname is ->" + ele.getTagName());
		}

		else {
			System.out.println("Element is not  displaying and  tagname is ->" + ele.getTagName());
		}
	}

	public void isenabled(WebDriver driver, WebElement ele) throws InterruptedException {
		Thread.sleep(1000);
		boolean enabled = ele.isEnabled();
		// System.out.println(enabled);

		if (enabled = true) {
			System.out.println("Element is enabled and element text is ->" + ele.getText());
		}

		else {
			System.out.println("Element is not enabled and  element text is ->" + ele.getText());
		}
	}

	public void URLvalidation(WebDriver driver, String expectedURl) {
		
		System.out.println(expectedURl);
		
		String actualurl = driver.getCurrentUrl();
		System.out.println(actualurl);
      
		assertEquals(actualurl, expectedURl);

	}
}
