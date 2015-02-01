package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnection {

	public DataConnection(String type,String id)
	{
		try
	    {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conexion = DriverManager.getConnection (
                "jdbc:mysql://localhost/jagdpanther","root", "root");
            Statement s = conexion.createStatement();
            // ResultSet rs
            ResultSet rs = s.executeQuery ("DELETE FROM "+type+" WHERE NAME="+id);
            while (rs.next())
            {
                System.out.println ("It was deleted");
            }
            conexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
	}
}
