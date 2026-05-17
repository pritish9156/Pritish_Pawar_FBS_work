package daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DataBaseDAO;
import dao.StudentDAOInterface;
import models.Student;
import util.DBUtil;

public class StudentDAOImplementation implements StudentDAOInterface{
	
	public StudentDAOImplementation() {
		DataBaseDAO.createTables();
	}

	@Override
	public boolean addStudent(Student s) {
		
		if(s==null)
			return false;
			
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "insert into student values(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, s.getStudentId());
			ps.setString(2, s.getStudName());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getCity());
			ps.setInt(5, s.getAge());
			ps.setDouble(6, s.getFeesPaid());
			
			int res = ps.executeUpdate();
			
			if(res>0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public ArrayList<Student> getAllStudent() {
		
		ArrayList<Student> studArray = null;
		
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "select * from student";
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				
				if(studArray==null)
					studArray = new ArrayList<Student>();
					
				Student tempStud = new Student(res.getInt(1), 
											res.getString(2), 
											res.getString(3), 
											res.getString(4), 
											res.getInt(5), 
											res.getDouble(6));
				
				studArray.add(tempStud);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return studArray;
	}

	@Override
	public Student searchStudentById(int id) {
		
		Student student = null;
		
		try {
			
			Connection con = DBUtil.getConnection();
			
			String query = "select * from student where sid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			
			ResultSet res = ps.executeQuery();
			
			if(res.next()) {
				student = new Student(res.getInt(1), 
						res.getString(2), 
						res.getString(3), 
						res.getString(4), 
						res.getInt(5), 
						res.getDouble(6));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public Boolean updateFees(int id, double fees) {
		
		try {
			
			Connection con = DBUtil.getConnection();
			
			String query = "update student set fees_paid = ? where sid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setDouble(1, fees);
			ps.setInt(2, id);
			
			int result = ps.executeUpdate();
			
			if(result!=0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Boolean deleteStudent(int id) {
		
		try {
			
			Connection con = DBUtil.getConnection();
			
			String query = "delete from student where sid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, id);
			
			int result = ps.executeUpdate();
			
			if(result!=0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
