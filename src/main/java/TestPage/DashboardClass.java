package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardClass {
	WebDriver driver;
	

	public String confirmationmsg() {
		return driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
	}
	
	public DashboardClass(WebDriver driver) {
		this.driver=driver;
	}
	

}
