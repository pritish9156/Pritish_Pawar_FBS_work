class Date{

	//Attributes

	int day;
	int month;
	int year;
	String dow;

	//behaviour
	void setDay(int d){
		this.day = d;
	}
	
	void setMonth(int m){
		this.month = m;
	}

	void setYear(int y){
		this.year = y;
	}

	void setDow(String dw){
		this.dow = dw;
	}

} //Date class end here

class Test1{

	public static void main(String args[]){
	
		Date d1 = new Date(); //Reference

		//printing HashCode
		System.out.println("\nHash Code : " + d1);

		d1.setDay(9);
		d1.setMonth(2);
		d1.setYear(2026);
		d1.setDow("Monday");

		//displaying information
		System.out.println("\nDate: " + d1.day + "-" + d1.month + "-" + d1.year + " " + d1.dow);

	}//main ends here

}