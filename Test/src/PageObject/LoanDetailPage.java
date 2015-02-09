package PageObject;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class LoanDetailPage extends BaseClass
{
	
  public By Link_CancelPayment=By.xpath("//a[text()='Cancel Payment']");
  
  public void CancelPayment()
  {
	  //click on cancel payment link
	  getDriver().findElement(Link_CancelPayment).click();
	  getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			  
			  
  }
  
}
