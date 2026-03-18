package Controller;

import java.util.ArrayList;

import Model.Employee;
import dao.EmployeeListDAO1;

public class EmployeeController {
//	EmployeeDAO ed = new EmployeeDAO();
	EmployeeListDAO1 ed=new EmployeeListDAO1();

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

	public ArrayList displayAll() {
		return ed.getAllEmployees();

	}

}
