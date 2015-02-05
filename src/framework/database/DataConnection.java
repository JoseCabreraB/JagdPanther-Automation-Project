package framework.database;

/**Created by Jose Cabrera
 * 1/28/15
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @title  DataConnection
 * @author Jose Cabrera
 * @description Is the page that contains information about the database connection
 * */
public class DataConnection {
	/***
	 ** @param Connection conex : this is the connection by default
	 *  @param Statement statement : Is the instance that permit execute querys 
	 *  @param String dirDB : The address where is located database
	 *  @param String userDB : The user of MySql
	 *  @param String passDB : The password of user of MySql 
	 */
	private static Connection conex = null;
	private static Statement statement;
	private static String dirDB = "jdbc:mysql://localhost/jagdpanther";   
	private static String userDB = "panther";
	private static String passDB = "panther11";

	/**
	 * This constructor initialize the connection with data base
	 */
	public DataConnection() {
		try {
			String dbClass = "com.mysql.jdbc.Driver";
			Class.forName(dbClass).newInstance();
			Connection con = DriverManager.getConnection(dirDB, userDB, passDB);
			statement = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is to delete all periods from data base
	 * @throws SQLException
	 */
	public void deleteDataInPeriodTable() throws SQLException {
		try{
			String query = "DELETE FROM jp_period WHERE ID > 0";
			statement.execute(query);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (conex != null){
				conex.close();
			}
		}
	}

	/**
	 * This method is to delete all applicants and users from data base 
	 * except the admin user
	 * @throws SQLException
	 */
	public void deleteDataInUserTable() throws SQLException {
		try {
			String query0 = "DELETE FROM login_register WHERE ID > 0";
			statement.execute(query0);
			String query1 = "DELETE FROM user_period WHERE APPLICANT_ID > 0";
			statement.execute(query1);    
			String query2 = "DELETE FROM message WHERE ID > 0";
			statement.execute(query2); 
			String query3 = "DELETE FROM jp_user WHERE CI != 123";
			statement.execute(query3); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conex!= null) {
				conex.close();
			}
		}
	}

	/**
	 * This method is to delete all programs from data base 
	 * @throws SQLException
	 */
	public void deleteDataInProgramTable() throws SQLException {
		try {
			String query1 = "DELETE FROM jp_period WHERE PROGRAM_ID > 0";
			statement.execute(query1);    
			String query2 = "DELETE FROM program WHERE ID > 0";
			statement.execute(query2); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conex != null) {
				conex.close();
			}
		}
	}

	/**
	 * This method is to delete all Stages from data base 
	 * @throws SQLException
	 */
	public void deleteDataInStageTable() throws SQLException {
		try {
			String query1 = "DELETE FROM stage WHERE ID > 0";
			statement.execute(query1);    
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conex != null){
				conex.close();
			}
		}
	}
}