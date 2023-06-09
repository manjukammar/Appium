package com.tyss.aajtak.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Feedback Page.
 * 
 * @author Ramya R
 */

public class FeedBack_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public FeedBack_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Name Text field */
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='i1']")
	private AndroidElement txtName;

	/* Email id Text field */
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='i5']")
	private AndroidElement txtemailId;

	/* Phone Number Text field */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='i9']")
	private AndroidElement txtPhoneNumber;

	/* Submit Button */
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
	private AndroidElement btnSubmit;

	/* Submit Another Response Link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Submit another response']")
	private AndroidElement lnkSubmitAnotherRespone;

	/* Another Feedback Form */
	@AndroidFindBy(xpath = "//android.webkit.WebView[@text='à¤•à¥ƒà¤ªà¤¯à¤¾ à¤?à¤ª à¤•à¥‡ à¤¬à¤¾à¤°à¥‡ à¤®à¥‡à¤‚ à¤…à¤ªà¤¨à¥€ à¤ªà¥?à¤°à¤¤à¤¿à¤•à¥?à¤°à¤¿à¤¯à¤¾ à¤¦à¥‡à¤‚']")
	private AndroidElement lnkAnotherFeedBackForm;

	/* Warning Message for Invalid Phone Number msg */
	@AndroidFindBy(xpath = "//android.view.View//android.view.View[@resource-id='i3']/android.widget.TextView[@text='Please enter a valid name']")
	private AndroidElement msgWarningMessageInPhoneNum;

	/* Feedback Confirmation link */
	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'प्रतिक्रिया के लिए आपका धन्यवाद')]")
	private AndroidElement lnkFeedbackConfirmation;

	/* Feedback About the App Text */
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='i13']")
	private AndroidElement txtFeedback;

	/* Name Text field */
	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'आपका नाम')]/parent::android.view.View/following-sibling::android.view.View/descendant::android.widget.EditText")
	private AndroidElement tbName;

	/* Email id Text field */
	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'आपका ईमेल आईडी')]/parent::android.view.View/following-sibling::android.view.View/descendant::android.widget.EditText")
	private AndroidElement tbEmailId;

	/* Phone Number Text field */
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'आपका मोबाइल नंबर')]/parent::android.view.View/following-sibling::android.view.View/descendant::android.view.View/android.widget.EditText")
	private AndroidElement tbPhoneNumber;

	/* Feedback About the App Text field */
	@AndroidFindBy(xpath = "//android.view.View[contains(@text,'ऐप के बारे में आपकी प्रतिक्रिया')]/parent::android.view.View/following-sibling::android.view.View/descendant::android.view.View/android.widget.EditText")
	private AndroidElement tbFeedback;

	/* Feedback title */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='फीडबैक']")
	private AndroidElement txtFeedbackTitle;

	/* Text box in the Feedback page */
	private AndroidElement requiredTextBox(String tbName) {
		return androidDriver.findElement(By.xpath("//android.view.View[contains(@text,'" + tbName
				+ "')]/parent::android.view.View/following-sibling::android.view.View/descendant::android.widget.EditText"));
	}

	/* Warning Messages in the feedback page */
	private AndroidElement warningMessages(String warningMsg) {
		return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + warningMsg + "']"));
	}

	/**
	 * Description:Method to Validate Feedback title
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validateFeedbackTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtFeedbackTitle, "Feedback title text",
					"Feedback title is Displayed", "Feedback title is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate title text");
			Assert.fail("Unable to validate Feedback title text");
		}
	}

	/**
	 * Description: Method to Set Phone number in the Phone number textbox.
	 * 
	 * @author Ramya R
	 * @param phoneNumber
	 */
	public synchronized void setPhoneNumberTb(String phoneNumber) {
		try {
			MobileActionUtil.scrollDown(2);
			MobileActionUtil.typeText(tbPhoneNumber, phoneNumber, "Phone Number Text area");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + phoneNumber + " into  Phone Number Text area");
			Assert.fail("Unable to set " + phoneNumber + " into  Phone Number Text area");
		}
	}

	/**
	 * Description: Method to click on Submit Button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkSubmitBtn() {
		try {
			MobileActionUtil.clickOnElement(btnSubmit, "Submit Button");
			MobileActionUtil.scrollUp(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Submit Button");
			Assert.fail("Unable to click on Submit Button");
		}
	}

	/**
	 * Description:Method to Validate Name text
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validateNameTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtName, "Name Text", "Name Text is Displayed",
					"Name Text is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Name Text");
			Assert.fail("Unable to validate Name Text");
		}
	}

	/**
	 * Description:Method to Validate Email Id text
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validateEmailIdTxt() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtemailId, "Email Id text", "Email Id text is Displayed",
					"Email Id text is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Email Id text");
			Assert.fail("Unable to validate Email Id text");
		}
	}

	/**
	 * Description:Method to Validate Phone text
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validatePhoneTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPhoneNumber, "Phone Number text",
					"Phone Number text is Displayed", "Phone Number text is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Phone Number text");
			Assert.fail("Unable to validate Phone Number text");
		}
	}

	/**
	 * Description:Method to Validate Phone number text field
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validatePhoneNumberTb() {
		try {
			MobileActionUtil.scrollDown(1);
			MobileActionUtil.validateisElementDisplayed(tbPhoneNumber, "Phone Number Textbox",
					"Phone Number Textbox is Displayed", "Phone Number Textbox is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Phone Number Textbox");
			Assert.fail("Unable to validate Phone Number Textbox");
		}
	}

	/**
	 * Description:Method to Validate Submit Button
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validateSubmitBtn() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnSubmit, "Submit Button", "Submit Button is Displayed",
					"Submit Button is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Submit Button");
			Assert.fail("Unable to validate Submit Button");
		}
	}

	/**
	 * Description:Method to Validate Warning Message for the invalid Name
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validateSubmitAnotherRespone() {
		try {
			MobileActionUtil.validateisElementDisplayed(lnkSubmitAnotherRespone, "Submit Another Respone Link",
					"Submit Another Respone is Displayed", "Submit Another Respone is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Submit Another Respone");
			Assert.fail("Unable to validate Submit Another Respone");
		}
	}

	/**
	 * Description:Method to Validate Warning Message for invalid Phone Number
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void validateWarningPhoneNumberMsg() {
		try {
			try {
				if (msgWarningMessageInPhoneNum.isDisplayed()) {
					MobileActionUtil.validationinfo("Warning Message of Phone Number is Displayed", "blue");
				} else {
					MobileActionUtil.extentinfo("Warning Message of Phone Number is Displayed");
				}
			} catch (Exception e) {
				MobileActionUtil.extentinfo("Warning Message of Phone Number is Displayed");
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Warning Message of Phone Number");
			Assert.fail("Unable to validate Warning Message of Phone Number");
		}
	}

	/**
	 * Description:Method to click Device back button
	 * 
	 * @author Ramya R
	 * @param numberOfTimes
	 * 
	 */
	public synchronized void clkDeviceBackButton(int numberOfTimes) {
		try {
			MobileActionUtil.clickDeviceBackButton(numberOfTimes);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on device back button");
			Assert.fail("Unable to click on device back button");
		}
	}

	/***********************************************/
	
	/**
	 * Description:Method to Validate Warning Messages
	 * 
	 * @author Bredlin
	 * @param reqText
	 * 
	 */
	public synchronized void validateWarningMsg(String reqText) {
		try {
			try {
				if (warningMessages(reqText).isDisplayed()) {
					MobileActionUtil.validationinfo("Warning Message is Displayed", "blue");
				} else {
					MobileActionUtil.extentinfo("Warning Message is Displayed");
				}
			} catch (Exception e) {
				MobileActionUtil.extentinfo("Warning Message is Displayed");
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate the Warning Message");
			Assert.fail("Unable to validate the Warning Message");
		}
	}

	/**
	 * Description:Method to Validate Textbox in the Feedback Page
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateTb(String tbName) {
		try {
			try {
				if (requiredTextBox(tbName).isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.validateisElementDisplayed(requiredTextBox(tbName), tbName + " Textbox",
					tbName + " Textbox is Displayed", tbName + " Textbox is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate " + tbName + " Textbox");
			Assert.fail("Unable to validate " + tbName + " Textbox");
		}
	}

	/**
	 * Description: Method to Set Values in the textboxes.
	 * 
	 * @author Bredlin
	 * @param tbName
	 * @param reqValue
	 */
	public synchronized void setValuesInTb(String tbName, String reqValue) {
		try {

			MobileActionUtil.typeText(requiredTextBox(tbName), reqValue, tbName + " Text area");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + reqValue + " into " + tbName + " Text area");
			Assert.fail("Unable to set " + reqValue + " into " + tbName + " Text area");
		}
	}

	/***********************************************/

	/**
	 * Description:Method to Validate Name Textbox
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateNameTb() {
		try {
			try {
				if (requiredTextBox("आपका नाम").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.validateisElementDisplayed(requiredTextBox("आपका नाम"), "आपका नाम Textbox", "आपका नाम Textbox is Displayed", "आपका नाम Textbox is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate आपका नाम Textbox");
			Assert.fail("Unable to validate आपका नाम Textbox");
		}
	}

	/**
	 * Description:Method to Validate Email Textbox
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateEmailTb() {
		try {
			try {
				if (requiredTextBox("आपका ईमेल आईडी").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.validateisElementDisplayed(requiredTextBox("आपका ईमेल आईडी"), "आपका ईमेल आईडी Textbox", "आपका ईमेल आईडी Textbox is Displayed", "आपका ईमेल आईडी Textbox is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate आपका ईमेल आईडी Textbox");
			Assert.fail("Unable to validate आपका ईमेल आईडी Textbox");
		}
	}
	/**
	 * Description:Method to Validate Name Textbox
	 * 
	 * @author Bredlin
	 * 
	 */
	public synchronized void validateFeedbackTb() {
		try {
			try {
				if (requiredTextBox("ऐप के बारे में आपकी प्रतिक्रिया").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.validateisElementDisplayed(requiredTextBox("ऐप के बारे में आपकी प्रतिक्रिया"), "ऐप के बारे में आपकी प्रतिक्रिया Textbox", "ऐप के बारे में आपकी प्रतिक्रिया Textbox is Displayed", "ऐप के बारे में आपकी प्रतिक्रिया Textbox is not Displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate ऐप के बारे में आपकी प्रतिक्रिया Textbox");
			Assert.fail("Unable to validate ऐप के बारे में आपकी प्रतिक्रिया Textbox");
		}
	}
	
	/**
	 * Description: Method to Set Values in the Email textbox.
	 * 
	 * @author Bredlin
	 * @param reqValue
	 */
	public synchronized void setEmailTb(String reqValue) {
		try {

			MobileActionUtil.typeText(requiredTextBox("आपका ईमेल आईडी"), reqValue, "आपका ईमेल आईडी Text area");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + reqValue + " into आपका ईमेल आईडी Text area");
			Assert.fail("Unable to set " + reqValue + " into आपका ईमेल आईडी Text area");
		}
	}
	
	/**
	 * Description: Method to Set Values in the Name textbox.
	 * 
	 * @author Bredlin
	 * @param reqValue
	 */
	public synchronized void setNameTb(String reqValue) {
		try {

			MobileActionUtil.typeText(requiredTextBox("आपका नाम"), reqValue, "आपका नाम Text area");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + reqValue + " into आपका नाम Text area");
			Assert.fail("Unable to set " + reqValue + " into आपका नाम Text area");
		}
	}
	
	/**
	 * Description: Method to Set Values in the Feedback textbox.
	 * 
	 * @author Bredlin
	 * @param reqValue
	 */
	public synchronized void setFeedbackTb(String reqValue) {
		try {

			MobileActionUtil.typeText(requiredTextBox("ऐप के बारे में आपकी प्रतिक्रिया"), reqValue, "ऐप के बारे में आपकी प्रतिक्रिया Text area");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to set " + reqValue + " into ऐप के बारे में आपकी प्रतिक्रिया Text area");
			Assert.fail("Unable to set " + reqValue + " into ऐप के बारे में आपकी प्रतिक्रिया Text area");
		}
	}
	
}
