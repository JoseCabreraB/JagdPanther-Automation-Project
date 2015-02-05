package framework.pages;

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
public abstract class NewFormStageorProgram {
	@FindBy(id = "form:inputName")
	protected WebElement txtName;

	@FindBy(id = "form:inputTitle")
	protected WebElement txtTitle;

	@FindBy(id = "form:inputDescription")
	protected WebElement txtDescription;


	public void setName(String names){
		txtName.sendKeys(names);
	}

	public void setTitle(String tittle){
		txtTitle.sendKeys(tittle);
	}

	public void setDescription(String description){
		txtDescription.sendKeys(description);
	}
}
