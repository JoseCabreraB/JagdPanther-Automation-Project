package pages.period;
/**Created by Jose Cabrera
 * 1/24/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import webdriver.SeleniumDriverManager;

public class PeriodPage {
	WebDriver driver;
	public PeriodPage(){
		this.driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
}
