package com.Book_lounge.genericUtility;
/**
 * @author : Nikitaba Parmar 
 * 
 */

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {
	/**
	 * Fetching data from Excel File
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcelFile(String sheet,int row,int cell) throws Exception {
		FileInputStream fis = new FileInputStream("filepath");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return data;
	}
	/**
	 * Fetching Row Count
	 * @param sheet
	 * @return
	 * @throws Exception
	 */
	public int getRowCount(String sheet) throws Exception {
		FileInputStream fis = new FileInputStream("filepath");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount= wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
}
