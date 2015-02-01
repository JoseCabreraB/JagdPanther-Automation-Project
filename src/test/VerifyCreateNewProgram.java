package test;
/**Created by Jose Cabrera
 * 1/27/15
 * 
 */
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.navigation.NavigationPage;
import utils.Randoms;
/**
 * @title  SeeApplicants
 * @author Jose Cabrera
 * @description Is the page that contains information about 
 * Test that verify if a Program is created correctly
 */
public class VerifyCreateNewProgram {

	public NavigationPage navigationPage=new NavigationPage();
	public Randoms ran=new Randoms();
	String name=ran.generateRandomString();
	
	@Test
	public void testVerifyNewProgramCreated() {
		
		Assert.
			assertTrue(navigationPage.SelectPrograms()
			.clickAddNewProgramLink().create(name, "test3").isNameEnabled(name));
	}
	
}
