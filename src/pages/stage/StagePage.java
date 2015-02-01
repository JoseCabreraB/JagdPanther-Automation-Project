package pages.stage;
/**Created by Jose Cabrera
 * 1/24/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver.SeleniumDriverManager;
/**
 * @title  StagePage
 * @author Jose Cabrera
 * @description Is the page that contains information about Stages in a table
 */
public class StagePage {
	WebDriver driver;
	@FindBy(id="j_id_t:j_id_10")
	WebElement createStage;
	@FindBy(id="j_id_t:stages_data")
	WebElement tableStage;
	public StagePage(){
		driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	public CreateStagePage clickAddNewStagelink()
	{
		createStage.click();
		return new CreateStagePage();
	}
	
	public Boolean isNameinTable(String test){
		return test.contains(test);
	}
	
}
