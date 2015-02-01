package test;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.navigation.NavigationPage;
import utils.Randoms;
/**
 * @title  RegisteredUserPage
 * @author Jose Cabrera
 * @description 	
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
