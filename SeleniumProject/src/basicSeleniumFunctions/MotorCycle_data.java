package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MotorCycle_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/");
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		
		String data=ele.getText();
		System.out.println(data);
		
		ele.click();
	}

}
