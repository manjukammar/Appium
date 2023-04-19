package com.tyss.aajtak.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.reports.ExtentManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

/**
 * Description:: This class contains action methods which is used for performing
 * action while executing script such as Click, SendKeys
 * 
 * @author Manikandan A
 */
public class MobileActionUtil {

	public static AndroidDriver<AndroidElement> androidDriver;
	public static WebDriverWait wait;
	public long ETO;
	public static JavascriptExecutor jsExecutor;
	public Actions action;
	public static TakesScreenshot screenshot;
	public static TouchAction touchAction;

	public MobileActionUtil(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		this.ETO = ETO;
		wait = new WebDriverWait(androidDriver, ETO);
		jsExecutor = (JavascriptExecutor) androidDriver;
		action = new Actions(androidDriver);
		screenshot = (TakesScreenshot) androidDriver;
		touchAction = new TouchAction(androidDriver);
	}

	/**
	 * Description: Method to provide info in the log,testNg reports
	 * 
	 * @author Manikandan A
	 * @param message
	 */
	public static synchronized void info(String message) {
		BaseTest.logger.info(message);
	}

	/**
	 * 
	 * Description: Method for the Error updation in Log file,TestNG Report
	 * 
	 * @author Manikandan A
	 * @param message
	 */
	public static synchronized void error(String message) {
		BaseTest.logger.error(message);
	}

	/**
	 * Description: Method to provide info in the extent report
	 * 
	 * @author Manikandan A
	 * @param message
	 */
	public static synchronized void extentinfo(String message) {
		ExtentManager.getTestReport().info(message);
	}

	/**
	 * 
	 * Description: Method for the info updation in extent Report
	 * 
	 * @author Manikandan A
	 * @param message
	 */
	public static synchronized void pass(String message) {
		ExtentManager.getTestReport().pass(MarkupHelper.createLabel(message, ExtentColor.GREEN));
	}

	/**
	 * 
	 * Description: Method for the error/error updation in extent Report
	 * 
	 * @author Manikandan A
	 * @param message
	 */
	public static synchronized void fail(String message) {
		ExtentManager.getTestReport().fail(MarkupHelper.createLabel(message, ExtentColor.RED));

	}

	/**
	 * Description: Method for the error/errorure updation in extent Report
	 * 
	 * @author Manikandan A
	 * @param message
	 * @param color
	 * 
	 */
	public static synchronized void validationinfo(String message, String color) {
		if (color.equalsIgnoreCase("blue"))
			ExtentManager.getTestReport().info(MarkupHelper.createLabel(message, ExtentColor.BLUE));
		else if (color.equalsIgnoreCase("green"))
			ExtentManager.getTestReport().pass(MarkupHelper.createLabel(message, ExtentColor.GREEN));
		else if (color.equalsIgnoreCase("red"))
			ExtentManager.getTestReport().fail(MarkupHelper.createLabel(message, ExtentColor.RED));
	}

	/**
	 * 
	 * Description: Check Element is clickable with expected conditions
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized boolean isElementClickable(AndroidElement element, String elementName) {
		info("Validate " + elementName + " is clickable");
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			error(elementName + " is not clickable");
			return false;
		}
	}

	/**
	 * Description:: Method to wait for mentioned time
	 * 
	 * @author Manikandan A
	 * @param poll
	 */
	public static synchronized void poll(int poll) {
		try {
			Thread.sleep(poll);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Description: Check Element is displayed with expected conditions
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized boolean isElementDisplayed(AndroidElement element, String elementName) {
		info("Validate " + elementName + " is displayed");
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.isDisplayed();
			info(elementName + " is displayed");
			return true;
		} catch (Exception e) {
			error(elementName + " is not displayed");
			return false;
		}
	}

	/**
	 * Description: Checks element is visible
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void isElementPresent(AndroidElement element, String elementName) {
		info("Validate " + elementName + " is present");
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			info(elementName + " is present");
		} catch (Exception e) {
			error(elementName + " is not present");
		}
	}

	/**
	 * Description: Wait for the Elements is displayed with expected conditions
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void waitForElements(List<WebElement> element, String elementName) {
		try {
			info("Wait for visibility of " + elementName);
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
		} catch (Exception e) {
			error(elementName + " is not visible");
			Assert.fail(elementName + " is not visible");
		}
	}

	/**
	 * 
	 * Description: Wait for the Element is displayed with expected conditions
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void waitForElement(AndroidElement element, String elementName) {
		try {
			info("Wait for visibility of " + elementName);
			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			error(elementName + " is not visible");
			Assert.fail(elementName + " is not visible");
		}
	}

	/**
	 * Description: Hide the keyboard
	 * 
	 * @author Manikandan A
	 */
	public static synchronized void hideKeyboard() {
		try {
			androidDriver.hideKeyboard();
			info("Keyboard is hidden");
		} catch (Exception e) {
		}
	}

	/**
	 * Description: Scroll to the Element
	 * 
	 * @author Manikandan A
	 * @param elementName
	 * @param elementText
	 */
	public static synchronized void scrollToElementByElementText(String elementName, String elementText) {
		info("Scroll till the " + elementName);
		try {
			androidDriver.findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()"
							+ ".scrollIntoView(new UiSelector().text(\"" + elementText + "\"))");
			info("Scroll till the " + elementName + " completed");
			validationinfo("Scroll till the " + elementName + " completed", "blue");
		} catch (Exception e) {
			error("Scroll till the " + elementName + " failed");
			Assert.fail("Scroll till the " + elementName + " failed");
		}
	}

	/**
	 * Description: Scroll to the Android Element
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 * @param elementName
	 * @param elementText
	 */
	public static synchronized void scrollToElement(AndroidElement element) {
		try {
			for (int i = 0; i <= 25; i++) {
				try {
					if (element.isDisplayed()) {
						break;
					}
				} catch (Exception e) {
					scrollDown(1);
				}
			}
		} catch (Exception e) {
			error("Scroll to the element failed");
			Assert.fail("Scroll to the element failed");
		}
	}

	/**
	 * Description: Scroll to the Android Element
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 * @param elementName
	 * @param elementText
	 */
	public static synchronized void swipeLeftToElement(AndroidElement element) {
		try {
			for (int i = 0; i <= 25; i++) {
				androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
				try {
					if (element.isDisplayed()) {
						break;
					}
				} catch (Exception e) {
					swipeLeft();

//					if (isAlertPresent() == true) {
//						try {
//							androidDriver.switchTo().alert();
//							handleAlert();
//						} catch (Exception ex) {
//							info("No Alert");
//
//						}
//
//					}
				}

				androidDriver.manage().timeouts().implicitlyWait(BaseTest.ITO, TimeUnit.SECONDS);
			}
		} catch (Exception e) {
			error("Swipe to the element failed");
			Assert.fail("Swipe to the element failed");
		}
	}

	/**
	 * Description: Scroll to the Android Element
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 * @param elementName
	 * @param elementText
	 */
	public static synchronized void swipeLeftToPhotoElement(AndroidElement element) {
		try {
			for (int i = 0; i <= 25; i++) {
				androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
				try {
					if (element.isDisplayed()) {
						break;
					}
				} catch (Exception e) {
					swipeLeftInSection();
				}

				androidDriver.manage().timeouts().implicitlyWait(BaseTest.ITO, TimeUnit.SECONDS);
			}
		} catch (Exception e) {
			error("Swipe to the element failed");
			Assert.fail("Swipe to the element failed");
		}
	}

	public static boolean isAlertPresent() {
		try {
			androidDriver.switchTo().alert().dismiss();
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	/**
	 * Description: Scroll to the Android Element
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 * @param elementName
	 * @param elementText
	 */
	public static synchronized void handleAlert() {
		try {
			AndroidElement ad = androidDriver
					.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']"));
			AndroidElement close = androidDriver
					.findElement(By.xpath("//android.widget.TextView[@resource-id='close-button-icon']"));
			AndroidElement skipVideo = androidDriver.findElement(By.xpath(
					"//android.view.View[@resource-id='countdown-close-container']/android.view.View[@resource-id='skip-label-container']"));
			AndroidElement container = androidDriver.findElement(By.xpath(
					"//android.view.View[@resource-id='countdown-close-container']/android.widget.TextView[@resource-id='countdown-text']"));

			try {
				androidDriver.switchTo().alert();
			} catch (Exception e) {
				info("No Alert");

			}

			try {
				try {
					if (container.isDisplayed()) {
						waitForInvisiblilityOfElement(skipVideo, "Skip Video");
						clickOnElement(skipVideo, "Skip Video");

					}
				} catch (Exception e) {
					waitForInvisiblilityOfElement(close, "Close Video");
					clickOnElement(close, "close button");
				}

			} catch (Exception e) {

			}
//			}

		} catch (Exception e) {
			error("No Ad");
//			Assert.fail("Swipe to the element failed");
		}
	}

	/**
	 * Description: Scroll to the Android Element
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 * @param element
	 */
	public static synchronized void swipeRightToElement(AndroidElement element) {
		try {
			for (int i = 0; i <= 25; i++) {
				androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
				try {
					if (element.isDisplayed()) {
						break;
					}
				} catch (Exception e) {
					swipeRight();
				}

				androidDriver.manage().timeouts().implicitlyWait(BaseTest.ITO, TimeUnit.SECONDS);
			}
		} catch (Exception e) {
			error("Swipe to the element failed");
			Assert.fail("Swipe to the element failed");
		}
	}

	/**
	 * Description: Method Swipe to Right
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 */
	public static void swipeRightAtCentre() {
		try {
			Dimension dim = androidDriver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int y = (int) (height * 0.50);
			int startX = (int) (width * 0.55);
			int endX = (int) (width * 0.02);
			TouchAction action = new TouchAction(androidDriver);
			action.press(PointOption.point(startX, y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(endX, y)).release().perform();
			info("Swiped Right Side at Centre");
			extentinfo("Swiped Right Side at Centre");
		} catch (Exception e) {
			error("Failed to Swipe Right Side at Centre");
			Assert.fail("Failed to Swipe Right Side at Centre");

		}
	}

	/**
	 * Description: Method Swipe to Right
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 */
	public static void swipeRightAtbottom() {
		try {
			Dimension dim = androidDriver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int y = (int) (height * 0.80);
			int startX = (int) (width * 0.55);
			int endX = (int) (width * 0.02);
			TouchAction action = new TouchAction(androidDriver);
			action.press(PointOption.point(startX, y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(endX, y)).release().perform();
			info("Swiped Right Side at Bottom");
			extentinfo("Swiped Right Side at Bottom");
		} catch (Exception e) {
			error("Failed to Swipe Right Side at Bottom");
			Assert.fail("Failed to Swipe Right Side at Bottom");
		}

	}

	public static void swipeleftAtbottom() {
		try {
			Dimension dim = androidDriver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int y = (int) (height * 0.80);
			int startX = (int) (width * 0.85);
			int endX = (int) (width * 0.02);
			TouchAction action = new TouchAction(androidDriver);
			action.press(PointOption.point(startX, y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(endX, y)).release().perform();
			info("Swiped Left Side at Bottom");
			extentinfo("Swiped Left Side at Bottom");
		} catch (Exception e) {
			error("Failed to Swipe Left Side at Bottom");
			Assert.fail("Failed to Swipe Left Side at Bottom");

		}

	}

	/**
	 * Description: Method clicks on element
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void clickOnElement(AndroidElement element, String elementName) {
		if (isElementClickable(element, elementName)) {
			element.click();
			info("Clicked on " + elementName);
			extentinfo("Clicked on " + elementName);
		} else {
			error("Unable to click on " + elementName);
			fail("Unable to click on " + elementName);
//			Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(element)) == null);
			Assert.fail("Unable to click on " + elementName);
		}
	}

	/**
	 * Description: Implicit wait for element to load
	 * 
	 * @author Manikandan A
	 * @param Seconds
	 */
	public static synchronized void implicitWait(int Seconds) {
		androidDriver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
	}

	/**
	 * Description: Wait for given time
	 * 
	 * @author Manikandan A
	 * @param millis
	 */
	public static synchronized void waitForElementToLoad(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
		}
	}

	/**
	 * Description: Method to click and type on a Textfield
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param value
	 * @param elementName
	 */
	public static synchronized void clickAndType(AndroidElement element, String value, String elementName) {
		try {
			waitForElement(element, elementName);
			element.click();

			element.clear();
			waitForElementToLoad(5000);
			androidDriver.getKeyboard().sendKeys(value);
			waitForElementToLoad(2000);
			androidDriver.hideKeyboard();
			info("Clicked and typed " + value + " in " + elementName);
			extentinfo("Clicked and typed " + value + " in " + elementName);
		} catch (AssertionError error) {
			fail("Unable to click and type " + value + " in " + elementName);
			error("Unable to click and type " + value + " in " + elementName);
			Assert.fail("Unable to click and type " + value + " in " + elementName);
		} catch (Exception e) {
			fail("Unable to click and type " + value + " in " + elementName);
			error("Unable to click and type " + value + " in " + elementName);
			Assert.fail("Unable to click and type " + value + " in " + elementName);
		}
	}

	/**
	 * Description: Method to type a value into the Textfield.
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param value
	 * @param elementName
	 */
	public static synchronized void typeText(AndroidElement element, String value, String elementName) {
		try {

			wait.until(ExpectedConditions.visibilityOf(element));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.clear();
			element.sendKeys(value);
			extentinfo(value + " is entered into " + elementName);
			info(value + " is entered into " + elementName);

		} catch (AssertionError error) {
			fail(value + " is not entered into " + elementName);
			error(value + " is not entered into " + elementName);
			Assert.fail("Unable to type in " + elementName);
		} catch (Exception e) {
			fail(value + " is not entered into " + elementName);
			error(value + " is not entered into " + elementName);
			Assert.fail("Unable to type in " + elementName);
		}
	}

	/**
	 * Description: Method to delete the directory
	 * 
	 * @author Manikandan A
	 * @param pathToDeleteFolder
	 */
	public static synchronized void deleteDir(String pathToDeleteFolder) {
		File extefolder = new File(pathToDeleteFolder);
		if ((extefolder.exists())) {
			deleteFolderDir(extefolder);
		}
	}

	/**
	 * Description: Method to perform horizontal Swipe
	 * 
	 * @author Manikandan A
	 * @param startPercentage
	 * @param endPercentage
	 */
	public static synchronized void horizontalSwipeByPercentages(double startPercentage, double endPercentage) {
		try {
			Dimension size = androidDriver.manage().window().getSize();
			int startPoint = (int) (size.width * startPercentage);
			int endPoint = (int) (size.width * endPercentage);
			touchAction.press(PointOption.point(endPoint, startPoint))
					.waitAction(new WaitOptions().withDuration(Duration.ofMillis(600)))
					.moveTo(PointOption.point(startPoint, endPoint)).release().perform();
			info("Horizontal swipe performed");
			extentinfo("Horizontal swipe performed");
		} catch (Exception e) {
			error("Unable to perform Horizontal swipe");
			fail("Unable to perform Horizontal swipe");
			Assert.fail("Unable to perform Horizontal swipe");
		}
	}

	/**
	 * Description: Method to perform horizontal Swipe
	 * 
	 * @author Manikandan A
	 * @param value
	 * @param startx
	 * @param starty
	 * @param endx
	 * @param endy
	 */
	public static synchronized void swipeUsingCoordinate(int value, int startx, int starty, int endx, int endy) {
		try {
			info("Swiping the element using Co-ordinates");
			for (int i = 1; i <= value; i++) {
				touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release()
						.perform();
				waitForElementToLoad(1000);
			}
			extentinfo("Swiping the element using Co-ordinates");
		} catch (AssertionError error) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		} catch (Exception e) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Clear the Text
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void clearText(AndroidElement element, String elementName) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.clear();
			info("Clear the text present in" + elementName);
		} catch (Exception e) {
			error("Unable to clear the text in " + elementName);
		}
	}

	/**
	 * Description: Method to get the attribute value for Monfarmer
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized String getAttribute(AndroidElement element, String elementName, String attribute) {
		String r = null;
		try {
			waitForElement(element, elementName);
			r = element.getAttribute("" + attribute + "");
		} catch (Exception e) {
			e.printStackTrace();
			error("User is not able to get the value of " + elementName);
			fail("User is not able to get the value of " + elementName);
			Assert.fail("User is not able to get the value of " + elementName);
		}
		return r;
	}

	/**
	 * Description: Method to click on element using JavaSCript
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void clickOnElementUsingJS(AndroidElement element, String elementName) {
		if (isElementClickable(element, elementName)) {
			jsExecutor.executeScript("arguments[0].click();", element);
			info("Clicked on " + elementName);
			extentinfo("Clicked on " + elementName);
		} else {
			error("Unable to click on " + elementName);
			fail("Unable to click on " + elementName);
			Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(element)) == null);
		}
	}

	/**
	 * Description: Method to tap on element using x and y coordinates
	 * 
	 * @author Sushmita
	 * @param element
	 * @param elementName
	 * @Param x , y
	 */
	public static synchronized void tapByCoordinates(AndroidDriver androidDriver, int x, int y, String elementName) {
		try {
			TouchAction touchAction = new TouchAction(androidDriver);
			touchAction.tap(PointOption.point(x, y)).perform();
			info("Clicked on :" + elementName);
			extentinfo("Clicked on :" + elementName);

		} catch (Exception e) {
			error("Unable to click on: " + elementName);
			fail("Unable to click on: " + elementName);
			Assert.fail("Unable to click on: " + elementName);
		}
	}

	/**
	 * Description: Method to type
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param value
	 * @param elementName
	 */
	public static synchronized void type(String value, String elementName) {
		try {
			waitForElementToLoad(5000);
			androidDriver.getKeyboard().sendKeys(value, Keys.ENTER);
			androidDriver.hideKeyboard();
			info("Clicked and type the value in " + elementName);
			extentinfo("Clicked and type the value in " + elementName);
		} catch (AssertionError error) {
			fail("Unable to click and type the value in " + elementName);
			error("Unable to click and type the value in " + elementName);
			Assert.fail("Unable to click and type the value in " + elementName);
		} catch (Exception e) {
			fail("Unable to click and type the value in " + elementName);
			error("Unable to click and type the value in " + elementName);
			Assert.fail("Unable to click and type the value in " + elementName);
		}
	}

	/**
	 * Description: Method for device back button
	 * 
	 * @author Manikandan A
	 * @param num
	 */
	public static synchronized void clickDeviceBackButton(int num) {
		try {
			poll(2000);
			for (int i = 0; i < num; i++) {
				androidDriver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
			}
			info("Able to click on device back button");
			extentinfo("Able to click on device back button");
		} catch (Exception e) {
			e.printStackTrace();
			error("Unable to click on device back button");
			fail("Unable to click on device back button");
			Assert.fail("Unable to click on device back button");
		}
	}

	/**
	 * Description: Method for fetching Current Date
	 * 
	 * @author Manikandan A
	 */
	public static synchronized String getCurrentDate() {
		DateFormat customFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}

	/**
	 * Description: Method to perform tap on element
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void tapOnElement(AndroidElement element, String elementName) {
		if (isElementClickable(element, elementName)) {
			Point p1 = null;
			p1 = element.getLocation();
			touchAction.tap(PointOption.point(p1.getX(), p1.getY())).perform();
			info("Tap on " + elementName);
			extentinfo("Tap on " + elementName);
		} else {
			error("Unable to tap on " + elementName);
			fail("Unable to tap on " + elementName);
			Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(element)) == null);
		}
	}

//	/**
//	 * Description: Method clicks on element using coordinates
//	 * 
//	 * @author Manikandan A
//	 * @param element
//	 * @param elementName
//	 */
//	public static synchronized void clickOnElementUsingCoordinates(AndroidElement element, String elementName, int x,
//			int y) {
//		if (isElementClickable(element, elementName)) {
//			Point p1 = null;
//			p1 = element.getLocation();
//			touchAction.tap(PointOption.point((p1.getX() + x), (p1.getY() + y))).perform();
//			info("Clicked on " + elementName);
//			extentinfo("Clicked on " + elementName);
//		} else {
//			error("Unable to click on " + elementName);
//			fail("Unable to click on " + elementName);
//			Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(element)) == null);
//		}
//	}

	/**
	 * Description: Method clicks on element using coordinates
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 */
	public static synchronized void clickOnElementUsingCoordinates(int x, int y) {

		try {
			touchAction.tap(PointOption.point(x, y)).perform();
			info("Clicked on Element");
		} catch (Exception e) {
			error("Unable to perform action on the element");
			fail("Unable to perform action on the element");
			Assert.fail("Unable to perform action on the element");
		}

	}

	/**
	 * Description: Method to Drag and Drop.
	 * 
	 * @author Sushmita
	 * @param elementToDrag,elementToDrop
	 */
	public static synchronized void dragAndDrop(AndroidElement elementToDrag, AndroidElement elementToDrop) {
		try {
			touchAction.longPress(new ElementOption().withElement(elementToDrag))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
					.moveTo(new ElementOption().withElement(elementToDrop)).release().perform();

			info("Drag and Drop Completed");
		} catch (Exception e) {

			error("Unable to Drag and Drop element");
			fail("Unable to Drag and Drop element");
			Assert.fail("Unable to Drag and Drop element");
		}
	}

	/**
	 * Description: Method to swipe Left to element
	 * 
	 * @author Ramya
	 */
	public synchronized static void swipeLeft() {
		try {
			info("Swiping the element using Co-ordinates");
			Dimension sizeOfWindow = androidDriver.manage().window().getSize();
			int width = sizeOfWindow.getWidth();
			int height = sizeOfWindow.getHeight();

			new TouchAction((AppiumDriver) androidDriver).press(PointOption.point((int) (width * 0.9), height / 2))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point((int) (width * 0.1), height / 2)).release().perform();

		} catch (AssertionError error) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		} catch (Exception e) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Method to swipe Left to element
	 * 
	 * @author Ramya
	 */
	public synchronized static void swipeLeftInSection() {
		try {
			info("Swiping the element using Co-ordinates to section");
			Dimension sizeOfWindow = androidDriver.manage().window().getSize();
			int width = sizeOfWindow.getWidth();
			int height = sizeOfWindow.getHeight();
			new TouchAction((AppiumDriver) androidDriver)
					.press(PointOption.point((int) (width * 0.9), (int) (height * 0.16)))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point((int) (width * 0.1), (int) (height * 0.16))).release().perform();

		} catch (AssertionError error) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		} catch (Exception e) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Method to swipe Left to element
	 * 
	 * @author Ramya
	 */
	public synchronized static void swipeLeftSection() {
		try {
			info("Swiping the element using Co-ordinates to section");
			Dimension sizeOfWindow = androidDriver.manage().window().getSize();
			int width = sizeOfWindow.getWidth();
			int height = sizeOfWindow.getHeight();
			new TouchAction((AppiumDriver) androidDriver)
					.press(PointOption.point((int) (width * 0.9), (int) (height * 0.16)))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point((int) (width * 0.1), (int) (height * 0.16))).release().perform();

		} catch (AssertionError error) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		} catch (Exception e) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Method to swipe Right to element
	 * 
	 * @author Ramya
	 */
	public static synchronized void swipeRight() {
		try {
			info("Swiping the element using Co-ordinates");
			Dimension sizeOfWindow = androidDriver.manage().window().getSize();
			int width = sizeOfWindow.getWidth();
			int height = sizeOfWindow.getHeight();
			new TouchAction((AppiumDriver) androidDriver).press(PointOption.point((int) (width * 0.1), height / 2))
					.moveTo(PointOption.point((int) (width * 0.9), height / 2)).release().perform();
		} catch (AssertionError error) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		} catch (Exception e) {
			error("Unable to perform swiping using Co-ordinates");
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Method to scroll up
	 * 
	 * @author Ramya
	 * @param noOfTimes
	 */
	public static synchronized void scrollUp(int noOfTimes) {
		try {
//			poll(1000);
			int i = noOfTimes;
			while (i > 0) {

				Dimension dimension = androidDriver.manage().window().getSize();
				int scrollStart = (int) (dimension.getHeight() * 0.75);
				int scrollEnd = (int) (dimension.getHeight() * 0.2);
				TouchAction swipe = new TouchAction(androidDriver);

				swipe.press(PointOption.point(0, scrollEnd)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
						.moveTo(PointOption.point(0, scrollStart)).release().perform();
				i--;
			}
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to swipe Up on screen");
			Assert.fail("Unable to swipe Up on screen");
		}

	}

	/**
	 * Description: Method to scroll up
	 * 
	 * @author Ramya
	 * @param noOfTimes
	 */
	public static synchronized void scrollUpInSection(int noOfTimes) {
		try {
//			poll(1000);
			int i = noOfTimes;
			while (i > 0) {

				Dimension dimension = androidDriver.manage().window().getSize();
				int scrollStart = (int) (dimension.getHeight() * 0.75);
				int scrollEnd = (int) (dimension.getHeight() * 0.4);
				TouchAction swipe = new TouchAction(androidDriver);

				swipe.press(PointOption.point(0, scrollEnd)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
						.moveTo(PointOption.point(0, scrollStart)).release().perform();
				i--;
			}
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to swipe Up on screen");
			Assert.fail("Unable to swipe Up on screen");
		}

	}

	/**
	 * Description: Method to scroll horizontally
	 * 
	 * @author Ramya
	 */
	public static synchronized void scrollHorizontally() {
		try {
			Dimension dimension = androidDriver.manage().window().getSize();
			int scrollStart = (int) (dimension.getWidth() * 0.5);
			int scrollEnd = (int) (dimension.getWidth() * 0.2);
			touchAction.press(PointOption.point(scrollStart, 50))
					.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(scrollEnd, 50))
					.release().perform();
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to scroll horizontally");
			Assert.fail("Unable to scroll horizontally");
		}

	}

	/**
	 * Description: Method to wait For Invisiblility Of Element
	 * 
	 * @author Ramya
	 * @param element
	 * @param elementName
	 */
	public static synchronized void waitForInvisiblilityOfElement(AndroidElement element, String elementName) {
		try {
			info("Wait for invisibility of " + elementName);
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			error(elementName + " is still visible");
		}
	}

	/**
	 * Description: Method to wait For Visiblility Of Element
	 * 
	 * @author Ramya
	 * @param element
	 * @param elementName
	 */
	public static synchronized void waitForVisiblilityOfElement(AndroidElement element, String elementName) {
		try {
			info("Wait for visibility of " + elementName);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			error(elementName + " is not visible");
		}
	}

	/**
	 * Description:: Check whether the Element is displayed with expected conditions
	 *
	 * @author Manikandan A
	 * @param element
	 * @param elementName
	 * @param validationPassMessage
	 * @param validationFailMessage
	 * @param color
	 */
	public static synchronized void validateisElementDisplayed(AndroidElement element, String elementName,
			String validationPassMessage, String validationFailMessage, String color) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Assert.assertTrue(element.isDisplayed());
			validationinfo(validationPassMessage, color);
			info(validationPassMessage);
		} catch (AssertionError | Exception e) {
			fail(validationFailMessage);
			error(validationFailMessage);
			Assert.fail(validationFailMessage);
		}

	}

	/**
	 * Description:: This Method is used to fetch the current Date and Time in
	 * defined format
	 * 
	 * @author Manikandan A, Sushmita
	 * @return systemCurrentDateandTime
	 */
	public static synchronized String fetchCurrentDateandTime() {
		String systemCurrentDateandTime = null;
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("MMM d, yyyy hh:mma");
			String strDate = formatter.format(date);
			systemCurrentDateandTime = strDate;
			info("Able to fetch the system Date and Time as " + systemCurrentDateandTime);
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to fetch Current Date and Time");
			Assert.fail("Unable to fetch Current Date and Time");
		}
		return systemCurrentDateandTime;
	}

	/**
	 * Description:: This Method is used to fetch the current year in defined format
	 * 
	 * @author Manikandan A, Sushmita
	 * @return systemCurrentYear
	 */
	public static synchronized String fetchCurrentYear() {
		String systemCurrentYear = null;
		try {
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
			String year = formatter.format(date);
			systemCurrentYear = year;
			info("Able to fetch the system year as " + systemCurrentYear);
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to fetch Current Year");
			Assert.fail("Unable to fetch Current Year");
		}
		return systemCurrentYear;
	}

	/**
	 * Description: Validate the Text
	 * 
	 * @author Manikandan A
	 * @param expected
	 * @param element
	 * @param elementname
	 * @param validationPassMessage
	 * @param validationFailMessage
	 * @param color
	 */
	public static synchronized void validateText(String expected, AndroidElement element, String elementname,
			String validationPassMessage, String validationFailMessage, String color) {
		wait.until(ExpectedConditions.visibilityOf(element));
		String actual = element.getText();
		try {
			Assert.assertEquals(actual, expected);
			info("Expected text " + expected + " is matching with the " + actual + " text in the application ");
			validationinfo(validationPassMessage, color);
			info(validationPassMessage);
		} catch (Exception e) {
			error("Expected text " + expected + " is not  matching with the " + actual + " text in the application ");
			error(validationFailMessage);
			fail(validationFailMessage);
		}
	}

	/**
	 * Description:: This Method is used to swipe Horizontal Using Coordinates for a
	 * specific element.
	 * 
	 * @author Manikandan A, Sushmita
	 * @param element
	 * @param noOfTimes
	 */
	public static synchronized void swipeHorizontalUsingCoordinates(AndroidElement element, int noOfTimes) {
		try {
			poll(1000);
			int i = noOfTimes;
			while (i > 0) {
				Point elementLocation = element.getLocation();
				int yAxis = (int) (elementLocation.getY());
				int xAxisStartPoint = (int) (elementLocation.getX() + 900);
				int xAxisEndPoint = (int) (elementLocation.getX() + 400);
				touchAction.press((new PointOption().withCoordinates(xAxisStartPoint, yAxis)))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
						.moveTo((new PointOption().withCoordinates(xAxisEndPoint, yAxis))).release().perform();
				info("Swiping horizontally using coordinates");
				i--;
			}
		} catch (Exception e) {

			error(e.getMessage());
			fail("Unable to swipe horizontally using coordinates");
			Assert.fail("Unable to swipe horizontally using coordinates");
		}
	}

	/**
	 * Description: Method to perform horizontal Swipe using coordinates
	 *
	 * @author Manikandan A
	 * @param actualElement
	 * @param expectedElement
	 * @param startx
	 * @param starty
	 * @param endx
	 * @param endy
	 */
	public static synchronized void swipeHorizontallyUsingCoordinate(AndroidElement actualElement,
			AndroidElement expectedElement, int startx, int starty, int endx, int endy) {
		try {
			info("Swiping the element using Co-ordinates");
			int xAxis = actualElement.getLocation().getX();
			int yAxis = actualElement.getLocation().getY();
			while (true) {
				try {
					expectedElement.isDisplayed();
					break;
				} catch (Exception e) {
					touchAction.longPress(PointOption.point((xAxis + startx), (yAxis + starty)))
							.moveTo(PointOption.point((xAxis + endx), (yAxis + endy))).release().perform();
				}
			}
			extentinfo("Swiping the element using Co-ordinates");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Method to perform Swipe using coordinates
	 *
	 * @author Sushmita
	 * @param actualElement
	 * @param startx
	 * @param starty
	 * @param endx
	 * @param endy
	 */
	public synchronized void swipeUsingCoordinate(AndroidElement actualElement, int startx, int starty, int endx,
			int endy) {
		try {
			info("Swiping the element using Co-ordinates");
			int xAxis = actualElement.getLocation().getX();
			int yAxis = actualElement.getLocation().getY();

			touchAction.longPress(PointOption.point((xAxis + startx), (yAxis + starty)))
					.moveTo(PointOption.point((xAxis + endx), (yAxis + endy))).release().perform();
			extentinfo("Swiping the element using Co-ordinates");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description:: Method to delete folder directory for time period above 30days
	 * 
	 * @author Manikandan A
	 * @param folderToDelete
	 */
	public static synchronized void deleteDirectory(String folderToDelete) {
		try {
			File dir = new File(folderToDelete);
			File[] files = dir.listFiles();
			if (files.length > 1) {
				for (File file : files) {
					String name = file.getName();
					if (name.toLowerCase().contains("automation")) {
						String[] dateTime = name.split("- ");
						if (calculateDateDifference(dateTime[1]) > 30) {
							String tempXLFile = new StringBuffer(folderToDelete).append(File.separator).append(name)
									.toString();
							deleteDir(tempXLFile);
						}
					}
				}
			}
		} catch (Exception e) {
			error("Unable to delete the directory");
			fail("Unable to delete the directory");
		}
	}

	/**
	 * Description: Method to delete folder directory
	 * 
	 * @author Manikandan A
	 * @param folderToDelete
	 */
	public static synchronized void deleteFolderDir(File folderToDelete) {
		File[] folderContents = folderToDelete.listFiles();
		if (folderContents != null) {
			for (File folderfile : folderContents) {
				if (!Files.isSymbolicLink(folderfile.toPath())) {
					deleteFolderDir(folderfile);
				}
			}
		}
		folderToDelete.delete();
	}

	/**
	 * Description:: Method to find difference between current date and mentioned
	 * date
	 * 
	 * @author Manikandan A
	 * @param actualDateTime
	 * @return days_difference
	 */
	public static synchronized long calculateDateDifference(String actualDateTime) {
		/* Create an instance of the SimpleDateFormat class */
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		long days_difference = 0;
		String currentDateTime = getCurrentDateTime();
		try {
			/* Use parse method to get date object of both dates */
			Date date1 = customFormat.parse(actualDateTime);
			Date date2 = customFormat.parse(currentDateTime);
			/* Calculate time difference in milliseconds */
			long time_difference = date2.getTime() - date1.getTime();
			/* Calculate time difference in days using TimeUnit class */
			days_difference = TimeUnit.MILLISECONDS.toDays(time_difference) % 365;
		} catch (Exception e) {
			error("Unable to calculate Date difference");
			fail("Unable to calculate Date difference");
		}
		return days_difference;
	}

	/**
	 * Description: Method for fetching Current Date Time
	 * 
	 * @author Manikandan A
	 */
	public static synchronized String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}

	/**
	 * Description: Capture the screenshot of the complete screen
	 * 
	 * @author Manikandan A
	 * @param path
	 * @return destinationPath
	 */
	public static synchronized String getScreenShot(String path) {
		File src = (screenshot.getScreenshotAs(OutputType.FILE));
		String currentDateTime = getCurrentDateTime();
		String destinationPath = path + BaseTest.className + "-" + currentDateTime + ".png";
		File destination = new File(destinationPath);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			error("Capture Failed " + e.getMessage());
		}
		return "./Screenshots/" + BaseTest.className + "-" + currentDateTime + ".png";
	}

	/**
	 * Description: To create the duration of the Test Run
	 * 
	 * @author Manikandan A
	 * @param millis
	 */
	public static synchronized String formatDuration(long millis) {
		long seconds = (millis / 1000) % 60;
		long minutes = (millis / (1000 * 60)) % 60;
		long hours = millis / (1000 * 60 * 60);

		StringBuilder b = new StringBuilder();
		b.append(hours == 0 ? "00" : hours < 10 ? String.valueOf("0" + hours) : String.valueOf(hours));
		b.append(":");
		b.append(minutes == 0 ? "00" : minutes < 10 ? String.valueOf("0" + minutes) : String.valueOf(minutes));
		b.append(":");
		b.append(seconds == 0 ? "00" : seconds < 10 ? String.valueOf("0" + seconds) : String.valueOf(seconds));
		return b.toString();
	}

	/**
	 * Description: Method to click and type on a Textfield without hiding the
	 * Keyboard.
	 * 
	 * @author Manikandan A
	 * @param element
	 * @param value
	 * @param elementName
	 */
	public static synchronized void clickAndTypewithoutHidingKeyboard(AndroidElement element, String value,
			String elementName) {
		try {
			waitForElement(element, elementName);
			element.click();
			element.clear();
			poll(3000);
			androidDriver.getKeyboard().sendKeys(value);
			waitForInvisiblilityOfElement(element, elementName);
			waitForElementToLoad(2000);
			info("Clicked and typed " + value + " in " + elementName);
			extentinfo("Clicked and typed " + value + " in " + elementName);
		} catch (AssertionError error) {
			fail("Unable to click and type " + value + " in " + elementName);
			error("Unable to click and type " + value + " in " + elementName);
			Assert.fail("Unable to click and type " + value + " in " + elementName);
		} catch (Exception e) {
			fail("Unable to click and type " + value + " in " + elementName);
			error("Unable to click and type " + value + " in " + elementName);
			Assert.fail("Unable to click and type " + value + " in " + elementName);
		}
	}

	/**
	 * Description: Method to scroll down
	 * 
	 * @author Ramya
	 * @param noOfTimes
	 */
	public static synchronized void scrollDown(int noOfTimes) {
		try {
//			poll(1000);
			int i = noOfTimes;
			Dimension dimension = androidDriver.manage().window().getSize();
			int scrollStart = (int) (dimension.getHeight() * 0.8);
			int scrollEnd = (int) (dimension.getHeight() * 0.3);

			while (i > 0) {

				touchAction.press(PointOption.point(0, scrollStart))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
						.moveTo(PointOption.point(0, scrollEnd)).release().perform();
				i--;
			}
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to swipe down on screen");
			Assert.fail("Unable to swipe down on screen");
		}

	}

	/**
	 * Description: Method to perform Swipe using coordinates
	 *
	 * @author Sushmita
	 * @param actualElement
	 * @param startx
	 * @param starty
	 * @param endx
	 * @param endy
	 * @param noOfTimes
	 */
	public static synchronized void swipeUsingCoordinate(AndroidElement actualElement, int startx, int starty, int endx,
			int endy, int noOfTimes) {
		try {
			poll(1000);
			int i = noOfTimes;
			info("Swiping the element using Co-ordinates");

			int xAxis = actualElement.getLocation().getX();
			int yAxis = actualElement.getLocation().getY();
			info("x co-ordinate : " + xAxis);
			info("y co-ordinate : " + yAxis);
			while (i > 0) {

				touchAction.press(PointOption.point((xAxis + startx), (yAxis + starty)))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
						.moveTo(PointOption.point((xAxis + endx), (yAxis + endy))).release().perform();

				i--;
			}
			extentinfo("Swiping the element using Co-ordinates completed");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to perform swiping using Co-ordinates");
			Assert.fail("Unable to perform swiping using Co-ordinates");
		}
	}

	/**
	 * Description: Method to validate app installed
	 *
	 * @author Manikandan A
	 * 
	 */
	public static synchronized void validateAppInstalled() {
		try {
			boolean status = androidDriver.isAppInstalled(BaseTest.properties.getProperty("appPackage"));
			if (status == true) {
				extentinfo("Application Installed");
				info("Application Installed");
			} else if (status == false) {
				extentinfo("Application not Installed");
				info("Application not Installed");
			}
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to validate the application installed");
			Assert.fail("Unable to validate the application installed");
		}
	}

	/**
	 * Description: Method to install the app
	 *
	 * @author Manikandan A
	 * 
	 */
	public static synchronized void installApp() {
		try {
			androidDriver.installApp(BaseTest.properties.getProperty("appApkPath"));
			extentinfo("Application Installed Successfully");
			info("Application Installed Successfully");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to install the application");
			Assert.fail("Unable to install the application");
		}
	}

	/**
	 * Description: Method to uninstall the app
	 *
	 * @author Manikandan A
	 * 
	 */
	public static synchronized void uninstallApp() {
		try {
			androidDriver.removeApp(BaseTest.properties.getProperty("appPackage"));
			extentinfo("Application uninstalled Successfully");
			info("Application uninstalled Successfully");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to uninstall the application");
			Assert.fail("Unable to uninstall the application");
		}
	}

	/**
	 * Description: Method to Close the app
	 *
	 * @author Manikandan A
	 * 
	 */
	public static synchronized void closeApp() {
		try {
			androidDriver.closeApp();
			poll(2000);
			extentinfo("Application closed Successfully");
			info("Application closed Successfully");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to Close the application");
			Assert.fail("Unable to Close the application");
		}
	}

	/**
	 * Description: Method to Turn Off the data
	 *
	 * @author Manikandan A
	 * 
	 */
	public static synchronized void turnOffTheConnection() {
		try {
			androidDriver.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
			extentinfo("Data Connection turned Off");
			info("Data Connection turned Off");
		} catch (Exception e) {

			error(e.getMessage());
			fail("Unable to Turn Off the Data Connection");
			Assert.fail("Unable to Turn Off the Data Connection");
		}
	}

	/**
	 * Description: Method to Turn On the data
	 *
	 * @author Manikandan A
	 * 
	 */
	public static synchronized void turnOnTheConnection() {
		try {
			androidDriver.setConnection(new ConnectionStateBuilder().withWiFiEnabled().withDataEnabled().build());
			extentinfo("Data Connection turned On");
			info("Data Connection turned On");
		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to Turn On the Data Connection");
			Assert.fail("Unable to Turn On the Data Connection");
		}
	}

	/**
	 * Description: Method to swipe up
	 * 
	 * @author Ramya
	 */
	public static synchronized void swipeUp() {
		try {
			Dimension dim = androidDriver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int x = width / 2;
			int starty = (int) (height * 0.80);
			int endy = (int) (height * 0.20);
			TouchAction action = new TouchAction(androidDriver);
			action.press(PointOption.point(x, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(x, endy)).release().perform();
			info("Swiped Up");
			extentinfo("Swiped Up");

		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to Swipe Up");
			Assert.fail("Unable to Swipe Up");
		}
	}

	/**
	 * Description: Method to swipe down
	 * 
	 * @author Ramya
	 */
	public static synchronized void swipeDown() {
		try {
			Dimension dim = androidDriver.manage().window().getSize();
			int height = dim.getHeight();
			int width = dim.getWidth();
			int x = width / 2;
			int starty = (int) (height * 0.20);
			int endy = (int) (height * 0.80);
			TouchAction action = new TouchAction(androidDriver);
			action.press(PointOption.point(x, starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
					.moveTo(PointOption.point(x, endy)).release().perform();
			info("Swiped Down");
			extentinfo("Swiped Down");

		} catch (Exception e) {
			error(e.getMessage());
			fail("Unable to Swipe Down");
			Assert.fail("Unable to Swipe Down");
		}
	}

	/**
	 * Description: Method to swipe Right to element
	 * 
	 * @author Ramya
	 */
	public static synchronized void closeVideo() {
		try {
			
			Dimension dim = androidDriver.manage().window().getSize();
			int height = dim.getHeight();			
			int width = dim.getWidth();
			
			int startX=(int) (width * 0.75);
			int endX=width / 2;
			int startY=(int) (height * 0.90);
			int endY=(int) (height * 0.95);		
			
			new TouchAction((AppiumDriver) androidDriver).longPress(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(endX, endY)).release().perform();

		} catch (Exception e) {
			error("Unable to close the Video");
			fail("Unable to close the Video");
			Assert.fail("Unable to close the Video");
		}
	}

	/**
	 * Description: Method to launch app
	 * 
	 * @author Ramya
	 */
	public static void launchApp() {
		String pkg = BaseTest.properties.getProperty("appPackage");
		String act = BaseTest.properties.getProperty("appActivity");
		try {
			runADBcmd("adb shell pm clear " + pkg);
			runADBcmd("adb shell am start -n " + pkg + "/" + act);
			info("App launched Succesfully");
		} catch (InterruptedException | IOException e) {	
			error("App not launched");
		} 
	}

	/**
	 * Description: Method to run adb command
	 * 
	 * @author Ramya
	 */
	public static void runADBcmd(String adbCommand) throws InterruptedException, IOException {
		poll(3000);
		Runtime.getRuntime().exec(adbCommand);
		poll(3000);
	}

	public static void zoomout() throws InterruptedException {
		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension dim = androidDriver.manage().window().getSize();
		int width = dim.width;
		int height = dim.height;

		int firstTouchXcoordinate_Start = (int) (width * .9);
		int firstTouchYcoordinate_Start = (int) (height * .9);

		int firstTouchXcoordinate_End = (int) (width * .5);
		int firstTouchYcoordinate_End = (int) (height * .6);

		int secondTouchXcoordinate_Start = (int) (width * .1);
		int secondTouchYcoordinate_Start = (int) (height * .1);

		int secondTouchXcoordinate_End = (int) (width * .5);
		int secondTouchYcoordinate_End = (int) (height * .4);

		TouchAction touch1 = new TouchAction(androidDriver);
		TouchAction touch2 = new TouchAction(androidDriver);

		touch1.longPress(PointOption.point(firstTouchXcoordinate_Start, firstTouchYcoordinate_Start))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point(firstTouchXcoordinate_End, firstTouchYcoordinate_End));

		touch2.longPress(PointOption.point(secondTouchXcoordinate_Start, secondTouchYcoordinate_Start))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point(secondTouchXcoordinate_End, secondTouchYcoordinate_End));

		MultiTouchAction multi = new MultiTouchAction(androidDriver);
		multi.add(touch1).add(touch2).perform();
	}

	public static void zoomin() throws InterruptedException {

		androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension dim = androidDriver.manage().window().getSize();
		int width = dim.width;
		int height = dim.height;

		int firstTouchXcoordinate_Start = (int) (width * .5);
		int firstTouchYcoordinate_Start = (int) (height * .4);

		int firstTouchXcoordinate_End = (int) (width * .1);
		int firstTouchYcoordinate_End = (int) (height * .1);

		int secondTouchXcoordinate_Start = (int) (width * .5);
		int secondTouchYcoordinate_Start = (int) (height * .6);

		int secondTouchXcoordinate_End = (int) (width * .9);
		int secondTouchYcoordinate_End = (int) (height * .9);

		TouchAction touch1 = new TouchAction(androidDriver);
		TouchAction touch2 = new TouchAction(androidDriver);

		touch1.longPress(PointOption.point(firstTouchXcoordinate_Start, firstTouchYcoordinate_Start))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point(firstTouchXcoordinate_End, firstTouchYcoordinate_End));

		touch2.longPress(PointOption.point(secondTouchXcoordinate_Start, secondTouchYcoordinate_Start))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
				.moveTo(PointOption.point(secondTouchXcoordinate_End, secondTouchYcoordinate_End));

		MultiTouchAction multi = new MultiTouchAction(androidDriver);
		multi.add(touch1).add(touch2).perform();
	}
}
