package TestPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup_ {
	WebDriver driver;
	

	public void setusername(String Username) {
		 driver.findElement(By.id("ap_email")).sendKeys(Username);
	 }
	 
	 public void clickcontinuebutton() {
		 driver.findElement(By.id("continue")).click();
	 }
	 
	 public void setpassword(String Password) {
		 driver.findElement(By.id("ap_password")).sendKeys(Password);
	 }

	 public void clicksigninbutton() {
		 driver.findElement(By.id("signInSubmit")).click();
	 }

	 
	 public Signup_(WebDriver driver) {
		 this.driver=driver;
		 
	
}
}

