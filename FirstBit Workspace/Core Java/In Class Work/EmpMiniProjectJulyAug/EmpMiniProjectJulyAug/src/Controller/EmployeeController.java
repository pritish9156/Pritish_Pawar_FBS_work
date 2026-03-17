package Controller;

import Model.Employee;
import dao.EmployeeDAO;

public class EmployeeController {
	EmployeeDAO ed = new EmployeeDAO();

	public boolean addEmployee(Employee e) {
		return ed.addEmployee(e);
	}

	public Employee searchEmployeeById(int id) {
		return ed.getById(id);
	}

	public boolean updateEmployee(int id, double salary) {
		return ed.updateSalary(id, salary);
	}

	public boolean deleteEmployee(int id) {
		return ed.deleteEmployee(id);
	}

	public Employee[] displayAll() {
		return ed.getAllEmployees();

	}

}
