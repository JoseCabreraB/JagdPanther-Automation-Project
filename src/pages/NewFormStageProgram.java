package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewFormStageProgram {
	
	@FindBy(id="form:inputName")
	protected WebElement name;
	
	@FindBy(id="form:inputTitle")
	protected WebElement tittle;
	
	@FindBy(id="form:inputDescription")
	protected WebElement description;
	

	public void setname(String message){
		
		name.sendKeys(message);
	}
	
	public void settittle(String message){
		tittle.sendKeys(message);
	}
	
	public void setDescription(String message){
		description.sendKeys(message);
	}
	
}
