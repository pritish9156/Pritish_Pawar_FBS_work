package daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.CourseDAOInterface;
import dao.DataBaseDAO;
import models.Course;
import util.DBUtil;

public class CourseDAOImplementation implements CourseDAOInterface{

	public CourseDAOImplementation(){
		DataBaseDAO.createTables();
	}
	
	@Override
	public boolean addCourse(Course course) {
		
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "insert into course values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, course.getCourseId());
			ps.setString(2, course.getCourseName());
			ps.setString(3, course.getDuration());
			ps.setDouble(4, course.getFees());
			
			int res = ps.executeUpdate();
			
			if(res > 0) 
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public ArrayList<Course> getAllCourses() {
		
		ArrayList<Course> courseArray = null;
		
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "select * from course";
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				if(courseArray == null)
					courseArray = new ArrayList<Course>();
				
				Course course = new Course(result.getInt(1), 
									result.getString(2), 
									result.getString(3), 
									result.getDouble(4));
				
				courseArray.add(course);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return courseArray;
	}

	@Override
	public Course getCourseById(int cid) {
		
		Course course = null;
	
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "select * from course where cid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, cid);
			
			ResultSet result = ps.executeQuery();
			
			if(result.next()) {
				course = new Course(result.getInt(1), 
						result.getString(2), 
						result.getString(3), 
						result.getDouble(4));
			
				return course;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return course;
	}

	@Override
	public boolean updateCourseFees(int cid, double cfees) {
	
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "update course set fees = ? where cid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setDouble(1, cfees);
			ps.setInt(2, cid);
			
			int result = ps.executeUpdate();
			
			if(result > 0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

	@Override
	public boolean deleteCourse(int cid) {
	
		try {
			Connection con = DBUtil.getConnection();
			
			String query = "delete from course where cid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, cid);
			
			int result = ps.executeUpdate();
			
			if(result > 0)
				return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
