package Assignment_1;

import InvalidateFormExceptions.*;

public class AdmissionForm {
		
	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	static int count = 0;
	static AdmissionForm[] admissionForm = new AdmissionForm[3];
	
	public AdmissionForm() {
		this.studentName = "Not Given";
		this.age = 0;
		this.percentage = 0.00;
		this.courseFees = 0.00;
		this.feesPaid = 0.00;	
	}
	
	public AdmissionForm(String studentName, int age, double percentage, String courseName, double feesPaid) throws EmptyNameException, FeesNotPaidException, InsufficientFeesException, InvalidPercentageException, NotFitForAdmissionException, UnderageException {
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = this.calCourseFees(courseName);
		this.feesPaid = feesPaid;
		
		if(this.validateForm())
			admissionForm[count++] = this;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	//validation method
	public boolean validateForm() throws EmptyNameException,
	FeesNotPaidException, InsufficientFeesException, InvalidPercentageException, 
	NotFitForAdmissionException, UnderageException{
		
		if(studentName == null || studentName.isBlank()) {
			throw new EmptyNameException();
		}
		
		if(age < 17) {
			throw new UnderageException();
		}
		
		if(percentage < 0 || percentage > 100) {
			throw new InvalidPercentageException();
		}
		
		if(percentage < 35) {
			throw new NotFitForAdmissionException();
		}
		
		if(feesPaid == 0) {
			throw new FeesNotPaidException();
		}
		
		if(feesPaid < (courseFees*0.30)) {
			throw new InsufficientFeesException();
		}	
		
		return true;
	}
	
	static void display() {
		for(int i=0; i<admissionForm.length; i++) {
			if(admissionForm[i] != null) {
				System.out.println("Student Name: " + admissionForm[i].studentName);
				System.out.println("Student Age: " + admissionForm[i].age);
				System.out.println("Student Percentage: " + admissionForm[i].percentage);
				System.out.println("Course Fees: " + admissionForm[i].courseFees);
				System.out.println("Course Fees Paid: " + admissionForm[i].feesPaid);
				System.out.println();
			}
		}
	}
	
	double calCourseFees(String courseName) {
		if(courseName.equals("BCA")) {
			return 40000;
		}
		
		if(courseName.equals("BBA")) {
			return 40000;
		}
		
		if(courseName.equals("BBA(CA)")) {
			return 40000;
		}
		
		return 0;
	}
}
