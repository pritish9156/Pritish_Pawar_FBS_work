package DAOImplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DAOInterface.ManageUserInterface;
import model.Users;
import util.DBUtil;

public class ManageUserDAO implements ManageUserInterface{
	
	static ArrayList<Users> userArrayList = new ArrayList<Users>();
	
	public ManageUserDAO(){
		
		Connection con = DBUtil.getConnection();
		
		try {
			Statement stmt = con.createStatement();
			
			String userTable = "create table if not exists users("
			        + "userId int primary key AUTO_INCREMENT, "
			        + "username varchar(50) not null, "
			        + "email varchar(50) unique not null, "
			        + "password varchar(50) not null, "
			        + "securityQuestion varchar(100), "
			        + "answer varchar(100), "
			        + "isActive boolean"
			        + ")";
			
			stmt.execute(userTable);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean registerUser(Users user) {
		
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "insert into users(username, email, password, securityQuestion, answer, isActive) values(?,?,?,?,?,?)";		
			PreparedStatement insertRecord = con.prepareStatement(query);
			
			insertRecord.setString(1, user.getUsername());
			insertRecord.setString(2, user.getEmail());
			insertRecord.setString(3, user.getPassword());
			insertRecord.setString(4, user.getSecurityQuestion());
			insertRecord.setString(5, user.getAnswer());
			insertRecord.setBoolean(6, user.getIsActive());
			
			int res = insertRecord.executeUpdate();
			
			if(res>0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean loginUser(String username, String password) {	
		
		for(Users user : userArrayList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
				return true;
		}
		
		return false;
	}

}
