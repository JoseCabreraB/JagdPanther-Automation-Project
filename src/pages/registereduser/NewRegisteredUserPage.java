package pages.registereduser;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.registereduser.NewRegisteredUserPage;
import pages.registereduser.RegisteredUserPage;

import webdriver.SeleniumDriverManager;
/**
 * @title  CreateRegisteredUserPage
 * @author Jose Cabrera
 * @description Is the page that is used for create Registered Users
 */
public class NewRegisteredUserPage  {
	
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
		WebElement createbutton;
		
	public NewRegisteredUserPage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public RegisteredUserPage createButton(){
		createbutton.click();
		return new RegisteredUserPage();
	}
	
	public void setci(String cis){
		
		ci.sendKeys(cis);
	}
	
	public void setname(String names){
		name.sendKeys(names);
	}

	public void setlastname(String lastnames){
		lastname.sendKeys(lastnames);
	}
	
	public void setemail(String emails){
		email.sendKeys(emails);
	}
	
	public RegisteredUserPage create(String ci, String Name, String Lastname,String email){
		setci(ci);
		setname(Name);
		setlastname(Lastname);
		setemail(email);
		return createButton();			
	}
}