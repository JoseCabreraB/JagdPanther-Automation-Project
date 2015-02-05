package test;
/**Created by Jose Cabrera
 * 1/26/15
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
 * Test that verify if the Applicants page contain the applicants in the table correctly
 */
public class SeeApplicants {

	public NavigationPage navigationPage=new NavigationPage();
	public Randoms ran=new Randoms();
	String name=ran.generateRandomString();
	
	@Test
	public void verifyApplicant() {
		
		Assert.
			assertTrue(navigationPage.SelectApplicants().isActionEnabled());
		
	}
	
}
