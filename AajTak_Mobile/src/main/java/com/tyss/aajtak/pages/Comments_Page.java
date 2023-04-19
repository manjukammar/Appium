package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Comments Page.
 * 
 * @author Ramya R
 */
public class Comments_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Comments_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Back Arrow icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement icnBackArrow;

	/* Comment text field */
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private AndroidElement tbComment;

	/* Comment text heading */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कमेंट्स']")
	private AndroidElement txtCommentHeading;

	/**
	 * Description: Method to Wait for Comment text field.
	 * 
	 * @author Ramya R
	 */
	public synchronized void waitForCommentTextfield() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(tbComment, "Comment text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Comment text field");
			Assert.fail("Unable to Wait for Comment text field");
		}
	}

	/**
	 * Description: Method to validate Comment heading text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateCommentHeading() {
		try {
			MobileActionUtil.isElementDisplayed(txtCommentHeading, "Comment heading text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Comment heading text");
			Assert.fail("Unable to validate Comment heading text");
		}
	}

	/**
	 * Description: Method to validate Comment text field
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateCommenttextfield() {
		try {
			MobileActionUtil.isElementDisplayed(tbComment, "Comment text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Comment text field");
			Assert.fail("Unable to validate Comment text field");
		}
	}

	/**
	 * Description: Method to click on Back Arrow button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkBackarrow() {
		try {
			MobileActionUtil.clickOnElement(icnBackArrow, "Back Arrow icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Back Arrow icon");
			Assert.fail("Unable to click on Back Arrow icon");
		}
	}

}
