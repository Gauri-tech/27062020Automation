package basicSeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
  // set chrome driver
		
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	
dr.manage().window().maximize();
	
	dr.get("http://sampleapp.tricentis.com/101/");
	
	//dr.close(); // close only the window which is open, close only the window which are open frm the code.
	
	
	//dr.quit(); // closes all the window which are open
	
	//dr.findElement(By.id("nav_automobile")).click();
	WebElement ele=dr.findElement(By.id("nav_automobile"));
	
	String data=ele.getText();
	System.out.println(data);
	
	ele.click();
	// enter text 
	
	//dr.findElement(By.id("search_form")).sendKeys("VW");
	//dr.findElement(By.id("search_form")).sendKeys(Keys.ENTER);
	
	  WebElement makeDropDown = dr.findElement(By.name("Make")); 
	  Select sel= new Select(makeDropDown); 
	  sel.selectByIndex(4);
	  Thread.sleep(3000);
	  sel.selectByValue("Ford");
	 Thread.sleep(3000);
	  sel.selectByVisibleText("Mercedes Benz");
	  
	  dr.findElement(By.id("dateofmanufacture")).sendKeys("12/31/2010");
	  
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
	   
	   //dr.findElement(By.xpath("//label[text()='Female']/span")).click();
	   
	  // click radio button
	   WebElement check=dr.findElement(By.xpath("//label[contains(., 'Bungee Jumping')]/span"));
	boolean isSelected=check.isSelected();
	System.out.println(isSelected);
	check.click();
	isSelected=check.isSelected();
	System.out.println(isSelected);
	
	   
	   
	   
	}

}
