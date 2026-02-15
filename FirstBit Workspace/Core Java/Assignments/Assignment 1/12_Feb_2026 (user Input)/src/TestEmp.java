import java.util.Scanner;

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

public class TestEmp{

	public static void main(String args[]){

		int id;
		String name;
		double sal;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id: ");
		id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Salary : ");
		sal = sc.nextDouble();
		
		Employee e1 = new Employee(id, name, sal);

		e1.display();
		
		sc.close();

	}//main ends here
	
}