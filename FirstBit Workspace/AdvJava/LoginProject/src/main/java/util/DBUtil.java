package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			
			Properties properties = new Properties();

            InputStream inputStream =
                    DBUtil.class.getClassLoader()
                            .getResourceAsStream("dbconfig.properties");

            properties.load(inputStream);

            String driverClass = properties.getProperty("driverclass");
            String dbUrl = properties.getProperty("url");
            String dbUsername = properties.getProperty("username");
            String dbPassword = properties.getProperty("password");
			
			Class.forName(driverClass);
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
