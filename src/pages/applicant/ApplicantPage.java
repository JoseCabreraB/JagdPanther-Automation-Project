package pages.applicant;
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
 * @title  ApplicantPage
 * @author Jose Cabrera
 * @description Is the page that contains information about applicants in a table 	
 */
public class ApplicantPage {
		WebDriver driver;
		@FindBy(id="j_id_t:applicants:0:j_id_1g")
		WebElement applicantsaction;
		
		public ApplicantPage(){
			this.driver=SeleniumDriverManager.getManager().getDriver();
			PageFactory.initElements(driver, this);
		}

		public Boolean isActionEnabled(){
			return applicantsaction.isDisplayed();
		}
}
