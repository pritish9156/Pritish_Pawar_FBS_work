package p2;

import java.util.ArrayList;
import java.util.LinkedList;

class Employee {
	int id;
	String name;
	double salary;

	public Employee() {
		this.id = 0;
		this.name = "Not Given";
		this.salary = 10000;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {

		return "\n\n id=" + id + "\nname=" + name + "\nsalary=" + salary;
	}

}

public class TestLL {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(5);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add(new Employee(10, "Sachin", 20000));
		l1.add(new Employee(18, "Virat", 25000));
		System.out.println(l1);

	}

}
