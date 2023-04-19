package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUp_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public SignUp_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* First name text box */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etFirstname']")
	private AndroidElement tbFirstName;

	/* Email or phone text box */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etUsername']")
	private AndroidElement tbEmailOrPhone;

	/* Password text box */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etPassword']")
	private AndroidElement tbPassword;

	/* Sign up button */
	@AndroidFindBy(xpath = "//android.widget.Button[@text='साइनअप करें']")
	private AndroidElement btnSignUp;

	/* Already member text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_account']")
	private AndroidElement txtAlreadyMember;

	/* Login button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login']")
	private AndroidElement btnLogin;

	/* Sign up with text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_login_loginwith']")
	private AndroidElement txtSignUpWith;

	/* Facebook login button */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/facebookView']")
	private AndroidElement btnFacebookLogin;

	/* Twitter login button */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='in.AajTak.headlines:id/bt_twitter_login']")
	private AndroidElement btnTwitterLogin;

	/* Privacy policy button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/gdprtv']")
	private AndroidElement lnkPrivacyPolicy;

	/* Agree terms and conditions link */
	@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='in.AajTak.headlines:id/gdprCheckbox']")
	private AndroidElement lnkAgreeTermsAndConditions;

	/* Close icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/toolbar_close']")
	private AndroidElement icnClose;

	/* Back arrow button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/tbBackArrow']")
	private AndroidElement btnBackArrow;

	/* Name input error text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कृपया अपना पहला नाम लिखें']")
	private AndroidElement txtNameInputError;

	/* Email input error text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अपना ईमेल/फोन लिखें']")
	private AndroidElement txtEmailInputError;

	/* Email error text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अपना ईमेल/फोन लिखें']")
	private AndroidElement txtEmailError;

	/* Name error text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कृपया अपना पहला नाम लिखें']")
	private AndroidElement txtNameError;

	/* Password input error text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अपना पासवर्ड डालें']")
	private AndroidElement txtPasswordInputError;

	/* Password hide icon */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show password']")
	private AndroidElement icnPasswordHide;

	/* Privacy Policy text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
	private AndroidElement txtPrivacyPolicy;

	/* Term And Condition text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='India Today Group : TERMS AND CONDITIONS']")
	private AndroidElement txtTermAndCondition;

	/* I agree check box */
	@AndroidFindBy(id = "in.AajTak.headlines:id/gdprCheckbox")
	private AndroidElement ckbIAgree;

	/* Password error text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='पासवर्ड बिना स्पेस के कम से कम 6 कैरेक्टर्स का होना चाहिए जिसमें 1 न्यूमरिक और 1 स्पेशल कैरेक्टर हो']")
	private AndroidElement txtPasswordError;

	/* Toast message text */
	@AndroidFindBy(xpath = "//android.widget.Toast")
	private AndroidElement txtToastmsg;

	/**
	 * Description:: Method to enter data in password text box.
	 * 
	 * @author Shivananda T S
	 * @param Password
	 */
	public synchronized void setPassword(String Password) {
		try {
			MobileActionUtil.typeText(tbPassword, Password, "Password");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to enter " + Password + " in Password text area");
			Assert.fail("Unable to enter " + Password + " in Password text area");
		}
	}

	/**
	 * Description: Method to click on Password.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnPassword() {
		try {
			MobileActionUtil.clickOnElement(tbPassword, "Password");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Password");
			Assert.fail("Unable to perform click action on Password");
		}
	}

	/**
	 * Description: Method to verify SignUp button.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validatesignUp() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnSignUp, "Signup button", "Able to validate Signup button",
					"Unable to validate Signup button", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Signup button");
			Assert.fail("Unable to validate Signup button");
		}
	}

	/**
	 * Description: Method to click on Sign up button.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnSignUp() {
		try {
			MobileActionUtil.clickOnElement(btnSignUp, "Sign up button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sign up button");
			Assert.fail("Unable to perform action on Sign up button");
		}
	}

	/**
	 * Description: Method to click on Privacy policy link.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnPrivacyPolicy() {
		try {
			MobileActionUtil.clickOnElement(lnkPrivacyPolicy, "Privacy policy link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Privacy policy link");
			Assert.fail("Unable to perform action on Privacy policy link");
		}
	}

	/**
	 * Description: Method to click on Agree terms and conditions link.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnAgreeTermsAndConditions() {
		try {
			MobileActionUtil.clickOnElement(lnkAgreeTermsAndConditions, "Agree terms and conditions link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Agree terms and conditions link");
			Assert.fail("Unable to perform action on Agree terms and conditions link");
		}
	}

	// android.widget.TextView[@text='Privacy Policy']

	/**
	 * Description: Method to click on Back arrow button.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnBackArrowBtn() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back arrow button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Back arrow button");
			Assert.fail("Unable to perform click action on Back arrow button");
		}
	}

	/**
	 * Description: Method to verify Email error text.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateEmailErrorText() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtEmailError, "Email error text",
					"Able to validate Email error text", "Unable to validate Email error text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Email error text");
			Assert.fail("Unable to validate Email error text");
		}
	}

	public AndroidElement getEmailInputErrorText() {
		return txtEmailInputError;
	}

	/**
	 * Description:Method to get text of Password input error text
	 * 
	 * @author:Shivananda T S
	 * @return PasswordInputErrorText
	 * 
	 */
	public synchronized String getPasswordInputErrorText() {
		String PasswordInputErrorText = null;
		try {
			PasswordInputErrorText = txtPasswordInputError.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Password input error text");
			Assert.fail("Unable to get text of Password input error text");
		}
		return PasswordInputErrorText;
	}

	/**
	 * Description: Method to verify Name error text.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateNameErrorText() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtNameError, "Name error text",
					"Able to validate Name error text", "Unable to validate Name error text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Name error text");
			Assert.fail("Unable to validate Name error text");
		}
	}

	/**
	 * Description: Method to click on Password hidden icon.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnPasswordHiddenIcon() {
		try {
			MobileActionUtil.clickOnElement(icnPasswordHide, "Password hidden icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Password hidden icon");
			Assert.fail("Unable to perform action on Password hidden icon");
		}
	}

	/******* 19-01-23 **********/

	/**
	 * Description:: Method to enter data in First name text box.
	 * 
	 * @author Shivananda T S
	 * @param firstname
	 */
	public synchronized void setFirstName(String firstname) {
		try {
			MobileActionUtil.typeText(tbFirstName, firstname, "First name text area");
			MobileActionUtil.validateText(firstname, tbFirstName, "Name Text box", "Entered text is reflecting",
					"Entered text is not reflecting", "blue");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to enter " + firstname + " in First name text area");
			Assert.fail("Unable to enter " + firstname + " in First name text area");
		}
	}

	/**
	 * Description:: Method to enter data in Email or phone text box.
	 * 
	 * @author Shivananda T S
	 * @param EmailOrPhone
	 */
	public synchronized void setEmailOrPhone(String EmailOrPhone) {
		try {
			MobileActionUtil.typeText(tbEmailOrPhone, EmailOrPhone, "Email or phone text box");
			MobileActionUtil.validateText(EmailOrPhone, tbEmailOrPhone, "Email or phone text box",
					"Entered text is reflecting", "Entered text is not reflecting", "blue");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to enter " + EmailOrPhone + " in Email or phone text area");
			Assert.fail("Unable to enter " + EmailOrPhone + " in Email or phone text area");
		}
	}

	/**
	 * Description: Method to verify Name text.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateNameText() {
		try {
			MobileActionUtil.validateisElementDisplayed(tbFirstName, "Name text", "Able to validate Name error text",
					"Unable to validate Name text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Name text");
			Assert.fail("Unable to validate Name text");
		}
	}

	/**
	 * Description: Method to verify EmailOrPhone text.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateEmailOrPhoneText() {
		try {
			MobileActionUtil.validateisElementDisplayed(tbEmailOrPhone, "EmailOrPhone text",
					"Able to validate Password text", "Unable to validate EmailOrPhone text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate EmailOrPhone text");
			Assert.fail("Unable to validate EmailOrPhone text");
		}
	}

	/**
	 * Description: Method to verify Password text.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validatePasswordText() {
		try {
			MobileActionUtil.validateisElementDisplayed(tbPassword, "Password text", "Able to validate Password text",
					"Unable to validate Password text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Password text");
			Assert.fail("Unable to validate Password text");
		}
	}

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author Shiavananda T S
	 * 
	 */
	public synchronized void clkBackbtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Back button");
			Assert.fail("Unable to perform click action on Back button");
		}
	}

	/**
	 * Description:: Method to enter email or phone text box and validate.
	 * 
	 * @author Shivananda T S
	 * @param EmailOrPhone
	 */
	public synchronized void setAndValidateEmailOrPhone(String EmailOrPhone) {
		try {
			String initialText = tbEmailOrPhone.getText();
			MobileActionUtil.clearText(tbEmailOrPhone, "Email or phone");
			MobileActionUtil.typeText(tbEmailOrPhone, EmailOrPhone, "Email or phone");
			String finalText = tbEmailOrPhone.getText();
			Assert.assertNotEquals(initialText, finalText);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to type and Validate");
			Assert.fail("Unable to type and Validate");
		}
	}

	/**
	 * Description:: Method to enter Name text box and validate.
	 * 
	 * @author Shivananda T S
	 * @param name
	 */
	public synchronized void setAndValidateName(String name) {
		try {
			String initialText = tbFirstName.getText();
			MobileActionUtil.clearText(tbFirstName, "Name Text field");
			MobileActionUtil.typeText(tbFirstName, name, "Name Text field");
			String finalText = tbFirstName.getText();
			Assert.assertNotEquals(initialText, finalText);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to type and Validate");
			Assert.fail("Unable to type and Validate");
		}
	}

	/**
	 * Description:: Method to enter Name text box and validate.
	 * 
	 * @author Shivananda T S
	 * @param password
	 */
	public synchronized void setAndValidatePassword(String password) {
		try {
			String initialText = tbPassword.getText();
			MobileActionUtil.clearText(tbPassword, "Password Text field");
			MobileActionUtil.typeText(tbPassword, password, "Password Text field");
			String finalText = tbPassword.getText();
			Assert.assertNotEquals(initialText, finalText);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to type and Validate Password Text field");
			Assert.fail("Unable to type and Validate Password Text field");
		}
	}

	/**
	 * Description:: Method to validate Password
	 * 
	 * @author Bredlin
	 * @param password
	 */
	public synchronized void validatePassword(String expectedPassword) {
		try {
			String actualPassword = tbPassword.getText();
			Assert.assertEquals(actualPassword, expectedPassword);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Validate Password");
			Assert.fail("Unable to Validate Password");
		}
	}

	/**
	 * Description:: Method to validate Privacy Policy text
	 * 
	 * @author Bredlin
	 */
	public synchronized void validatePrivacyPolicyText() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPrivacyPolicy, "Privacy Policy text",
					"Able to validate Privacy Policy text", "Unable to validate Privacy Policy text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Privacy Policy text");
			Assert.fail("Unable to validate Privacy Policy text");
		}
	}

	/**
	 * Description:: Method to validate Terms And Condition text
	 * 
	 * @author Bredlin
	 */
	public synchronized void validateTermsAndConditionText() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtTermAndCondition, "Terms And Condition text",
					"Able to validate Terms And Condition text", "Unable to validate Terms And Condition text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Terms And Condition text");
			Assert.fail("Unable to validate Terms And Condition text");
		}
	}

	/**
	 * Description: Method to click on I Agree check box
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkIAgreeCkb() {
		try {
			MobileActionUtil.clickOnElement(ckbIAgree, "I Agree check box");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on I Agree check box");
			Assert.fail("Unable to perform click action on I Agree check box");
		}
	}

	/**
	 * Description:: Method to validate Password Error text
	 * 
	 * @author Bredlin
	 */
	public synchronized void validatePasswordErrorTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPasswordError, "Password Error text",
					"Able to validate Password Error text", "Unable to validate Password Error text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Password Error text");
			Assert.fail("Unable to validate Password Error text");
		}
	}

	public synchronized void clkSevaKiShathreLnk() {
		try {
			MobileActionUtil.clickOnElementUsingCoordinates(768, 1667);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on I Agree check box");
			Assert.fail("Unable to perform action on I Agree check box");
		}
	}

	/**
	 * Description: Method to Validate Toast Message.
	 * 
	 * @author Bredlin
	 */
	public synchronized void validateToastMessage() {
		try {
			try {
				txtToastmsg.isDisplayed();
			} catch (Exception e) {
				MobileActionUtil.info("Toast Message is not Interactable");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Validate Toast Message");
			Assert.fail("Unable to Validate Toast Message");
		}
	}

}