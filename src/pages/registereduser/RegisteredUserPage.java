package pages.registereduser;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver.SeleniumDriverManager;
/**
 * @title  RegisteredUserPage
 * @author Jose Cabrera
 * @description Is the page that contains information about Registered Users in a table
 */
public class RegisteredUserPage {
	
	WebDriver driver;
	
	@FindBy(id="j_id_t:j_id_16")
	WebElement createRegisteredUser;
	
	@FindBy(id="j_id_t:AllUserTable_data")
	WebElement usersTable;
	
	public RegisteredUserPage(){
		this.driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public NewRegisteredUserPage clickAddNewRegisteredUserlink()
	{
		createRegisteredUser.click();
		return new NewRegisteredUserPage();
	}
	
	public Boolean addIsEnabled(){
		return createRegisteredUser.isEnabled();
	}
	
	public Boolean isNameinTable(String test){
		return usersTable.getText().contains(test);
	}
}
