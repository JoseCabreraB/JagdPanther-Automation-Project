package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginLikeAnAdministrator {

	public LoginPage loginPage = new LoginPage();
	
	@Test (priority = 0)
	public void testVerifyLogin() {
		loginPage.login("admin@admin.com","admin11");
		Assert.assertTrue(loginPage.getResult());
		loginPage.quit();
	}
	
		
}
