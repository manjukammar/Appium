package com.tyss.aajtak.reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.tyss.aajtak.commonutils.FileVariables;
import com.tyss.aajtak.util.MobileActionUtil;

/**
 * Description: Implements the creation of the Extent Html report with specified
 * name after loading the Extent config file from specified location.
 * 
 * @author Sajal,vikas
 */
public class Extent {
	
	private ExtentReports extent;
	FileVariables fileVariables = new FileVariables();
	/**
	 * Description: Creates of HTML report in specified path
	 * 
	 * @author Sajal,vikas
	 */
	public  ExtentReports getExtent(String filepath) {

		if (extent == null) {
			try {
				extent = new ExtentReports();
				extent.attachReporter(getHtmlReporter(filepath + "/AutomationReport.html"));	
				return extent; 
			} catch (Exception e) {
				MobileActionUtil.info("Exception while creating report html file.");
				
			}
		}
		return extent;
	}
	/**
	 * Description :Loads the Extent-config file specified from the location
	 * 
	 * @author Sajal,vikas
	 */
	private static ExtentHtmlReporter getHtmlReporter(String filePath) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(filePath);
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/config/extent-config.xml");
		return htmlReporter;
	}

}
