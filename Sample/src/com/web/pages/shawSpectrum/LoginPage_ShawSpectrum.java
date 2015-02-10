package com.web.pages.shawSpectrum;

import org.openqa.selenium.By;
import com.web.pages.Element;

public class LoginPage_ShawSpectrum  {
	
	
	private By userIDBy = By.cssSelector("#form #userId");
	private By passwordBy = By.cssSelector("#form #password");
	private By loginBy = By.cssSelector("#form #loginButton");
	
	By logOutBy = By.cssSelector("wegew");
//	By userIDBy = By.cssSelector("");
	
	
	private String baseUrl = "https://servicing.STG.circleone.com/spectrum/login.jsp";

	
	
	public void navigateToShawSpectrumURL(){
		Element.hitUrl(baseUrl);
	}
	
	public void enterUserID(String userID){
		Element.enterText(userIDBy, userID);
	}
	
	public void enterPassword(String password){
		Element.enterText(passwordBy, password);
	}
	
	public void clickLogin(){
		Element.click(loginBy);
	}
	
	public void clickLogOut(){
		Element.click(logOutBy);
	}
	
	
	
	public void loginWith(String username, String password){
		enterUserID(username);
		enterPassword(password);
		clickLogin();
	}
	
	

}
