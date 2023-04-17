package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import stepDefinitions.ActionClass;
import stepDefinitions.BaseClass;

public class EditClientPPage extends BaseClass {

	WebDriver driver;
	ActionClass actions=new ActionClass();

	public EditClientPPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Clients']")
	WebElement Client_dpd;

	@FindBy(xpath = "//a[.='Clients list']")
	WebElement ClientList_btn;


	@FindBy(xpath = "/html/body/div/div/div[4]/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[5]/div/a[1]/i")
	WebElement editbutton;

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

	@FindBy(xpath = "//*[@id='linuxMachine_keyType']")
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

	@FindBy(xpath = "//button[.='Save']")
	WebElement Clienteditsave_btn;

	@FindBy(xpath = "//button[.='Cancel']")
	WebElement ClientCancel_btn;

	@FindBy(xpath = "/html/body/div[2]/div/div[3]")
	WebElement popupokbtn;

	
	
	public void ClickClientDpd() throws InterruptedException {
		actions.isenabled(driver, Client_dpd);
		   actions.isdisplayed(driver, Client_dpd);
				Client_dpd.click();
			}

			public void ClickClientListd() throws InterruptedException {
				actions.isenabled(driver,ClientList_btn);
				actions.isdisplayed(driver,ClientList_btn);
				ClientList_btn.click();
			}
	public void Click_clienteditbtn() throws InterruptedException {
		Thread.sleep(1000);
		actions.isdisplayed(driver,editbutton);
         actions.isenabled(driver,editbutton);
         Thread.sleep(1000);
		 editbutton.click();
		 
	}

	public void Enterclient_name(String clientname) throws Exception {
		actions.isdisplayed(driver,client_name);
		client_name.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		client_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		client_name.sendKeys(clientname);
	}

	public void Enterclient_email(String clientemail) throws InterruptedException {
		
		 actions.isdisplayed(driver,client_email);
		client_email.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		client_email.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		client_email.sendKeys(clientemail);
	}

	public void Enterclient_phone(String clientphone) throws InterruptedException {
		 actions.isdisplayed(driver,client_phone);
		client_phone.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		client_phone.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		client_phone.sendKeys(clientphone);
	}

	public void Enterclient_status() {

		Select status = new Select(client_status);

		status.selectByVisibleText("Active");

	}

	public void EnterchromeCast_devices(String chromeCastdevices) throws InterruptedException {
		actions.isdisplayed(driver,chromeCast_devices);
		
		chromeCast_devices.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		chromeCast_devices.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		chromeCast_devices.sendKeys(chromeCastdevices);
	}

	public void EnterchromeCast_validity(String chromeCastvalidity) throws InterruptedException {
		
		actions.isdisplayed(driver,chromeCast_validity);
		chromeCast_validity.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		chromeCast_validity.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		chromeCast_validity.sendKeys(chromeCastvalidity);
	}

	public void EnterchromeCast_subStartDatePassword(String chromeCastsubStartDate) throws InterruptedException {
		actions.isdisplayed(driver,chromeCast_subStartDate);
		chromeCast_subStartDate.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
	    chromeCast_subStartDate.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		chromeCast_subStartDate.sendKeys(chromeCastsubStartDate);
	}

	public void EnterchromeCast_subEndDate(String chromesubEndDate) throws InterruptedException {
		actions.isdisplayed(driver,chromeCastsubEndDate);
		chromeCastsubEndDate.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		chromeCastsubEndDate.sendKeys(Keys.DELETE);
		Thread.sleep(1000);

		chromeCastsubEndDate.sendKeys(chromesubEndDate);
	}

	public void EnterlinuxMachine_ip(String linuxMachineip) throws InterruptedException {
		
		 actions.isdisplayed(driver,linuxMachine_ip);		linuxMachine_ip.sendKeys(Keys.CONTROL + "a");
		  Thread.sleep(1000);
		  linuxMachine_ip.sendKeys(Keys.DELETE);
		Thread.sleep(1000);

		linuxMachine_ip.sendKeys(linuxMachineip);
	}

	public void EnterlinuxMachine_userName(String linuxMachineuserName) throws InterruptedException {
		actions.isdisplayed(driver,linuxMachine_userName);
		
		linuxMachine_userName.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		linuxMachine_userName.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		linuxMachine_userName.sendKeys(linuxMachineuserName);
	}

	public void Enterlinux_key() throws InterruptedException {
		actions.isdisplayed(driver,linuxMachine_keyType);

		Select key = new Select(linuxMachine_keyType);
		key.deselectByVisibleText("Private");
	}

	public void Enterlinux_keytext(String linuxsecretkey) throws InterruptedException {
		 actions.isdisplayed(driver,linuxMachine_secretKey);
		linuxMachine_secretKey.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		linuxMachine_secretKey.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		linuxMachine_secretKey.sendKeys(linuxsecretkey);
	}

	public void Enterdb_name(String dbname) throws InterruptedException {
		
		actions.isdisplayed(driver,db_name);
		db_name.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		db_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);

		db_name.sendKeys(dbname);
	}

	public void Enterdb_port(String dbport) throws InterruptedException {

		actions.isdisplayed(driver,db_port);
		db_port.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		db_port.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		db_port.sendKeys(dbport);
	}

	public void Enterdb_password(String dbpassword) throws InterruptedException {

		 actions.isdisplayed(driver,db_password);
		db_password.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		db_password.sendKeys(Keys.DELETE);
		db_password.sendKeys(dbpassword);
	}

	public void Enterdb_hostname(String dbhostname) throws InterruptedException {
		
		
		actions.isdisplayed(driver,db_hostname);
		db_hostname.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(1000);
		db_hostname.sendKeys(Keys.DELETE);
		Thread.sleep(1000);

		db_hostname.sendKeys(dbhostname);
	}

	public void Clienteditsave_btn() throws InterruptedException {
		actions.isdisplayed(driver,Clienteditsave_btn);
		Thread.sleep(1000);
		Clienteditsave_btn.click();
	}

	public void ClientCancel_btn() throws InterruptedException {
		 actions.isdisplayed(driver,ClientCancel_btn);
		Thread.sleep(1000);
		ClientCancel_btn.click();
	}

	public void popupok_btn() throws InterruptedException {
		 actions.isdisplayed(driver,popupokbtn);
		popupokbtn.click();

	}

}
