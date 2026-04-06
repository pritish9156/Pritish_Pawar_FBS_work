package Map;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	int getId() {
		return id;
	}



	void setId(int id) {
		this.id = id;
	}



	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}



	double getSalary() {
		return salary;
	}



	void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return " Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
