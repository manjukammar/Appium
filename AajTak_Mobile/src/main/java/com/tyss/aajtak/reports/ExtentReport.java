package com.tyss.aajtak.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.tyss.aajtak.baseutil.BaseTest;
/**
 * Description : Creates the HTML report based on the name specified.
 * @author Sajal,vikas
 * 
 */
public class ExtentReport {
	private static ExtentTest extentTtest;
	private static ExtentReports extentReports;

	/**
	 * Description : Creates the HTML report based on the name specified
	 * @author Sajal,vikas
	 * 
	 */
	public static ExtentTest createTest(String name) {

		extentTtest = extentReports.createTest(name);
		return extentTtest;
	}

	public static ExtentReports getExtent() {
		return extentReports;
	}
	/**
	 * Description : Initializes report specified in the file path
	 * @author Sajal,vikas
	 * 
	 */
	public void initReport(String filepath) {
		extentReports = new Extent().getExtent(filepath);
		BaseTest.logger.info("Report Initiated");
	}

}
