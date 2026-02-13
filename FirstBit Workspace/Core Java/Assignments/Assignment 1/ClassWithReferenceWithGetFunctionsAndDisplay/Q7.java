class Admin{

	//Attributes

	int id;
	String name;
	double salary;
	double allowance;


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

	//getters inspecters

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
	
		//Hash Code
		System.out.println("HashCode: " + admin1);

		admin1.setId(102);
		admin1.setEmpName("Raghav");
		admin1.setSalary(10000);
		admin1.setAllowance(10000);

		//display information
		System.out.println("\nAdmin Id: " + admin1.getId());
		System.out.println("Name: " + admin1.getEmpName());
		System.out.println("Salary: " + admin1.getSalary() + "rs");
		System.out.println("Allowance: " + admin1.getAllowance() + "rs");

		admin1.display();

	}//main ends here

}
	