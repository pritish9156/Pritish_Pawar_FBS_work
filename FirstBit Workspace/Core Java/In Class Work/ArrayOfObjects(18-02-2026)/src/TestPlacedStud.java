import java.util.Scanner;

class PlacedStudent{

	//Attributes

	String frn;
	String studentName;
	double distanceCovered;
	String companyName;
	String designation;

	//constructors
	//default

	PlacedStudent(){
		this.frn = "not avilable";
		this.studentName = "not avilable";
		this.distanceCovered = 1;
		this.companyName = "not placed yet";
		this.designation = "not placed yet";
	}

	//Parameterized
	PlacedStudent(String frn, String studentName, double distanceCovered, String companyName, String designation) {
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
		this.companyName = companyName;
		this.designation = designation;
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
		System.out.println("\nFRN: " + frn);
		System.out.println("Student Name: " + studentName);
		System.out.println("Distance Covered: " + distanceCovered + "kms");
		System.out.println("Company Name: " + companyName);
		System.out.println("Designation: " + designation);
	}
	
}//PlacedStudent class ends here



public class TestPlacedStud {

	public static void main(String[] args) {
		PlacedStudent[] psArray = new PlacedStudent[3];
		
		Scanner sc = new Scanner(System.in);
		
		psArray[0] = new PlacedStudent("FRN12233204", "Rajesh", 100, "TCS", "Wagholi"); 
		psArray[1] = new PlacedStudent("FRN12233202", "Ramesh", 10, "not placed", "Wagholi");
		psArray[2] = new PlacedStudent();
		
		//student not placed
		for(int i=0; i<psArray.length; i++) {
			if( psArray[i].getFrn().contains("FRN") && psArray[i].getCompanyName().contains("not placed")) {
				psArray[i].display();
			}
		}
		sc.close();
	}

}
