package com.tyss.aajtak.commonutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.tyss.aajtak.baseutil.BaseTest;

/**
 * Description: Implements generic methods to perform operations on Excel
 * Workbook.
 * 
 * @author: Manikandan A
 */
public class ExcelUtil {
	/* Private constructor */
	private ExcelUtil() {

	}

	/**
	 * Description:Fetches the Data from Row using Fillo query. 
	 * 
	 * @author:Manikandan A
	 * @param xlPath
	 * @param sql
	 */
	public static synchronized String[][] getRowDataFromExcelUsingFillo(String xlPath, String sql) {

		Fillo fillo = new Fillo();
		String[][] tableValues = null;
		Connection connection;
		try {
			connection = fillo.getConnection(xlPath);
			Recordset recordset = connection.executeQuery(sql);
			ArrayList<String> lstFieldNames = recordset.getFieldNames();

			tableValues = new String[recordset.getCount()][lstFieldNames.size()];

			int rowno = 0;

			while (recordset.next()) {

				int colno = 0;

				for (String fieldName : lstFieldNames) {
					tableValues[rowno][colno++] = recordset.getField(fieldName);

				}
				rowno++;
			}
			recordset.close();
			connection.close();
		} catch (FilloException e) {
			System.out.println("Fillo exception");
			e.printStackTrace();
		}

		return tableValues;
	}

	/**
	 * Description:Fetches the row count in the specified sheet
	 * 
	 * @author:Manikandan A
	 * @param sPath
	 * @param sSheet
	 */
	public static synchronized int getRowCount(String sPath, String sSheet) {
		int iRowNum = 0;
		try {
			FileInputStream fis = new FileInputStream(sPath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			iRowNum = sht.getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iRowNum;
	}

	/**
	 * Description:Fetches the column count in the specified sheet
	 * 
	 * @author:Manikandan A
	 * @param sSheet
	 * @parm sPath
	 */
	public static synchronized int getColumnCount(String sPath, String sSheet) {
		int colnum = 0;
		try {
			FileInputStream fis = new FileInputStream(sPath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			colnum = sht.getRow(0).getPhysicalNumberOfCells();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return colnum;
	}

	/**
	 * Description : Fetches the specified row data from the Excel sheet
	 * 
	 * @author:Manikandan A
	 * @param sFilePath
	 * @param sSheet
	 * @param rowNo
	 */
	public static synchronized String[] getRowData(String sFilePath, String sSheet, int rowNo) {
		DataFormatter dataFormatter = new DataFormatter();
		String sData[] = null;
		try {
			FileInputStream fis = new FileInputStream(sFilePath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			int iCellNum = sht.getRow(rowNo).getPhysicalNumberOfCells();
			sData = new String[iCellNum];
			for (int j = 0; j < iCellNum; j++) {
				Cell cell = sht.getRow(rowNo).getCell(j);
				sData[j] = dataFormatter.formatCellValue(cell);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return sData;
	}

	/**
	 * Description: Set the value into specified cell
	 * 
	 * @author Manikandan A
	 * @param xlpath
	 * @param sheetName
	 * @param rowNo
	 * @param columnNo
	 * @param value
	 */
	public static synchronized void writeDataIntoExcel(String xlpath, String sheetName, int rowNo, int columnNo,
			String value) {
		try {
			FileInputStream input = new FileInputStream(xlpath);
			XSSFWorkbook wb = new XSSFWorkbook(input);
			XSSFSheet sh = wb.getSheet(sheetName);
			XSSFRow row = sh.getRow(rowNo);
			row.createCell(columnNo).setCellValue(value);
			FileOutputStream fos = new FileOutputStream(xlpath);
			wb.write(fos);
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Description:Fetches the data from the specified cell
	 * 
	 * @author:Manikandan A
	 * @param xlPAth
	 * @param sheetName
	 * @param rowNo
	 * @param colNo
	 */
	public static synchronized String getCellData(String xlPAth, String sheetName, int rowNo, int colNo) {
		DataFormatter dataFormatter = new DataFormatter();

		int iRowNum = 0;
		String data = null;
		try {
			FileInputStream fis = new FileInputStream(xlPAth);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sheetName);
			iRowNum = sht.getLastRowNum();
			if (rowNo <= iRowNum) {
				Cell cell = sht.getRow(rowNo).getCell(colNo);
				data = dataFormatter.formatCellValue(cell);
			} else {
				BaseTest.logger.info("Please provide the valid row count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}