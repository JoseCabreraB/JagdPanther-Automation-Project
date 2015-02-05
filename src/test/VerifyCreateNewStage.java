package test;

/**Created by Jose Cabrera
 * 1/25/15
 * 
 */
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework.pages.navigation.NavigationPage;
import framework.pages.stage.StagePage;
import framework.utils.ReadExcel;

/**
 * @title  SeeApplicants
 * @author Jose Cabrera
 * @description Is the page that contains information about 
 * Test that verify if a Stage is created correctly
 */
public class VerifyCreateNewStage {
	public NavigationPage navigationPage = new NavigationPage();
	
	@DataProvider(name = "Stages")
	
	public Object[][] createStage() throws IOException {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.readExcel("C:\\Users\\Jose Cabrera\\workspace\\jagdpanther\\src\\utils",
				"testStages.xlsx", "Stages");
		return data;
	}
	
	@Test(dataProvider = "Stages")
	
	public void testVerifyNewStageCreated(String name, String Tittle, String Description) {
		StagePage stage = navigationPage.clickStagesLink()
				.clickAddNewStageButton().create(name, Tittle, Description);
		Assert.
		assertTrue(stage.isNameinTable(name));
	}
}
