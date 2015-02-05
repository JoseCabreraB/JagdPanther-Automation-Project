package test;
/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.LoginPage;
/**
 * @title  LoginLikeAnAdministrator
 * @author Jose Cabrera
 * @description Is the page that contains information about Test that verify the login successfully
 */
public class LoginLikeAnAdministrator {

	public LoginPage loginPage = new LoginPage();

	@Test (priority = 0)
	public void testVerifyLogin() {
		loginPage.login("admin@admin.com","admin11");
		Assert.assertTrue(loginPage.getResult());
		loginPage.quit();
	}


}
