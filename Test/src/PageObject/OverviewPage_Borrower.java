package PageObject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;


public class OverviewPage_Borrower extends BaseClass
{
	public By Link_Make_Payment=By.xpath("//a[text()='Make Payment']");
	public By tabBorrowing=By.xpath("//span/a[text()='Borrowing']");
	
	public Make_Payment_Page Click_MakePayment()
	{
		// click on make payment link
		getDriver().findElement(Link_Make_Payment).click();
		getDriver().manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		
		Make_Payment_Page MP=new Make_Payment_Page();
		return MP;
		
	}

}
