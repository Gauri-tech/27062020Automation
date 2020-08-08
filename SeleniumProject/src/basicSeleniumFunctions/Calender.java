package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/");
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		ele.click();
		
		dr.findElement(By.name("Open Date of Manufacture Calender")).click();
		
		// Select Year 2019
		String year=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText();
		while(!year.equals("2019"))
			{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			
			dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='21']")).click();
			}
		String month=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		while(!month.equals("January"))
		{
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
			month=dr.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")).getText();
		}
		dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='21']")).click();
		
		
	}

}
