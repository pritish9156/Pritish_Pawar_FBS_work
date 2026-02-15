import java.util.Scanner;

class SalesManager{

	//Attributes

	int id;
	String name;
	double salary;
	double incentive;
	int target;

	//constructors
	//default
	SalesManager(){
		this.id = -1;
		this.name = "not avilable";
		this.salary = 5000;
		this.incentive = 1000;
		this.target = 10000;
	}

	

	SalesManager(int id, String name, double salary, double incentive, int target) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}



	void setId(int i){
		this.id = i;
	}

	void setEmpName(String name){
		this.name = name;
	}

	void setSalary(double sal){
		this.salary = sal;
	}

	void setIncentive(double incen){
		this.incentive = incen;
	}

	void setTarget(int tar){
		this.target = tar;
	}

	//getters

	int getId(){
		return this.id;
	}
	
	String getName(){
		return this.name;
	}

	double getSalary(){
		return this.salary;
	}

	double getIncentive(){
		return this.incentive;
	}

	int getTarget(){
		return this.target;
	}

	void display(){
		System.out.println("\nSales Manager Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Incentive: " + incentive);
		System.out.println("Target: " + target);
	}

}//SalesManager class ends here

class TestSalesManager{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Manager id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Manager Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Manager salary: ");
		double sal = sc.nextDouble();
		
		System.out.println("Enter Manager Incentive: ");
		double incentive = sc.nextDouble();
		
		System.out.println("Enter Manager Target: ");
		int target = sc.nextInt();

		SalesManager sm1 = new SalesManager(id, name, sal, incentive, target);
		
		sm1.display();
		
		sc.close();

	}//main ends here

}
	