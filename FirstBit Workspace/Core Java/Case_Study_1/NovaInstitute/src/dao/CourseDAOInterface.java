package dao;

import java.util.ArrayList;

import models.Course;

public interface CourseDAOInterface {
	
	boolean addCourse(Course course);
	ArrayList<Course> getAllCourses();
	Course getCourseById(int id);
	boolean updateCourseFees(int cid, double cfees);
	boolean deleteCourse(int id);

}
