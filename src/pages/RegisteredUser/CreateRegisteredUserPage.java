package pages.RegisteredUser;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.RegisteredUser.CreateRegisteredUserPage;
import pages.RegisteredUser.RegisteredUserPage;
import webdriver.SeleniumDriverManager;
/**
 * @title  CreateRegisteredUserPage
 * @author Jose Cabrera
 * @description Is the page that is used for create Registered Users
 */
public class CreateRegisteredUserPage  {
	public WebDriver driver;
	public WebDriverWait wait; 
		@FindBy(id="j_id_t:inputCi")
		WebElement ci;
		@FindBy(id="j_id_t:inputName")
		WebElement name;
		@FindBy(id="j_id_t:inputLastName")
		WebElement lastname;
		@FindBy(id="j_id_t:inputEmail")
		WebElement email;
		@FindBy(id="j_id_t:j_id_1d")
		WebElement createButton;
	public CreateRegisteredUserPage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public CreateRegisteredUserPage createButton(){
		createButton.click();
		return this;
	}
	public CreateRegisteredUserPage setci(String message){
		
		ci.sendKeys(message);
		return this;
	}
	public CreateRegisteredUserPage setname(String message){
		name.sendKeys(message);
		return this;
	}

	public CreateRegisteredUserPage setlastname(String message){
		lastname.sendKeys(message);
		return this;
	}
	public CreateRegisteredUserPage setemail(String message){
		email.sendKeys(message);
		return this;
	}
	public RegisteredUserPage create(String ci, String Name, String Lastname,String email){
		this
			.setci(ci)
			.setname(Name)
			.setlastname(Lastname)
			.setemail(email)
			.createButton();			
		return new RegisteredUserPage();
	}
}