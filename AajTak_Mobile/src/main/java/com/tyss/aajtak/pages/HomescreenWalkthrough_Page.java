package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * Description: This class implements the locators and methods for HomeScreen Walk through Page.
 * 
 * @author Sreelatha
 *
 */
public class HomescreenWalkthrough_Page {
	
	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public HomescreenWalkthrough_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/*Pull Down button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_pullDown")
	private AndroidElement btnPullDown;
	
	/**
	 * Description: Method to validate Pull Down button
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validatePullDownBtn() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnPullDown, "Pull Down button", "Pull Down button is displayed", "Pull Down button is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Pull Down button");
			Assert.fail("Unable to validate Pull Down button");
		}
	}
	
}
