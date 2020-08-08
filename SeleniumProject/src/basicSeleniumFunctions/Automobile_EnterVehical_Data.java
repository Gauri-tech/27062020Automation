package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automobile_EnterVehical_Data {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://sampleapp.tricentis.com/101/");
		WebElement ele=dr.findElement(By.id("nav_automobile"));
		
		String data=ele.getText();
		System.out.println(data);
		
		ele.click();
		
		
		
		//WebElement ele=dr.findElement(By.id("nav_truck"));
		//String data=ele.getText();
		//System.out.println(data);
		//dr.findElement(By.id("search_form")).sendKeys("truck");
		//dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
	
		WebElement makeDropDown = dr.findElement(By.name("Make")); 
		  Select sel= new Select(makeDropDown); 
		  sel.selectByIndex(4);
		  Thread.sleep(3000);
		  sel.selectByValue("Ford");
		 Thread.sleep(3000);
		  sel.selectByVisibleText("Mercedes Benz");
		  
		  dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");
		  
			/*
			 * WebElement fuelDropDown = dr.findElement(By.name("fuel")); Select fl= new
			 * Select(fuelDropDown); fl.selectByIndex(1);
			 */
		  dr.findElement(By.id("engineperformance")).sendKeys("1200");
		 
		  dr.findElement(By.id("listprice")).sendKeys("10000");
		  
		  dr.findElement(By.id("licenseplatenumber")).sendKeys("1111");
		  dr.findElement(By.id("numberofseats")).sendKeys("6");
		  
		  dr.findElement(By.id("annualmileage")).sendKeys("100");
		  
		   //dr.findElement(By.id("annualmileage")).sendKeys("100");
		   dr.findElement(By.id("nextenterinsurantdata")).click();
		   dr.findElement(By.id("firstname")).sendKeys("Gauri");
		   dr.findElement(By.id("lastname")).sendKeys("dab");
		   dr.findElement(By.id("birthdate")).sendKeys("08/10/2000");
		   //dr.findElement(By.className("ideal-radiocheck-label")).click();
		   
		   dr.findElement(By.xpath("//label[text()='Female']/span")).click();
		   
		   
		   
		   dr.findElement(By.id("streetaddress")).sendKeys("Pune");
		   WebElement countryDropDown = dr.findElement(By.name("Country")); 
		   Select cl= new Select(countryDropDown);
		   cl.selectByValue("India");
		   
		   dr.findElement(By.id("zipcode")).sendKeys("44000");		
		  
		   dr.findElement(By.id("city")).sendKeys("Pune");
		  
		   
		   WebElement makeDropDown1 = dr.findElement(By.name("country")); 
		   Select col= new Select(makeDropDown1);
		   col.selectByValue("India");
	}

}
