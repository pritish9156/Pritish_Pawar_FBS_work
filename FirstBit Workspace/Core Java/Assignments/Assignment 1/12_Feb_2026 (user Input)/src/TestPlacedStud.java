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
		PlacedStudent ps1 = new PlacedStudent();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Frn Number: ");
		String frn = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		String studName = sc.nextLine();
		
		System.out.println("Enter Distance Covered: ");
		double distCov = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Company Name: ");
		String comName = sc.nextLine();
		
		System.out.println("Enter Designation: ");
		String desig = sc.nextLine();
		
		PlacedStudent ps2 = new PlacedStudent(frn, studName, distCov, comName, desig);

		ps1.display();
		System.out.println("\nUser Input : ");
		ps2.display();
		
		sc.close();
	}

}
