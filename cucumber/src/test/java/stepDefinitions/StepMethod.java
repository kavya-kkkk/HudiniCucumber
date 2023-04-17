package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageObjects.AddClientpage;
import pageObjects.AddDeviceClientPage;
import pageObjects.EditClientPPage;
import pageObjects.SigninPage;

@SuppressWarnings("deprecation")
public class StepMethod extends BaseClass {
	
	

 @AfterStep
	public void attachScreenshot (Scenario scenario) {
	 
	if(scenario.isFailed()) {
		byte[] screenshotTaken=  ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs (OutputType.BYTES);
	scenario.attach(screenshotTaken, "image/png", "error screen");
	}
	
 }
	@Before
	public void setup() throws IOException {

		// reading propertied file

		config = new Properties();
		FileInputStream configprofile = new FileInputStream("configure.properties");
		config.load(configprofile);

		logger = Logger.getLogger("cucumber");// added logger
		PropertyConfigurator.configure("log4j.properties");// added logger

		String br = config.getProperty("browser");

		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", config.getProperty("chromepath"));
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else if (br.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", config.getProperty("firefoxpath"));
			driver = new FirefoxDriver();

		}

		logger.info("**********launching brower*********");
	}

	@Given("I launched browser")
	public void i_launch_chrome_browser() {

		signin = new SigninPage(driver);
		actions = new ActionClass();
		editclient = new EditClientPPage(driver);
		adddeviceclient = new AddDeviceClientPage(driver);
		actions = new ActionClass();
	}

	@When("I opened the hudini Signin page {string}")
	public void i_open_the_hudini_signin_page_https_testing_d2okaspacdbhs_amplifyapp_com(String url) throws Exception {
		driver.get(url);
		Thread.sleep(1000);
		logger.info("********entered url and opened the appliction***********");

	}

	@Then("I entered the email id {string}")
	public void i_entered_the_email_id(String string) throws Exception {
		/*
		 * list<map<String,string>> creatlist=datatable.asMap();
		 * creatlist.get(0).get("emails");
		 */
		Thread.sleep(1000);

		signin.EnterEmail(string);

		logger.info("**********entered email id*********");

	}

	@And("I entered the password {string}")
	public void i_entered_the_password(String string) throws InterruptedException {
		Thread.sleep(1000);
		signin.EnterPassword(string);
		logger.info("**********password*********");
		// Assert.assertEquals("https://testing.d2okaspacdbhs.amplifyapp.com/login",addclient.getpageurl());
	}

	@Then("I clicked on signin buttton")
	public void i_clicked_on_sigin_buttton() throws Exception {
		
		signin.ClickSignIn();
		
		

	}

	@Then("I closed the browser")
	public void i_close_the_browser() throws InterruptedException {
		
		Thread.sleep(1000);
		actions.URLvalidation(driver, "https://testing.d2okaspacdbhs.amplifyapp.com/dashboard");
		Thread.sleep(1000);
		driver.quit();

	}

//ADD CLIENT

	@And("I can saw the Hudini Admin dashboard")
	public void user_can_view_dashbord() throws InterruptedException {

		addclient = new AddClientpage(driver);
		Thread.sleep(1000);
		// Assert.assertEquals("https://testing.d2okaspacdbhs.amplifyapp.com/dashboard",addclient.getpageurl());
		logger.info("**********Dash broad*********");
	}

	@When("I clicked on chromecast button")
	public void click_on_clients_dropdown() throws InterruptedException {
		Thread.sleep(1000);
		addclient.ClickClientDpd();

		logger.info("**********click on clients dp*********");
	}

	@Then("I can see the  List of add device list page")
	public void click_on_client_list() throws InterruptedException {
		Thread.sleep(1000);
		addclient.ClickClientListd();

		// Assert.assertEquals("https://testing.d2okaspacdbhs.amplifyapp.com/personal-record",addclient.getpageurl());
		logger.info("**********client record page*********");
	}

	@Then("User can view added Client list")
	public void user_can_view_added_client_list() {

		// Assert.assertEquals("https://testing.d2okaspacdbhs.amplifyapp.com/personal-record",addclient.getpageurl());

	}

	@And("I can saw the  List of add device list page")
	public void click_on_add_button() throws InterruptedException {
		Thread.sleep(1000);
		addclient.Click_clientaddbtn();

	}

	@Then("User can view Client add page")
	public void user_can_view_client_add_page() {
		// Assert.assertEquals("https://testing.d2okaspacdbhs.amplifyapp.com/devices/client/ADD",addclient.getpageurl());

	}

	@Then("I  added  the client as a admin")
	public void add_client_as_a_admin() throws InterruptedException {
		String clientname = randomClientName();
		addclient.Enterclient_name(clientname);

		String email = randomestring() + "@gmail.com";
		addclient.Enterclient_email(email);

		String phonenumber = randomeNumber() + "1";
		addclient.Enterclient_phone(phonenumber);

		addclient.Enterclient_status();
		String castno = randomNumberofCastDevices();
		addclient.EnterchromeCast_devices(castno);
		String validity = randomValidity();
		addclient.EnterchromeCast_validity(validity);
		String date = randomStartdate();
		addclient.EnterchromeCast_subEndDate(date);
		String date1 = randomEnddate();
		addclient.EnterchromeCast_subStartDatePassword(date1);
		String IP = randomIPaddress() + ".123.21.23";
		addclient.EnterlinuxMachine_ip(IP);
		String username = randomUsername();
		addclient.EnterlinuxMachine_userName(username);

		// addcpage.Enterlinux_key();
		String keytext = randomkeyText();
		addclient.Enterlinux_keytext(keytext);
		String password = randomDBpassword();
		addclient.Enterdb_password(password);
		String port = randomportno();

		addclient.Enterdb_port(port);
		String hostname = randomhostname();

		addclient.Enterdb_hostname(hostname);
		String name = randomDBname();
		addclient.Enterdb_name(name);

	}

	@When("I clicked on save button")
	public void click_on_add_button1() throws InterruptedException {
		addclient.clientAddbtn();

	}

	@Then("I clicked on popup window ok button")
	public void u_ser_can_see_popup() throws InterruptedException {
		addclient.popupok_btn();

	}

	@Then("Click on OK button")
	public void click_on_ok_button() throws InterruptedException {

		addclient.popupok_btn();
		// Assert.assertEquals("https://testing.d2okaspacdbhs.amplifyapp.com/personal-record",addclient.getpageurl());
	}

	@And("Click on edit button")
	public void click_on_edit_button() throws InterruptedException {
		Thread.sleep(1000);
		editclient.Click_clienteditbtn();

	}

	@Then("change the client email and phonenumber")
	public void change_the_client_email_and_phonenumber() throws Exception {

		String clientname = randomClientName();
		editclient.Enterclient_name(clientname);

		String email = randomestring() + "@gmail.com";
		editclient.Enterclient_email(email);

		String phonenumber = randomeNumber() + "1";
		editclient.Enterclient_phone(phonenumber);

		// editclient.Enterclient_status();

		String castno = randomNumberofCastDevices();
		editclient.EnterchromeCast_devices(castno);

		String validity = randomValidity();
		editclient.EnterchromeCast_validity(validity);
		/*
		 * //String date = randomStartdate();
		 * 
		 * 
		 * //editclient.EnterchromeCast_subEndDate(date); //String date1 =
		 * randomEnddate();
		 * 
		 * //editclient.EnterchromeCast_subStartDatePassword(date1);
		 */

		String IP = randomIPaddress() + ".123.21.23";
		editclient.EnterlinuxMachine_ip(IP);

		String username = randomUsername();
		editclient.EnterlinuxMachine_userName(username);

		// addcpage.Enterlinux_key();
		String keytext = randomkeyText();
		editclient.Enterlinux_keytext(keytext);

		String password = randomDBpassword();
		editclient.Enterdb_password(password);

		String port = randomportno();
		editclient.Enterdb_port(port);

		String hostname = randomhostname();
		editclient.Enterdb_hostname(hostname);

		String name = randomDBname();
		editclient.Enterdb_name(name);

	}

	@Then("click on save button")
	public void click_on_save_button() throws InterruptedException {

		editclient.Clienteditsave_btn();
	}

	@Then("Client edited popup is displayed and click on OK button")
	public void client_edited_popup_is_displayed_and_click_on_ok_button() throws InterruptedException {
		editclient.popupok_btn();
	}

	@Then("I see the client edited successfully")
	public void see_the_client_edited_successfully() {
		String actualURl = driver.getCurrentUrl();
		System.out.println(actualURl);
		String ExpectedURl = "https://testing.d2okaspacdbhs.amplifyapp.com/personal-record";
		assertEquals(actualURl, ExpectedURl);

	}

	// add device as a client
	@Then("click on chromecast button")
	public void click_on_chromecast_button() throws InterruptedException {
		adddeviceclient.chromecast();
		Thread.sleep(1000);
		adddeviceclient.chromecastlist();

	}

	@Then("List of device list page should be displayed")
	public void list_of_device_list_page_should_be_displayed() {
		String actualURl = driver.getCurrentUrl();
		System.out.println(actualURl);
		String ExpectedURl = "https://testing.d2okaspacdbhs.amplifyapp.com/device-record";
		assertEquals(actualURl, ExpectedURl);

	}

	@Then("Click on add device button")
	public void click_on_add_device_button() throws InterruptedException {
		adddeviceclient.clientadddevice();
	}

	@Then("Add a device as a client")
	public void add_a_device_as_a_client() {

		String chromecastname = randomdevicename();
		adddeviceclient.Enterchromecast_friendly_name(chromecastname);

		String ip = randomIPaddress() + ".23.234.21";
		adddeviceclient.Enterchromecast_ip(ip);

		String roomno = randomRoomnumber();
		adddeviceclient.Enterchromecast_room_no(roomno);

	}

	@When("Click on save button")
	public void click_on_save_button1() {
		adddeviceclient.Add_Button();
	}

	@When("Click on popup window ok button")
	public void click_on_popup_window_ok_button() throws InterruptedException {
		adddeviceclient.devicepopupOKbutton();
	}

	@Then("Check whether device is added in the device list")
	public void check_whether_device_is_added_in_the_device_list() {
		String actualURl = driver.getCurrentUrl();
		System.out.println(actualURl);
		String ExpectedURl = "https://testing.d2okaspacdbhs.amplifyapp.com/device-record";
		assertEquals(actualURl, ExpectedURl);
	}

}
