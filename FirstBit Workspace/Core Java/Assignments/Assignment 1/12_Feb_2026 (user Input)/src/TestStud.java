import java.util.Scanner;

class Student{

	//Attributes
	
	String frn;
	String studentName;
	double distanceCovered;

	//constructors
	//default
	
	Student() {
		this.frn = "123243006";
		this.studentName = "Rakesh Ramesh";
		this.distanceCovered = 20;
	}	

	Student(String frn, String studentName, double distanceCovered) {
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
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

	void display(){
		System.out.println("\nFrn : " + frn);
		System.out.println("Name : " + studentName);
		System.out.println("Distance Covered : " + distanceCovered + "kms");
	}


}//Student Class Ends Here


public class TestStud {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Frn Number: ");
		String frn = sc.next();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Distance Covered: ");
		double dc = sc.nextDouble();
		
		Student s2 = new Student(frn, name, dc);
		
		s1.display();
		System.out.println("\n user input : ");
		s2.display();
		
		sc.close();

	}

}
