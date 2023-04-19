package com.tyss.aajtak.testsuitegenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlSuite.FailurePolicy;
import org.testng.xml.XmlTest;

import com.tyss.aajtak.baseutil.BaseTest;

/**
 * Description :This class is used to generate TestNG.xml (anyname.xml)
 * dynamically which is used to drive all the TestNG classes.This reads
 * Controller.xlsx file which contains package name in a column and className in
 * another column named TestcaseId .Based on the status 'Yes'/'No' ,the
 * TestNG.xml will contain only those classes where status is 'Yes'. Note:We can
 * further customize according to the requirement like grouping by
 * test,include,exclude
 * 
 * @author : Manikandan A
 */
public class TestSuiteGenerator {

	static int testcnt = 0;

	public static void main(String[] args) {

		XmlSuite xmlSuite = new XmlSuite();
		xmlSuite.setConfigFailurePolicy(FailurePolicy.CONTINUE);
		Map<String, String> mpconfiginfo = getConfigInfo(System.getProperty("user.dir") + "/Controller.xlsx");
		xmlSuite.setName(mpconfiginfo.get("applicationName"));
		xmlSuite.addListener(mpconfiginfo.get("listenerAddress"));
		Map<String, String> mpconfiginfo1 = getConfigInfo1(System.getProperty("user.dir") + "/Controller.xlsx");
		/* To set parameter at suite level use below line */
		 xmlSuite.setParameters(mpconfiginfo1);
		XmlTest xmlTest = null;
		// xmlSuite.setParallel(ParallelMode.TESTS);
		xmlSuite.setThreadCount(1);
		String browserName = mpconfiginfo.get("browserName");
		addClasses(xmlSuite, xmlTest, browserName);
		TestNG testng = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(xmlSuite);
		testng.setXmlSuites(suites);
		try {
			Files.write(Paths.get(System.getProperty("user.dir") + "/TestSuite.xml"), xmlSuite.toXml().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Description: This method fetches the TestNG classes to be run from Excel
	 * sheet (Controller.xlsx) and adds it to TestSuite.xml
	 * 
	 * @author Sajal, Vikas
	 * @param xmlSuite
	 * @param xmlTest
	 * @param browserName
	 */
	private static void addClasses(XmlSuite xmlSuite, XmlTest xmlTest, String browserName) {
		xmlTest = new XmlTest(xmlSuite);
		xmlTest.setName("PROJECT_Test" + ++testcnt);
		xmlTest.setThreadCount(1);
//		xmlTest.addParameter("browserName", browserName);
		String classNames[] = getRunTestClasses(System.getProperty("user.dir") + "/Controller.xlsx");
		List<XmlClass> list = new ArrayList<XmlClass>();
		try {
			for (int i = 0; i < classNames.length; i++) {
				list.add(new XmlClass(Class.forName(classNames[i])));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		xmlTest.setXmlClasses(list);
	}

	/**
	 * Description: This method returns an array of String containing TestNG class
	 * names which are used for running in the TestSuite.xml
	 * 
	 * @author Sajal, Vikas
	 * @param strXlFilePath
	 */
	private static String[] getRunTestClasses(String strXlFilePath) {
		BaseTest.logger.info(strXlFilePath);
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			fis = new FileInputStream(new File(strXlFilePath));
			wb = (Workbook) WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh1 = wb.getSheet("PackageController");
		Sheet sh2 = wb.getSheet("TestController");
		ArrayList<String> lstClassNames = new ArrayList<String>();

		String[] strClassNames = null;

		if (sh1 != null) {
			int rowcnt_sh1 = sh1.getPhysicalNumberOfRows();
			for (int i = 1; i <= rowcnt_sh1; i++) {
				Row r_sh1 = null;
				r_sh1 = sh1.getRow(i);
				if (r_sh1 != null) {
					if (r_sh1.getCell(2).getStringCellValue().equalsIgnoreCase("yes")) {
						String flowName = r_sh1.getCell(1).getStringCellValue();

						if (sh2 != null) {
							int rowcnt_sh2 = sh2.getPhysicalNumberOfRows();

							for (int j = 1; j <= rowcnt_sh2; j++) {
								Row r_sh2 = null;
								r_sh2 = sh2.getRow(j);
								String flowNameSheet2 = null;

								if (r_sh2 != null) {
									String pkgName = r_sh2.getCell(1).getStringCellValue();
									// System.out.println(pkgName);
									String[] pkNameSplit = pkgName.split("[.]");
									flowNameSheet2 = pkNameSplit[3];
									if (flowName.equals(flowNameSheet2)
											&& r_sh2.getCell(3).getStringCellValue().equalsIgnoreCase("yes")) {
										lstClassNames.add(r_sh2.getCell(1).getStringCellValue() + "."
												+ r_sh2.getCell(2).getStringCellValue());
									}
								}
							}
						}
					}
				}
			}
		}
		try {
			wb.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		strClassNames = new String[lstClassNames.size()];
		for (int k = 0; k < lstClassNames.size(); k++) {
			strClassNames[k] = lstClassNames.get(k);
			BaseTest.logger.info(strClassNames[k]);
		}
		BaseTest.logger.info("Total Scripts for Execution : " + strClassNames.length);
		return strClassNames;
	}

	/**
	 * Description: This method returns LinkeHashMap containing information of
	 * parallel ,thread count,browser count read from Controller.xlsx
	 * 
	 * @author Sajal, Vikas
	 * @param filepath
	 */
	private static Map<String, String> getConfigInfo(String filepath) {
		LinkedHashMap<String, String> configinfo = new LinkedHashMap<String, String>();
		try {
			FileInputStream fis = new FileInputStream(new File(filepath));
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Configuration");
			Row r = null;
			for (int i = 1; i <= 4; i++) {
				r = sh.getRow(i);
				if (r != null) {
					Cell cell = r.getCell(1);
					CellType celltype = cell.getCellTypeEnum();
					if (celltype == CellType.NUMERIC) {
						configinfo.put(r.getCell(0).getStringCellValue(),
								Integer.toString((int) cell.getNumericCellValue()));
					} else if (celltype == CellType.STRING) {
						configinfo.put(r.getCell(0).getStringCellValue(), cell.getStringCellValue());
					}
				}
			}
			fis.close();
			wb.close();
		} catch (Exception e) {
		}
		return configinfo;
	}
	
	/**
	 * Description: This method returns LinkeHashMap containing information of
	 * parallel ,thread count,browser count read from Controller.xlsx
	 * 
	 * @author Sajal, Vikas
	 * @param filepath
	 */
	private static Map<String, String> getConfigInfo1(String filepath) {
		LinkedHashMap<String, String> configinfo = new LinkedHashMap<String, String>();
		try {
			FileInputStream fis = new FileInputStream(new File(filepath));
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Configuration");
			Row r = null;
			for (int i = 1; i <= 1; i++) {
				r = sh.getRow(i);
				if (r != null) {
					Cell cell = r.getCell(1);
					CellType celltype = cell.getCellTypeEnum();
					if (celltype == CellType.NUMERIC) {
						configinfo.put(r.getCell(0).getStringCellValue(),
								Integer.toString((int) cell.getNumericCellValue()));
					} else if (celltype == CellType.STRING) {
						configinfo.put(r.getCell(0).getStringCellValue(), cell.getStringCellValue());
					}
				}
			}
			fis.close();
			wb.close();
		} catch (Exception e) {
		}
		return configinfo;
	}

}
