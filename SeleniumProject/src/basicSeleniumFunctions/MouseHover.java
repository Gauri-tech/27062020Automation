package basicSeleniumFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		
	dr.manage().window().maximize();
		
		dr.get("https://www.flipkart.com/");
	
	// implicit wait impli
		dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
	Actions act=new Actions(dr);
	act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
	// eXPLICIT WAIT
	WebDriverWait wait=new WebDriverWait(dr,5);
	wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='T-Shirts']")))).click();
	
	//dr.findElement(By.xpath("//a[text()='T-Shirts']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));		
	act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();				
	boolean f=dr.findElement(By.xpath("//input[@class='_3uUUD5']")).isSelected();
	}

}
