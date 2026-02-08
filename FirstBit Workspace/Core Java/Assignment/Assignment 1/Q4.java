class Employee{

	//Attributes

	int id;
	String empName;
	double salary;

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
		e1.id = 101;
		e1.empName = "Raghaav";
		e1.salary = 20000;

		e1.displayEmp();

	}//main ends here
	
}