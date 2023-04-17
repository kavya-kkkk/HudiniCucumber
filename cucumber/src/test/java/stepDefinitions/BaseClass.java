package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.AddClientpage;
import pageObjects.AddDeviceClientPage;
import pageObjects.EditClientPPage;
import pageObjects.SigninPage;

public class BaseClass { // this class for store all the common datas

	public WebDriver driver;
	public SigninPage signin;
	public AddClientpage addclient;
	public static Logger logger;
	public Properties config;
	public ActionClass actions;
	public EditClientPPage editclient;
    public AddDeviceClientPage adddeviceclient;
	public static String randomestring() {// generating ramdome string for unique email id

		String generatedString1 = RandomStringUtils.randomAlphabetic(6);
		return (generatedString1);

	}
	/*I @AfterStep
	public void attachScreenshot (Scenario scenario) {
	if(scenario.isFailed()) {
	((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs (OutputType.BYTES);
	byte[] screenshot Taken= }
	scenario.attach (screenshot Taken, "image/png", "error screen");*/

	public static String randomeNumber() {// generating ramdome string for unique email id

		String generatednumber = RandomStringUtils.randomNumeric(9);
		return (generatednumber);

	}
	
	
	public static String randomdevicename() {
		String devicename=RandomStringUtils.randomAlphabetic(4);
		return (devicename);
	}
	

	public static String randomRoomnumber() {
		String roomnumber=RandomStringUtils.randomNumeric(3);
		return (roomnumber);
	}
	
	public static String randomkeyText() {
		String Keytext=RandomStringUtils.randomAlphanumeric(5);
		return (Keytext);
	}
	
	public static String randomDBpassword() {
		String password=RandomStringUtils.randomAlphanumeric(3);
		return (password);
	}
	
	public static String randomportno() {
		String portno=RandomStringUtils.randomNumeric(3);
		return (portno);
	}
	
	public static String randomNumberofCastDevices() {
		String NumberofCastDevices=RandomStringUtils.randomNumeric(2);
		return (NumberofCastDevices);
		
	}
	public static String randomValidity() {
		String Validity=RandomStringUtils.randomNumeric(3);
		return (Validity);
		
	}
	public static String randomUsername() {
		String Username=RandomStringUtils.randomAlphabetic(3);
		return (Username);
		
	}	
	public static String randomhostname() {
		String hostname=RandomStringUtils.randomAlphabetic(3);
		return (hostname);
		
	}
	public static String randomDBname() {
		String DB=RandomStringUtils.randomAlphabetic(3);
		return (DB);
		
	}	
	
	public static String randomClientName() {
		String DB=RandomStringUtils.randomAlphabetic(5);
		return (DB);
		
	}	
	
	public static String randomStartdate() {
		
		Random rand = new Random();
		int randvalue= rand.nextInt(44);
		System.out.println(randvalue);
		
		 Calendar cal= Calendar.getInstance();
		 cal.add(Calendar.DATE,randvalue);
		 cal.add(Calendar.MONTH,1);
		 cal.add(Calendar.YEAR,1);
		Date d=cal.getTime();
		  
	SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
	String date =sdf.format(d);
		
		System.out.println(date);
		return date;
		
		
		
		//String date=RandomStringUtils.randomNumeric(2);
		//return (date);
		
	}
	
public static String randomEnddate() {
		
		Random rand = new Random();
		int randvalue= rand.nextInt();
		int date1=rand.nextInt(28);
		int month=rand.nextInt(12);
		System.out.println(date1 +"====date======");
		System.out.println(month +"====month======");
		System.out.println(randvalue+"====year======");
		
		 Calendar cal= Calendar.getInstance();
		 cal.add(Calendar.DATE,2);
		 cal.add(Calendar.MONTH,2);
		 cal.add(Calendar.YEAR,2);
		Date d=cal.getTime();
		  
		SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
		String date =sdf.format(d);
		
		System.out.println(date +"date==========");
	return date;
}

public static String randomIPaddress() {
	String IP=RandomStringUtils.randomNumeric(2);
	return IP;
}

}
