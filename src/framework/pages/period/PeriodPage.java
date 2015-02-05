package framework.pages.period;

/**Created by Jose Cabrera
 * 1/24/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import framework.webdriver.SeleniumDriverManager;

/**
 * @title  ApplicantPage
 * @author Jose Cabrera
 * @description Is the page that contains information about applicants in a table 	
 */
public class PeriodPage {
	WebDriver driver;

	public PeriodPage(){
		this.driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
}
