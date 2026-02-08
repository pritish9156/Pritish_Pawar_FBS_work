class SalesManager{

	//Attributes

	int id;
	String name;
	double salary;
	double incentive;
	int target;

}SalesManager class ends here

class Test6{

	public static void main(String args[]){
	
		SalesManager sm1 = new SalesManager(); //reference
	
		//Hash Code
		System.out.println("HashCode: " + sm1);

		//initialization
		sm1.id = 141;
		sm1.name = "Ranveer";
		sm1.salary = 41000;
		sm1.incentive = 5000;
		sm1.target = 100000;

		//display information
		System.out.println("\nSales Manager Id: " + sm1.id);
		System.out.println("Name: " + sm1.name);
		System.out.println("Salary: " + sm1.salary);
		System.out.println("Incentive: " + sm1.incentive);
		System.out.println("Target: " + sm1.target);

	}//main ends here

}
	