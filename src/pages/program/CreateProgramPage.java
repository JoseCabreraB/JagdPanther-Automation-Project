package pages.program;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.SeleniumDriverManager;
/**
 * @title  CreateProgramPage
 * @author Jose Cabrera
 * @description Is the page that is used for create Programs
 */
public class CreateProgramPage {
	public WebDriver driver;
	public WebDriverWait wait; 
		@FindBy(id="form:inputName")
		WebElement name;
		@FindBy(id="form:inputTitle")
		WebElement tittle;
		@FindBy(id="form:j_id_18")
		WebElement createButton;
	public CreateProgramPage(WebDriver driver){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public ProgramPage clickCreateButton(){
		createButton.click();
		return new ProgramPage();
	}
	public CreateProgramPage setname(String message){
		
		name.sendKeys(message);
		return this;
	}
	public CreateProgramPage settittle(String message){
		tittle.sendKeys(message);
		return this;
	}
	public ProgramPage create(String Name, String Tittle){
		this
			.setname(Name)
			.settittle(Tittle);
			return clickCreateButton();
	}
}
