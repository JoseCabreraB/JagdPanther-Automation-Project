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

import pages.NewFormStageorProgram;

import webdriver.SeleniumDriverManager;
/**
 * @title  CreateStagePage
 * @author Jose Cabrera
 * @description Is the page that is used for create Stages
 */
public class NewStagePage extends NewFormStageorProgram {
	
	public WebDriver driver;
	
	public WebDriverWait wait;
	
		@FindBy(id="form:j_id_1k")
		WebElement createButton;
		
	public NewStagePage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public StagePage createButton(){
		createButton.click();
		return new StagePage();
	}
	
	public StagePage create(String Name, String Tittle,String Description){
			setname(Name);
			settittle(Tittle);
			setDescription(Description);
			return createButton();
	}
}
