package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DifferentBrowser {

	public static void main(String[] args) {
		
		// Opening Internet Explorer Browser  DOES NOT WORK
		
		//System.setProperty("webdriver.ie.driver", "C:\\WebDrivers\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplo/rerDriver();
	        //driver.get("https://www.facebook.com/");
	        //driver.get("https://gmail.com/");

		// Opening Chrome Browser  WORKS

	    System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    //driver.get("https://www.facebook.com/");
	    driver.get("https://gmail.com/");

		// Opening Firefox Browser

	 	//WebDriver driver = new FirefoxDriver();
	        //driver.get("https://www.facebook.com/");
	        //driver.get("https://gmail.com/");


	}

}
