class Employee{

	//Attributes

	int id;
	String empName;
	double salary;

	//constructors
	//default

	Employee(){
		this.id = -1;
		this.empName = "not avilable";
		this.salary = 5000;
	}

	//parametarised

	Employee(int i, String name, double s){
		this.id = i;
		this.empName = name;
		this.salary = s;
	}


	void setId(int i){
		this.id = i;
	}

	void setEmpName(String name){
		this.empName = name;
	}

	void setSalary(double sal){
		this.salary = sal;
	}

	//getters

	int getId(){
		return this.id;
	}

	String getEmpName(){
		return this.empName;
	}

	double getSalary(){
		return this.salary;
	}

	//display
	void display(){
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Name: " +  empName);
		System.out.println("Salary : " + salary);

	}
	

}//Employee class ends here

class Test4{

	public static void main(String args[]){

		Employee e1 = new Employee(); //reference

		System.out.println("Employee Id: " + e1.getId());
		System.out.println("Employee Name: " +  e1.getEmpName());
		System.out.println("Salary : " + e1.getSalary());

		//initialization
		e1.setId(102);
		e1.setEmpName("Raghav");
		e1.setSalary(10000);
		
		System.out.println();
		e1.display();

	}//main ends here
	
}