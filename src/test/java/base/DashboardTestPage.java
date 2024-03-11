package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageclasses.DashBoardPage;
import pageclasses.LoginPage;
import pageclasses.ProductsPage;

public class DashboardTestPage {
	
	public WebDriver driver;
	LoginPage lp;
	DashBoardPage dp;
	ProductsPage pp;
	
	@BeforeMethod
	public void launchBrowser() {
		 driver=new ChromeDriver();
		 driver.get("https://admin-demo.nopcommerce.com/login");	
		 lp=new LoginPage(driver);
		 dp=new DashBoardPage(driver);
		 pp=new ProductsPage(driver);
	}
	
	@Test
	public void ConfirmNaviagtedToDahboard() {
	String data	=dp.verifyPageTitle();
	String expectedData="Dashboard";
	Assert.assertEquals(data, expectedData);
	}
	
	@Test
	public void VerifyLogoutButton() {
		lp.performLogin("admin@yourstore.com", "admin");
		dp.logoutFunction();
	String 	Actualtext=lp.getPageTitle();
	String ExpectedText="Admin area demo";
	Assert.assertEquals(Actualtext, ExpectedText);
	}
	
	@Test
	public void TestProductLink() throws InterruptedException {
		lp.performLogin("admin@yourstore.com", "admin");
		dp.verifyProductsLink();
		String Expectedvalue="Products";
		Assert.assertEquals(pp.VerifyPageTitle(), Expectedvalue);		
	}
	

}
