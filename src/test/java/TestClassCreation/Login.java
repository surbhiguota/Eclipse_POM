package TestClassCreation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestPage.DashboardClass;
import TestPage.Signup_;

public class Login {
	@Test
	public void LogintestPOM() {
		WebDriver driver;
		driver=utilities.DriverFactory.open();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	//Enter login info
	   Signup_ Signup_ =new  Signup_(driver);	    
	   Signup_.setusername("surbhigupta.tayal@gmail.com");
	   Signup_.clickcontinuebutton();
	   Signup_.setpassword("Surbhi@123");
	   Signup_.clicksigninbutton();
		    	
	//   Dashboard page
   	DashboardClass dashboard=new DashboardClass(driver);
   	 String Config=dashboard.confirmationmsg();
   	 System.out.println(Config);
   	 Assert.assertTrue(Config.contains("urbh"));
   	 
   	 driver.quit();
		
		
		
	}

}
