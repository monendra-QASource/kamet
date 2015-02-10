package com.web.pages;


import org.openqa.selenium.By;

public class LoginPage {
	
	private By emailBy = By.cssSelector(".auth-frm input");
	private By continueButtonBy = By.cssSelector(".auth-buttons .btn-p"); 
	private By passwordBy = By.cssSelector(".password input");
	private By signInButtonBy = By.cssSelector(".auth-buttons a.btn-p-green");
	
	public void enterUsername(String username){
		Element.enterText(emailBy, username);
	}
	
	public void clickOnContinue() {
		Element.click(continueButtonBy);
	}
	
	public void enterPassword(){
		Element.click(passwordBy);
	}
	
	public void clickOnSignin(){
		Element.click(signInButtonBy);
	}

}
