package pages.stage;
/**Created by Jose Cabrera
 * 1/24/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.SeleniumDriverManager;
/**
 * @title  CreateStagePage
 * @author Jose Cabrera
 * @description Is the page that is used for create Stages
 */
public class CreateStagePage {
	public WebDriver driver;
	public WebDriverWait wait; 
		@FindBy(id="form:inputName")
		WebElement name;
		@FindBy(id="form:inputTitle")
		WebElement tittle;
		@FindBy(id="form:inputDescription")
		WebElement description;
		@FindBy(id="form:j_id_1k")
		WebElement createButton;
	public CreateStagePage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public CreateStagePage createButton(){
		createButton.click();
		return this;
	}
	public CreateStagePage setname(String message){
		
		name.sendKeys(message);
		return this;
	}
	public CreateStagePage settittle(String message){
		tittle.sendKeys(message);
		return this;
	}
	public CreateStagePage setDescription(String message){
		description.sendKeys(message);
		return this;
	}
	public StagePage create(String Name, String Tittle,String Description){
		this
			.setname(Name)
			.settittle(Tittle)
			.setDescription(Description)
			.createButton();			
		return new StagePage();
	}
}
