package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		test();
		test2();

		test3();
		test4();
//test5();
	}

	public static void test() throws FileNotFoundException {
		FileInputStream file = new FileInputStream(
				"E:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");

	}

	public static void test2() {
		try {
			FileInputStream file = new FileInputStream(
					"E:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void test3() throws ArithmeticException {

	}

	public static void test4() throws IOException {

	}
	/*public static void test5(int age)
	{
		if (age>=18)
		{
			System.out.println("you are eligible");
		}
		else
			{throw new Exception("Your age is below 18");
			}
	}*/
		
		
	}
	
	

