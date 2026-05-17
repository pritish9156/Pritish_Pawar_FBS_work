package controller;

import java.util.ArrayList;

import models.Course;
import services.CourseServiceInterface;

public class CourseController {

	CourseServiceInterface courseServiceImpl;
	
	public CourseController(CourseServiceInterface courseService) {
		this.courseServiceImpl = courseService;
	}
	
	public boolean InsertCourse(Course course) {
		return courseServiceImpl.InsertCourse(course);
	}

	public ArrayList<Course> showAllCourses() {
		return courseServiceImpl.showAllCourses();
	}

	public Course showCourseById(int id) {
		return courseServiceImpl.showCourseById(id);
	}

	public boolean updateCourseFees(int cid, double cfees) {
		return courseServiceImpl.updateCourseFees(cid, cfees);
	}

	public boolean deleteCourse(int id) {
		return courseServiceImpl.deleteCourse(id);
	}
}
