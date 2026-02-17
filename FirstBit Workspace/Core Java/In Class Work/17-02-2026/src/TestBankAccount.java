class BankAccount{

	//Attributes
	int accountNumber;
 	String holderName;
 	double currentBalance;
 	static double interestRate = 8.7;

        //constructors
	//default
	BankAccount(){
		this.accountNumber = 0;
		this.holderName = "not avilable";
		this.currentBalance = 0;
	}

	//Parameterized
	BankAccount(int accountNumber, String holderName, double currentBalance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.currentBalance = currentBalance;
	}
	
	//getters and setters
	int getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getHolderName() {
		return holderName;
	}

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	double getCurrentBalance() {
		return currentBalance;
	}

	void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	double getInterestRate() {
		return interestRate;
	}

	static void setInterestRate(double iRate) {
		interestRate = iRate;
	}

	void display(){
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Account Holder Name: " + holderName);
		System.out.println("Current Balance: " + currentBalance + "rs");
		System.out.println("Interest Rate: " + interestRate + "%");
	}


}// BankAccount class ends here

class TestBankAccount{

	public static void main(String args[]){

		BankAccount b1 = new BankAccount(101, "Utkarsh", 10000);
		BankAccount b2 = new BankAccount(102, "sushant", 50000);
		
		b1.display();
		b2.display();
		
		BankAccount.setInterestRate(10);
		
		b1.display();
		b2.display();

	}//main ends here
}