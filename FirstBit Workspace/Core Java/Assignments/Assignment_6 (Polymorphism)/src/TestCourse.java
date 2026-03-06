class Course{
	String courseName;
	int duration;
	double fees;
	String instituteName;
	String mode;
	
	public Course() {
		this.courseName = "Not Given";
		this.duration = 0;
		this.fees = 0;
		this.instituteName = "Not Given";
		this.mode = "Not Given";
	}

	Course(String courseName, int duration, double fees, String instituteName, String mode) {
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
		this.instituteName = instituteName;
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "courseName=" + courseName + "\nduration=" + duration + "\nfees=" + fees + "\ninstituteName="
				+ instituteName + "\nmode=" + mode;
	}
	
	void getCourseFees() {
		System.out.println();
	}

	
}

class OnlineCourse extends Course{
	String platform;
	int numberOfVideos;
	
	public OnlineCourse() {
		super();
		this.platform = "Not Given";
		this.numberOfVideos = 0;
	}

	OnlineCourse(String courseName, int duration, double fees, String instituteName, String mode, String platform, int numberOfVideos) {
		super(courseName, duration, fees, instituteName, mode);
		this.platform = platform;
		this.numberOfVideos = numberOfVideos;
	}

	@Override
	public String toString() {
		return super.toString()+"\nplatform=" + platform + "\nnumberOfVideos=" + numberOfVideos;
	}

	void getCourseFees() {
		System.out.println("Platform: " + this.platform);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Fees: " + this.fees);
	}
	
}

class OfflineCourse extends Course{
	String classroomNumber;
	String trainerName;
	
	public OfflineCourse() {
		super();
		this.classroomNumber = "Not Given";
		this.trainerName = "Not Given";
	}

	OfflineCourse(String courseName, int duration, double fees, String instituteName, String mode, String classroomNumber, String trainerName) {
		super(courseName, duration, fees, instituteName, mode);
		this.classroomNumber = classroomNumber;
		this.trainerName = trainerName;
	}

	@Override
	public String toString() {
		return super.toString()+"\nclassroomNumber=" + classroomNumber + "\ntrainerName=" + trainerName;
	}

	void getCourseFees() {
		System.out.println("Classroom Number: " + this.classroomNumber);
		System.out.println("Course Name: " + this.courseName);
		System.out.println("Fees: " + this.fees);
	}
	
}

public class TestCourse{
	public static void main(String[] args) {
		
		OnlineCourse o1 = new OnlineCourse("Java Full Stack", 6, 30000, "ABC Institute", "Online", "Udemy", 120);
		OfflineCourse o2 = new OfflineCourse("Data Science", 8, 40000, "XYZ Institute", "Offline", "C-101", "Mr. Raj");
		
//		System.out.println(o1);
//		System.out.println();
//		System.out.println(o2);
		
		o1.getCourseFees();
		System.out.println();
		o2.getCourseFees();
	}
}