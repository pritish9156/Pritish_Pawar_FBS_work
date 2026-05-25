package MyApplication;
import controller.CourseController;
import controller.StudentController;
import dao.CourseDAOInterface;
import dao.StudentDAOInterface;
import daoimplementation.CourseDAOImplementation;
import daoimplementation.StudentDAOImplementation;
import services.CourseServiceInterface;
import serviceImplementation.CourseServiceImpl;
import serviceImplementation.StudentServiceImpl;
import services.StudentServiceInterface;
import view.LoginView;

public class MyApplication {

	public static void main(String[] args) {
		
		StudentDAOInterface studDAOInterface = new StudentDAOImplementation();
		StudentServiceInterface studServiceInterface = new StudentServiceImpl(studDAOInterface);
		StudentController studController = new StudentController(studServiceInterface);
		
		CourseDAOInterface courseDAOInterface = new CourseDAOImplementation();
		CourseServiceInterface courseServiceInterface = new CourseServiceImpl(courseDAOInterface);
		CourseController courseController = new CourseController(courseServiceInterface);
		
		LoginView myApp = new LoginView(studController, courseController);
		
		myApp.showLoginPage();
	}

}
