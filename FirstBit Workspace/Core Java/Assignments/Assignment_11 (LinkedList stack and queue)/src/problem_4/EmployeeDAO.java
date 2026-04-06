package problem_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeDAO {

	static LinkedList empArray = new LinkedList();
	
	static {
		
		empArray.add(new Employee(101, "Ramesh", 1000));
		empArray.add(new Employee(102, "Suresh", 2000));
		empArray.add(new Employee(103, "Mahesh", 3000));
		empArray.add(new Employee(104, "Rajesh", 4000));
		empArray.add(new Employee(105, "Amit", 5000));
		empArray.add(new Employee(106, "Sumit", 6000));
		empArray.add(new Employee(107, "Rohit", 7000));
		empArray.add(new Employee(108, "Mohit", 8000));
		empArray.add(new Employee(109, "Ankit", 9000));
		empArray.add(new Employee(110, "Vikas", 10000));
		
	}
	
	Iterator i;
	
	public boolean addEmployee(Employee emp) {
		empArray.addLast(emp);
		return true;
	}
	
	public boolean initIterator() {
		i = empArray.listIterator();
		return true;
	}
	
	public Employee nextEmployee() {
		if(i.hasNext()) {
			return (Employee) i.next();
		}
		else
			return null;
	}
	
	public Employee previousEmployee() {
		if(((ListIterator) i).hasPrevious()) {
			return (Employee) ((ListIterator) i).previous();
		}
		else
			return null;
	}
	
	public LinkedList displayAllEmployee() {
		return empArray;
	}
}
