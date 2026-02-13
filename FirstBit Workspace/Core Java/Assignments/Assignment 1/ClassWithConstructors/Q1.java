class Date{

	//Attributes

	int day;
	int month;
	int year;
	String dow;

	//constructor 
	//default

	Date(){
		this.day = 10;
		this.month = 03;
		this.year = 2003;
		this.dow = "Monday";
	}

	//parametarised

	Date(int d, int m, int y, String dayOfWeek){
		this.day = d;
		this.month = m;
		this.year = y;
		this.dow = dayOfWeek;
	}
	
	//behaviour
	//setters //mutatters
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

	//getters //inspecters
	int getDay(){
		return this.day;
	}

	int getMonth(){
		return this.month;
	}

	int getYear(){
		return this.year;
	}

	String getDow(){
		return this.dow;
	}

	//display
	void display(){
		System.out.println("\nDate: " + this.day + "-" + this.month + "-" + this.year + " " + this.dow);
	}

} //Date class end here

class Test1{

	public static void main(String args[]){
	
		Date d1 = new Date(); //Reference
		Date d2 = new Date(11, 2, 2026, "wednesday");

		d1.display();
		d2.display();

		d1.setDay(21);

		d1.display();


	}//main ends here

}