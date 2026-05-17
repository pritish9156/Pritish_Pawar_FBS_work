package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBUtil;

public class DataBaseDAO {
	
	static public void createTables() {

		Connection con = DBUtil.getConnection();
		
		try {
			
			String query1 = "create table if not exists student(sid int primary key, "
							+ "name varchar(30) not null, "
							+ "email varchar(30) unique, "
							+ "city varchar(30), "
							+ "age int check(age >= 18), "
							+ "fees_paid decimal(10,2))";
			
			String query2 = "create table if not exists course(cid int primary key, "
							+ "cname varchar(30) not null, "
							+ "duration varchar(30), "
							+ "fees decimal(10,2))";
			
			PreparedStatement ps1 = con.prepareStatement(query1);
			PreparedStatement ps2 = con.prepareStatement(query2);
			
			ps1.execute();
			ps2.execute();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
