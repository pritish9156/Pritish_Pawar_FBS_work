package dao;

import java.util.ArrayList;

import Model.Admin;
import Model.Employee;

public class EmployeeListDAO1 {
	
	static ArrayList empArray;
	
	static {
		empArray = new ArrayList();
		empArray.add(new Admin(301, "Pragati", 70000, 10000));
	}
	
	public boolean addEmployee(Employee e) {

		return empArray.add(e);
	}
	
	public Employee getById(int id) {

		for(int i=0; i<empArray.size(); i++) {
			if(((Employee) empArray.get(i)).getId() == id) {
				return (Employee) empArray.get(i);
			}
		}

		return null;
	}
	
	public boolean updateSalary(int id, double newSalary) {

		for(int i=0; i<empArray.size(); i++) {
			if(((Employee) empArray.get(i)).getId() == id) {
				((Employee) empArray.get(i)).setSalary(newSalary);
				return true;
			}
		}

		return false;
	}
	
	public boolean deleteEmployee(int id) {
		
		for(int i=0; i<empArray.size(); i++) {
			if(((Employee) empArray.get(i)).getId() == id) {
				empArray.remove(i);
				return true;
			}
		}

		return false;
	}
	
	public ArrayList getAllEmployees() {

		return empArray;
	}

}
