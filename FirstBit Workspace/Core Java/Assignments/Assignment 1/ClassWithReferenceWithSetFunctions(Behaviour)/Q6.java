class SalesManager{

	//Attributes

	int id;
	String name;
	double salary;
	double incentive;
	int target;

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

}//SalesManager class ends here

class Test6{

	public static void main(String args[]){
	
		SalesManager sm1 = new SalesManager(); //reference
	
		//Hash Code
		System.out.println("HashCode: " + sm1);

		sm1.setId(102);
		sm1.setEmpName("Raghav");
		sm1.setSalary(10000);
		sm1.setIncentive(5000);
		sm1.setTarget(10000);

		//display information
		System.out.println("\nSales Manager Id: " + sm1.id);
		System.out.println("Name: " + sm1.name);
		System.out.println("Salary: " + sm1.salary);
		System.out.println("Incentive: " + sm1.incentive);
		System.out.println("Target: " + sm1.target);

	}//main ends here

}
	