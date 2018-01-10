package demo;

//MODIFY and COMPLETE

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTC {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.ie.driver", "C:\\WebDrivers\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");

		//WebDriver driver = new InternetExplorerDriver();

		//driver.get("http://www.google.com");

		//WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");

		//driver.get("https://www.facebook.com/");

		// driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

		// driver.findElement(By.name("pass")).sendKeys("password");

		// driver.findElement(By.linkText("Messenger")).click();
	}

}
