package test;

/**Created by Jose Cabrera
 * 1/27/15
 * 
 */
import org.testng.Assert;
import org.testng.annotations.Test;

import framework.pages.navigation.NavigationPage;
import framework.pages.program.ProgramPage;
import framework.utils.Randoms;

/**
 * @title  SeeApplicants
 * @author Jose Cabrera
 * @description Is the page that contains information about 
 * Test that verify if a Program is created correctly
 */
public class VerifyCreateNewProgram {
	public NavigationPage navigationPage = new NavigationPage();
	public Randoms ran = new Randoms();
	String name = ran.generateRandomString();

	@Test
	public void testVerifyNewProgramCreated() {

		ProgramPage Program = navigationPage.clickProgramsLink()
				.clickAddNewProgramButton().createProgram(name, "test3","datos");
		Assert.assertTrue(Program.isNameEnabled());
	}

}
