import java.util.Scanner;

class Date{
	int day, month, year;
	String dow;
	
	public Date() {
		this.day = 12;
		this.month = 04;
		this.year = 2026;
		this.dow = "Monday";
	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 * @param dow
	 */
	Date(int day, int month, int year, String dow) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		this.dow = dow;
	}

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	String getDow() {
		return dow;
	}

	void setDow(String dow) {
		this.dow = dow;
	}
	
	void display() {
		System.out.println("Day is " + this.day);
		System.out.println("Month is " + this.month);
		System.out.println("Year is " + this.year);
		System.out.println("Day of week is " + this.dow);
	}
	
}


public class Test {

	public static void main(String[] args) {
		
		System.out.println("Hello Java...!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Date ");
		System.out.println("Enter Day: ");
		int day = sc.nextInt();
		
		System.out.println("Enter Month: ");
		int month = sc.nextInt();
		
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
		System.out.println("Enter day of week: ");
		String dow = sc.next();
		
		Date d1 = new Date(10,03,2003,"Monday");
		Date d2 = new Date(day, month, year, dow);
		
		System.out.println();
		d1.display();
		System.out.println("\n After User Input");
		d2.display();
		
		sc.close();
	}

}
