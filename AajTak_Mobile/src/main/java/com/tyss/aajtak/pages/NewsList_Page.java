package com.tyss.aajtak.pages;

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
 * 
 * 
 * Description:This class has Method Implementation for News List Page.
 * 
 * @author Sushmita P H
 *
 */
public class NewsList_Page {
	
	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public NewsList_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

    /*News List Title text*/	
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvNewsTitle")
	private AndroidElement txtNewslistTitle;

	/*Comment icon*/
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomComment")
	private AndroidElement icnComment;
	
	/*Book mark icon*/
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomBookmark")
	private AndroidElement icnBookmark;

	/*Download icon*/
	@AndroidFindBy(id="in.AajTak.headlines:id/ivBottomDownload")
	private AndroidElement icnDownload;

	/*Share icon*/
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomShare")
	private AndroidElement icnShare;

	/*Toast message text*/
	@AndroidFindBy(xpath = "//android.widget.Toast")
	private AndroidElement txtToastmsg;
	
	
	/**
	 * Description: Method to Validate Toast Message.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateToastMessage() {
		try {
			try {
				MobileActionUtil.waitForVisiblilityOfElement(txtToastmsg, "Toast Message text");
			} catch (Exception e) {
				MobileActionUtil.info("Toast Message is not Interactable");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Toast Message text");
			Assert.fail("Unable to validate Toast Message text");
		}
	}

	
	/**
	 * Description: Method to click on Bookmark Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void clkBookmarkIcon() {
		try {
			MobileActionUtil.clickOnElement(icnBookmark, "Bookmark icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Bookmark icon");
			Assert.fail("Unable to click on Bookmark icon");
		}
	}
	
	/**
	 * Description: Method to click on Download Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void clkDownloadIcon() {
		try {
			MobileActionUtil.clickOnElement(icnDownload, "Download icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Download icon");
			Assert.fail("Unable to click on Download icon");
		}
	}
	
	/**
	 * Description: Method to click on News list Title text.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void clkNewslistTitleTxt() {
		try {
			MobileActionUtil.clickOnElement(txtNewslistTitle, "Newslist Title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Newslist Title text");
			Assert.fail("Unable to click on Newslist Title text");
		}
	}
	
	/**
	 * Description: Method to Verify News list Title text.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateNewslistTitleTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtNewslistTitle, "Newslist Title text", "Newslist Title text is displayed", 
					"Newslist Title text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Newslist Title text");
			Assert.fail("Unable to validate Newslist Title text");
		}
	}
	
	
	/**
	 * Description: Method to Verify Bookmark Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateBookmarkIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnBookmark, "Bookmark icon", "Bookmark icon is displayed", 
					"Bookmark icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Bookmark icon");
			Assert.fail("Unable to validate Bookmark icon");
		}
	}
	
	/**
	 * Description: Method to Verify Comment Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateCommentIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnComment, "Comment icon", "Comment icon is displayed",
					"Comment icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Comment icon");
			Assert.fail("Unable to validate Comment icon");
		}
	}
	
	/**
	 * Description: Method to Verify Share Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateShareIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnShare, "Share icon", "Share icon is displayed", "Share icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Share Icon");
			Assert.fail("Unable to validate Share Icon");
		}
	}
	
	/**
	 * Description: Method to Verify Download Icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateDownloadIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnDownload, "Download icon", "Download icon is displayed",
					"Download icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Download icon");
			Assert.fail("Unable to validate Download icon");
		}
	}
	
	
	/**
	 * Description: Method to wait for the visibility of News list Title.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void waitForNewslistTitle() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtNewslistTitle, "Newslist Title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to wait for the visibility of Newslist Title text");
			Assert.fail("Unable to wait for the visibility of Newslist Title text");
		}
	}
	
	
   /**************************************************31-01-23***************************************************/
	
	

	
}
