package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
public WebDriver driver;

	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement DashboardPageTitle;
	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement LogoutBtn;
	
	@FindBy(xpath = "//i[@class=\"nav-icon fas fa-book\"]")
	WebElement CatalogLink;
	
	@FindBy(xpath = "//a[@href=\"/Admin/Product/List\"]")
	WebElement productLink;
	
	@FindBy(xpath = "href=\"/Admin/Category/List\"")
	WebElement CategoriesLink;
	
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void logoutFunction() {
		LogoutBtn.click();
	}
	
	public String verifyPageTitle() {
	String	data=DashboardPageTitle.getText();
	return data;
	}
	
	public void verifyProductsLink() throws InterruptedException {
		CatalogLink.click();
		Thread.sleep(2000);
		productLink.click();
	}
	public void verifycategorieLink() throws InterruptedException {
		CatalogLink.click();
		Thread.sleep(2000);
		CategoriesLink.click();
	}
	
	
	
	
	
}
