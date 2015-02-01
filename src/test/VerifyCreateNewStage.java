package test;
/**Created by Jose Cabrera
 * 1/25/15
 * 
 */
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import database.DataConnection;
import pages.navigation.NavigationPage;
import utils.ReadExcel;

public class VerifyCreateNewStage {
	
	public NavigationPage navigationPage=new NavigationPage();
	@DataProvider(name="Stages")
	public Object[][] createStage() throws IOException{
		ReadExcel read=new ReadExcel();
		
			Object[][] data = read.readExcel("C:\\Users\\Jose Cabrera\\workspace\\jagdpanther\\src\\utils",
					"testStages.xlsx", "Stages");
		return data;
	}
	@Test(dataProvider="Stages")
	public void testVerifyNewStageCreated(String name, String Tittle, String Description) {
		
		Assert.
			assertTrue(navigationPage.SelectStages()
						.clickAddNewStagelink().create(name, Tittle, Description)
						.isNameinTable(name));
		DataConnection deleteStage=new DataConnection(name,"stages");
	
	}
	
	
}
