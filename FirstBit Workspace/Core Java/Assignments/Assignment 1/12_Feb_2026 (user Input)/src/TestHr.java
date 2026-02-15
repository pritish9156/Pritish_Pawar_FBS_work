import java.util.Scanner;

class HR{

	//Attributes

	int id;
	String hrName;
	double salary;
	int commission;

	//constructor
	//default

	HR(){
		this.id = -1;
		this.hrName = "Not avilable";
		this.salary = 5000;
		this.commission = 5;
	}


	//parametarised

	HR(int i, String name, double sal, int com){
		this.id = i;
		this.hrName = name;
		this.salary = sal;
		this.commission = com;
	}

	void setId(int i){
		this.id = i;
	}

	void setEmpName(String name){
		this.hrName = name;
	}

	void setSalary(double sal){
		this.salary = sal;
	}

	void setCommission(int com){
		this.commission = com;
	}

	//getters

	int getId(){
		return this.id;
	}

	String getEmpName(){
		return this.hrName;
	}

	double getSalary(){
		return this.salary;
	}

	int getCommission(){
		return this.commission;
	}

	void display(){
		System.out.println("\nHR id: " + id);
		System.out.println("HR Name: " + hrName);
		System.out.println("HR salary: " + salary + "rs");
		System.out.println("HR Commission: " + commission + "%");
	}


}//HR class Ends here

class TestHr{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
			
		System.out.println("\nEnter HR id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter HR salary: ");
		double sal = sc.nextDouble();
		
		System.out.println("Enter HR Commission: ");
		int com = sc.nextInt();
		
		HR hr2 = new HR();
		HR hr1 = new HR(id, name, sal, com);

		hr1.display();
		hr2.display();
		
		sc.close();

	}//main ends here

}