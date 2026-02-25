import java.util.Scanner;

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

	//Parameterized

	Admin(int i, String n, double sal, double a){
		this.id = i;
		this.name = n;
		this.salary = sal;
		this.allowance = a;
	}


	//Mutators
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

	//getters inspectors accesses

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

class TestAdmin{

	public static void main(String args[]){
		
	
		Admin[] adminArray = new Admin[3];
		
		adminArray[0] = new Admin(101, "pritish", 2000, 100);
		adminArray[2] = new Admin();
		adminArray[1] = new Admin();
		
		adminArray[2].setId(102);
		adminArray[2].setEmpName("Rohit");
		adminArray[2].setSalary(20000);
		adminArray[2].setAllowance(200);
		
		for(int i=0; i<adminArray.length; i++) {
			adminArray[i].display();
		}
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {
			System.out.println("\n1.Search by name\n2.Search by id\n3.Exit");
			System.out.println("Enter Your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1: {
					System.out.println("\nEnter name to search: ");
					sc.nextLine();
					String nameToSearch = sc.nextLine();
					
					boolean flag=true;
					
					for(int i=0; i<adminArray.length; i++) {
						if(adminArray[i].getEmpName().contains(nameToSearch)) {
							adminArray[i].display();
							flag=false;
						}
					}
					
					if(flag) System.out.println("\nEmployee Not found...");
					break;
				}
					
				case 2: {
					System.out.println("\nEnter employee id to search: ");
					int empIdToSearch = sc.nextInt();
					
					boolean flag=true;
					
					for(int i=0; i<adminArray.length; i++) {
						if(adminArray[i].getId() == empIdToSearch) {
							adminArray[i].display();
							flag=false;
						}
					}
					
					if(flag) System.out.println("\nEmployee Not Found");
					break;
				}
				
				case 3: {
					System.out.println("\nEnd..");
				}
			}
		}while(choice!=3);
		
		sc.close();
	}//main ends here

}
	