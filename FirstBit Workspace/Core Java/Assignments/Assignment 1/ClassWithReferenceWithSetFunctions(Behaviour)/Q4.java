class Employee{

	//Attributes

	int id;
	String empName;
	double salary;

	void setId(int i){
		this.id = i;
	}

	void setEmpName(String name){
		this.empName = name;
	}

	void setSalary(double sal){
		this.salary = sal;
	}

	void displayEmp(){

		System.out.println("\nEmployee id: " + id);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + salary + "Rs");
	}

}//Employee class ends here

class Test4{

	public static void main(String args[]){

		Employee e1 = new Employee(); //reference
		
		System.out.println("\nHashCode : " + e1);

		//initialization
		e1.setId(102);
		e1.setEmpName("Raghav");
		e1.setSalary(10000);

		e1.displayEmp();

	}//main ends here
	
}