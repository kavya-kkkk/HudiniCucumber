package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.ActionClass;
import stepDefinitions.BaseClass;
import utillties.WaitHelper;

public class SigninPage extends BaseClass {

	public WebDriver driver1;
	WaitHelper waithelper;

	ActionClass actions = new ActionClass();

	public SigninPage(WebDriver rdriver) {

		driver1 = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(rdriver);
	}

	@FindBy(xpath = "//*[@id='root']/div/div/div/div/div[2]/div/div/div/div/div/div/form/div[1]/div/input")
	@CacheLookup
	WebElement Email_txt;

	@FindBy(xpath = "//*[@id='password']")
	@CacheLookup
	WebElement Password_txt;

	@FindBy(xpath = "//butt[@type='submit']")
	@CacheLookup
	WebElement Sigin_btn;

	@FindBy(xpath = "//div[.='Email is Required']")
	WebElement Emailnull_errormsg;

	@FindBy(xpath = "//div[.='Password is Required']")
	WebElement passwordnull_errormsg;

	@FindBy(xpath = "//div[@role='dialog']")
	WebElement errorpopup;

	@FindBy(xpath = "//button[.='Try Again!']")
	WebElement errorpopup_btn;

	public void EnterEmail(String email) throws InterruptedException

	{
		// waithelper.WaitForElement(Email_txt, 30); //elements is taking time means we
		// can use wait helper

		actions.isdisplayed(driver1, Email_txt);

		Email_txt.sendKeys(email); // if element is loaded within 2 sec it start execute the code
	}

	public void EnterPassword(String password) throws InterruptedException

	{ 
		actions.isdisplayed(driver1, Password_txt);

		// waithelper.WaitForElement(Password_txt, 30);
		Password_txt.sendKeys(password);

	}

	public void ClickSignIn() throws InterruptedException

	{
		actions.isdisplayed(driver1, Sigin_btn);
		actions.isenabled(driver1, Sigin_btn);
		// waithelper.WaitForElement(Password_txt, 30);
		Sigin_btn.click();

	}

	public void Errorpopup() throws InterruptedException

	{
		actions.isdisplayed(driver1, errorpopup);

		// waithelper.WaitForElement(Password_txt, 30);
		errorpopup.getText();

	}

	public void Popupbtn() throws InterruptedException

	{
		actions.isdisplayed(driver1, errorpopup);

		// waithelper.WaitForElement(Password_txt, 30);
		errorpopup_btn.getText();

	}
}
