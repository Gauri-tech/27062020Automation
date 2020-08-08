package testNGAttributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	@Test(dataProvider="getData")
	public void login(String userName, String password) {
		System.out.println("enter user name="+userName);

		System.out.println("enter password="+password);
		System.out.println("click on login button ");
	
	System.out.println("***************");
	}
@DataProvider
	public String[][] getData() 
	{
		String[][] data = new String[3][2];

//row1
		data[0][0] = "user1";
		data[0][1] = "Password1";
//row2
		data[1][0] = "user2";
		data[1][1] = "Password2";

//row3
		data[2][0] = "user3";
		data[2][1] = "Password3";
	return data;
	
	}

}
