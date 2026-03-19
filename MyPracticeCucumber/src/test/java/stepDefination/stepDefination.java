package stepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactory20.CreateCustomerPage;

import PageFactory20.LoginPage;
import PageFactory20.createNewAccount;
import PageFactory20.logOutPage;
import Utilities.BaseClass;
import Utilities.CommanFunctionsForMailID;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination extends BaseClass {
	
	WebDriver driver= BaseClass.initializationDriver();
	LoginPage obj= new LoginPage(driver);
	
	CreateCustomerPage createnewcustomer = new CreateCustomerPage(driver);
	createNewAccount  createbewAccount=  new createNewAccount(driver);
	logOutPage logOutt=new logOutPage(driver);
	
	
	
	@Before(order=1)
	public void beforeTest1() {
		System.out.println("I will run before every scenarios1");
	}
	@Before(order=2)
	public void beforeTest2() {
		System.out.println("I will run before every scenarios2");
	}
	@After(order=1)
	public void afterTest1() {
		System.out.println("I will run after every scenarios1");
	}
	@After(order=2)
	public void afterTest2() {
		System.out.println("I will run after every scenarios2");
	}
	@Given("user Open the browser URl")
	public void user_open_the_browser_u_rl() {
		
	}

	@Given("User enters the Username")
	public void user_enters_the_username() {
		
	}

	@Given("User enters the Password")
	public void user_enters_the_password() {
		
	}

	

	@Then("user will be navigated to homepage")
	public void user_will_be_navigated_to_homepage() {
		
	}
	@Given("User enters the Username as {string}")
	public void user_enters_the_username_as1(String string1) {
	  
	}

	@Given("User enters the Password as {string}")
	public void user_enters_the_password_as1(String string1) {
	   
	}
	@Then("an error message is thrown that user credentials are wrong")
	public void an_error_message_is_thrown_that_user_credentials_are_wrong() {
	    
	}
	@Given("user opens the browser url")
	public void user_opens_the_browser_url() {
	   
	}

	@Given("User enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	   
	}

	@Given("User enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	    
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		obj.clickLogin();
	}

	@Then("user will be navigated to homepage of application")
	public void user_will_be_navigated_to_homepage_of_application() {
	    
	}

	@Then("user will search electronic product")
	public void user_will_search_electronic_product() {
	    
	}

	@Then("User will add it to card")
	public void user_will_add_it_to_card() {
	  
	}

	@Then("user will search lifestyle product")
	public void user_will_search_lifestyle_product() {
	    
	}

	@Then("user will search clothing product")
	public void user_will_search_clothing_product() {
	    
	}

	@Given("User Open the Registration from")
	public void user_open_the_registration_from() {
		
		driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
	    
	}

	@Given("user enter the below details")
	public void user_enter_the_below_details(io.cucumber.datatable.DataTable userTable ) {
	   List<List<String>>data=userTable.asLists(String.class);
	   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data.get(1).get(0));
	   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data.get(1).get(1));
	   driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(data.get(1).get(2));
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys(data.get(1).get(3));
	}
	@Given("User opens the login of the application")
	public void user_opens_the_homepage_of_the_application() {
		
		String loginTitle=getTitle();
		System.out.println(loginTitle);
		
		if(loginTitle.contains("Guru99 Bank Home")) {
			System.out.println("user is on login page");
		}
		else {
			throw new NullPointerException("Incorrect page Opened");
		}
		
	  
	}

	@Given("User enter the Username as {string}")
	public void user_enter_the_username_as(String username) {
		
	obj.enterUserName(username);
	  
	}

	@Given("User enter the Password as {string}")
	public void user_enter_the_password_as(String password) {
		
		obj.enterPassWord(password);
		
	  
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		
		obj.clickLogin();
		
		
	}

	@Then("Validate user will be navigated to homepage")
	public void validate_user_will_be_navigated_to_homepage() {
	String homePage=getTitle();
	System.out.println(homePage);
	if(homePage.contains("HomePage")) {
		System.out.println("user is on the Home page");
	}
	else {
		throw new NullPointerException("Incorrect page Opened");
	}
	
	}
	@Then("User closed browser")
	public void user_closed_browser() {
		closebrowse();
	}
	@Given("user opens the login of the application")
	public void user_opens_the_login_of_the_application() {
		String loginTitle=getTitle();
		System.out.println(loginTitle);
		
		if(loginTitle.contains("Guru99 Bank Home")) {
			System.out.println("user is on login page");
		}
		else {
			throw new NullPointerException("Incorrect page Opened");
		}
	}

	@Given("user enters the username as {string}")
	public void user_enters_the_username_as11(String username) {
	   
		obj.enterUserName(username);
	}

	@Given("user enters password as {string}")
	public void user_enters_password_as(String password) {
		obj.enterPassWord(password);
	}


	@Then("Validate user will navigated to homepage")
	public void validate_user_will_navigated_to_homepage() {
		String homePage=getTitle();
		System.out.println(homePage);
		if(homePage.contains("HomePage")) {
			System.out.println("user is on the Home page");
		}
		else {
			throw new NullPointerException("Incorrect page Opened");
		}
		
	}
      //create new customer
	@Then("user click on the new customer link")
	public void user_click_on_the_new_customer_link() {
		createnewcustomer.clickOnNewCustomer();
	}

	@Then("user enters the customername as {string}")
	public void user_enters_the_customername_as(String customerName) {
		createnewcustomer.entercustomerName(customerName);
	}

	@Then("user selects the gender")
	public void user_selects_the_gender() {
		createnewcustomer.selectgender();
	  
	}

	@Then("user enters the DOB as {string}")
	public void user_enters_the_dob_as(String doB) {
		createnewcustomer.enterDOB(doB);
	}

	@Then("User enters the  address as {string}")
	public void user_enters_the_address_as(String address) {
		createnewcustomer.enterAdress(address);
	 
	}

	@Then("User enters the city  as {string}")
	public void user_enters_the_city_as(String city) {
		createnewcustomer.enterCity(city);
	}

	@Then("user enters the State as  {string}")
	public void user_enters_the_state_as(String state) {
		createnewcustomer.enterState(state);
	   
	}

	@Then("user enters the pin as {string}")
	public void user_enters_the_pin_as(String pin) {
		createnewcustomer.enterPin(pin);
	   
	}

	@Then("user enters the mobileNumber as {string}")
	public void user_enters_the_mobile_number_as(String mobileNumber) {
		createnewcustomer.enterMobileNumber(mobileNumber);
	}

	@Then("user enter the email")
	public void user_enter_the_email() {
		createnewcustomer.enterEmail();
	}

	@Then("user enter the password as {string}")
	public void user_enter_the_password_as1(String Password) {
		createnewcustomer.enterPassword(Password);
	}

	@When("User Click on submit button")
	public void user_click_on_submit_button() {
		createnewcustomer.clickOnSubmit();
	    
	}

	@Then("new customer is created")
	public void new_customer_is_created() {
		createnewcustomer.validateCustomerIDGeneration();
	}

	@Then("user captures the customer id")
	public void user_captures_the_customer_id() {
	String CustomerID=	createnewcustomer.getcustomerID();
	System.out.println("Customer ID generated is"+CustomerID);
	   
	}
	@Given("User Enter username as {string}")
	public void user_enter_username_as(String string) {
		obj.enterUserName(string);
	}

	@Given("user Enter Password as {string}")
	public void user_enter_password_as(String string) {
		obj.enterPassWord(string);
	}

	@When("user Click on login button")
	public void user_click_on_login_button1() {
		obj.clickLogin();
	   
	}

	@Then("User is navigate to homePage")
	public void user_is_navigate_to_home_page() {
	   
	}
	@Then("user enter customer details to create new customer")
	public void user_enter_customer_details_to_create_new_customer(io.cucumber.datatable.DataTable dataTable) {
		 List<List<String>>data=dataTable.asLists(String.class);
		 driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys(data.get(1).get(0));
		 driver.findElement(By.xpath("//input[@value='m']")).click();
		 driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(data.get(1).get(1));
		 driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(data.get(1).get(2));
		 driver.findElement(By.xpath("//input[@name='city']")).sendKeys(data.get(1).get(3));
		 driver.findElement(By.xpath("//input[@name='state']")).sendKeys(data.get(1).get(4));
		 driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(data.get(1).get(5));
		 driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(data.get(1).get(6));
		 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(CommanFunctionsForMailID.generateReandomEmailID());
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(1).get(8));
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement cusID= driver.findElement(By.xpath("//*[text()='Customer ID']"));
		boolean flag=cusID.isDisplayed();
		if(flag==true) {
			System.out.println("CustomerID is generated");
		}else {
			throw new NullPointerException("No customer ID is generated");
		}
		WebElement cusI= driver.findElement(By.xpath("//*[text()='Customer ID']//following-sibling::td"));
		String customerID=cusI.getText();
		System.out.println("Customer id generated is"+customerID);
	String emailID=	driver.findElement(By.xpath("//tr/td[text()='Email']//following-sibling::td")).getText();
	System.out.println("Dyanamic Email ID is"+emailID);
		 
		 
	}
	@Given("user open the login page of application")
	public void user_open_the_login_page_of_application() {
		String loginTitle=getTitle();
		System.out.println(loginTitle);
		
		if(loginTitle.contains("Guru99 Bank Home")) {
			System.out.println("user is on login page");
		}
		else {
			throw new NullPointerException("Incorrect page Opened");
		}
	    
	}
	@Given("user Enter Valid user name as {string}")
	public void user_enter_valid_user_name_as(String username) {
		obj.enterUserName(username);
		
	  
	}

	@Given("User Enter valid password as {string}")
	public void user_enter_valid_password_as(String password) {
		obj.enterPassWord(password);
	}

	@Then("user navigate to Homepage")
	public void user_navigate_to_homepage() {
		String loginTitle=getTitle();
		System.out.println(loginTitle);
		
		
		/*
		 * if(loginTitle.contains("Guru99 bank add new account")) {
		 * 
		 * System.out.println("Guru99 bank add new account"); } else { throw new
		 * NullPointerException("Incorrect page Opened"); }
		 */
	}

	@Then("User Click on new account link")
	public void user_click_on_new_account_link() {
		
		createbewAccount.clickonNewAccount();
	    
	}

	@Then("user Enter Customer ID as {string}")
	public void user_enter_customer_id_as(String cusIDval) {
		createbewAccount.enterCustomerID(cusIDval);
	    
	}

	@Then("User Select account type from dropdown")
	public void user_select_account_type_from_dropdown() {
		createbewAccount.selectAccountType();
	   
	}

	@Then("user enter initial deposite amount as {string}")
	public void user_enter_initial_deposite_amount_as(String amount) {
		createbewAccount.enterrInitialAmmount(amount);
	}

	@Then("Validate User can see the new account is displayed.")
	public void validate_user_can_see_the_new_account_is_displayed() {
		String newAccountPageTitle = getTitle();
		System.out.println(newAccountPageTitle);
		
		if(newAccountPageTitle.contains("Created Account details")) {
			
			System.out.println("A new account is created");
		}
		else {
			throw new NullPointerException("No account created");
		}
	}
	@When("User click on logout button")
	public void user_click_on_logout_button() {
		
		
		logOutt.clickOnLogOut();
		
	}
	@When("User read logout msg and  click on ok button")
	public void user_read_logout_msg_and_click_on_ok_button() {
		gettextalert();
		getccept();
	   
	}
	@Then("user is navigate to loginpage")
	public void user_is_navigate_to_loginpage() {
		String logouttitle=getTitle();
		System.out.println(logouttitle);
		if(logouttitle.contains("Guru99 Bank Home")) {
			System.out.println("user is on login page");
		}
		else {
			throw new NullPointerException("Incorrect page Opened");
		}
	}
	
		
		
		
			



	  
	}




	
	    
	

	
	

