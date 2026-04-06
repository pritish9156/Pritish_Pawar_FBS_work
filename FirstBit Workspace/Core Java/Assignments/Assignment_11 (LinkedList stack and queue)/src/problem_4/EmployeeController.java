package problem_4;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeController {
	
	EmployeeDAO employeeDAO;
	
	EmployeeController(EmployeeDAO empDAO){
		this.employeeDAO = empDAO;
	}
	
	public boolean addEmployee(Employee emp) {
		return employeeDAO.addEmployee(emp);
	}
	
	public boolean initIterator() {
		return employeeDAO.initIterator();
	}
	
	public Employee nextEmployee() {
		return employeeDAO.nextEmployee();
	}
	
	public Employee previousEmployee() {
		return employeeDAO.previousEmployee();
	}
	
	public LinkedList displayAllEmployee() {
		return employeeDAO.displayAllEmployee();
	}
}
