package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	Connection con;

	public Connection getConnection() {
		FileInputStream fis = null;
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(".//Resources//dbconfi.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = (String) prop.get("url");
		
		String username = (String) prop.get("username");

		String password = (String) prop.get("password");

		try {
			con = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return con;

	}
}
