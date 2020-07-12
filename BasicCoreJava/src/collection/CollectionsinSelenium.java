package collection;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionsinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver dr=new ChromeDriver();
		
		//list in Selenium
		List<WebElement> element=dr.findElements(By.xpath(""));
		
		//set in selenium
		Set<String> wins=dr.getWindowHandles();
		
		
	}
	
}
