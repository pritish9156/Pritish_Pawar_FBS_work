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
		
		System.out.println("\nFRN: " + ps1.frn);
		System.out.println("Student Name: " + ps1.studentName);
		System.out.println("Distance Covered: " + ps1.distanceCovered + "kms");
		System.out.println("Company Name: " + ps1.companyName);
		System.out.println("Designation: " + ps1.designation);

	}//main ends here
}

