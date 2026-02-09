class Student{

	//Attributes

	String frn;
	String studentName;
	double distanceCovered;

	void setFrn(String f){
		this.frn = f;
	}

	void setStudName(String name){
		this.studentName = name;
	}

	void setDistanceCovered(double dc){
		this.distanceCovered = dc;
	}

}//Student Class Ends Here

class Test2{

	public static void main(String args[]){
		
		Student s1 = new Student(); //Reference
		Student s2 = new Student();
	
		//HashCode
		//System.out.println("\nHashCode : " + s1);

		//initialization using setfunction
		s1.setFrn("FRN134544409");
		s1.setStudName("Pritish Pawar");
		s1.setDistanceCovered(30);

		s2.setFrn("FRN134544404");
		s2.setStudName("Ramesh Pawar");
		s2.setDistanceCovered(10);

		//printing output		
		System.out.println("\nFrn : " + s1.frn);
		System.out.println("Name : " + s1.studentName);
		System.out.println("Distance Covered : " + s1.distanceCovered + "kms");

		System.out.println("\n\nFrn : " + s2.frn);
		System.out.println("Name : " + s2.studentName);
		System.out.println("Distance Covered : " + s2.distanceCovered + "kms");

	}//main ends here
}