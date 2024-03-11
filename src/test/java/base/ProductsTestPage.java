package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageclasses.DashBoardPage;
import pageclasses.LoginPage;
import pageclasses.ProductsPage;

public class ProductsTestPage {
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
	public void TestSearchProduct() throws InterruptedException {
	      lp.performLogin("admin@yourstore.com","admin");
	      dp.verifyProductsLink();
	      pp.VerifySearchProduct("Asus N551JK-XO076H Laptop");
	}

}
