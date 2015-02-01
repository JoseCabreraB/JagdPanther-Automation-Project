package test;
/**Created by Jose Cabrera
 * 1/26/15
 * 
 */
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.navigation.NavigationPage;
import utils.Randoms;

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
