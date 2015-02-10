package com.web.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverClass {

	
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}
	
	private static WebDriver openBrowser(String appURL) {
		System.out.println("Launching Firefox browser..");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
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
		openBrowser(getConfigValue("baseurl"));

	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	public void click(By locator){
		getDriver().findElement(locator);
	}
	
	
	
	
	
}
