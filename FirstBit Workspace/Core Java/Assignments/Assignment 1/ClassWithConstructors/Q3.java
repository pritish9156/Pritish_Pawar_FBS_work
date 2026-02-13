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

	//parametarised

	PlacedStudent(String f, String name, double dc, String cn, String d){
		this.frn = f;
		this.studentName = name;
		this.distanceCovered = dc;
		this.companyName = cn;
		this.designation = d;
	}

	void setFrn(String f){
		this.frn = f;
	}

	void setStudName(String sn){
		this.studentName = sn;
	}

	void setDistanceCovered(double dc){
		this.distanceCovered = dc;
	}

	void setCompanyName(String cn){
		this.companyName = cn;
	}

	void setDesignation(String desig){
		this.designation = desig;
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

	String getCompanyName(){
		return this.companyName;
	}

	String getDesignation(){
		return this.designation;
	}

	//display

	void display(){
		System.out.println("\nFRN: " + frn);
		System.out.println("Student Name: " + studentName);
		System.out.println("Distance Covered: " + distanceCovered + "kms");
		System.out.println("Company Name: " + companyName);
		System.out.println("Designation: " + designation);
	}
	
}//PlacedStudent class ends here

class Test3{

	public static void main(String args[]){
	
		PlacedStudent ps1 = new PlacedStudent(); //Reference

		PlacedStudent ps2 = new PlacedStudent(
			"FRN32434405",
			"Ramesh",
			40,
			"TCS",
			"Sales Manager"
		);

		ps1.display();
		ps2.display();

	}//main ends here
}

