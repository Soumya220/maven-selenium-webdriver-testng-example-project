package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\soumyade\\eclipse-workspace\\ChromeDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
