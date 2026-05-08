package models;

public class Course {

	int courseId;
	String CourseName;
	String duration;
	double fees;
	
	public Course() {
		
	}

	public Course(int courseId, String courseName, String duration, double fees) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", CourseName=" + CourseName + ", duration=" + duration + ", fees="
				+ fees + "]";
	}
	
}
