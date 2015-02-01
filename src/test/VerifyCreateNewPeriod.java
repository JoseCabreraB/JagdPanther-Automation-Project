package test;
/**Created by Jose Cabrera
 * 1/26/15
 * 
 */
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.navigation.NavigationPage;
import utils.Randoms;
/**
 * @title  SeeApplicants
 * @author Jose Cabrera
 * @description Is the page that contains information about 
 * Test that verify if a Period is created correctly
 */
public class VerifyCreateNewPeriod {

	public LoginPage loginPage = new LoginPage();
	public NavigationPage navigationPage;
	public Randoms ran=new Randoms();
	String name=ran.generateRandomString();
	
	@Test
	public void createNewPeriod() {
		
		navigationPage.SelectPeriods();
		
	}
	
}
