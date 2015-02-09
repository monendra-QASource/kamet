package Test_Scripts;
import org.testng.annotations.Test;

import PageObject.BaseClass;
import PageObject.LoginPage;
import PageObject.OverviewPage_Borrower;



public class sample  extends BaseClass {
	public String Email="lender02@1.stg";
	public String Passw="Password23";
	
	  @Test
	  public void Logintest()
	  {
		  LoginPage lp= new LoginPage();
		  //login to prosper with loan user.
		  OverviewPage_Borrower ov=  lp.login(Email, Passw);
	    //navigate to Make payment page
      
	  }

}
