package base;


import Com.Testleaf.UI.Test.*;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel  {
	
	public static String[][] readData(String fileName, String sheetnam) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./TestData/"+fileName);
		XSSFSheet ws = wb.getSheet(sheetnam);
		int rowCount = ws.getLastRowNum();
		System.out.println(rowCount);
		int totalRowsCount = ws.getPhysicalNumberOfRows();
		System.out.println(totalRowsCount);

		// Get No. of Cells from Header
		int cellCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][cellCount];
		
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				String stringCellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=stringCellValue;

			}
		}

		// Close Excel Workbook
		wb.close();
		return data;

	}

}
