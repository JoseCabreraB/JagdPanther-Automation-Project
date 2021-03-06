package test;

/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import framework.database.DataConnection;
import framework.pages.LoginPage;

/**
 * @title  JagdPantherSuite
 * @author Jose Cabrera
 * @description Is the page that contains information about the before and AfterSuite  	
 */
public class JagdPantherSuite {
	public LoginPage loginPage = new LoginPage();
	private DataConnection delete = new DataConnection();
	
	@BeforeSuite
	public void init() {
		loginPage.login("admin@admin.com","admin11");
	}

	@AfterSuite
	public void quit() throws SQLException {
		loginPage.quit();
		delete.deleteDataInUserTable();
		delete.deleteDataInStageTable();
		delete.deleteDataInPeriodTable();
		delete.deleteDataInProgramTable();
	}
}
