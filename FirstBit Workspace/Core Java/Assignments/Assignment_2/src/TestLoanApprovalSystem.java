class Bank{
	double approveLoan(Student s) {
		
		if(s.percentage >= 80) {
			return 200000.0;
		}else if(s.percentage < 80 && s.percentage >= 60){
			return 100000.0;
		}else if(s.percentage < 60 && s.percentage >= 40) {
			return 50000.0;
		}else if(s.percentage < 40) {
			return 0.0;
		}
		
		return 0;
	}
	
	double approveLoan(Employee e) {
		
		if(e.annualSal >= 1200000.0) {
			return 700000.0;
		}else if(e.annualSal < 1200000.0 && e.annualSal >= 1000000.0){
			return 600000.0;
		}else if(e.annualSal < 1000000.0 && e.annualSal >= 600000.0) {
			return 500000.0;
		}else if(e.annualSal < 600000.0 && e.annualSal >= 400000.0) {
			return 400000.0;
		}else if(e.annualSal < 400000.0) {
			return 0.0;
		}
		
		return 0;
	}
}

class Student{
	int rollNo;
	String name;
	double percentage;
	
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

	double getPercentage() {
		return percentage;
	}

	void setPercentage(double percentage) {
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
		
		System.out.println("Loan Approval for Student: " + b1.approveLoan(s1) + "rs for percentage of " + s1.getPercentage() +"%");
		System.out.println("Loan Approval for employee: " + b1.approveLoan(e1) + "rs for annual salary of " + e1.getAnnualSal() +"LPA");

	}

}
