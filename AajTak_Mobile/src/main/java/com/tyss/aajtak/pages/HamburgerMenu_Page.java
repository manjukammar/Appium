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
 * Description: This class has Method Implementation for Hamburger Menu Page.
 * 
 * @author Sreelatha
 */
public class HamburgerMenu_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public HamburgerMenu_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Hamburger icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement icnHamburger;

	/* Settings link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='सेटिंग्स']")
	private AndroidElement lnkSettings;

	/* Login or Register Button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/signupBody")
	private AndroidElement btnLoginOrRegister;

	/* Book mark title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='बुकमार्क']")
	private AndroidElement txtBookmarkPageTitle;

	/* Namaskar User Name text */
	@AndroidFindBy(xpath = "in.AajTak.headlines:id/tvUserName")
	private AndroidElement txtNamskarUserName;

	/* Close icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivNavClose")
	private AndroidElement icnCloseHamburgerMenu;

	/* Download icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivDownloaded")
	private AndroidElement icnDownload;

	/* Download Content icon */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private AndroidElement icnDownloadcontent;

	/* Book mark icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBookmark")
	private AndroidElement icnBookmark;

	/* Notification icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivNotificationHub")
	private AndroidElement icnNotification;

	/* Top Category link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/menuheader' and @text='टॉप कैटेगरी']")
	private AndroidElement lnkTopCategory;

	/* Anya Category link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/menuheader' and @text='अन�?य कैटेगरी']")
	private AndroidElement lnkAnyaCategory;

	/* Home link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/lblItems' and @text='डेली हाइलाइट�?स']")
	private AndroidElement lnkDailyHighlights;

	/* Logout button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='साइन आउट']")
	private AndroidElement btnLogout;

	/* Aapka SwaagathHe link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='आपका स्वागत है!']")
	private AndroidElement lnkAapkaSwaagathHe;
	
	
	/* Links in the Hamburger Menu */
	private AndroidElement lnkHamburgerMenu(String reqLnk) {
		return androidDriver.findElement
				(By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='"+reqLnk+"']"));
		
	}

	/* Home link in Hamburger menu */
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='in.AajTak.headlines:id/hamburgerList']/child::android.widget.TextView[@text='होम']")
	private AndroidElement lnkHomeInHamburger;
	
	/**
	 * Description: Method to click on Login or Register button.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkLoginOrRegisterBtn() {
		try {
			MobileActionUtil.clickOnElement(btnLoginOrRegister, "Login or Register button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Login or Register button");
			Assert.fail("Unable to perform action on Login or Register button");
		}
	}

	/**
	 * Description: Method to click on Close Icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkCloseIcn() {
		try {
			MobileActionUtil.clickOnElement(icnCloseHamburgerMenu, "Close icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Close icon");
			Assert.fail("Unable to perform action on Login or Close icon");
		}
	}

	/**
	 * Description: Method to click on Notification Icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkNotificationIcn() {
		try {
			MobileActionUtil.clickOnElement(icnNotification, "Notification icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Notification icon");
			Assert.fail("Unable to perform action on Login or Notification icon");
		}
	}

	/**
	 * Description: Method to click on Bookmark Icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBookmarkIcn() {
		try {
			MobileActionUtil.clickOnElement(icnBookmark, "Bookmark icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Bookmark icon");
			Assert.fail("Unable to perform action on Login or Bookmark icon");
		}
	}

	/**
	 * Description: Method to click on Download Icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkDownloadIcn() {
		try {
			MobileActionUtil.clickOnElement(icnDownload, "Download icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Download icon");
			Assert.fail("Unable to perform action on Download icon");
		}
	}
	
	/**
	 * Description: Method to validate Hamburger icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validatehamburgerIcn() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnHamburger, "Hamburger icon", "Hamburger icon is displayed",
					"Hamburger Icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Hamburger icon");
			Assert.fail("Unable to validate Hamburger icon");
		}
	}

	/**
	 * Description: Method to used to wait for the Hamburger Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitForHamburgerIcn() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnHamburger, "Hamburger icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to wait for the Hamburger icon");
			Assert.fail("Unable to wait for the Hamburger icon");
		}
	}

	/**
	 * Description: Method to validate Download icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateDownloadIcn() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnDownload, "Download icon", "Download Icon is displayed",
					"Download Icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Download Icon");
			Assert.fail("Unable to validate Download Icon");
		}
	}

	/**
	 * Description: Method to validate Login Or Register Button
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateLoginOrRegister() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnLoginOrRegister, "Login Or Register button",
					"Login Or Register Button is displayed", "Login Or Register Button is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Login Or Register button");
			Assert.fail("Unable to validate Login Or Register button");
		}
	}

	/**
	 * Description: Method to click on Logout Icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkLogoutIcn() {
		try {
			MobileActionUtil.clickOnElement(btnLogout, "Logout icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Logout icon");
			Assert.fail("Unable to perform action on Logout icon");
		}
	}

	/**
	 * Description: Method to click on Top Category link.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkTopCategoryLnk() {
		try {
			MobileActionUtil.clickOnElement(lnkTopCategory, "Top Category link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Top Category link");
			Assert.fail("Unable to perform action on Top Category link");
		}
	}

	/**
	 * Description: Method to wait for Home link.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitForHomeLnk() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(lnkHamburgerMenu("होम"), "Home link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to wait for the Home link");
			Assert.fail("Unable to wait for the Home link");
		}
	}

	/**
	 * Description: Method to validate Aapka Swaagatha He link
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateAapkaSwaagathHeLnk() {
		try {
			MobileActionUtil.validateisElementDisplayed(lnkAapkaSwaagathHe, "Aapka Swaagatha He link",
					"Aapka Swaagatha He link is displayed", "Aapka Swaagatha He link is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Aapka Swaagatha He link");
			Assert.fail("Unable to validate Aapka Swaagatha He link");
		}
	}

	/**
	 * Description: Method to validate Namskar User Name text
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateNamskarUserNameTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtNamskarUserName, "Namskar User Name text",
					"Namskar User Name text is displayed", "Namskar User Name text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Namskar User Name text");
			Assert.fail("Unable to validate Namskar User Name text");
		}
	}

	/**
	 * Description: Method to validate Bookmark Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBookmarkIcn() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnBookmark, "Bookmark Icon", "Bookmark Icon is displayed",
					"Bookmark Icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Bookmark Icon");
			Assert.fail("Unable to validate Bookmark Icon");
		}
	}

	/**
	 * Description: Method to validate Notification icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateNotificationIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnNotification, "Notification icon",
					"Notification icon is displayed", "Notification icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Notification icon");
			Assert.fail("Unable to validate Notification icon");
		}
	}

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author
	 * 
	 */
	public synchronized void clkBackbtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Back button");
			Assert.fail("Unable to perform action on Back button");
		}
	}

	/**
	 * Description:Method to Scroll to manoranjan category
	 * 
	 * @author
	 * 
	 */
	public synchronized void scrollToManoranjanCategory() {
		try {
			MobileActionUtil.scrollToElement(lnkHamburgerMenu("मनोरंजन"));
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Scroll to the element");
			Assert.fail("Unable to Scroll to the element");
		}
	}

	/**
	 * Description: Method to click on Download Content In Hamburger Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkDownloadContentIcn() {
		try {
			MobileActionUtil.clickOnElement(icnDownloadcontent, "Download content icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Download content icon");
			Assert.fail("Unable to perform action on Download content icon");
		}
	}

	/**
	 * Description:Method to Scroll to Settings
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void scrollToSettings() {
		try {
			MobileActionUtil.scrollToElement(lnkSettings);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Scroll to the element");
			Assert.fail("Unable to Scroll to the element");
		}
	}

	/**
	 * Description: Method to click on Hamburger icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkHamburgerIcn() {
		try {
			MobileActionUtil.scrollUp(2);
			MobileActionUtil.clickOnElement(icnHamburger, "Hamburger icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Hamburger icon");
			Assert.fail("Unable to perform action on Hamburger icon");
		}
	}
	
	/***************************************************/
	
	/**
	 * Description: Method to click on the Link in the Hamburger Menu
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkReqLnk(String reqLnk) {
		try {
			try {
				if(lnkHamburgerMenu(reqLnk).isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.clickOnElement(lnkHamburgerMenu(reqLnk), reqLnk+" link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on "+reqLnk+" link");
			Assert.fail("Unable to perform action on "+reqLnk+" link");
		}
	}
	
	/***************************************************/

	/**
	 * Description: Method to click on the Photo Link in the Hamburger Menu
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkPhotoLnk() {
		try {
			try {
				if(lnkHamburgerMenu("फोटो").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.clickOnElement(lnkHamburgerMenu("फोटो"), "फोटो link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on फोटो link");
			Assert.fail("Unable to perform action on फोटो link");
		}
	}
	
	/**
	 * Description: Method to click on the Video Link in the Hamburger Menu
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkVideoLnk() {
		try {
			try {
				if(lnkHamburgerMenu("वीडियो").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.clickOnElement(lnkHamburgerMenu("वीडियो"), "वीडियो link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on वीडियो link");
			Assert.fail("Unable to perform action on वीडियो link");
		}
	}
	
	/**
	 * Description: Method to click on the Settings Link in the Hamburger Menu
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkSettingsLnk() {
		try {
			try {
				if(lnkHamburgerMenu("सेटिंग्स").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.clickOnElement(lnkHamburgerMenu("सेटिंग्स"), "सेटिंग्स link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on सेटिंग्स link");
			Assert.fail("Unable to perform action on सेटिंग्स link");
		}
	}
	
	/**
	 * Description: Method to click on the Manoranjan Link in the Hamburger Menu
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkManoranjanLnk() {
		try {
			try {
				if(lnkHamburgerMenu("मनोरंजन").isDisplayed()) {
				}
			} catch (Exception e) {
				MobileActionUtil.scrollDown(1);
			}
			MobileActionUtil.clickOnElement(lnkHamburgerMenu("मनोरंजन"), "मनोरंजन link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on मनोरंजन link");
			Assert.fail("Unable to perform action on मनोरंजन link");
		}
	}
	
	/**
	 * Description: Method to click on Photo Link
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkHomeLnk() {
		try {
			MobileActionUtil.waitForElement(lnkHomeInHamburger, "Home link");
			MobileActionUtil.clickOnElement(lnkHomeInHamburger, "Home link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Home link");
			Assert.fail("Unable to perform action on Home link");
		}
	}

	
}
