class PlacedStudent{

	//Attributes

	String frn;
	String studentName;
	double distanceCovered;
	String companyName;
	String designation;
	
}//PlacedStudent class ends here

class Test3{

	public static void main(String args[]){
	
		PlacedStudent ps1 = new PlacedStudent(); //Reference
		
		System.out.println("\nHashCode: " + ps1);
		
		//initialization
		ps1.frn = "FRN12343433406";
		ps1.studentName = "Raghav";
		ps1.distanceCovered = 13.4;
		ps1.companyName = "RK Plastic";
		ps1.designation = "Sales Manager";
		
		System.out.println("\nFRN: " + ps1.frn);
		System.out.println("Student Name: " + ps1.studentName);
		System.out.println("Distance Covered: " + ps1.distanceCovered + "kms");
		System.out.println("Company Name: " + ps1.companyName);
		System.out.println("Designation: " + ps1.designation);

	}//main ends here
}

