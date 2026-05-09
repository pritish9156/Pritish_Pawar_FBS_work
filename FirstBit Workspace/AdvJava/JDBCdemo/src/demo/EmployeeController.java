package demo;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeController {

	EmployeeService es=new EmployeeService();
	
	public ArrayList<Employee> displayAllEmployees()
	{
		try {
			
		return es.displayAllEmployees();
		
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public int addEmployee(Employee emp)  {
		
		try {
			
			return es.addEmployee(emp);
			
			
			}catch(Exception e)
			{
				System.out.println(e);
			}
			return 0;
		
	}

	public ArrayList<Employee> searchByEmpName(String empName) {
		// TODO Auto-generated method stub
		return es.searchByEmpName(empName);
	}

	public Employee searchByEmpId(int empId) {
		// TODO Auto-generated method stub
		return es.searchByEmpId(empId);
	}

	public Boolean updateEmployeeName(Employee empToUpdate, String empName) {
		// TODO Auto-generated method stub
		return es.updateEmployeeName(empToUpdate, empName);
	}

	public Boolean updateEmpSalary(Employee empToUpdate, double empSal) {
		// TODO Auto-generated method stub
		return es.updateEmployeeSalary(empToUpdate, empSal);
	}

	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return es.deleteEmployee(id);
	}

	public ArrayList<Employee> sortEmployeeBySal(int subChoice) {
		// TODO Auto-generated method stub
		return es.sortEmpBySal(subChoice);
	}
	
	
}
