package test;

/**Created by Jose Cabrera
 * 1/26/15
 * 
 */
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.navigation.NavigationPage;
import framework.pages.registereduser.RegisteredUserPage;
import framework.utils.Randoms;

/**
 * @title  SeeApplicants
 * @author Jose Cabrera
 * @description Is the page that contains information about 
 * Test that verify if the Registered Users page contain the Registered Users in the table correctly
 */
public class SeeRegisteredUsers {

	public NavigationPage navigationPage = new NavigationPage();
	public Randoms ran = new Randoms();
	String name = ran.generateRandomString();
	@Test
	public void SeeUsers() {
		RegisteredUserPage registeredUser = navigationPage.clickRegisteredUsersLink();
		Assert.
		assertTrue(registeredUser.addIsEnabled());
	}

}
