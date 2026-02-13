class Student{

	//Attributes

	String frn;
	String studentName;
	double distanceCovered;

	//constructors
	//default
	
	Student(){
		this.frn = "not avilable";
		this.studentName = "not avilable";
		this.distanceCovered = 1;
	}

	Student(String f, String name, double dc){
		this.frn = f;
		this.studentName = name;
		this.distanceCovered = dc;
	}

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
		Student s2 = new Student("not avilable", "not avilable", 1);
	
		s1.display();
		s2.display();

				
		
	}//main ends here
}