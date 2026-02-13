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

	SalesManager(int i, String n, double sal, double incen, int target){
		this.id = i;
		this.name = n;
		this.salary = sal;
		this.incentive = incen;
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

class Test6{

	public static void main(String args[]){
	
		SalesManager sm1 = new SalesManager(102, "Raghav", 10000, 5000, 10000); //reference
		SalesManager sm2 = new SalesManager();

		sm1.display();
		sm2.display();

	}//main ends here

}
	