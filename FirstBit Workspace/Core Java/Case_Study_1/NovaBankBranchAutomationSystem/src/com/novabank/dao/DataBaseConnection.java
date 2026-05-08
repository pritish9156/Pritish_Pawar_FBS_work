package com.novabank.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DataBaseConnection{
	
	
	private Connection getConnection() {
		
		try {
			FileInputStream fis = new FileInputStream(".//Resources//application.properties");
			Properties properties = new Properties();
			properties.load(fis);
			
			String url = (String) properties.get("url");
			String username = (String) properties.get("username");
			String password = (String) properties.get("password");
			
			System.out.println(url + " " + username + " " + password +"\n");
			Connection connection = DriverManager.getConnection(url, username, password);
			
			
			return connection;
			
		} catch (IOException e) {
			System.out.println("Not Able to fetch properties file...!");
			return null;
			
		} catch (SQLException e) {
			System.out.println("Please check your database credentials...!");
			return null;
		}	
		
	}
	
	public Statement getStatement(){
	
		Connection con = getConnection();

		try {
			
			if(con!=null) {
				Statement stm = con.createStatement();
				return stm;
			}
			
			return null;
			
		} catch (SQLException e) {
			
			return null;
		}
			
	}
}
