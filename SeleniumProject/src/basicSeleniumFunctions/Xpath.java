package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
	dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/");
		//WebElement ele=dr.findElement(By.xpath("//a[@id='nav_automobile']"));
		
		WebElement ele=dr.findElement(By.xpath("//a[text()='Automobile']"));
		
		
		String data=ele.getText();
		System.out.println(data);
		
		ele.click();
		
	
	
	}

}
