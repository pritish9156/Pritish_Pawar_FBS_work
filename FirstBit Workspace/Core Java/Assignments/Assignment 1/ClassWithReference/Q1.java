class Date{

	//Attributes

	int day;
	int month;
	int year;
	String dow;

} //Date class end here

class Test1{

	public static void main(String args[]){
	
		Date d1 = new Date(); //Reference
		Date d2 = new Date();
		int a;

		//printing HashCode
		System.out.println("\nHash Code : " + d1);

		//System.out.println(a); //error -> variable not initiallized if not in class 

		//if inside class integer will be initiallized with 0 and non integer with null

		//input
		d1.day = 10;
		d1.month = 12;
		d1.year = 2003;
		d1.dow = "Wednesday";

		System.out.println("Date: " + d1.day + "-" + d1.month + "-" + d1.year + " " + d1.dow);

		//hashcode of the second object
		System.out.println();
		System.out.println("Second Object Hash Code : " + d2);

	}//main ends here

}