package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	 private static WebDriver driver = null;

	    public WebDriver getDriver() {
	        return driver;
	    }
	    private static WebDriver openBrowser() {
	        System.out.println("Launching Firefox browser..");
	        driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.stg.circleone.com");
	        return driver;
	    }


	    public String getConfigValue(String key){

	        String value = null;
	        Properties prop = new Properties();
	        InputStream input = null;
	        try {
	            input = new FileInputStream("config.properties");
	    // load a properties file
	            prop.load(input);

	    value  = prop.getProperty(key);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }finally{
	        try {
	            input.close();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        }
	        return value;
	    }

	    @BeforeClass
	    public void set(){
	        openBrowser();

	    } 
	   

	    @AfterClass
	    public void tearDown(){
	        driver.quit();
	    }

	    public void click(By locator){
	        getDriver().findElement(locator);
	    }



}
