package excelFunction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	
	String path;
	public Xls_Reader (String path)
	{ 
		this.path=path;
	}
	
	// path is contanst through out the function
	public String getCellData(String sheetName, int rowNum, int colNum) throws IOException {

		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheet(sheetName);

		int rows = sheet.getPhysicalNumberOfRows();

// int rows=sheet.getLastRowNum();

		System.out.println(rows);

// System.out.println(sheet.getPhysicalNumberOfRows());

		XSSFRow row = sheet.getRow(rowNum);
		int cols = row.getLastCellNum();
		System.out.println(cols);

		XSSFCell cell = row.getCell(colNum);

		String data = cell.getStringCellValue();
		//System.out.println(data);
		return data;
	}
}