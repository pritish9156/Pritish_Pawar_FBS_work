class Admin{

	//Attributes

	int id;
	String name;
	double salary;
	double allowance;

	//constructors
	//default
	
	Admin(){
		this.id = -1;
		this.name = "not avilable";
		this.salary = 5000;
		this.allowance = 100;
	}

	//parametarised

	Admin(int i, String n, double sal, double a){
		this.id = i;
		this.name = n;
		this.salary = sal;
		this.allowance = a;
	}


	//mutatters
	void setId(int i){
		this.id = i;
	}

	void setEmpName(String name){
		this.name = name;
	}

	void setSalary(double sal){
		this.salary = sal;
	}

	void setAllowance(int allo){
		this.allowance = allo;
	}

	//getters inspecters accessers

	int getId(){
		return this.id;
	}

	String getEmpName(){
		return this.name;
	}

	double getSalary(){
		return this.salary;
	}

	double getAllowance(){
		return this.allowance;
	}

	void display(){
		System.out.println("\nAdmin Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary + "rs");
		System.out.println("Allowance: " + allowance + "rs");
	}

}// Admin class ends here

class Test7{

	public static void main(String args[]){
	
		Admin admin1 = new Admin(); //reference
		Admin admin2 = new Admin(102, "Raghav", 10000, 10000);
	
		//Hash Code
		System.out.println("HashCode: " + admin1);

		admin1.display();
		admin2.display();

	}//main ends here

}
	