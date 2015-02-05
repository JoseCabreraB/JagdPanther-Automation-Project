package pages;
/**Created by Jose Cabrera
 * 2/4/15
 * 
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @title  NewFromStageProgramPage
 * @author Jose Cabrera
 * @description Is the page that is used for create Registered Users
 */

public class NewFormStageorProgram {
	
	@FindBy(id="form:inputName")
	protected WebElement name;
	
	@FindBy(id="form:inputTitle")
	protected WebElement tittle;
	
	@FindBy(id="form:inputDescription")
	protected WebElement description;
	

	public void setname(String names){
		
		name.sendKeys(names);
	}
	
	public void settittle(String tittles){
		tittle.sendKeys(tittles);
	}
	
	public void setDescription(String descriptions){
		description.sendKeys(descriptions);
	}
}
