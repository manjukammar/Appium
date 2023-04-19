package com.tyss.aajtak.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class implements the locators and methods for Share page.
 * 
 * @author Mulage Abhishek
 * 
 */
public class Share_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Share_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Anya share text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अन्य']")
	private AndroidElement optAntAnyaa;
	
	/* Anya share text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='के जरिये शेयर करें']")
	private AndroidElement txtAnyaShare;
	
	/* Share icon  */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomShare")
	private AndroidElement icnShare;

	/* Other share button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='अन्य']")
	private AndroidElement btnOtherShare;
	
	/* Facebook share button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvFacebook")
	private AndroidElement btnFaceBookShar;

	/* Whatsapp share button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvWhatsapp")
	private AndroidElement btnWhatsAppShare;

	/* Twitter share button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvTwitter")
	private AndroidElement btnTwitterShare;

	/* Share cancel button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvCancel")
	private AndroidElement btnShareCancel;

	/* Share option highlights button */
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/design_bottom_sheet']//android.widget.TextView")
	private List<AndroidElement> btnShareOptionHighlights;

	/* Anya share options button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/text1']")
	private List<AndroidElement> btnAnyaShareOptions;

	/* Whatsapp back button */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	private AndroidElement btnWhatsappBack;

	/* Share me option button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ShareMe']")
	private AndroidElement btnShareMeOption;

	/* Whatsapp in other option button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp']")
	private AndroidElement btnWhatsAppInOtherOption;

	/* Share to mobile button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share to mobile']")
	private AndroidElement btnShareToMobile;

	/* Whatsapp toolbar */
	@AndroidFindBy(id = "com.whatsapp:id/toolbar")
	private AndroidElement toolbarWhatsapp;
	
	/**
	 * Description: Method to verify Share any text .
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateShareOptionsAreDisplayed() {
		try {
			List<AndroidElement> options = btnAnyaShareOptions;
			for (AndroidElement element : options) {
				MobileActionUtil.validateisElementDisplayed(element, element.getText(),
						element.getText()+" Share option is displayed",
						"Unable to validate Share options are displayed", "blue");
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Share options are displayed");
			Assert.fail("Unable to validate Share options are displayed");
		}
	}
	
	
	
	/**
	 * Description: Method to wait for Other share.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitTillOtherShare() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(btnOtherShare, "Other share");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Other share is not displayed");
			Assert.fail("Other share is not displayed");
		}
	}

	/**
	 * Description: Method to wait for Share cancel.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitTillShareCancelBtn() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(btnShareCancel, "Share cancel");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Share cancel is not displayed");
			Assert.fail("Share cancel is not displayed");
		}
	}

	/**
	 * Description: Method to verify Share me option.
	 * 
	 *@author Abhishek
	 *
	 */
	public synchronized void validateShareMeOption() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnShareMeOption, "Share me option",
					"Share me option is displayed", "Share me option is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Share me option is not displayed");
			Assert.fail("Share me option is not displayed");
		}
	}

	/**
	 * Description: Method to verify WhatsApp in other option.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateWhatsAppInOtherOption() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnWhatsAppInOtherOption, "WhatsApp in other option",
					"WhatsApp in other option is displayed", "WhatsApp in other option is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("WhatsApp in other option is not displayed");
			Assert.fail("WhatsApp in other option is not displayed");
		}
	}

	/**
	 * Description: Method to click on Share icon.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnShareIcon() {
		try {

			MobileActionUtil.clickOnElement(icnShare, "Share icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Share icon");
			Assert.fail("Unable to perform action on Share icon");
		}
	}

	/**
	 * Description: Method to verify Facebook share.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateFaceBookShare() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnFaceBookShar, "Facebook share",
					"Facebook share is displayed", "Facebook share is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Facebook share is not displayed");
			Assert.fail("Facebook share is not displayed");
		}
	}

	/**
	 * Description: Method to verify Whatsapp share.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateWhatsappShare() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnWhatsAppShare, "Whatsapp share",
					"Whatsapp share is displayed", "Whatsapp share is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Whatsapp share is not displayed");
			Assert.fail("Whatsapp share is not displayed");
		}
	}

	/**
	 * Description: Method to verify Twitter share.
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateTwitterShare() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnTwitterShare, "Twitter share",
					"Twitter share is displayed", "Twitter share is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Twitter share is not displayed");
			Assert.fail("Twitter share is not displayed");
		}
	}

	/**
	 * Description: Method to verify Share cancel.
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateShareCancel() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnShareCancel, "Share cancel", "Share cancel is displayed",
					"Share cancel is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Share cancel is not displayed");
			Assert.fail("Share cancel is not displayed");
		}
	}

	/**
	 * Description: Method to verify Share other.
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateOtherShare() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnOtherShare, "Share other", "Share other is displayed",
					"Share other is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Share other is not displayed");
			Assert.fail("Share other is not displayed");
		}
	}

	/**
	 * Description: Method to click on Share other button.
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnShareOtherBtn() {
		try {
			MobileActionUtil.clickOnElement(btnOtherShare, "Share other button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Share other button");
			Assert.fail("Unable to perform action on Share other button");
		}
	}

	/**
	 * Description: Method to verify Share any text .
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateShareAnytxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(optAntAnyaa, "Share any text",
					"Share any text is displayed", "Share any text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Share any text is not displayed");
			Assert.fail("Share any text is not displayed");
		}
		}

	/**
	 * Description: Method to click on WhatsApp share.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnWhatsAppShare() {
		try {

			MobileActionUtil.clickOnElement(btnWhatsAppShare, "Whatsapp share");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Whatsapp share");
			Assert.fail("Unable to perform action on Whatsapp share");
		}
	}


	/**
	 * Description: Method to click share cancel.
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkShareCancelBtn() {
		try {
			MobileActionUtil.clickOnElement(btnShareCancel, "share cancel");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click for share cancel");
			Assert.fail("Unable to Wait for click cancel");
		}
	}
	
	/**
	 * Description: Method to verify Share Options.
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateShareOtions() {
		try {
			validateFaceBookShare();
			validateWhatsappShare();
			validateTwitterShare();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Share Options");
			Assert.fail("Unable to validate Share Option");
		}
	}
	
	/**
	 * Description: Method to verify Toolbar whatsapp.
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateToolbarWhatsapp() {
		try {
			MobileActionUtil.validateisElementDisplayed(toolbarWhatsapp, "Toolbar whatsapp",
					"Toolbar whatsapp is displayed",
					"Toolbar whatsapp is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Toolbar whatsapp is not displayed");
			Assert.fail("Toolbar whatsapp is not displayed");
		}
		
	}
}
