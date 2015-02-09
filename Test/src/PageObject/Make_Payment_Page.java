package PageObject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Make_Payment_Page extends BaseClass
{
	
	public By Button_GoToOverview=By.className("btn btn-p btn-p-orange form-submit");
	public By Button_MakeAPayment=By.xpath("//a[@class='btn btn-p btn-p-orange-hollow']");
	public By Radio_MinimumDue=By.id("minimum_payment_due");
	public By Label_MinimumDue=By.xpath("//form/div[1]/span");
	public By Radio_OtherAmount=By.id("other_amount");
	public By Input_OtherAmount=By.id("other-amount");
	public By Radio_FullPay=By.id("payoff_amount");
	public By Label_FullPayAmount=By.id("payoff-amount-field");
	public By Label_ACH_Enabled=By.id("ach-toggle");
	public By Button_Send=By.id("loan-payment-submit-btn");
	public By Dropdown_BankAccount= By.id("bank-account-select");
	public By Calander=By.id("payment-calendar-widget");
	public By LabelConfirmAmount=By.xpath("//div/div[2]/div[1]/span[1]");
	public By ButtonConfirm=By.id("borrower-confirm-btn");
	public By ButtonCancel=By.id("cancel-confirm");
	public By LabelThankYou=By.xpath("//p[text()='Thank you']");
	public By ButtonGoToLoanDetail=By.xpath("//a[@class='btn btn-p btn-p-orange form-submit']");
	public By Validaiton=By.id("error_additional_amount");
	
	
			
	public void Payment(String PaymentType,String LoanPayment,String BankAccount,String date) 
	{
		getDriver().findElement(Button_MakeAPayment).click();
		getDriver().findElement(Radio_MinimumDue);
		if (PaymentType=="MinimumDue")
		{
			getDriver().findElement(Radio_MinimumDue).click();
		}
		else if (PaymentType=="Other")
		{
			getDriver().findElement(Radio_OtherAmount).click();
			getDriver().findElement(Input_OtherAmount).sendKeys(LoanPayment);
		}
		
		else if (PaymentType=="PayOff")
		{
			getDriver().findElement(Radio_FullPay).click();
		}
		
		getDriver().findElement(Calander).click();
		By Calander_Date=By.xpath("//div[2]/div/div["+date+"+1]");
		getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		getDriver().findElement(Calander_Date).click();
		getDriver().manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		getDriver().findElement(Button_Send).click();
		getDriver().manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
				
	}
	
	public void validation()
	{
		 Assert.assertTrue(getDriver().findElement(Validaiton).getText().matches("Please enter a valid amount"));
	}
	public void ConfirmPayment(String Payment)
	{
		//verify that user is navigate do to confirm payment page
		getDriver().findElement(LabelConfirmAmount);
		if(Payment=="Yes")
		{
			getDriver().findElement(ButtonConfirm).click();
		}
		else if(Payment=="No")
		{
			getDriver().findElement(ButtonCancel).click();
		}
		
	}
	
	public LoanDetailPage Payment_ThanksYou()
	{
		//verify that user is navigated to Payment Thankyou page
		getDriver().findElement(LabelThankYou);
		//click on Go to Loan Detail page
		getDriver().findElement(ButtonGoToLoanDetail).click();
		LoanDetailPage LP=new LoanDetailPage();
		return LP;
				
	}

}
