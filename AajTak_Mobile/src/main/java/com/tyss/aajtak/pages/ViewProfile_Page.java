package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.tyss.aajtak.util.MobileActionUtil;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for ViewProfile Page.
 * 
 * @author Ramya R
 */
public class ViewProfile_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public ViewProfile_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* View profile button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvMyProfile']")
	private AndroidElement btnViewProfile;

	/* My download content text */
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/consDownload']")
	private AndroidElement txtMyDownloadContent;

	/* My bookmark text */
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/consBookmark']")
	private AndroidElement txtMyBookmark;

	/* My download content icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivDownloaded")
	private AndroidElement icnMyDownloadContent;

	/* My bookmark content icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBookmark")
	private AndroidElement icnMyBookmarkContent;

	/* Edit profile button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/cvEditProfile']")
	private AndroidElement btnEditProfile;

	/* User name text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvUserName']")
	private AndroidElement txtUserName;

	/* User Place text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvProfileLocation']")
	private AndroidElement txtUserPlace;

	/* Back arrow button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement btnBackArrow;

	/* Profile image */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/cvUserProfile']")
	private AndroidElement imgProfile;

	/**
	 * Description: Method to click on View profile.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOnViewProfile() {
		try {
			MobileActionUtil.clickOnElement(btnViewProfile, "View profile Button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on View profile Button ");
			Assert.fail("Unable to click on View profile Button");
		}
	}

	/**
	 * Description: Method to verify My download content.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateMyDownloadContent() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtMyDownloadContent, "My download content text",
					"Able to validate My download content", "Unable to validate My download content", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate My download content text");
			Assert.fail("Unable to validate My download content text");
		}
	}

	/**
	 * Description: Method to verify My bookmark.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateMyBookmark() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtMyBookmark, "My bookmark text",
					"Able to validate My bookmark text", "Unable to validate My bookmark text", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate My bookmark text");
			Assert.fail("Unable to validate My bookmark text");
		}
	}

	/**
	 * Description: Method to click on My download content icon.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOnMyDownloadContentIcon() {
		try {
			MobileActionUtil.clickOnElement(icnMyDownloadContent, "My download content icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on My download content icon");
			Assert.fail("Unable to click on My download content icon");
		}
	}

	/**
	 * Description: Method to click on My bookmark content icon.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOnMyBookmarkContentIcon() {
		try {
			MobileActionUtil.clickOnElement(icnMyBookmarkContent, "My bookmark content icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on My bookmark content icon");
			Assert.fail("Unable to click on My bookmark content icon");
		}
	}

	/**
	 * Description: Method to click on Edit profile.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOnEditProfile() {
		try {
			MobileActionUtil.clickOnElement(btnEditProfile, "Edit profile Button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Edit profile button");
			Assert.fail("Unable to click on Edit profile button");
		}
	}

	/**
	 * Description: Method to verify User name.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateUserName() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtUserName, "User name text",
					"Able to validate User name text field", "Unable to validate User name text field", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate User name text field");
			Assert.fail("Unable to validate User name text field");
		}
	}

	/**
	 * Description: Method to verify User place.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateUserPlace() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtUserPlace, "User place text field",
					"Able to validate User place text field", "Unable to validate User place text field", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate User place text field");
			Assert.fail("Unable to validate User place text field");
		}
	}

	/**
	 * Description: Method to verify Profile image.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateProfileImage() {
		try {
			MobileActionUtil.validateisElementDisplayed(imgProfile, "Profile image", "Able to validate Profile image",
					"Unable to validate Profile image", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Profile image");
			Assert.fail("Unable to validate Profile image");
		}
	}

	/**
	 * Description: Method to click on Back arrow button
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOnBackArrowButton() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back arrow button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Back arrow button");
			Assert.fail("Unable to click on Back arrow button");
		}
	}

}
