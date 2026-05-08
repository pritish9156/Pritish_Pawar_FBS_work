package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			FileInputStream fileInputStream = new FileInputStream(".//Resources//dbconfi.properties");
			
			Properties properties = new Properties();
			
			properties.load(fileInputStream);
			
			String driverClassName = properties.getProperty("driverclass");
			String dbUrl = properties.getProperty("url");
			String dbUsername = properties.getProperty("username");
			String dbPassword = properties.getProperty("password");
			
			Class.forName(driverClassName);
			
			connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
