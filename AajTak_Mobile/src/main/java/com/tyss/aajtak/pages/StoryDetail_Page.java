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

public class StoryDetail_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public StoryDetail_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* First story title */
	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title']"),
			@AndroidBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/clNewsStory']") })
	private AndroidElement titleFirstStory;

	/* Back arrow button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement btnBackArrow;

	/* More options button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/moreOptions")
	private AndroidElement btnMoreOptions;

	/* Download story button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomDownload")
	private AndroidElement btnDownloadStory;

	/* Title any story text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement txtTitleOfAnyStory;

	/* Story update time text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvLastUpdates")
	private AndroidElement txtStoryUpdatedTime;

	/* InArticle link1 text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title']")
	private AndroidElement txtInArticleLink1;

	/* Bhadi khabarae button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar")
	private AndroidElement btnBhadikhabarae;

	/**
	 * Description: Method to verify Bhadi khabarae.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateBhadikhabarae() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnBhadikhabarae, "Bhadi khabarae",
					"Able to validate Bhadi khabarae", "Unable to validate Bhadi khabarae", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Bhadi khabarae");
			Assert.fail("Unable to validate Bhadi khabarae");
		}
	}

	/**
	 * Description: Method to verify First story title.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateFirstStoryTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(titleFirstStory, "First story title",
					"Able to validate First Story title", "Unable to validate First story title", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate First story title");
			Assert.fail("Unable to validate First story title");
		}
	}

	/**
	 * Description: Method to verify Story updated time.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateStoryUpdatedTime() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtStoryUpdatedTime, "Story updated time",
					"Able to validate Story updated time", "Unable to validate Story updated time", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Story updated time");
			Assert.fail("Unable to validate Story updated time");
		}
	}

	/**
	 * Description: Method to wait for story updated time.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void waitTillStoryUpdatedTime() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtStoryUpdatedTime, "Story updated time");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to wait for Story updated time");
			Assert.fail("Unable to wait for Story Updated Time");
		}
	}

	/**
	 * Description: Method to verify In Article link 1.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateInArticleLink1() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtInArticleLink1, "In Article link1",
					"Able to validate In Article link1", "Unable to validate In Article link1", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate In Article link1");
			Assert.fail("Unable to validate In Article link1");
		}
	}

	/**
	 * Description: Method to click on More options.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnMoreOptions() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(btnMoreOptions, "More options");
			MobileActionUtil.clickOnElement(btnMoreOptions, "More options");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on More options");
			Assert.fail("Unable to perform click action on More options");
		}
	}

	/**
	 * Description: Method to click on InArticleLink1.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnInArticleLink1() {
		try {
			MobileActionUtil.clickOnElement(txtInArticleLink1, "In Article link1");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on In Article link1");
			Assert.fail("Unable to perform click action on In Article link1");
		}
	}

	/**
	 * Description:Method to get text of Title of any story
	 * 
	 * @author:SreeLatha
	 * @return TitleOfAnyStory
	 * 
	 */
	public synchronized String getTitleOFAnyStory() {
		String TitleOfAnyStory = null;
		try {
			TitleOfAnyStory = txtTitleOfAnyStory.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Title of any story");
			Assert.fail("Unable to get text of Title of any story");
		}
		return TitleOfAnyStory;
	}

	/**
	 * Description: Method to click on Title of any story.
	 * 
	 * @author SreeLatha
	 */
	public synchronized void clkTitleOfAnyStory() {
		try {
			MobileActionUtil.clickOnElement(txtTitleOfAnyStory, "Title of any story text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Title of any story text");
			Assert.fail("Unable to perform click action on Title of any story text");
		}
	}

	/**
	 * Description: Method to click on Download story button.
	 * 
	 * @author Shiavananda T S
	 */
	public synchronized void clkDownloadStory() {
		try {
			MobileActionUtil.clickOnElement(btnDownloadStory, "Download story button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Download story button");
			Assert.fail("Unable to perform click action on Download story button");
		}
	}

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author Shiavananda T S.
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
	 * Description: Method to click on Back arrow button.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void clkOnBackArrow() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back arrow button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Back arrow button");
			Assert.fail("Unable to perform click action on Back arrow button");
		}
	}

}
