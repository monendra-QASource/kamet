package com.web.pages;


import org.openqa.selenium.By;

public class Home {
	
	
	private By signInBy =  By.id("M_c5_c4_hlSignIn");
	
	
	
	public void clickSignIn(){
		Element.click(signInBy);
	}
	
	
}
