package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	public static WebDriver open() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surbhi.gupta\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		return new ChromeDriver();
	}

}
