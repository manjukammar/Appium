package com.tyss.aajtak.baseutil;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.tyss.aajtak.commonutils.FileOperation;
import com.tyss.aajtak.reports.ExtentManager;
import com.tyss.aajtak.reports.ExtentReport;
import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/***********************************************************************
 * Description : Implements Application Precondition and Postcondition.
 * 
 * @BeforeSuite: Creates all the folder structure for Extent Reports, Creates
 *               the connection with DataBase and starts server for Real/Virtual
 *               Mobile device.
 * @BeforeTest : Downloads the driver executable file.
 * @BeforeClass : Launches the browser according to the browser name specified
 *              and Launches the application in Mobile.
 * @AfterClass : Closes the browser/App after completion of execution
 * @AfterSuite: Kills the driver for respective application type(ie, Web
 *              Application and Mobile Application)
 * 
 * 
 */

public class BaseTest {
	public static final int ITO = 10;
	public static final int ITO_High = 10;
	public static final int ETO = 25;
//	public static final int pageLoadTimeout = 30;
	public static String sDirPath = System.getProperty("user.dir");
	public static Logger logger = LoggerFactory.getLogger(BaseTest.class);
	public String testCaseName;
	public static final String driverPath = "/drivers";
	public static String browserName;
	public static String className;
	public DesiredCapabilities mobileCapabilities;
	public static AndroidDriver<AndroidElement> androidDriver;
	public static InitializePagesMobile pages;
	public static URL appiumServerURL;
	public static MobileActionUtil mobileActionUtil;
	public static Properties properties;
	public static Properties prop_constants;
	public static final String TESTDATAEXCELPATH = sDirPath + "/src/main/resources/TestData/Data.xlsx";
	public static final String CONFIGPATH = sDirPath + "/src/main/resources/EnvironmentVariables/config.properties";
	public static final String VALIDATIONCONSTANTS = sDirPath
			+ "/src/main/resources/TestData/Validation_Constants.properties";

	static {
		try {
			properties = new Properties();
			prop_constants = new Properties();
			FileInputStream fis = new FileInputStream(CONFIGPATH);
			properties.load(fis);
			FileInputStream fis1 = new FileInputStream(VALIDATIONCONSTANTS);
			prop_constants.load(fis1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Description : Creates folder structure for Extent reports and starts the
	 * appium server and emulator
	 * 
	 * @author: Manikandan A
	 * @param applicationType
	 */
	@Parameters({ "applicationType" })
	@BeforeSuite(alwaysRun = true)
	public synchronized void createFiles(String applicationType) {
		try {
			logger.info("Folder creation for Extent");
			FileOperation fileOperation = new FileOperation();
			fileOperation.CreateFiles();

			if (applicationType.toLowerCase().contains("mobile")) {
				appiumServerURL = CreateDriver.getInstance().startServer();
				if (applicationType.toLowerCase().contains("virtual")) {
					System.out.println("In" + applicationType);
					CreateDriver.getInstance().launchingEmulator();
				}
			}
			if (applicationType.toLowerCase().contains("mobile")) {
				mobileCapabilities = CreateDriver.getInstance().setUpMobileCapabilities();
				AppiumDriver appiumDriver = null ;
				try {
					
					appiumDriver = CreateDriver.getDriver(appiumServerURL.toString());

					
				} catch (Exception e) {
					logger.error("Unable to launch the mobile");
				}
				
				androidDriver=(AndroidDriver<AndroidElement>) appiumDriver;
			}
		} catch (Exception e) {
			logger.info("Exception while report inititation");
		}
	}

	/**
	 * Description: Launches the browser as specified in the parameter
	 * 
	 * @author Manikandan A
	 * @param browserName
	 */

	@BeforeClass
	public synchronized void launchApp() {

		ExtentTest parentExtentTest = ExtentReport.createTest(getClass().getSimpleName());
		ExtentManager.setParentReport(parentExtentTest);
	}

	/**
	 * Description: Launches the browser as specified in the parameter,Launches the
	 * Application in mobile
	 * 
	 * @author:Manikandan A
	 * @param browserName
	 * @param applicationType
	 */
	@Parameters({ "applicationType" })
	@BeforeMethod
	public synchronized void launchApp(String applicationType, Method methodName) {
		logger = LoggerFactory.getLogger(getClass().getName());
		className = getClass().getSimpleName();

		this.testCaseName = methodName.getName();
		String description = methodName.getAnnotation(Test.class).description();
		ExtentTest testReport = ExtentManager.getParentReport().createNode(testCaseName, "Description: " + description);
		ExtentManager.setTestReport(testReport);

		androidDriver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		mobileActionUtil = new MobileActionUtil(androidDriver, ETO);
		pages = new InitializePagesMobile(androidDriver, ETO);
		logger.info("Running test - " + getClass().getSimpleName());
		
	}

	/**
	 * Description: Kills the driver in Task Manager as specified in the parameter.
	 * 
	 * @author Manikandan A
	 * @param browserName
	 * @param applicationType
	 */
	@AfterSuite(alwaysRun = true)
	@Parameters({ "applicationType" })
	public synchronized void killTask(String applicationType) {

		try {
			if (androidDriver != null) {
				androidDriver.quit();
				logger.info("Driver closed successfully");
			} else {
				logger.error("Unable to close the driver");
			}

			
		} catch (Exception e) {
			logger.error("Unable to close the driver");
		}finally {
			if (applicationType.toLowerCase().contains("realmobile")) {
				CreateDriver.getInstance().stopAppiumServer();

			} else if (applicationType.toLowerCase().contains("virtualmobile")) {
				CreateDriver.getInstance().stopAppiumServer();
				if (applicationType.toLowerCase().contains("virtual")) {
					CreateDriver.getInstance().closeEmulator();
				}

			}
		}
	}
}