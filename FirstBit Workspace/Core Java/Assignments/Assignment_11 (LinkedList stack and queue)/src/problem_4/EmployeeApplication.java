package problem_4;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		EmployeeController empController = new EmployeeController(employeeDAO );
		EmployeeView empView = new EmployeeView(empController);
		
		empView.startApplication();

	}

}
