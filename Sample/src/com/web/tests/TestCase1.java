package com.web.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.web.pages.BaseClass;
import com.web.pages.Home;
import com.web.pages.LoginPage;
import com.web.pages.UserHomepage;
import com.web.pages.makePaymentPage;

public class TestCase1 extends BaseTestClass {

	Home home = new Home();
	LoginPage Login = new LoginPage();
	UserHomepage Homepage = new UserHomepage();
	makePaymentPage paymentpage = new makePaymentPage();

	
	@Test
	//TC_048: Verify that 03 radio option should be displayed on “Make Payment” page.
	public void Terstcase1(){
		
		home.clickSignIn();
		Login.EnterUsername();
		Login.clickOnContinue();
		Login.EnterPassword();
		Login.clickOnSignin();
		Homepage.clickOnMakePaymentLink();
		Login.waittest();
		paymentpage.clickMakeAPaymentButton();
		Assert.assertTrue(paymentpage.verifyFullRadiobutton(), "Full Loan amount radio button not displayed");
		Assert.assertTrue(paymentpage.verifyMinimumRadiobutton(), "Minimum due radio button not displayed");
		Assert.assertTrue(paymentpage.verifyOtherRadiobutton(), "Other radio button not displayed");		
	}
	
//	//TC_049: Verify that “Other Amount” radio option is selected by default on “Make Payment” page when ACH is off.
//	@Test
//	public void Terstcase2(){
//		
//		home.clickSignIn();
//		Login.EnterUsername();
//		Login.clickOnContinue();
//		Login.EnterPassword();
//		Login.clickOnSignin();
//		Homepage.clickOnMakePaymentLink();
//		Login.waittest();
//		paymentpage.clickMakeAPaymentButton();
//		Assert.assertTrue(paymentpage.verifyOtherRadiobuttonselected(), "Other radio button not auto selected");
//	}
//	@Test
//public void Terstcase3(){
//		
//		home.clickSignIn();
//		Login.EnterUsername();
//		Login.clickOnContinue();
//		Login.EnterPassword();
//		Login.clickOnSignin();
//		Homepage.clickOnMakePaymentLink();
//		Login.waittest();
//		paymentpage.clickMakeAPaymentButton();
//		paymentpage.enterValueInOtherAmount("-500");
//		paymentpage.clickOnSend();
//		Login.waittest();
//		Assert.assertTrue(paymentpage.verifyValidationMessageisDisplayed(), "Validation Message not displayed");
//		
//	}
	
}
