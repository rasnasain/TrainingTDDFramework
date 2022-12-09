package com.training.util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	@DataProvider
	public Object[][] getData(String sheetName) throws Throwable {
		String filePath = "./src/test/resources/TestData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet(sheetName);

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowCount-1][colCount];

		for (int row = 1; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
				data[row-1][col] = sheet.getRow(row).getCell(col).getStringCellValue();
				System.out.println(data);
			}
		}
		return data;
	}
}
