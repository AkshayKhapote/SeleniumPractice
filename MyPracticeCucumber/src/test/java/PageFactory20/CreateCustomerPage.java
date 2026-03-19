package PageFactory20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.CommanFunctionsForMailID;

public class CreateCustomerPage {
	
	WebDriver driver;
	
	public CreateCustomerPage(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);	
		}
	

	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomerlink ;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customer_Name;
	
	@FindBy(xpath="//input[@value='m']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement DoB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement Address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement Pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement Mobile;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement  password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[text()='Customer ID']")
	WebElement customerID;
	
	@FindBy(xpath="//*[text()='Customer ID']//following-sibling::td")
	WebElement custIDval;
	
	public void clickOnNewCustomer() {
		newCustomerlink.click();
		
	}
	public void entercustomerName(String customerName) {
		customer_Name.sendKeys(customerName);
	}
	public void selectgender() {
		gender.click();
	}
	public void enterDOB(String doB) {
		DoB.sendKeys(doB);
		
	}
	public void enterAdress(String address) {
		Address.sendKeys(address);
		
	}
	public void enterCity (String city) {
		City.sendKeys(city);
		
	}
	public void enterState(String state) {
		State.sendKeys(state);
	}
	public void enterPin(String pin) {
		Pin.sendKeys(pin);
	}
	public void enterMobileNumber(String mobileNumber) {
		Mobile.sendKeys(mobileNumber);
		
	}
	public void enterEmail() {
		Email.sendKeys(CommanFunctionsForMailID.generateReandomEmailID());
	}
	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
	public void clickOnSubmit() {
		submit.click();
		
	}
	public void validateCustomerIDGeneration() {
		boolean flag=customerID.isDisplayed();
		if(flag==true) {
			System.out.println("CustomerID is generated");
		}else {
			throw new NullPointerException("No customer ID is generated");
		}
	
	}
	public String getcustomerID() {
	String cusIDval=custIDval.getText();
	return cusIDval;
	}
	
	
	
}
