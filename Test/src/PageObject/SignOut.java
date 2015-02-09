package PageObject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class SignOut extends BaseClass
{
	public By LinkSignOut=By.xpath("//a[text()='Sign Out']");
	public By ProsperLogo=By.xpath("//body/div[1]/div[1]/div[1]/div[1]/a");
	
	
	public void signOut(String Type)
	{
		if((getDriver().findElement(LinkSignOut).isDisplayed())==true)
		{
		if(Type=="Link")
		{
			
			getDriver().findElement(LinkSignOut).click();
		}
		else if(Type=="LOGO")
		{
			getDriver().findElement(ProsperLogo).click();
			getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
			getDriver().findElement(LinkSignOut).click();
		}
		}
		else
		{
			System.out.println("user is not logged in");
		}
	}
}
