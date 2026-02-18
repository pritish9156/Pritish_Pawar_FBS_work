class LibraryUser {
	
	String userName;
	int lateReturnedDays;
	static double finePerDay = 100;
	
	public LibraryUser() {
		this.userName = "Not Avilable";
		this.lateReturnedDays = 0;
	}

	LibraryUser(String userName, int lateReturnedDays) {
		this.userName = userName;
		this.lateReturnedDays = lateReturnedDays;
	}

	String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	int getLateReturnedDays() {
		return lateReturnedDays;
	}

	void setLateReturnedDays(int lateReturnedDays) {
		this.lateReturnedDays = lateReturnedDays;
	}

	static double getFinePerDay() {
		return finePerDay;
	}

	static void setFinePerDay(double fine) {
		finePerDay = fine;
	}
	
	//method to calculate the total fine amount
	double calTotalFine() {
		return this.lateReturnedDays*finePerDay;
	}
	
	void display() {
		System.out.println("User Name: " + this.userName);
		System.out.println("Number of days the book is returned late: " + this.lateReturnedDays);
		System.out.println("Total Fine Amount: " + this.calTotalFine());
		System.out.println();
	}
	
}


public class TestLibraryFine {

	public static void main(String[] args) {
		
		LibraryUser lu1 = new LibraryUser("Rakesh", 10);
		LibraryUser lu2 = new LibraryUser("Ramesh", 5);
		LibraryUser lu3 = new LibraryUser("Renuka", 100);
		
		lu1.display();
		lu2.display();
		
		LibraryUser.setFinePerDay(200);

		lu3.display();
	}

}
