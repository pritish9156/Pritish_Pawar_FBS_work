class Date{

	//Attributes

	int day;
	int month;
	int year;
	String dow;

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
		Date d2 = new Date();

		//printing HashCode
		System.out.println("\nHash Code : " + d1);

		d1.setDay(10);
		d1.setMonth(2);
		d1.setYear(2026);
		d1.setDow("Tuesday");

		d2.setDay(10);
		d2.setMonth(10);
		d2.setYear(2026);
		d2.setDow("Tuesday");

		System.out.println("\nUsing Display Function");
		d1.display();

		//displaying information
		System.out.println("\nDate 2: " + d2.getDay() + "-" + d2.getMonth() + "-" + d2.getYear() + " " + d2.getDow());

		//compare age usgin getters
		if(d1.getYear() > d2.getYear() || d1.getMonth() > d2.getMonth() || d1.getDay() > d2.getDay()){
			System.out.println("\nd2 is older");
		}
		else{
			System.out.println("\nd1 is older");
		}


	}//main ends here

}