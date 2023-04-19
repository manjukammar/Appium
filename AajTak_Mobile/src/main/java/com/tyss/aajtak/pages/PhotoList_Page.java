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
 * 
 * Description:This class has Method Implementation for Photo List Page.
 * 
 * @author Sreelatha
 *
 */
public class PhotoList_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public PhotoList_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Photo section from Horizontal menu */
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='फोटो']/android.widget.TextView")
	private AndroidElement lnkPhotoFromHorizontalMenu;

	/* Photo list from Hamburger menu */
	@AndroidFindBy(xpath = "//android.widget.ListView[@resource-id='in.AajTak.headlines:id/hamburgerList']/descendant::android.widget.TextView[@text='फोटो']")
	AndroidElement lnkPhotoListFromHamburgerMenu;

	/* Book mark icon */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivBookmarkDetail']")
	private AndroidElement icnBookmark;

	/* Download icon */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivDownload']")
	private AndroidElement icnDownload;

	/* Photo share icon */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivShare']")
	private AndroidElement icnPhotoShare;
	
	/* Share icon */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivShare']")
	private AndroidElement icnShare;

	/* Sub-Categories Of Photo list Section */
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='in.AajTak.headlines:id/rvCategoryPhotoLanding']")
	private AndroidElement subCategoriesOfPhotolistSection;

	/* Sub-Category links */
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='in.AajTak.headlines:id/rvCategoryPhotoLanding']/child::android.view.ViewGroup/android.widget.TextView")
	private List<AndroidElement> lnkSubCategory;

	/* Photo title text */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvPhotoTitle']")
	private AndroidElement txtPhotoTitle;

	/* Photo gallery date */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvLastUpdate']")
	private AndroidElement photoGalleryDate;
	
	

	/**
	 * Description: Method to click on Book mark icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnBookmarkIcon() {
		try {
			MobileActionUtil.clickOnElement(icnBookmark, "Bookmark Icon");
			MobileActionUtil.poll(2000);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Bookmark Icon");
			Assert.fail("Unable to perform action on Bookmark Icon");
		}
	}

	/**
	 * Description: Method to click on Download Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnDownloadIcon() {
		try {
			MobileActionUtil.clickOnElement(icnDownload, "Download Icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Download Icon");
			Assert.fail("Unable to perform action on Download Icon");
		}
	}

	
	/**
	 * Description: Method to click on photo List From Hamburger Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnPhotoListFromHambergurMenu() {
		try {
			MobileActionUtil.clickOnElement(lnkPhotoListFromHamburgerMenu, "Photo List From Hamburger Menu");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on photo List From Hamburger Menu");
			Assert.fail("Unable to perform action on photo List From Hamburger Menu");
		}
	}

	/**
	 * Description: Method to click on photo Section From Horizontal Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnPhotoSectionFromHorizontalMenu() {
		try {
			MobileActionUtil.clickOnElement(lnkPhotoFromHorizontalMenu, "Photo Section From Horizontal Menu");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Photo Section From Horizontal Menu");
			Assert.fail("Unable to perform action on Photo Section From Horizontal Menu");
		}
	}

	/**
	 * Description: Method to click on Photo Share Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnPhotoShareIcon() {
		try {
			MobileActionUtil.clickOnElement(icnPhotoShare, "Photo Share Icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Photo Share Icon");
			Assert.fail("Unable to perform action on Photo Share Icon");
		}
	}

	/**
	 * Description: Method to click on Share Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnShareIcon() {
		try {
			MobileActionUtil.clickOnElement(icnShare, "Share Icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Share Icon");
			Assert.fail("Unable to perform action on Share Icon");
		}
	}

	/**
	 * Description: Method to click on Verify Photo Title
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnVerifyPhotoTitle() {
		try {
			MobileActionUtil.clickOnElement(txtPhotoTitle, "Verify Photo Title");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Verify Photo Title");
			Assert.fail("Unable to perform action on Verify Photo Title");
		}
	}

	/**
	 * Description: Method to validate Bookmark Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBookmarkIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnBookmark, "Bookmark Icon", "Bookmark Icon is displayed",
					"Bookmark Icon is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Bookmark Icon");
			Assert.fail("Unable to validate Bookmark Icon");
		}
	}

	/**
	 * Description: Method to validate Download Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateDownloadIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnDownload, "Download Icon", "Download Icon is displayed",
					"Download Icon is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Download Icon");
			Assert.fail("Unable to validate Download Icon");
		}
	}

	/**
	 * Description: Method to validate Photo Section From Horizontal Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validatePhotoSectionFromHorizontalMenu() {
		try {
			MobileActionUtil.validateisElementDisplayed(lnkPhotoFromHorizontalMenu,
					"Photo Section From Horizontal Menu", "Photo Section From Horizontal Menu is displayed",
					"Photo Section From Horizontal Menu is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Photo Section From Horizontal Menu");
			Assert.fail("Unable to validate Photo Section From Horizontal Menu");
		}
	}

	/**
	 * Description: Method to validate Share Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateShareIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnShare, "Share Icon", "Share Icon is displayed",
					"Share Icon is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Share Icon");
			Assert.fail("Unable to validate Share Icon");
		}
	}

	/**
	 * Description:Method to get text of Photo Gallery Date Description
	 * 
	 * @author:Sreelatha
	 * @return PhotoGalleryDateDesc
	 * 
	 */
	public synchronized String getPhotoGalleryDateDesc() {
		String PhotoGalleryDateDesc = null;
		try {
			PhotoGalleryDateDesc = photoGalleryDate.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Photo Gallery Date Description");
			Assert.fail("Unable to get text of Photo Gallery Date Description");
		}
		return PhotoGalleryDateDesc;
	}

	/**
	 * Description:Method to get text of Verify Photo Title Description
	 * 
	 * @author:Sreelatha
	 * @return VerifyPhotoTitleDesc
	 * 
	 */
	public synchronized String getVerifyPhotoTitleDesc() {
		String verifyPhotoTitleDesc = null;
		try {
			verifyPhotoTitleDesc = txtPhotoTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Verify Photo Title Description");
			Assert.fail("Unable to get text of Verify Photo Title Description");
		}
		return verifyPhotoTitleDesc;
	}

	

	/**
	 * Description:Method to get text of photo List From Hamburger Menu Description
	 * 
	 * @author:Sreelatha
	 * @return photoListFromHamburgerMenuDesc
	 * 
	 */
	public synchronized String getPhotoListFromHamburgerMenuDesc() {
		String photoListFromHamburgerMenuDesc = null;
		try {
			photoListFromHamburgerMenuDesc = lnkPhotoListFromHamburgerMenu.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Photo List From Hambergur Menu Description");
			Assert.fail("Unable to get text of Photo List From Hambergur Menu Description");
		}
		return photoListFromHamburgerMenuDesc;
	}

	/**
	 * Description:Method to get text of Photo Section From Horizontal Menu
	 * 
	 * @author:Sreelatha
	 * @return photoSectionFromHorizontalMenuDesc
	 * 
	 */
	public synchronized String getPhotoSectionFromHorizontalMenuDesc() {
		String photoSectionFromHorizontalMenuDesc = null;
		try {
			photoSectionFromHorizontalMenuDesc = lnkPhotoFromHorizontalMenu.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Photo Section From Horizontal Menu");
			Assert.fail("Unable to get text of Photo Section From Horizontal Menu");
		}
		return photoSectionFromHorizontalMenuDesc;
	}

	/**
	 * Description: Method to wait For Book mark Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitForBookmarkIcon() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnBookmark, "Book mark Icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Bookmark Icon is not visible");
			Assert.fail("Bookmark Icon is not visible");
		}
	}

	/**
	 * Description: Method to wait For download Icon
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitForDownloadIcon() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnDownload, "Download Icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Download Icon is not visible");
			Assert.fail("Download Icon is not visible");
		}
	}

	/**
	 * Description: Method to validate Photo Gallery Date
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validatePhotoGalleryDate() {
		try {
			String GalleryDateAndTime = null;
			try {
				GalleryDateAndTime = photoGalleryDate.getText();
			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to get text of Photo Gallery Date");
				Assert.fail("Unable to get text of Photo Gallery Date");
			}
			MobileActionUtil.validateisElementDisplayed(photoGalleryDate, "Photo Gallery Date",
					"Photo Gallery Date & Time" + GalleryDateAndTime + " is displayed",
					"Photo Gallery Date & Time " + GalleryDateAndTime + "is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Photo Gallery Date");
			Assert.fail("Unable to validate Photo Gallery Date");
		}
	}

	/**
	 * Description: Method to validate display of sub categories.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateDisplayOfSubcategories() {
		String subCategoryNames ;
		try {
			for (AndroidElement subCategory : lnkSubCategory) {
				subCategoryNames = subCategory.getText();
				MobileActionUtil.info("Sub-Category: " + subCategoryNames + " is displayed");
				MobileActionUtil.extentinfo("Sub-Category: " + subCategoryNames + " is displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate sub categories");
			Assert.fail("Unable to validate sub categories");
		}
	}
	
	/**
	 * Description: Method to click on each sub category.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnSubCategoriesInPhotoSection() {
		try {
			for (AndroidElement subCategory : lnkSubCategory) {
				String subCategoryNames = subCategory.getText();
				MobileActionUtil.clickOnElement(subCategory, subCategoryNames);
				MobileActionUtil.poll(2000);
				clkBackbtn();
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on sub categories");
			Assert.fail("Unable to perform action on sub categories");
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
	 * Description: Method to Swipe left at the center.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void swipeLeftAtTheCenter() {
		try {
			MobileActionUtil.swipeLeft();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sub categories");
			Assert.fail("Unable to perform action on Sub categories");
		}
	}

	
	/**
	 * Description: Method to validate Sub Categories Section text.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateSubCategoriesOfPhotolistSection() {
		try {
			String SubCategoriesOfPhotolistSection = null;
			try {
				SubCategoriesOfPhotolistSection = subCategoriesOfPhotolistSection.getText();
			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to get text of SecondSubCategory");
				Assert.fail("Unable to get text of SecondSubCategory");
			}
			MobileActionUtil.validateisElementDisplayed(subCategoriesOfPhotolistSection, "Sub Category section text",
					"Sub Category section text is " + SubCategoriesOfPhotolistSection + "  displayed",
					"Sub Category section text is  " + SubCategoriesOfPhotolistSection + " not displayed displayed",
					"green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Photolist Section");
			Assert.fail("Unable to validate Photolist Section");
		}
	}

	






	



}
