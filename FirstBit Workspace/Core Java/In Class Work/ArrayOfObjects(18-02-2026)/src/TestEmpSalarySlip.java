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
		
		Employee[] arr = new Employee[3];
		
		arr[0] = new Employee(101, "Ranvir", 1000);
		arr[1] = new Employee();
		arr[2] = new Employee();
		
		arr[1].setEmpId(102);
		arr[1].setEmpName("Rajesh");
		arr[1].setBasicSal(20000);
		
		for(int i=0; i<arr.length; i++) {
			arr[i].display();
		}

	}

}
