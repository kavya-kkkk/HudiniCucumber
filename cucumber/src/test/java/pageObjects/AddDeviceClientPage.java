package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDeviceClientPage {

	WebDriver driver;

	public AddDeviceClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Chromecast']")
	WebElement chromcast;

	@FindBy(xpath = "//a[.='Device List']")
	WebElement chromcastlist;

	@FindBy(xpath = "//button[.='Add Device']")
	WebElement clientadddevice;

	@FindBy(id = "chromecast_friendly_name")
	WebElement chromecast_friendly_name;

	@FindBy(id = "chromecast_ip")
	WebElement chromecast_ip;

	@FindBy(id = "chromecast_room_no")
	WebElement chromecast_room_no;

	@FindBy(xpath = "/html/body/div/div/div[4]/div/div/div/div/div[2]/div/form/button[1]")
	WebElement Adddev_Button;

	@FindBy(xpath = "//button[.='Cancel']")
	WebElement Canceldev_btn;

	@FindBy(xpath = "//button[.='OK']")

	WebElement devicepopupOKbutton;

	public void Enterchromecast_friendly_name(String chromecastfriendlyname) {

		chromecast_friendly_name.sendKeys(chromecastfriendlyname);
	}

	public void Enterchromecast_ip(String chromecastip) {

		chromecast_ip.sendKeys(chromecastip);
	}

	public void Enterchromecast_room_no(String chromecastroomno) {

		chromecast_room_no.sendKeys(chromecastroomno);
	}

	public void Add_Button() {
 
		Adddev_Button.click();
	}

	public void Cancel_btn() throws InterruptedException {
		Thread.sleep(1000);
		Canceldev_btn.click();
	}

	public void clientadddevice() throws InterruptedException {
		Thread.sleep(1000);
		clientadddevice.click();
		// devicepopupOKbutton
	}

	public void devicepopupOKbutton() throws InterruptedException {
		Thread.sleep(1000);
		devicepopupOKbutton.click();

	}

	public void chromecast() throws InterruptedException {
		Thread.sleep(1000);
		chromcast.click();

	}

	public void chromecastlist() throws InterruptedException {
		Thread.sleep(1000);
		chromcastlist.click();

	}
} 
