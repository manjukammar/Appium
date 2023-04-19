package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * 
 * Description:This class has Method Implementation for Login Or Register Page
 * 
 * @author Sushmita P H
 *
 */
public class LoginOrRegister_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public LoginOrRegister_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Email or phone  text field*/
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etLoginUsername']")
	private AndroidElement tbEmailOrPhone;

	/* Close button*/
	@AndroidFindBy(id = "in.AajTak.headlines:id/tbClose")
	private AndroidElement btnClose;
	
	/*Login button*/
	@AndroidFindBy(id = "in.AajTak.headlines:id/btLoginSso")
	private AndroidElement btnLogin;
	
	/*Password text field*/
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='पासवर्ड']")
	private AndroidElement tbPasswordTa;

	/*Login button*/
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/btLoginSso']")
	private AndroidElement btnForgetLogin;
	
	/*Forgot Password button*/
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvLoginLorgotPswd']")
	private AndroidElement btnForgotPassword;

	/*Sign up link*/
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvLoginSignup']")
	private AndroidElement btnSignUpKaren;

	/*Facebook login icon*/
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/btnFacebook']")
	private AndroidElement icnFacebook;

	/*Twitter Login icon*/
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/btnTwitterlogin']")
	private AndroidElement icnTwitterLogin;
	
	

	/**
	 * Description: Method to Set email into email text field .
	 * 
	 * @author Sushmita P H 
	 * @param emailOrPhone
	 */
	public synchronized void setEmailorPhoneTa(String emailOrPhone) {
		try {

			MobileActionUtil.typeText(tbEmailOrPhone, emailOrPhone, "Email or Phone text field");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + emailOrPhone + " into email or phone text field");
			Assert.fail("Unable to set " + emailOrPhone + " into email or phone text field");
		}
	}

	/**
	 * Description: Method to set password.
	 * 
	 * @author Sushmita P H
	 * @param password
	 */
	public synchronized void setPasswordTa(String password) {
		try {
			MobileActionUtil.typeText(tbPasswordTa, password, "Password text field");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + password + " into Password text field");
			Assert.fail("Unable to set " + password + " into password text field");
		}
	}
	
	/**
	 * Description: Method to click on facebook  Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void clkfacebookLoginIcon() {
		try {
			MobileActionUtil.clickOnElement(icnFacebook, "Facebook icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Facebook icon");
			Assert.fail("Unable to click on Facebook icon");
		}
	}

	/**
	 * Description: Method to click on Forgot Password button.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void clkForgotPasswordBtn() {
		try {
			MobileActionUtil.clickOnElement(btnForgotPassword, "Forgot Password button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Forgot Password button");
			Assert.fail("Unable to click on Forgot Password button");
		}
	}


	/**
	 * Description: Method to Verify Facebook Login Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateFacebookLIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnFacebook, "Facebook Login icon",
					"Facebook Login icon is displayed", "Facebook Login icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Facebook Login icon");
			Assert.fail("Unable to validate Facebook Login icon");
		}
	}

	/**
	 * Description: Method to Verify Twitter Login Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateTwitterIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnTwitterLogin, "Twitter Login icon",
					"Twitter Login icon is displayed", " Twitter Login icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Twitter Login icon");
			Assert.fail("Unable to validate Twitter Login icon");
		}
	}

	/**
	 * Description: Method to Verify SignUp Karen Button.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateSignUpKarenBtn() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnSignUpKaren, "Sign Up Karen button",
					"SignUp Karen button is displayed ", "SignUp Karen button is not displayed ", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate SignUp Karen button");
			Assert.fail("Unable to validate SignUp Karen button");
		}
	}

	/**
	 * Description: Method to Verify Login Button.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateLoginBtn() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnLogin, "Login button", "Login button is displayed",
					"Login button is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Login button");
			Assert.fail("Unable to validate Login button");
		}
	}


	/**
	 * Description: Method to click on login Button.
	 * 
	 * @author Sanjay
	 */
	public synchronized void clkLoginBtn() {
		try {
			MobileActionUtil.clickOnElement(btnForgetLogin, "Login button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on login Button");
			Assert.fail("Unable to click on login Button");
		}
	}

	/**
	 * Description: Method to click on SignUp link.
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkSignUpLnk() {
		try {
			MobileActionUtil.clickOnElement(btnSignUpKaren, "SignUp link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on SignUp link");
			Assert.fail("Unable to click on SignUp link");
		}
	}
	
	/**
	 * Description: Method to click on Close button 
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkCloseBtn() {
		try {
			MobileActionUtil.clickOnElement(btnClose, "Close button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Close button");
			Assert.fail("Unable to click on Close button");
		}
	}
	

	
	
	/**************************************************31-01-23***************************************************/
	
	

	/*All icons */
	private AndroidElement icnAll(String icons) {
		String xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/"+icons+"']";
		return androidDriver.findElementByXPath(xpath);
		
	}
	
	/*All buttons */
	private AndroidElement btnAll(String buttons) {
		String xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/"+buttons+"']";
		return androidDriver.findElementByXPath(xpath);
		
	}
	
	
	/**
	 * Description: Method to click on Icons.
	 * 
	 * @author Manjappa
	 * @param icons 
	 */
	public synchronized void clkOnIcons(String icons) {
		try {
			MobileActionUtil.clickOnElement(icnAll(icons), "All Icons");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on All Icons");
			Assert.fail("Unable to click on All Icons");
		}
	}
	
	
	/**
	 * Description: Method to click on Icons.
	 * 
	 * @author Manjappa
	 * @param buttons 
	 */
	public synchronized void clkOnBtns(String buttons) {
		try {
			MobileActionUtil.clickOnElement(btnAll(buttons), "All buttons");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on All buttons");
			Assert.fail("Unable to click on All buttons");
		}
	}
}
