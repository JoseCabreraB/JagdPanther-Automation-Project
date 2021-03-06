package pages.program;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.program.NewProgramPage;

import webdriver.SeleniumDriverManager;
/**
 * @title  ProgramPage
 * @author Jose Cabrera
 * @description Is the page that contains information about programs in a table
 */
public class ProgramPage {
	
	WebDriver driver;
	
	@FindBy(id="j_id_y:j_id_1a")
	WebElement addnewprogramlink;
	
	@FindBy(id="j_id_t:nameInput_display")
	WebElement nameprogram;
	
	public ProgramPage(){
		this.driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public NewProgramPage clickAddNewProgramLink()
	{
		addnewprogramlink.click();
		return new NewProgramPage(driver);
	}
	
	public Boolean isNameEnabled(String test){
		return nameprogram.isDisplayed();
	}
	
}
