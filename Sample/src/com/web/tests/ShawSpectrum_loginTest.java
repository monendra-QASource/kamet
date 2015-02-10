package com.web.tests;

import org.testng.annotations.Test;

import com.web.pages.BaseClass;
import com.web.pages.shawSpectrum.LoginPage_ShawSpectrum;

public class ShawSpectrum_loginTest extends BaseClass{

	private LoginPage_ShawSpectrum loginPage_ShawSpectrum = new LoginPage_ShawSpectrum(); 
	
	private String username = "VisheshSahni";
	private String password = "W3ak52Pas5";
	
	
	@Test
	public void loginTest(){
		
		loginPage_ShawSpectrum.navigateToShawSpectrumURL();
		
		loginPage_ShawSpectrum.loginWith(username, password);
		
	}
	
	
}
