package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinitions.ActionClass;
import stepDefinitions.BaseClass;

public class AddClientpage extends BaseClass{

	WebDriver driver1;
   ActionClass  actions=new ActionClass();
	public AddClientpage(WebDriver rdriver) {
		driver1 = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//span[.='Clients']")
	WebElement Client_dpd;

	@FindBy(xpath = "//a[.='Clients list']")
	WebElement ClientList_btn;

	@FindBy(xpath = "//button[.='Add Client']")
	WebElement addclientbtn;

	@FindBy(id = "client_name")
	WebElement client_name;

	@FindBy(id = "client_email")
	WebElement client_email;

	@FindBy(id = "client_status")
	WebElement client_status;

	@FindBy(id = "client_phone")
	WebElement client_phone;

	@FindBy(id = "chromeCast_devices")
	WebElement chromeCast_devices;

	@FindBy(id = "chromeCast_validity")
	WebElement chromeCast_validity;

	@FindBy(id = "chromeCast_subStartDate")
	WebElement chromeCast_subStartDate;

	@FindBy(id = "chromeCast_subEndDate")
	WebElement chromeCastsubEndDate;

	@FindBy(id = "linuxMachine_ip")
	WebElement linuxMachine_ip;

	@FindBy(id = "linuxMachine_userName")
	WebElement linuxMachine_userName;

	@FindBy(id = "linuxMachine_keyType")
	WebElement linuxMachine_keyType;

	@FindBy(id = "linuxMachine_secretKey")
	WebElement linuxMachine_secretKey;

	@FindBy(id = "db_name")
	WebElement db_name;

	@FindBy(id = "db_hostname")
	WebElement db_hostname;

	@FindBy(id = "db_port")
	WebElement db_port;

	@FindBy(id = "db_password")
	WebElement db_password;

	@FindBy(xpath = "//button[.='Add']")
	WebElement ClientAdd_btn;

	@FindBy(xpath = "//button[.='Cancel']")
	WebElement ClientCancel_btn;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]")
	WebElement popupokbtn;

	public String getpageurl() {
		return driver1.getCurrentUrl();
	}

	public void ClickClientDpd() throws InterruptedException {
	
   actions.isdisplayed(driver1, Client_dpd);
		Client_dpd.click();
	}

	public void ClickClientListd() throws InterruptedException {
		 actions.isdisplayed(driver1,ClientList_btn);
		ClientList_btn.click();
	}

	public void Click_clientaddbtn() throws InterruptedException {
		 actions.isdisplayed(driver1,addclientbtn);
		addclientbtn.click();
	}

	public void Enterclient_name(String clientname) throws InterruptedException {
		 actions.isdisplayed(driver1,client_name);
		client_name.sendKeys(clientname);
	}

	public void Enterclient_email(String clientemail) throws InterruptedException {
		 actions.isdisplayed(driver1,client_email);
		client_email.sendKeys(clientemail);
	}

	public void Enterclient_phone(String clientphone) throws InterruptedException {
		 actions.isdisplayed(driver1,client_phone);
		client_phone.sendKeys(clientphone);
	}

	public void Enterclient_status() {

		Select status = new Select(client_status);

		status.selectByVisibleText("Active");

	}

	public void EnterchromeCast_devices(String chromeCastdevices) throws InterruptedException {
		 actions.isdisplayed(driver1,chromeCast_devices);
		chromeCast_devices.sendKeys(chromeCastdevices);
	}

	public void EnterchromeCast_validity(String chromeCastvalidity) throws InterruptedException {
		 actions.isdisplayed(driver1,chromeCast_validity);
		chromeCast_validity.sendKeys(chromeCastvalidity);
	}

	public void EnterchromeCast_subStartDatePassword(String chromeCastsubStartDate) throws InterruptedException {
		 actions.isdisplayed(driver1,chromeCast_subStartDate);
		 Thread.sleep(1000);
		chromeCast_subStartDate.sendKeys(chromeCastsubStartDate);
	}

	public void EnterchromeCast_subEndDate(String chromesubEndDate) throws InterruptedException {
		 actions.isdisplayed(driver1,chromeCastsubEndDate);
		 Thread.sleep(1000);
		chromeCastsubEndDate.sendKeys(chromesubEndDate);
	}

	public void EnterlinuxMachine_ip(String linuxMachineip) throws InterruptedException {
		 actions.isdisplayed(driver1,linuxMachine_ip);
		 Thread.sleep(1000);
		linuxMachine_ip.sendKeys(linuxMachineip);
	}

	public void EnterlinuxMachine_userName(String linuxMachineuserName) throws InterruptedException {
		 actions.isdisplayed(driver1,linuxMachine_userName);
		linuxMachine_userName.sendKeys(linuxMachineuserName);
	}

	public void Enterlinux_key() throws InterruptedException {
		 actions.isdisplayed(driver1,linuxMachine_keyType);
		Select key = new Select(linuxMachine_keyType);
		key.deselectByVisibleText("Public");
	}

	public void Enterlinux_keytext(String linuxsecretkey) throws InterruptedException {
		 actions.isdisplayed(driver1,linuxMachine_secretKey);
		linuxMachine_secretKey.sendKeys(linuxsecretkey);
	}

	public void Enterdb_name(String dbname) throws InterruptedException {
		 actions.isdisplayed(driver1,db_name);
		db_name.sendKeys(dbname);
	}

	public void Enterdb_port(String dbport) throws InterruptedException {
		 actions.isdisplayed(driver1,db_port);
		db_port.sendKeys(dbport);
	}

	public void Enterdb_password(String dbpassword) throws InterruptedException {
		 actions.isdisplayed(driver1,db_password);
		db_password.sendKeys(dbpassword);
	}

	public void Enterdb_hostname(String dbhostname) throws InterruptedException {
		 actions.isdisplayed(driver1,db_hostname);
		db_hostname.sendKeys(dbhostname);
	}

	public void clientAddbtn() throws InterruptedException {
		 actions.isdisplayed(driver1,ClientAdd_btn);
		ClientAdd_btn.click();
	}

	public void ClientCancel_btn() throws InterruptedException {
		 actions.isdisplayed(driver1,ClientCancel_btn);
		ClientCancel_btn.click();
	}

	public void popupok_btn() throws InterruptedException {
		 actions.isdisplayed(driver1,popupokbtn);
		popupokbtn.click();

	}

}
