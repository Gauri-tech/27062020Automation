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
}
