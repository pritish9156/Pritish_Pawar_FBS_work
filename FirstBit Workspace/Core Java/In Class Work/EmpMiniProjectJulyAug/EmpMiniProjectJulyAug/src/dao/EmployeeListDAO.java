package dao;

import java.util.ArrayList;

import Model.Employee;
import Model.HR;

public class EmployeeListDAO {
	
	static ArrayList empList;
	static {
		empList=new ArrayList();
		empList.add(new HR(101, "Ranjit", 50000, 5000));
		
	}
	public boolean addEmployee(Employee e) {

		return empList.add(e);
	}
	public Employee getById(int id) {

		for (int i = 0; i < empList.size(); i++) {
			if(((Employee) empList.get(i)).getId()==id) {
				return (Employee) empList.get(i);
			}
		}

		return null;
	}
	public boolean updateSalary(int id, double newSalary) {
		
		for (int i = 0; i < empList.size(); i++) {
			if(((Employee) empList.get(i)).getId()==id) {
				((Employee) empList.get(i)).setSalary(newSalary);
				return true;
			}
		}
		return false;
	}
	public ArrayList getAllEmployees() {

		return empList;
	}

}
