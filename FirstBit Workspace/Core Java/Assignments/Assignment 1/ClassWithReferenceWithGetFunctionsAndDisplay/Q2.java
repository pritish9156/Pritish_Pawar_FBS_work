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

	//getters

	String getFrn(){
		return this.frn;
	}

	String getStudName(){
		return this.studentName;
	}

	double getDistanceCovered(){
		return this.distanceCovered;
	}

	//display
	
	void display(){
		System.out.println("\nFrn : " + frn);
		System.out.println("Name : " + studentName);
		System.out.println("Distance Covered : " + distanceCovered + "kms");
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

		s1.display();
		s2.display();

	}//main ends here
}