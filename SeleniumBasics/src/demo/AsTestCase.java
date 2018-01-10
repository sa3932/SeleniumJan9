package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AsTestCase {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); // Open the browser omsrisaibabaji amma CODE WORKS

		driver.get("https://www.facebook.com/"); // Navigating to Facebook.com

		driver.manage().window().maximize(); // Maximizes the window

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Implicit wait of 30 seconds
																		

		driver.findElement(By.id("email")).sendKeys("abc@gmail.com"); // Entering username														

		driver.findElement(By.name("pass")).sendKeys("password"); // Entering password																

		driver.findElement(By.id("loginbutton")).click();

		String expectedMessage = "The password you’ve entered is incorrect. Forgot Password?";

 String actualMessage = driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText();
 
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Test case Passed");
		}

		else {
			System.out.println("Test case Failed");
		}

	}

}
