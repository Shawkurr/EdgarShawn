package com.revature.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil 
{
	
	private static ConnectionUtil cu = new ConnectionUtil();
	
	private ConnectionUtil() 
	{
		super();
	}
	
	public static ConnectionUtil getInstance() 
	{
		return cu;
	}
	
	public static Connection getConnection() 
	{
		
		final String DB_DRIVER_CLASS = "driver.class.name";
		final String DB_USERNAME = "db.username";
		final String DB_PASSWORD = "db.password";
		final String DB_URL = "db.url";
		
		Connection conn = null;
		
		Properties prop = new Properties();
			try 
			{		
				prop.load(new FileInputStream("src/main/resources/Connection.prop"));
				Class.forName(prop.getProperty(DB_DRIVER_CLASS));
				conn = DriverManager.getConnection(prop.getProperty(DB_URL),prop.getProperty(DB_USERNAME) , prop.getProperty(DB_PASSWORD) );
			} 
			
			catch (ClassNotFoundException | SQLException | IOException e) 
			{
				e.printStackTrace();
			}		
		return conn;	
	}
}
