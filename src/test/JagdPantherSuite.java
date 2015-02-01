package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;


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
