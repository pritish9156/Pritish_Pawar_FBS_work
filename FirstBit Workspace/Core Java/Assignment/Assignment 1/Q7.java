class Admin{

	//Attributes

	int id;
	String name;
	double salary;
	double allowance;

}// Admin class ends here

class Test7{

	public static void main(String args[]){
	
		Admin admin1 = new Admin(); //reference
	
		//Hash Code
		System.out.println("HashCode: " + admin1);

		//initialization
		admin1.id = 141;
		admin1.name = "Ranveer Sharma";
		admin1.salary = 41000;
		admin1.allowance = 5000;


		//display information
		System.out.println("\nSales Manager Id: " + admin1.id);
		System.out.println("Name: " + admin1.name);
		System.out.println("Salary: " + admin1.salary + "rs");
		System.out.println("Allowance: " + admin1.allowance + "rs");

	}//main ends here

}
	