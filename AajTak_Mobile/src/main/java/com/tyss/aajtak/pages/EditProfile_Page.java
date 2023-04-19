package com.tyss.aajtak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Edit Profile Page.
 * 
 * @author Ramya R
 */
public class EditProfile_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public EditProfile_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Camera text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivCamera")
	private AndroidElement txtCamera;

	/* Ok button in DOB */
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private AndroidElement btnOkInDoB;

	/* Profile Selection button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/cvEditProfile']")
	private AndroidElement btnProfileSelection;

	/* Save Karen button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSave']")
	private AndroidElement btnSaveKaren;

	/* Select Sthree btn */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='स्री']")
	private AndroidElement btnSelectSthree;

	/* Allow1 button */
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']"),
			@AndroidBy(xpath = "//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']") })
	private AndroidElement bthAllow1;

	/* Year header text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/date_picker_header_year']")
	private AndroidElement txtYearHeader;

	/* Back Arrow icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/tbBackArrow']")
	private AndroidElement icnBackArrow;

	/* Edit Profile options */
	private AndroidElement optionsNameandEmail(String option) {
		String xpath = "//android.widget.EditText[@text='"+option+"']";
		return androidDriver.findElement(By.xpath(xpath));
	}
	
	/* Gender button */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etGender']")
	private AndroidElement btnGender;
	
//	/* Edit UserName text */
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etName']")
//	private AndroidElement txtEditUserName;
//
//	/* Registered Email text */
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etEmail']")
//	private AndroidElement txtRegisteredEmail;

//	/* Registered Phone Number text */
//	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etEmail']")
//	private AndroidElement txtRegisteredPhoneNum;

	/* User DOB button */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etDateBirth']")
	private AndroidElement btnUserDoB;

	/* User Location text field */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/etLocation']")
	private AndroidElement tbUserLocation;

	/* Edit Profile title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='प्रोफाइल एडिट करें']")
	private AndroidElement txtEditProfileTitle;

	/* Selected Sthree option */
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='स्री']")
	private AndroidElement ddSelectedSthree;

	/* Selecte the year */
	private AndroidElement txtYear(String year) {
		String xpath = "//android.widget.TextView[@text='" + year + "']";
		return androidDriver.findElement(By.xpath(xpath));
	}

	/* Next month button */
	@AndroidFindBy(id = "android:id/next")
	private AndroidElement btnNextMonth;

	/* Select the day */
	private AndroidElement txtDay(String day) {
		String xpath = "//android.view.View[@text='" + day + "']";
		return androidDriver.findElement(By.xpath(xpath));
	}

	/* Pic done button*/
	@AndroidFindAll({@AndroidBy(id="org.codeaurora.snapcam:id/done_button"),
	@AndroidBy(id="com.sec.android.app.camera:id/okay"),
	@AndroidBy(xpath="//android.widget.ImageView[@content-desc='Done']"),
	@AndroidBy(xpath="//android.widget.ImageButton[@content-desc='Done']")})
	private AndroidElement btnPicDone;
	
	/* Camera Shutter button */
	@AndroidFindAll({@AndroidBy(id="org.codeaurora.snapcam:id/shutter_button" ),
		@AndroidBy(id="com.sec.android.app.camera:id/normal_center_button"),
		@AndroidBy(xpath = "//android.view.View[@content-desc='Shutter button']"),
		@AndroidBy(xpath="//*[contains(@resource-id,'shutter')]"),
		@AndroidBy(id="com.oneplus.camera:id/primary_button_icon_container"),
		@AndroidBy(xpath = "//android.widget.ImageView[@content-desc='Shutter button']"),
		@AndroidBy(xpath="//android.widget.ImageButton[@content-desc='Take photo']"),
		@AndroidBy(xpath="//android.widget.ImageView[@resource-id='com.android.camera:id/shutter_button']")})
	private AndroidElement btnCameraShutter;

	/* Home tab */
	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.TextView[@text='होम']")
	private AndroidElement homeTab;

	/* Download Content icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/consDownload")
	private AndroidElement icnDownloadedContent;

	/* Namskar User Name text */
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'नमस्कार')]")
	private AndroidElement txtNamskarUserName;

	/* Settings link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='सेटिंग्स']")
	private AndroidElement lnkSettings;

	/* Aapka SwaagathHe link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='आपका स्वागत है!']")
	private AndroidElement lnkAapkaSwaagathHe;

/**
	 * Description: Method to click on Download Content In Hamburger Menu
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkDownloadContentIcn() {
		try {
			MobileActionUtil.clickOnElement(icnDownloadedContent, "Download content icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Download content icon");
			Assert.fail("Unable to click on Download content icon");
		}
	}
	/**
	 * Description: Method to Wait for Save Karen.
	 * 
	 * @author Ramya R
	 */
	public synchronized void waitForSaveKaren() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(btnSaveKaren, "Save Karen button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Save Karen button");
			Assert.fail("Unable to Wait for Save Karen button");
		}
	}

	/**
	 * Description: Method to Scroll To Registered Phone Number.
	 * 
	 * @author Ramya R
	 * @param options 
	 */
	public synchronized void scrollToRegisteredPhoneNumber(String options) {
		try {
			MobileActionUtil.scrollToElement(optionsNameandEmail(options));
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to Registered Phone Number text field");
			Assert.fail("Unable to scroll to Registered Phone Number text field");
		}
	}

	/**
	 * Description: Method to Scroll To Registered Email.
	 * 
	 * @author Ramya R
	 * @param options 
	 */
	public synchronized void scrollToRegisteredEmail(String options) {
		try {
			MobileActionUtil.scrollToElement(optionsNameandEmail(options));
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Scroll to Registered Email");
			Assert.fail("Unable to Scroll to Registered Email");
		}
	}

	/**
	 * Description: Method to validate User Location.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateUserLocation() {
		try {
			MobileActionUtil.isElementDisplayed(tbUserLocation, "User Location text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate User Location");
			Assert.fail("Unable to validate User Location");
		}
	}

	/**
	 * Description: Method to validate User DOB.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateUserDOB() {
		try {
			MobileActionUtil.isElementDisplayed(btnUserDoB, "User DOB button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate User DOB");
			Assert.fail("Unable to validate User DOB");
		}
	}

	/**
	 * Description: Method to validate Registered Email.
	 * 
	 * @author Ramya R
	 * @param options 
	 */
	public synchronized void validateRegisteredEmail(String options) {
		try {
			MobileActionUtil.isElementDisplayed(optionsNameandEmail(options), "Registered Email text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Registered Email");
			Assert.fail("Unable to validate Registered Email");
		}
	}

	/**
	 * Description: Method to validate Edit User name.
	 * 
	 * @author Ramya R
	 * @param options 
	 */
	public synchronized void validateEditUsername(String options) {
		try {
			MobileActionUtil.isElementDisplayed(optionsNameandEmail(options), "Edit UserName text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Edit userName text");
			Assert.fail("Unable to validate Edit userName text");
		}
	}

	/**
	 * Description: Method to validate Edit Profile title page.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateEditProfilePage() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtEditProfileTitle, "Edit Profile title text",
					"Edit Profile page is displayed", "Edit Profile page is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Edit Profile Page");
			Assert.fail("Unable to validate Edit Profile Page");
		}
	}

	/**
	 * Description: Method to validate Back Arrow icon is displayed
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateBackArrow() {
		try {
			MobileActionUtil.isElementDisplayed(icnBackArrow, "Back Arrow icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Back Arrow icon");
			Assert.fail("Unable to validate Back Arrow icon");
		}
	}

	/**
	 * Description: Method to click on Year header.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkyearHeader() {
		try {
			MobileActionUtil.clickOnElement(txtYearHeader, "Year header text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Year header");
			Assert.fail("Unable to click on Year header");
		}
	}

	/**
	 * Description: Method to click on Allow button .
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkWhileUsingTheApp() {
		try {
			MobileActionUtil.clickOnElement(bthAllow1, "Allow button ");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Allow button");
			Assert.fail("Unable to click on Allow button");
		}
	}

	/**
	 * Description: Method to click on User DOB button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkUserDOB() {
		try {
			MobileActionUtil.clickOnElement(btnUserDoB, "User DOB button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on User DOB button");
			Assert.fail("Unable to click on User DOB button");
		}
	}

	/**
	 * Description: Method to click on S three button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkSelectSThree() {
		try {
			MobileActionUtil.clickOnElement(btnSelectSthree, "S three button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on S three button");
			Assert.fail("Unable to click on S three button");
		}
	}

	/**
	 * Description: Method to click on Save Karen button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkSaveKaren() {
		try {
			MobileActionUtil.clickOnElement(btnSaveKaren, "Save Karen button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Save Karen button");
			Assert.fail("Unable to click on Save Karen button");
		}
	}

	/**
	 * Description: Method to click on Pic done button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkPicDone() {
		try {
			MobileActionUtil.clickOnElement(btnPicDone, "Pic done button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Pic done button");
			Assert.fail("Unable to click on Pic done button");
		}
	}

	/**
	 * Description: Method to click on Ok in DoB button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOkinDOB() {
		try {
			MobileActionUtil.clickOnElement(btnOkInDoB, "Ok button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Ok button");
			Assert.fail("Unable to click on Ok button");
		}
	}

	/**
	 * Description: Method to click on Gender button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkGender() {
		try {
			MobileActionUtil.clickOnElement(btnGender, "Gender button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Gender button");
			Assert.fail("Unable to click on Gender");
		}
	}

	/**
	 * Description: Method to click on Edit Profile title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkEditProfileTitle() {
		try {
			MobileActionUtil.clickOnElement(txtEditProfileTitle, "Edit Profile title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Edit Profile title text");
			Assert.fail("Unable to click on Edit Profile title text");
		}
	}

	/**
	 * Description: Method to click on Camera shutter button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkCameraShutterBtn() {
		try {
			MobileActionUtil.clickOnElement(btnCameraShutter, "Camera shutter button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Camera shutter button");
			Assert.fail("Unable to click on Camera shutter button");
		}
	}

	/**
	 * Description: Method to click on Camera .
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkCamera() {
		try {
			MobileActionUtil.clickOnElement(txtCamera, "Camera text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Camera text");
			Assert.fail("Unable to click on Camera text");
		}
	}

	/**
	 * Description: Method to validate Registered Phone Number.
	 * 
	 * @author Ramya R
	 * @param options 
	 */
	public synchronized void validateRegisteredPhoneNumber(String options) {
		try {
			try {
				MobileActionUtil.isElementDisplayed(optionsNameandEmail(options), "Registered Phone Number text");
			} catch (Exception e1) {
				MobileActionUtil.info("User is registered through mail id in that case mobile number will not display");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Registered Phone Number");
			Assert.fail("Unable to validate Registered Phone Number");
		}
	}

	/**
	 * Description: Method to set User DOB text field.
	 * 
	 * @author Ramya R
	 * @param dateOfBirth
	 */
	public synchronized void setUserDOBTextField(String dateOfBirth) {
		try {
			MobileActionUtil.typeText(btnUserDoB, "7th दिसंबर 1997", "User DOB text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set User DOB text field");
			Assert.fail("Unable to set User DOB text field");
		}
	}

	/**
	 * Description: Method to validate Gender.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateGender() {
		try {
			MobileActionUtil.isElementDisplayed(ddSelectedSthree, "Gender dropdown");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Gender dropdown");
			Assert.fail("Unable to validate Gender dropdown");
		}
	}

	/**
	 * Description: Method to enter location in User Location text field.
	 * 
	 * @author Ramya R
	 * @param location
	 */
	public synchronized void setUserLocation(String location) {
		try {
			MobileActionUtil.scrollDown(2);
			MobileActionUtil.typeText(tbUserLocation, location, "User Location text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to enter" + location + "in User Location text field");
			Assert.fail("Unable to enter" + location + "in User Location text field");
		}
	}

	/**
	 * Description: Method to click on Photo or Profile Selection button
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkProfileSelection() {
		try {
			MobileActionUtil.scrollUp(2);
			MobileActionUtil.clickOnElement(btnProfileSelection, "Profile Selection button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Profile Selection button");
			Assert.fail("Unable to click on Profile Selection button");
		}
	}

	/**
	 * Description: Method to click on Year .
	 * 
	 * @author
	 * @param year
	 */
	public synchronized void clkYear(String year) {
		try {
			MobileActionUtil.scrollUp(5);
			MobileActionUtil.clickOnElement(txtYear(year), "Year text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Year text");
			Assert.fail("Unable to click on Year text");
		}
	}

	/**
	 * Description: Method to click on Photo or Profile Selection button
	 * 
	 * @author Ramya R
	 */
	public synchronized void selectDayOfTheMonth(String day, int month) {
		try {
			month = month - 1;
			for (int i = 0; i < month; i++) {
				MobileActionUtil.clickOnElement(btnNextMonth, "Next Month button");
			}
			MobileActionUtil.clickOnElement(txtDay(day), "Day of the month text");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to select Day of the month text");
			Assert.fail("Unable to select Day of the month text");
		}
	}

}
