class PlacedStudent{

	//Attributes

	String frn;
	String studentName;
	double distanceCovered;
	String companyName;
	String designation;

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
		
		System.out.println("\nHashCode: " + ps1);
		
		ps1.setFrn("FRN32434405");
		ps1.setStudName("Ramesh");
		ps1.setDistanceCovered(40);
		ps1.setCompanyName("TCS");
		ps1.setDesignation("Sales Manager");
		
		System.out.println("\nFRN: " + ps1.getFrn());
		System.out.println("Student Name: " + ps1.getStudName());
		System.out.println("Distance Covered: " + ps1.getDistanceCovered() + "kms");
		System.out.println("Company Name: " + ps1.getCompanyName());
		System.out.println("Designation: " + ps1.getDesignation());

		System.out.println("\nUsing display function");
		ps1.display();

	}//main ends here
}

