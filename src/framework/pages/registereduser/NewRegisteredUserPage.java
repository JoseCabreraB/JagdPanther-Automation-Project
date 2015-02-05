package framework.pages.registereduser;

/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.pages.registereduser.NewRegisteredUserPage;
import framework.pages.registereduser.RegisteredUserPage;
import framework.webdriver.SeleniumDriverManager;

/**
 * @title  CreateRegisteredUserPage
 * @author Jose Cabrera
 * @description Is the page that is used for create Registered Users
 */
public class NewRegisteredUserPage  {

	public WebDriver driver;
	public WebDriverWait wait; 

	@FindBy(id = "j_id_t:inputCi")
	WebElement txtCI;

	@FindBy(id = "j_id_t:inputName")
	WebElement txtName;

	@FindBy(id = "j_id_t:inputLastName")
	WebElement txtLastName;

	@FindBy(id = "j_id_t:inputEmail")
	WebElement txtEmail;

	@FindBy(id = "j_id_t:j_id_1d")
	WebElement createButton;

	public NewRegisteredUserPage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}

	public RegisteredUserPage createButton(){
		createButton.click();
		return new RegisteredUserPage();
	}

	public void setCI(String ci){

		txtCI.sendKeys(ci);
	}

	public void setName(String name){
		txtName.sendKeys(name);
	}

	public void setLastName(String lastName){
		txtLastName.sendKeys(lastName);
	}

	public void setEmail(String emails){
		txtEmail.sendKeys(emails);
	}

	public RegisteredUserPage create(String ci, String name, String lastName,String email){
		setCI(ci);
		setName(name);
		setLastName(lastName);
		setEmail(email);
		return createButton();			
	}
}