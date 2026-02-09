class Student{

	//Attributes

	String frn;
	String studentName;
	double distanceCovered;

}//Student Class Ends Here

class Test2{

	public static void main(String args[]){
		
		Student s1 = new Student(); //Reference
	
		//HashCode
		//System.out.println("\nHashCode : " + s1);

		//input
		s1.frn = "FRN1232323204";
		s1.studentName = "Raghav";
		s1.distanceCovered = 13;

		//printing output		
		System.out.println("\nFrn : " + s1.frn);
		System.out.println("Name : " + s1.studentName);
		System.out.println("Distance Covered : " + s1.distanceCovered + "kms");

	}//main ends here
}