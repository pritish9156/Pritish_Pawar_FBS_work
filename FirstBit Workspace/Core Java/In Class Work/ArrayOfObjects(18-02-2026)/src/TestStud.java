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

		Student[] studArray = new Student[3];
		
		for(int i=0; i<studArray.length; i++) {
			studArray[i] = new Student();
		}
		
		studArray[0].setStudentName("Rocky");
		studArray[0].setFrn("FRN2344324306");
		studArray[0].setDistanceCovered(20.5);
		
		for(int i=0; i<studArray.length; i++) {
			studArray[i].display();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter FRN number to search: ");
		String frn = sc.next();
		
		boolean flag = true;
		
		for(int i=0; i<studArray.length; i++) {
			if(frn.equals(studArray[i].getFrn())) {
				studArray[i].display();
				flag = false;
			}
		}
		
		if(flag) System.out.println("\nStudent Not Found....");

	}

}
