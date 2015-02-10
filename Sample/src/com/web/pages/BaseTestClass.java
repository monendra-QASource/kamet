package com.web.pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.web.pages.WebDriverClass;

public class BaseTestClass {
	
	@BeforeClass
	public void set(){
		new WebDriverClass().set();

	}
	
	@AfterClass
	public void tearDown(){
		new WebDriverClass().tearDown();
	}

}
