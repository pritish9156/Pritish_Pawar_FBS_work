package Comparator;

import java.util.*;

class Employee{
	
	int empId;
	String empName;
	double basicSal;
	
	public Employee() {
		this.empId = 0;
		this.empName = "not avilable";
		this.basicSal = 0;
	}

	Employee(int empId, String empName, double basicSal) {
	
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
	}

	int getEmpId() {
		return empId;
	}

	void setEmpId(int empId) {
		this.empId = empId;
	}

	String getEmpName() {
		return empName;
	}

	void setEmpName(String empName) {
		this.empName = empName;
	}

	double getBasicSal() {
		return basicSal;
	}

	void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		return "\nempId=" + empId + "\nempName=" + empName + "\nbasicSal=" + basicSal + "\n";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("equls called");
//		if(this.empId == ((Employee)obj).getEmpId()) {
//			return true;
//		}
//		
//		return false;
//	}

//	@Override
//	public int compareTo(Employee o) {
//		System.out.println("compareTo called");
//		Employee e1 = (Employee)o;
//		return this.empId - e1.empId;
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		Employee e1 = (Employee)o;
//		return this.empName.compareTo(e1.getEmpName());
//	}
//	
}

public class TestList {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Raghav", 10000);
		Employee e2 = new Employee(103, "Shivam", 20000);
		Employee e3 = new Employee(102, "Krish", 30000);
		
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		ArrayList l2 = new ArrayList();
		
		l2.add("Apple");
		l2.add("Cat");
		l2.add("Ball");
		
		System.out.println("before sort: " + l1);
		
		SortOnId soi = new SortOnId();
		SortOnSalary sos = new SortOnSalary();
		
		Collections.sort(l1, sos);
		
		System.out.println("\nAfter sort: " + l1);
	
		System.out.println(Collections.binarySearch(l1, new Employee(103,"Shivam",20000), sos));
		
	}
	
	public static void main1(String[] args) {
		
		Employee e1 = new Employee(101, "Raghav", 10000);
		Employee e2 = new Employee(102, "Shivam", 20000);
		Employee e3 = new Employee(103, "Krish", 30000);
		
		ArrayList l1 = new ArrayList();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		System.out.println(l1);
		
		System.out.println(l1.contains(new Employee(101, "Raghav", 10000)));
		
	}

}
