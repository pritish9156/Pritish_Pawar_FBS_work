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
		
		Employee e1 = new Employee(101, "Rajesh", 10000);
		Employee e2 = new Employee(102, "Ramesh", 20000);
		Employee e3 = new Employee(103, "Rakesh", 40000);
		
		e1.display();
		e2.display();
		
		Employee.setBonusRate(10);
		
		e3.display();

	}

}
