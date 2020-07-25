package excelFunction;

import java.io.IOException;

public class UseReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "E:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\Testdata.xlsx";
		Xls_Reader xl=new Xls_Reader(path);
	
	
	String data=xl.getCellData("Sheet1", 0, 0);
	System.out.println(data);
	}

}
