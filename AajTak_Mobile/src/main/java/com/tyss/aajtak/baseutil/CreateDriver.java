package com.tyss.aajtak.baseutil;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.AndroidServerFlag;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class CreateDriver {

	private static CreateDriver instance = null;

	private CreateDriver() {
	}

	public static String userHomePath = System.getProperty("user.home");
	public static final String NODEJSPATH = BaseTest.properties.getProperty("NODEJSPATH");
	public static final String NPMPATH = userHomePath + BaseTest.properties.getProperty("NPMPATH");
	public static final String ADBPATH = userHomePath + BaseTest.properties.getProperty("ADBPATH");
	public static final String EMULATORPATH = userHomePath + BaseTest.properties.getProperty("EMULATORPATH");

	public static AppiumDriverLocalService service;

	/**
	 * getInstance method to retrieve active driver instance
	 * 
	 * @author Manikandan A
	 * @return CreateDriver
	 */
	public static CreateDriver getInstance() {
		if (instance == null) {
			instance = new CreateDriver();
		}
		return instance;
	}

public static ThreadLocal<AppiumDriver> appiumDriver=new ThreadLocal<>();
	

	public static AppiumDriver getDriver(String appiumServerURL) {
		if (appiumDriver.get() == null) {
			try {
				
				appiumDriver.set(new AndroidDriver<AndroidElement>(new URL(appiumServerURL),setUpMobileCapabilities()));
			} catch (Exception e) {
				cleanDriver();
			}
			return appiumDriver.get();
		}
		return null;
	}

	public static void cleanDriver() {
		appiumDriver.get().quit();
		appiumDriver.remove();
	}
	
	
	/**
	 * Description: Start the Appium Server
	 * 
	 * @author Manikandan A
	 */
	public static URL startServer() {
		URL appiumServerURL = null;
		try {
			BaseTest.logger.info("Starting the Appium Server");
			
//			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
//			Runtime.getRuntime().exec("adb uninstall io.appium.uiautomator2.server");
//			Runtime.getRuntime().exec("adb uninstall io.appium.uiautomator2.server.test");
//			Runtime.getRuntime().exec("adb shell pkill -9 node");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("noReset", "true");
			
				/* Build the Appium service */
				AppiumServiceBuilder builder = new AppiumServiceBuilder();
				builder.usingDriverExecutable(new File(NODEJSPATH));
				builder.withAppiumJS(new File(NPMPATH));
				builder.withArgument(AndroidServerFlag.BOOTSTRAP_PORT_NUMBER,
						BaseTest.properties.getProperty("bootstrapPort"));
				builder.withIPAddress(BaseTest.properties.getProperty("hostAddress"));
				builder.usingPort(Integer.parseInt(BaseTest.properties.getProperty("port")));

				// builder.withCapabilities(cap);
				builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
				builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");

				service = AppiumDriverLocalService.buildService(builder);
				service.start();
				appiumServerURL = service.getUrl();
				// appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");
				BaseTest.logger.info("Appium Server started");
				BaseTest.logger.info("Appium Server URL: " + appiumServerURL);
			
			

		} catch (Exception e) {

		}
		return appiumServerURL;
	}

	/**
	 * Description: Start the Emulator
	 * 
	 * @author Manikandan A
	 */
	public static void launchingEmulator() {
		String path = EMULATORPATH;
		BaseTest.logger.info("Launching the Emulator");
		String avd = BaseTest.properties.getProperty("avd");
		// String[] aCommand = new String[] { EMULATORPATH, "-avd", avd };
		String gpu = BaseTest.properties.getProperty("gpu");
		String[] aCommand = new String[] { path, "-avd", avd, "-gpu", gpu };
		try {
			Process process = new ProcessBuilder(aCommand).start();
			process.waitFor(60, TimeUnit.SECONDS);
			BaseTest.logger.info("Emulator launched successfully!");
		} catch (Exception e) {
			BaseTest.logger.error("Unable to launch the emulator");
		}
	}

	/**
	 * Description: Close the Emulator
	 * 
	 * @author Manikandan A
	 */
	public static void closeEmulator() {
		BaseTest.logger.info("Killing emulator...");
		String path = ADBPATH;
		String[] aCommand = new String[] { path, "emu", "kill" };
		try {
			Process process = new ProcessBuilder(aCommand).start();
			process.waitFor(30, TimeUnit.SECONDS);
			BaseTest.logger.info("Emulator closed successfully!");
		} catch (Exception e) {
			BaseTest.logger.error("Unable to close the emulator");
		}
	}

	/**
	 * Description: Stop the Appium server
	 * 
	 * @author Manikandan A
	 */
	public static void stopAppiumServer() {
		try {
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			BaseTest.logger.info("Appium server stopped");
		} catch (Exception e) {
			BaseTest.logger.error("Unable to stop the appium server");
		}
	}

	static int count = 0;

	/**
	 * Description: Set Capabilities for mobile
	 * 
	 * @author Manikandan A
	 */
	public static DesiredCapabilities setUpMobileCapabilities() {
		File app = new File(BaseTest.properties.getProperty("appApkPath"));

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, BaseTest.properties.getProperty("deviceName"));

		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 10000);
		capabilities.setCapability("autoGrantPermissions", true);	
		if (BaseTest.properties.getProperty("runType").toLowerCase().contains("install") && count == 0) {

			capabilities.setCapability("app", BaseTest.properties.getProperty("appApkPath"));
			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
					BaseTest.properties.getProperty("appPackage"));
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					BaseTest.properties.getProperty("appActivity"));
			count++;
		} else if (BaseTest.properties.getProperty("runType").toLowerCase().contains("execute")) {

			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
					BaseTest.properties.getProperty("appPackage"));
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					BaseTest.properties.getProperty("appActivity"));
		} else {

			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,
					BaseTest.properties.getProperty("appPackage"));
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					BaseTest.properties.getProperty("appActivity"));
		}

		return capabilities;
	}

	/**
	 * Description: Method to check appium server is running
	 * 
	 * @author Manikandan A
	 * @param port
	 */
	public static boolean isAppiumServerRunnning(int port) {
		boolean isAppiumServerRunning = false;
		ServerSocket socket;
		try {
			socket = new ServerSocket(port);
			System.out.println(port);
			socket.close();
		} catch (IOException e) {
			isAppiumServerRunning = true;
		} finally {
			socket = null;
		}
		return isAppiumServerRunning;
	}
}
