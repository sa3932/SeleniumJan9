package demo;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {	
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
}

}

	

