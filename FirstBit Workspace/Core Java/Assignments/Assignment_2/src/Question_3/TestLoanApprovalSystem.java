package Question_3;

class Bank{
	double approveLoan(int percentage) {
		
		if(percentage >= 80) {
			return 200000.0;
		}else if(percentage < 80 && percentage >= 60){
			return 100000.0;
		}else if(percentage < 60 && percentage >= 40) {
			return 50000.0;
		}else if(percentage < 40) {
			return 0.0;
		}
		
		return 0;
	}
	
	double approveLoan(double sal) {
		
		if(sal >= 1200000.0) {
			return 700000.0;
		}else if(sal < 1200000.0 && sal >= 1000000.0){
			return 600000.0;
		}else if(sal < 1000000.0 && sal >= 600000.0) {
			return 500000.0;
		}else if(sal < 600000.0 && sal >= 400000.0) {
			return 400000.0;
		}else if(sal < 400000.0) {
			return 0.0;
		}
		
		return 0;
	}
}

class Student{
	int rollNo;
	String name;
	int percentage;
	
	public Student() {
		this.rollNo = 0;
		this.name = "Not avilable";
		this.percentage = 99;
	}

	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getPercentage() {
		return percentage;
	}

	void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
}

class Employee{
	int id;
	String name;
	double annualSal;
	
	public Employee() {
		this.id = 0;
		this.name = "Not avilable";
		this.annualSal = 1100000.0;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getAnnualSal() {
		return annualSal;
	}

	void setAnnualSal(double annualSal) {
		this.annualSal = annualSal;
	}
	
}

public class TestLoanApprovalSystem {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		Student s1 = new Student();
		Employee e1 = new Employee();
		
		s1.setPercentage(59);
		e1.setAnnualSal(700000);
		
		System.out.println("Loan Approval for Student: " + b1.approveLoan(s1.getPercentage()) + "rs for percentage of " + s1.getPercentage() +"%");
		System.out.println("Loan Approval for employee: " + b1.approveLoan(e1.getAnnualSal()) + "rs for annual salary of " + e1.getAnnualSal() +"LPA");

	}

}
