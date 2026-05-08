package demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {

	EmployeeDao empDao =new EmployeeDao();
	
	
	public ArrayList<Employee> displayAllEmployees() throws SQLException
	{
		return empDao.getAllEmployees();
	}


	public int addEmployee(Employee emp) throws SQLException, IOException {
		
		return empDao.addEmployee(emp);
		
	}


	public ArrayList<Employee> searchByEmpName(String empName) {
		// TODO Auto-generated method stub
		return empDao.searchEmployeeByName(empName);
	}


	public Employee searchByEmpId(int empId) {
		// TODO Auto-generated method stub
		return empDao.searchEmployeeById(empId);
	}


	public Boolean updateEmployeeName(Employee empToUpdate, String empName) {
		// TODO Auto-generated method stub
		return empDao.updateEmployeeName(empToUpdate, empName);
	}


	public Boolean updateEmployeeSalary(Employee empToUpdate, double empSal) {
		// TODO Auto-generated method stub
		return empDao.updateEmployeeSalary(empToUpdate, empSal);
	}


	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return empDao.deleteEmployee(id);
	}
}
