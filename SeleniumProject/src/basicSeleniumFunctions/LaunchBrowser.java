package basicSeleniumFunctions;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // set chrome driver
		
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	
dr.get("https://www.google.com/search?q=google&rlz=1C1CHBD_enIN829IN829&oq=google&aqs=chrome..69i57j0l6j69i60.2727j0j8&sourceid=chrome&ie=UTF-8");
	}

}
