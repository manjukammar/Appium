package com.tyss.aajtak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Image DownloadKaren
 * Page.
 * 
 * @author Sreelatha
 */
public class ImageDownloadKaren_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public ImageDownloadKaren_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Toggles Turn Off Radio button */
	private AndroidElement turnOffRdo(String reqTxt) {
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + reqTxt
				+ "']/following-sibling::android.widget.Switch[@checked='true']"));

	}

	/* Toggles Turn Off Radio button */
	private AndroidElement turnOnRdo(String reqTxt) {
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + reqTxt
				+ "']/following-sibling::android.widget.Switch[@checked='false']"));

	}

	/* Toggle Text */
	private AndroidElement toggleTxt(String reqTxt) {
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + reqTxt + "']"));

	}

	/* Back arrow Button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void clkBackButton(int noOfTimes) {
		try {
			MobileActionUtil.clickDeviceBackButton(noOfTimes);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Back button");
			Assert.fail("Unable to perform action on Back button");
		}
	}

	/**************************************************/
	
	/**
	 * Description:Method to validate Text in Image Download karen page
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateToogleTxt(String reqTxt) {
		try {
			MobileActionUtil.validateisElementDisplayed(toggleTxt(reqTxt), reqTxt + " text",
					reqTxt + " text is displayed", reqTxt + " text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate " + reqTxt + " text");
			Assert.fail("Unable to validate " + reqTxt + " text");
		}
	}

	/**
	 * Description:Method to turn on the Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOnRdo(String reqTxt) {
		try {
			MobileActionUtil.clickOnElement(turnOnRdo(reqTxt), reqTxt + " toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn On " + reqTxt);
			Assert.fail("Unable to turn On " + reqTxt);
		}
	}

	/**
	 * Description:Method to turn on the Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOffRdo(String reqTxt) {
		try {
			MobileActionUtil.clickOnElement(turnOffRdo(reqTxt), reqTxt + " toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn Off " + reqTxt);
			Assert.fail("Unable to turn Off " + reqTxt);
		}
	}

	/**
	 * Description:Method to validate toggle is enabled or not
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateToggleIsEnabled(String reqText) {
		try {
			MobileActionUtil.validateisElementDisplayed(turnOffRdo(reqText), reqText + " toggle",
					reqText + " toggle is enabled", reqText + " toggle is not enabled", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate " + reqText + " toggle is enabled or not");
			Assert.fail("Unable to validate " + reqText + " toggle is enabled or not");
		}
	}
	
	/**************************************************/
	
	/**
	 * Description:Method to turn on 3G/4G Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOff3G4GRdo() {
		try {
			MobileActionUtil.clickOnElement(turnOffRdo("3जी/4जी"), "3जी/4जी toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn Off 3जी/4जी");
			Assert.fail("Unable to turn Off 3जी/4जी");
		}
	}
	
	/**
	 * Description:Method to turn on Wifi Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOffWifiRdo() {
		try {
			MobileActionUtil.clickOnElement(turnOffRdo("वाई फाई"), "वाई फाई toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn Off वाई फाई");
			Assert.fail("Unable to turn Off वाई फाई");
		}
	}
	
	/**
	 * Description:Method to turn on 2G Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOff2GRdo() {
		try {
			MobileActionUtil.clickOnElement(turnOffRdo("2जी"), "2जी toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn Off 2जी");
			Assert.fail("Unable to turn Off 2जी");
		}
	}
	
	/**
	 * Description:Method to turn off 3G/4G Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOn3G4GRdo() {
		try {
			MobileActionUtil.clickOnElement(turnOnRdo("3जी/4जी"), "3जी/4जी toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn On 3जी/4जी");
			Assert.fail("Unable to turn On 3जी/4जी");
		}
	}
	
	/**
	 * Description:Method to turn off Wifi Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOnWifiRdo() {
		try {
			MobileActionUtil.clickOnElement(turnOnRdo("वाई फाई"), "वाई फाई toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn On वाई फाई");
			Assert.fail("Unable to turn On वाई फाई");
		}
	}
	
	/**
	 * Description:Method to turn off 2G Radio Button
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void clkTurnOn2GRdo() {
		try {
			MobileActionUtil.clickOnElement(turnOnRdo("2जी"), "2जी toggle");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn On 2जी");
			Assert.fail("Unable to turn On 2जी");
		}
	}
	
	/**
	 * Description:Method to validate 2G Text
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validate2GToggleTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(toggleTxt("2जी"), "2जी text",
					"2जी text is displayed", "2जी text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate 2जी text");
			Assert.fail("Unable to validate 2जी text");
		}
	}
	
	/**
	 * Description:Method to validate 3G/4G Text
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validate3G4GToggleTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(toggleTxt("3जी/4जी"), "3जी/4जी text",
					"3जी/4जी text is displayed", "3जी/4जी text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate 3जी/4जी text");
			Assert.fail("Unable to validate 3जी/4जी text");
		}
	}
	
	/**
	 * Description:Method to validate Wifi Text
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateWifiToggleTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(toggleTxt("वाई फाई"), "वाई फाई text",
					"वाई फाई text is displayed", "वाई फाई text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate वाई फाई text");
			Assert.fail("Unable to validate वाई फाई text");
		}
	}
	
	/**
	 * Description:Method to validate 2G toggle is enabled or not
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validate2GToggleIsEnabled() {
		try {
			MobileActionUtil.validateisElementDisplayed(turnOffRdo("2जी"), "2जी toggle",
					"2जी toggle is enabled", "2जी toggle is not enabled", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate 2जी toggle is enabled or not");
			Assert.fail("Unable to validate 2जी toggle is enabled or not");
		}
	}
	
	/**
	 * Description:Method to validate 3G/4G toggle is enabled or not
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validate3G4GToggleIsEnabled() {
		try {
			MobileActionUtil.validateisElementDisplayed(turnOffRdo("3जी/4जी"), "3जी/4जी toggle",
					"3जी/4जी toggle is enabled", "3जी/4जी toggle is not enabled", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate 3जी/4जी toggle is enabled or not");
			Assert.fail("Unable to validate 3जी/4जी toggle is enabled or not");
		}
	}
	
	/**
	 * Description:Method to validate Wifi toggle is enabled or not
	 * 
	 * @author Bredlin
	 * 
	 */
	 
	public synchronized void validateWifiToggleIsEnabled() {
		try {
			MobileActionUtil.validateisElementDisplayed(turnOffRdo("वाई फाई"), "वाई फाई toggle",
					"वाई फाई toggle is enabled", "वाई फाई toggle is not enabled", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate वाई फाई toggle is enabled or not");
			Assert.fail("Unable to validate वाई फाई toggle is enabled or not");
		}
	}
}
