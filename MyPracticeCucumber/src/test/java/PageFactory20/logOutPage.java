package PageFactory20;

import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class logOutPage {
	
	WebDriver driver;

	public logOutPage(WebDriver driver) {
		
	 this.driver= driver;
	 
	 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	
	
	WebElement logout;
	
	
	public void clickOnLogOut() {
		//explicitewait
		BaseClass.waitForElementClickable(logout);
		// scroll to element
		BaseClass.scrollDown(logout);
		BaseClass.scrollclick(logout);

		// click logout
		logout.click();
		//gettext of alert popup
		String msg=	BaseClass.gettextalert();
		System.out.println(msg);
		//Accept Alert popup
		BaseClass.getccept();
		
	}
	
	
}
