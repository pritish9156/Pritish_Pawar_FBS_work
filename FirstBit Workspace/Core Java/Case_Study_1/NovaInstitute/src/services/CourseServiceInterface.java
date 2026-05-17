package services;

import java.util.ArrayList;

import models.Course;

public interface CourseServiceInterface {
	
	boolean InsertCourse(Course course);
	ArrayList<Course> showAllCourses();
	Course showCourseById(int id);
	boolean updateCourseFees(int cid, double cfees);
	boolean deleteCourse(int id);
	
}
