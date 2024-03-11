package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageclasses.LoginPage;

public class LoginTestPage {
	public WebDriver driver;
	LoginPage lp;
	
	@BeforeMethod
	public void launchBrowser() {
		 driver=new ChromeDriver();
		 driver.get("https://admin-demo.nopcommerce.com/login");
			lp=new LoginPage(driver);
			
			
	}
	
	
	
	@Test
	public void verifyLoginPage() {
		  String actualvalue=  lp.getPageTitle();
		     String Expectedvalue="Admin";
		     Assert.assertEquals(actualvalue, Expectedvalue);
		     
	}
	
	@Test
	public void verifyLoginFunction() {
		
      lp.performLogin("admin@yourstore.com","admin");
     
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

}
