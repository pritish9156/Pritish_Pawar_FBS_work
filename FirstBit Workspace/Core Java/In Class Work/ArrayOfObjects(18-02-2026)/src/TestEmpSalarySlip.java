import java.util.Scanner;

class Employee{
	
	int empId;
	String empName;
	double basicSal;
	static double bonusRate = 5;
	
	public Employee() {
		this.empId = 0;
		this.empName = "not avilable";
		this.basicSal = 0;
	}

	Employee(int empId, String empName, double basicSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSal = basicSal;
	}

	int getEmpId() {
		return empId;
	}

	void setEmpId(int empId) {
		this.empId = empId;
	}

	String getEmpName() {
		return empName;
	}

	void setEmpName(String empName) {
		this.empName = empName;
	}

	double getBasicSal() {
		return basicSal;
	}

	void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	static double getBonusRate() {
		return bonusRate;
	}

	//A method to update the bonus rate
	static void setBonusRate(double br) {
		bonusRate = br;
	}
	
	//method to calculate the total salary
	double calTotalSal() {
		return this.basicSal + (this.basicSal * bonusRate / 100);
	}
	
	void display() {
		System.out.println("Employee Name: " + this.empName);
		System.out.println("Basic Salary: " + this.basicSal);
		System.out.println("Bonus Amount: " + this.basicSal * bonusRate / 100);
		System.out.println("Total Salary: " + this.calTotalSal());
		System.out.println();
	}
	
}


public class TestEmpSalarySlip {

	public static void main(String[] args) {
		
		Employee[] empArray = new Employee[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<empArray.length; i++) {
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name: ");
			String name = sc.nextLine();
			System.out.println("Enter basic salary: ");
			double sal = sc.nextDouble();
			System.out.println();
			
			empArray[i] = new Employee(id, name, sal);
		}
		
		for(int i=0; i<empArray.length; i++) {
			empArray[i].display();
		}
		
		//search by emp id and name
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
					
					for(int i=0; i<empArray.length; i++) {
						if(empArray[i].getEmpName().contains(nameToSearch)) {
							empArray[i].display();
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
					
					for(int i=0; i<empArray.length; i++) {
						if(empArray[i].getEmpId() == empIdToSearch) {
							empArray[i].display();
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
		
	}

}
