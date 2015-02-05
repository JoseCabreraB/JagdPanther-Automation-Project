package framework.pages.program;

/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.pages.NewFormStageorProgram;

import framework.webdriver.SeleniumDriverManager;

/**
 * @title  CreateProgramPage
 * @author Jose Cabrera
 * @description Is the page that is used for create Programs
 */
public class NewProgramPage extends NewFormStageorProgram {
	public WebDriver driver;
	public WebDriverWait wait; 

	@FindBy(id = "form:j_id_18")
	WebElement createbutton;

	public NewProgramPage(WebDriver driver) {
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}

	public ProgramPage clickCreateButton(){
		createbutton.click();
		return new ProgramPage();
	}

	public ProgramPage createProgram(String name, String title, String description){
		setName(name);
		setTitle(title);
		setDescription(description);
		return clickCreateButton();
	}
}
