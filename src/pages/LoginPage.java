package pages;
/**Created by Jose Cabrera
 * 1/24/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.navigation.NavigationPage;
import webdriver.SeleniumDriverManager;
/**
 * @title  CreateStagePage
 * @author Jose Cabrera
 * @description Is the page that is used for login in the application
 */

public class LoginPage {

	protected WebDriver driver;
	protected WebDriverWait wait; 
	
		@FindBy(id="j_id_i:userName")
		WebElement user;
		
		@FindBy(id="j_id_i:password")
		WebElement pass;
		
		@FindBy(id="j_id_i:j_id_q")
		WebElement loginButton;
		
		@FindBy(id="j_id_d")
		WebElement closeSession;
		
	public LoginPage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		wait=SeleniumDriverManager.getManager().getWait();
    	PageFactory.initElements(driver, this);
		driver.get("http://localhost:8080/");
	}
	
	public LoginPage login(){
		loginButton.click();
		return this;
	}
	
	public LoginPage setuser(String message){
		
		user.sendKeys(message);
		return this;
	}
	
	public LoginPage setpass(String message){
		pass.sendKeys(message);
		return this;
	}
	
	public NavigationPage login(String username, String password){
		this
			.setuser(username)
			.setpass(password)
			.login();
			
		return new NavigationPage();
	}
	
	public Boolean getResult(){
		return closeSession.isEnabled();
	}
	
	public void quit()
	{
		driver.quit();
	}
}
