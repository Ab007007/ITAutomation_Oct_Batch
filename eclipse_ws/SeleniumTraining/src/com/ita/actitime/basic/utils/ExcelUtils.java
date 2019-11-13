package com.ita.actitime.basic.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.javafx.iio.common.RoughScaler;

public class ExcelUtils {
	static String fileName = "data\\acittime-testdata.xls";
	static Workbook wb = null;
	
	public static Workbook getWorkBookObj() throws FileNotFoundException, IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);

		wb = WorkbookFactory.create(fis);
		return wb;
	}

	public static String getMyExcelValue(String sheetName,int rowNumber,int columnNum) throws FileNotFoundException, IOException
	{
		String cellValue = null;
		wb = getWorkBookObj();
		Sheet sh  = wb.getSheet(sheetName);
		Row row  = sh.getRow(rowNumber);
		Cell cell = row.getCell(columnNum);
		return cell.getStringCellValue();		
	}
	public static void printAllValuesOfExcel(String sheetName, FileInputStream fis, Workbook wb) throws IOException {
		Sheet sheet = wb.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum() + 1;

		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);

			System.out.println(cell.getCellType());
		}
		fis.close();
	}

	public static void printSheetNames(Workbook wb) {
		int totalSheets = wb.getNumberOfSheets();

		for (int i = 0; i < totalSheets; i++) {
			System.out.println(wb.getSheetName(i));
		}
	}


	public static int getRowCount(String sheetName) throws FileNotFoundException, IOException
	{
		wb= getWorkBookObj();
		Sheet sh = wb.getSheet(sheetName);
		return sh.getLastRowNum()+1;
	}





}
