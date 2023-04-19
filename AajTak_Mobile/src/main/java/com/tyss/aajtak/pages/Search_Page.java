package com.tyss.aajtak.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class implements the locators and methods for Search page.
 * 
 * @author Mulage Abhishek
 * 
 */
public class Search_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Search_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Search icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/icSearch']")
	private AndroidElement icnSearch;

	/* Khojo button */
	@AndroidFindBy(xpath = "//android.widget.Button[@text='खोजें' and @resource-id='in.AajTak.headlines:id/btn_search']")
	private AndroidElement btnKhojo;

	/* Search topics text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_tredingTopics")
	private AndroidElement txtSearchTopics;

	/* Search cancel icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/icSearchClose")
	private AndroidElement icnSearchCancel;

	/* Search category text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/rvSearchCategory")
	private AndroidElement txtSearchCategory;

	/* Search details text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/rvSearchDetails")
	private AndroidElement txtSearchDetails;

	/* Search articles */
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='in.AajTak.headlines:id/atv_searchText']")
	private AndroidElement searchArticles;

	/* Popular search text */
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='in.AajTak.headlines:id/rv_trendingTopics']/child::android.widget.TextView")
	private List<AndroidElement> txtPopularSearch;

	/* Trending Topics searches text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ट्रेंडिंग टॉपिक्स']")
	private AndroidElement txtTrendingTopicsSearches;

	/* First popular search text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textView' and @index=0]")
	private AndroidElement txtFirstPopularSearch;

	/* Second Popular Search text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/textView' and @index='1']")
	private AndroidElement txtsecondPopularSearch;

	/* All results text */
	private AndroidElement txtAllresults(String allResults) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvCategory' and @text='"+allResults+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Story results text */
	private AndroidElement txtStoryResults(String storyResults) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvCategory' and @text='"+storyResults+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Photo results text */
	private AndroidElement txtPhotoResults(String photoResults) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvCategory' and @text='"+photoResults+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Video results text */
	private AndroidElement txtVideoResults(String videoResults) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvCategory' and @text='"+videoResults+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* About Results text */
	@AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_result']")
	private AndroidElement txtAboutResults;

	/* Back arrow button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement btnBackArrow;

	/* Expected Video title text */
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='वीडियो'])[1]")
	private AndroidElement txtVideoTitle;

	/* Actual Video title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvVideoTitle']")
	private AndroidElement txtActualVideoTitle;

	/* Photo screen text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/rvSearchDetails")
	private AndroidElement txtPhotoScreen;


	/**
	 * Description: Method to click on All results text
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnAllResultsTxt(String allResults) {
		try {
			MobileActionUtil.clickOnElement(txtAllresults("सभी"), "All results text ");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on All results text");
			Assert.fail("Unable to perform action on All results text");
		}
	}

	/**
	 * Description: Method to click on Video title text
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnVideoTitleTxt() {
		try {
			MobileActionUtil.clickOnElement(txtVideoTitle, "Video title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Video title text");
			Assert.fail("Unable to perform action on Video title text");
		}
	}

	/**
	 * Description: Method to click on First Popular Search text
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnFirstPopularSearchTxt() {
		try {
			MobileActionUtil.clickOnElement(txtFirstPopularSearch, "First Popular Search text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First Popular Search text");
			Assert.fail("Unable to perform action on First Popular Search text");
		}
	}

	/**
	 * Description: Method to click on Photo results
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnPhoto() {
		try {
			MobileActionUtil.clickOnElement(txtPhotoResults("फोटो"), "Photo results");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Photo results");
			Assert.fail("Unable to perform action on Photo results");
		}
	}

	/**
	 * Description: Method to click on Search icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnSearchIcn() {
		try {
			MobileActionUtil.clickOnElement(icnSearch, "Search icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Search icon");
			Assert.fail("Unable to perform action on Search icon");
		}
	}

	/**
	 * Description: Method to click on Second Popular Search
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnSecondPopularSearch() {
		try {
			MobileActionUtil.clickOnElement(txtsecondPopularSearch, "Second Popular Search text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Second Popular Search text");
			Assert.fail("Unable to perform action on Second Popular Search text");
		}
	}

	/**
	 * Description: Method to click on Story text
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnStory() {
		try {
			MobileActionUtil.clickOnElement(txtStoryResults("समाचार"), "Story");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Story");
			Assert.fail("Unable to perform action on Story");
		}
	}

	/**
	 * Description: Method to click on Video
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnVideoResults() {
		try {
			MobileActionUtil.clickOnElement(txtVideoResults("वीडियो"), "Video");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Video");
			Assert.fail("Unable to perform action on Video");
		}
	}

	/**
	 * Description: Method to validate About Results
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateAboutResults() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAboutResults, "About Results",
					"About Results are  displayed", "About Results are not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Results are not displayed");
			Assert.fail("Results are not displayed");
		}
	}

	/**
	 * Description: Method to validate Trending Topics Searches
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateTrendingTopicsSearches() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtTrendingTopicsSearches, "Trending Topics Searches",
					"Trending Topics are displayed", "Trending Topics are not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Trending Topics are not displayed");
			Assert.fail("Trending Topics are not displayed");
		}
	}

	/**
	 * Description: Method to validate All Results
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateAllResults() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAllresults("सभी"), "All Results", "All results are displayed",
					"All results are not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("All results are not displayed");
			Assert.fail("All results are not displayed");
		}
	}

	


	/**
	 * Description: Method to validate Photo
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validatePhoto() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPhotoResults("फोटो"), "Photo", "Photo is  displayed",
					"Photo is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("photo is not displayed");
			Assert.fail("Unable to validate Photo");
		}
	}

	/**
	 * Description: Method to validate Number of Results
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateNumberOfResults() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAboutResults, "Number of Results",
					"Number of Results are displayed", "Number of Results are not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Number of Results are not displayed");
			Assert.fail("Number of Results are not displayed");
		}
	}

	

	/**
	 * Description: Method to validate Story
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateStory() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtStoryResults("समाचार"), "Story", "Story is displayed",
					"Story is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Story is not displayed");
			Assert.fail("Story is not displayed");
		}
	}

	

	/**
	 * Description: Method to validate Video
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateVideo() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtVideoResults("वीडियो"), "Video", "Video is displayed",
					"Video is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Video is not displayed");
			Assert.fail("Video is not displayed");
		}
	}

	/**
	 * Description: Method to validate Actual Video Title
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateActualVideoTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtActualVideoTitle, "Actual Video Title",
					"Actual Video Title is displayed", "Actual Video Title is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Actual Video Title is not displayed");
			Assert.fail("Actual Video Title is not displayed");
		}
	}

	/**
	 * Description: Method to validate Excpected Video Title
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateExcpectedVideoTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtVideoTitle, "Excpected Video Title",
					"Excpected Video Title is displayed", "Excpected Video Title is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Excpected Video Title is not displayed");
			Assert.fail("Excpected Video Title is not displayed");
		}
	}

	/**
	 * Description: Method to click on khojo button
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnkhojo() {
		try {
			MobileActionUtil.clickOnElement(btnKhojo, "khojo button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on khojo button");
			Assert.fail("Unable to perform action on khojo button");
		}
	}

	/**
	 * Description: Method to type value in search articles
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void setValue1InSearchArticles() {
		try {
			MobileActionUtil.typeText(searchArticles, "aajtak", "Search Articles");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to type value on Search Articles");
			Assert.fail("Unable to type value on Search Articles");
		}
	}

	/**
	 * Description: Method to type value in search articles
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void setValue2InSearchArticles() {
		try {
			MobileActionUtil.typeText(searchArticles, "Live blog", "Search Articles");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to type value on Search Articles");
			Assert.fail("Unable to type value on Search Articles");
		}
	}

	/**
	 * Description: Method to wait For search
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void waitForSearch() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnSearch, "search");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Search icon not displayed");
			Assert.fail("Search icon not displayed");
		}
	}

	/**
	 * Description: Method to clear Search text field.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clrSearchTF() {
		try {
			MobileActionUtil.clearText(searchArticles, "Search text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to clear Search text field");
			Assert.fail("Unable to clear Search text field");
		}
	}

	/**
	 * Description: Method to validate popularSearch
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validatePopularSearch() {
		String popularSearchTxt = null;
		try {
			for (AndroidElement searchTxt : txtPopularSearch) {
				popularSearchTxt = searchTxt.getText();
				MobileActionUtil.info("Popular Search: " + popularSearchTxt + " is displayed");
				MobileActionUtil.extentinfo("Popular Search: " + popularSearchTxt + " is displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate First Popular Search");
			Assert.fail("Unable to validate First Popular Search");
		}
	}

	/**
	 * Description: Method to validate First popularSearch
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateFirstPopularSearch() {
		try {
			String GalleryDateAndTime = null;
			try {
				GalleryDateAndTime = txtFirstPopularSearch.getText();
			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to get text of bookmark StoryDesc");
				Assert.fail("Unable to get text of bookmark StoryDesc");
			}

			MobileActionUtil.validateisElementDisplayed(txtFirstPopularSearch, "First Popular Search",
					"Able to validate First Popular Search is" + GalleryDateAndTime + "displayed",
					"Unable to validate First Popular Search" + GalleryDateAndTime + "displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate First Popular Search");
			Assert.fail("Unable to validate First Popular Search");
		}
	}



	/**
	 * Description: Method to validate Photo detail screen
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validatePhotoDetailScreen() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPhotoScreen, "Photo detail screen",
					"Photo detail screen is displayed", "Photo detail screen is not displayed",
					"blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Photo detail screen is not displayed");
			Assert.fail("Photo detail screen is not displayed");
		}
	}

	/**
	 * Description: Method to clear Search text field.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnClearIcon() {
		try {
			MobileActionUtil.clearText(searchArticles, "Search text field");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to clear Search text field");
			Assert.fail("Unable to clear Search text field");
		}
	}

	/**
	 * Description: Method to click on Trending searches.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnTrendingSearches() {
		try {
			MobileActionUtil.clickOnElement(txtTrendingTopicsSearches, "Trending searches");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Trending searches");
			Assert.fail("Unable to perform action on Trending searches");
		}
	}

	/**
	 * Description: Method to click on Trending search tag text.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnTrendingSearchTag() {
		try {
			MobileActionUtil.clickOnElement(txtFirstPopularSearch, "Trending search tag text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Trending search tag text");
			Assert.fail("Unable to perform action on Trending search tag text");
		}
	}

	/**
	 * Description: Method to validate search details text.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateSearchDetails() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtSearchDetails, "Search details text",
					"Search details text is displayed", "Search details text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Search details text is not displayed");
			Assert.fail("Search details text is not displayed");
		}
	}

	/**
	 * Description: Method to validate search category text.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateSearchCategory() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtSearchCategory, "Search category text",
					"Search category text is displayed", "Search category text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Search category text is not displayed");
			Assert.fail("Search category text is not displayed");
		}
	}

	/**
	 * Description: Method to click on Search cancel icon.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnSearchCancelIcon() {
		try {
			MobileActionUtil.clickOnElement(icnSearchCancel, "Search cancel icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Search cancel icon");
			Assert.fail("Unable to perform action on Search cancel icon");
		}

	}

	/**
	 * Description: Method to validate search screen.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateSearchScreen() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtSearchTopics, "Search screen",
					"Search screen is displayed",
					"Search screen is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Search screen is not displayed");
			Assert.fail("Search screen is not displayed");
		}
	}

	

	/**
	 * Description: Method to type value in search articles
	 * 
	 * @author Mulage Abhishek
	 * @param Aajtak
	 */
	public synchronized void setValue1InSearchArticles(String Aajtak) {
		try {
			MobileActionUtil.typeText(searchArticles, Aajtak, "Search Articles");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to type value on Search Articles");
			Assert.fail("Unable to type value on Search Articles");
		}
	}
}
