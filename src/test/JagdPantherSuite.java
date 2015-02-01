package test;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;
/**
 * @title  JagdPatherSuite
 * @author Jose Cabrera
 * @description Is the page that contains information about the before and AfterSuite  	
 */

public class JagdPantherSuite {
	public LoginPage loginPage = new LoginPage();
	@BeforeSuite
	public void init(){
		loginPage.login("admin@admin.com","admin11");
	}
	
	@AfterSuite
	public void quit(){
		loginPage.quit();
	}
}
