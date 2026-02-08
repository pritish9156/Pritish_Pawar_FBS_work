class HR{

	//Attributes

	int id;
	String hrName;
	double salary;
	int commission;

}//HR class Ends here

class Test5{

	public static void main(String args[]){

		HR hr1 = new HR(); //reference

		//HashCode
		System.out.println("HashCode: " + hr1);

		//initialization
		hr1.id = 1;
		hr1.hrName = "Ramesh Pawar";
		hr1.salary = 21000;
		hr1.commission = 10;

		//displaying
		System.out.println("\nHR id: " + hr1.id);
		System.out.println("HR Name: " + hr1.hrName);
		System.out.println("HR salary: " + hr1.salary + "rs");
		System.out.println("HR id: " + hr1.commission + "%");

	}//main ends here

}