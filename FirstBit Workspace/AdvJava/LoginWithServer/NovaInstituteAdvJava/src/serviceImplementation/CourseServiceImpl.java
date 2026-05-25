package serviceImplementation;

import java.util.ArrayList;

import dao.CourseDAOInterface;
import models.Course;
import services.CourseServiceInterface;

public class CourseServiceImpl implements CourseServiceInterface{
	
	CourseDAOInterface courseDAOImpl;
	
	public CourseServiceImpl(CourseDAOInterface courseDAO){
		this.courseDAOImpl = courseDAO;
	}
	

	@Override
	public boolean InsertCourse(Course course) {
		return courseDAOImpl.addCourse(course);
	}

	@Override
	public ArrayList<Course> showAllCourses() {
		return courseDAOImpl.getAllCourses();
	}

	@Override
	public Course showCourseById(int id) {
		return courseDAOImpl.getCourseById(id);
	}

	@Override
	public boolean updateCourseFees(int cid, double cfees) {
		return courseDAOImpl.updateCourseFees(cid, cfees);
	}

	@Override
	public boolean deleteCourse(int id) {
		return courseDAOImpl.deleteCourse(id);
	}
	
}
