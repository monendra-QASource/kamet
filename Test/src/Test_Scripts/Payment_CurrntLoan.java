package Test_Scripts;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import PageObject.*;


public class Payment_CurrntLoan extends BaseClass
{
	public String Email="user893812@prosper.stg";
	public String Passw="Password23";
	public String PaymentType="Other";
	public String LoanPayment="25";
	public String BankAccount="Bristol county savings bank *****3123";
	public String date="8";
	public String Payment="Yes";
	public String Type="Link";
	
	 @Test
	  public void Logintest()
	  {
		 LoginPage lp= new LoginPage();
		  //login to prosper with loan user.
		  OverviewPage_Borrower ov=  lp.login(Email, Passw);
		  Make_Payment_Page MP= ov.Click_MakePayment();
	       MP.Payment(PaymentType, LoanPayment, BankAccount, date);
	        
	       //submit confirm loan payment page
	       MP.ConfirmPayment(Payment);
	       //navigate to Loan detail page from payment thank you page
	       
	       //cancel loan payment
	       LoanDetailPage LP= MP.Payment_ThanksYou();
	       LP.CancelPayment();
	       getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	       //Si
	        SignOut so=new SignOut();
	        so.signOut(Type);
	        
	       
	    
	 
	  }
}
