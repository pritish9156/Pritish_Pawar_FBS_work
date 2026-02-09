class Admin{

	//Attributes

	int id;
	String name;
	double salary;
	double allowance;

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
		System.out.println("\nAdmin Id: " + admin1.id);
		System.out.println("Name: " + admin1.name);
		System.out.println("Salary: " + admin1.salary + "rs");
		System.out.println("Allowance: " + admin1.allowance + "rs");

	}//main ends here

}
	