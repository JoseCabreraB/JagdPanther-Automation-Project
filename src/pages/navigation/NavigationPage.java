package pages.navigation;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.applicant.ApplicantPage;
import pages.period.PeriodPage;
import pages.program.ProgramPage;
import pages.registereduser.RegisteredUserPage;
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
	WebElement programslink;
	
	@FindBy(linkText="Periodos")
	WebElement periodslink;
	
	@FindBy(linkText="Postulantes")
	WebElement applicantslink;
	
	@FindBy(linkText="Etapas")
	WebElement stageslink;
	
	@FindBy(linkText="Usuarios de Sistema Registrados")
	WebElement registereduserslink;
	
	public NavigationPage(){
		driver=SeleniumDriverManager.getManager().getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public ProgramPage SelectPrograms()
	{
		programslink.click();
		return new ProgramPage(); 
	}
	
	public PeriodPage SelectPeriods()
	{
		periodslink.click();
		return new PeriodPage(); 
	}

	public ApplicantPage SelectApplicants()
	{
		applicantslink.click();
		return new ApplicantPage(); 
	}
	
	public StagePage SelectStages()
	{
		stageslink.click();
		return new StagePage(); 
	}
	
	public RegisteredUserPage SelectRegisteredUsers()
	{
		registereduserslink.click();
		return new RegisteredUserPage(); 
	}
	
}
