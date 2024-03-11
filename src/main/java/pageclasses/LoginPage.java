package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver driver;


	 @FindBy(id = "Email")
	 WebElement username;
	 
	 @FindBy(id="Password")
	 WebElement password;
	 
	 @FindBy(xpath = "//button[@type=\"submit\"]")
	 WebElement loginBtn;
	 
	 @FindBy(xpath = "//h1[contains(text(),'Admin area demo')]")
	 WebElement pageTitle;
	 
	 @FindBy(name = "RememberMe")
	 WebElement checkbox;
	 
	 public LoginPage(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements( driver, this); 
		
	 }
	 
	 public String getPageTitle() {
		     String actualvalue= pageTitle.getText();
		     return actualvalue;
	 }
	 
	 public void performLogin(String uname,String pwd) {
		 username.clear();
		 username.sendKeys(uname);
		 password.clear();
		 password.sendKeys(pwd);
		 loginBtn.click();
		 
	 }
	 
	 public void performCheckBoxOperation() {
		 checkbox.click();
		 
	 }
}
