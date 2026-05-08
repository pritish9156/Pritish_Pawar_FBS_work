package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

public class DataBaseDAO {

	public static void main(String[] args) {
		createTables();
	}
	static public void createTables() {
		DBUtil dbc = new DBUtil();
		Connection con = dbc.getConnection();
		
		try {
			Statement ps = con.createStatement();
			
			ps.execute("create table if not exists student(sid int primary key, "
					+ "name varchar(30), "
					+ "email varchar(30), "
					+ "city varchar(30), "
					+ "age int, "
					+ "fees_paid double)");
			
			ps.execute("create table if not exists course(cid int primary key, "
					+ "cname varchar(30), "
					+ "duration varchar(30), "
					+ "fess double)");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
