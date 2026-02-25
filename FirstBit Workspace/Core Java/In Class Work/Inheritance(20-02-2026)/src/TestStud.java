import java.util.Scanner;

class Student{

	//Attributes
	
	String frn;
	String studentName;
	double distanceCovered;
	static int count;
	
	static {
		count = 0;
	}

	//constructors
	//default
	
	Student() {
		this.frn = "123243006";
		this.studentName = "Rakesh Ramesh";
		this.distanceCovered = 20;
		count++;
	}	

	Student(String frn, String studentName, double distanceCovered) {
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
		count++;
	}
	
	String getFrn() {
		return frn;
	}

	void setFrn(String frn) {
		this.frn = frn;
	}

	String getStudentName() {
		return studentName;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	double getDistanceCovered() {
		return distanceCovered;
	}

	void setDistanceCovered(double distanceCovered) {
		this.distanceCovered = distanceCovered;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}

	void display(){
		System.out.println("\nFrn : " + frn);
		System.out.println("Name : " + studentName);
		System.out.println("Distance Covered : " + distanceCovered + "kms");
	}


}//Student Class Ends Here

class PlacedStudent extends Student{

	//Attributes
	String companyName;
	String designation;

	//constructors
	//default

	PlacedStudent(){
		super();
		this.companyName = "not placed yet";
		this.designation = "not placed yet";
	}

	//Parameterized
	PlacedStudent(String frn, String studentName, double distanceCovered, String companyName, String designation) {
		super(frn,studentName,distanceCovered);
		this.companyName = companyName;
		this.designation = designation;
	}

	double getDistanceCovered() {
		return distanceCovered;
	}

	void setDistanceCovered(double distanceCovered) {
		this.distanceCovered = distanceCovered;
	}

	String getCompanyName() {
		return companyName;
	}

	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	void display(){
		super.display();
		System.out.println("Company Name: " + companyName);
		System.out.println("Designation: " + designation);
	}
	
}//PlacedStudent class ends here

public class TestStud {

	public static void main(String[] args) {

		Student s1 = new Student("1", "Pritish", 200);
		Student s2 = new Student("2", "Utkarsh", 300);
		Student s3 = new Student("3", "Suryakant", 500);
		Student s4 = new Student("4", "Rani", 300);


		PlacedStudent ps1 = new PlacedStudent("3", "Suryakant", 500, "TCS", "Developer");
		PlacedStudent ps2 = new PlacedStudent("4", "Rani", 600, "Wipro", "Backend");
		
		System.out.println(Student.getCount());
		ps1.display();
	}

}
