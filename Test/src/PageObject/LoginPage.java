package PageObject;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;


//import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
	
	private By buttonSignIn=By.id("M_c5_c4_hlSignIn");
	private By InputEmailaddress=By.id("M_ctl00_MainContent_MainContent_c7_tb_email");
	private By ButtonContinue=By.id("M_ctl00_MainContent_MainContent_c7_btn_continue");
	private By InputPassword=By.id("M_ctl00_MainContent_MainContent_c7_tb_password");
	private By ButtonSignIn=By.id("M_ctl00_MainContent_MainContent_c7_btn_signin");
	
		
	public OverviewPage_Borrower login(String email, String passw)
	{
		
		//verify that "Sign In" button is displayed on Prosper Home page.
		getDriver().findElement(buttonSignIn);
		//click on "SignIn" button
		getDriver().findElement(buttonSignIn).click();	
		getDriver().manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		   //verify that user is navigated to "Sign In" page.
		getDriver().findElement(InputEmailaddress);
		   //Enter the user email address
		getDriver().findElement(InputEmailaddress).sendKeys(email);
		   //click on "Continue" button
		getDriver().findElement(ButtonContinue).click();
		   // Verify that user is navgiate to "Password" page.
		getDriver().findElement(InputPassword);
		   //Enter the Password
		getDriver().findElement(InputPassword).sendKeys(passw);
		   //click on "Sign In" button
		getDriver().findElement(ButtonSignIn).click();
		   //Verify that user is navigate to "Overview" page.
		    assertEquals("Account Overview - Prosper" , getDriver().getTitle());
		    OverviewPage_Borrower OV=new OverviewPage_Borrower();
		    return OV;
		    
		
	}
	

}
