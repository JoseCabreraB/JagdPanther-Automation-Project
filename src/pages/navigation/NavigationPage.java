package pages.navigation;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.RegisteredUser.RegisteredUserPage;
import pages.applicant.ApplicantPage;
import pages.period.PeriodPage;
import pages.program.ProgramPage;
import pages.stage.StagePage;
import webdriver.SeleniumDriverManager;
/**
 * @title  NavigationPage
 * @author Jose Cabrera
 * @description Is the navigation bar that have the links to all pages of JagdPanther
 */
public class NavigationPage {
	
	WebDriver driver;
	
	@FindBy(linkText="Programas")
	WebElement programsLink;
	
	@FindBy(linkText="Periodos")
	WebElement periodsLink;
	
	@FindBy(linkText="Postulantes")
	WebElement applicantsLink;
	
	@FindBy(linkText="Etapas")
	WebElement stagesLink;
	
	@FindBy(linkText="Usuarios de Sistema Registrados")
	WebElement registeredUsersLink;
	
	public NavigationPage(){
		driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	public ProgramPage SelectPrograms()
	{
		programsLink.click();
		return new ProgramPage(); 
	}
	public PeriodPage SelectPeriods()
	{
		periodsLink.click();
		return new PeriodPage(); 
	}

	public ApplicantPage SelectApplicants()
	{
		applicantsLink.click();
		return new ApplicantPage(); 
	}
	
	public StagePage SelectStages()
	{
		stagesLink.click();
		return new StagePage(); 
	}
	public RegisteredUserPage SelectRegisteredUsers()
	{
		registeredUsersLink.click();
		return new RegisteredUserPage(); 
	}
	
}
