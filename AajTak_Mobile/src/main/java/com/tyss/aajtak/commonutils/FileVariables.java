package com.tyss.aajtak.commonutils;


import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Description : Implements creation of file variables required to perform various file operations.
 * @author Manikandan A
 *  
 */
public class FileVariables {
	private static String extentDir;
	private static String screenShotPath;
	private String sStartTime;
	private String extentReportFolderPath;
	private Date date;
	private SimpleDateFormat sdf;
	private String sDate;
	private String hash;
	/**
	 * Description:Gets the  screenshot path 
	 * @author:Manikandan A
	 * @param screenShotPath
	 */
	public static String getScreenShotPath() {
		return screenShotPath;
	}
	/**
	 * Description:Sets the  screenshot path 
	 * @author:Manikandan A
	 * @param screenShotPath
	 */
	public void setScreenShotPath(String screenShotPath) {
		FileVariables.screenShotPath = screenShotPath;
	}

	/**
	 * Description:Gets start time
	 * @author:Manikandan A
	 * @return sStartTime
	 */

	public String getsStartTime() {
		return sStartTime;
	}
	/**
	 * Description:Sets the  start time 
	 * @author:Manikandan A
	 * @param sStartTime
	 */
	public void setsStartTime(String sStartTime) {
		this.sStartTime = sStartTime;
	}
	/**
	 * Description:Gets Extent report folder path
	 * @author:Manikandan A
	 * @return extentReportFolderPath
	 */
	public String getExtentReportFolderPath() {
		return extentReportFolderPath;
	}
	/**
	 * Description:Sets the  Extent report folder path 
	 * @author:Manikandan A
	 * @param extentReportFolderPath
	 */
	public void setExtentReportFolderPath(String extentReportFolderPath) {
		this.extentReportFolderPath = extentReportFolderPath;
	}
	/**
	 * Description:Gets Date
	 * @author:Manikandan A
	 * @return date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * Description:Sets the  date 
	 * @author:Manikandan A
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * Description:Gets simple date format
	 * @author:Manikandan A
	 * @return sdf
	 */
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	/**
	 * Description:Sets the simple date format
	 * @author:Manikandan A
	 * @param sdf
	 */
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}
	/**
	 * Description:Gets Date
	 * @author:Manikandan A
	 * @return sDate
	 */
	public String getsDate() {
		return sDate;
	}
	/**
	 * Description:Sets the date
	 * @author:Manikandan A
	 * @param sDate
	 */
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	/**
	 * Description:Gets Hash
	 * @author:Manikandan A
	 * @return hash
	 */
	public String getHash() {
		return hash;
	}
	/**
	 * Description Sets the hash
	 * @author:Manikandan A
	 * @param  hash
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	/**
	 * Description:Gets extent directory
	 * @author:Manikandan A
	 * @return extentDir
	 */
	public static String getExtentDir() {
		return extentDir;
	}
	/**
	 * Description:Sets extent dir
	 * @author:Manikandan A
	 * @param extentDir
	 */
	public void setExtentDir(String extentDir) {
		this.extentDir = extentDir;
	}
}
