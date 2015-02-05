package framework.pages.navigation;

/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.pages.applicant.ApplicantPage;
import framework.pages.period.PeriodPage;
import framework.pages.program.ProgramPage;
import framework.pages.registereduser.RegisteredUserPage;
import framework.pages.stage.StagePage;
import framework.webdriver.SeleniumDriverManager;

/**
 * @title  NavigationPage
 * @author Jose Cabrera
 * @description Is the navigation bar that have the links to all pages of JagdPanther
 */
public class NavigationPage {

	WebDriver driver;

	@FindBy(linkText = "Programas")
	WebElement programsLink;

	@FindBy(linkText = "Periodos")
	WebElement periodsLink;

	@FindBy(linkText = "Postulantes")
	WebElement applicantsLink;

	@FindBy(linkText = "Etapas")
	WebElement stagesLink;

	@FindBy(linkText = "Usuarios de Sistema Registrados")
	WebElement registeredUsersLink;

	public NavigationPage(){
		driver = SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}

	public ProgramPage clickProgramsLink() {
		programsLink.click();
		return new ProgramPage(); 
	}

	public PeriodPage clickPeriodsLink() {
		periodsLink.click();
		return new PeriodPage(); 
	}

	public ApplicantPage clickApplicantsLink() {
		applicantsLink.click();
		return new ApplicantPage(); 
	}

	public StagePage clickStagesLink() {
		stagesLink.click();
		return new StagePage(); 
	}

	public RegisteredUserPage clickRegisteredUsersLink() {
		registeredUsersLink.click();
		return new RegisteredUserPage(); 
	}

}
