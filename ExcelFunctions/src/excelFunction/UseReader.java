package excelFunction;

import java.io.IOException;

public class UseReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	Xls_Reader xl=new Xls_Reader();
	String path = "E:\\27062020\\27062020Automation\\ExcelFunctions\\src\\excelFunction\\Testdata.xlsx";
	
	String data=xl.getCellData(path, "Sheet1", 0, 0);
	System.out.println(data);
	}

}
