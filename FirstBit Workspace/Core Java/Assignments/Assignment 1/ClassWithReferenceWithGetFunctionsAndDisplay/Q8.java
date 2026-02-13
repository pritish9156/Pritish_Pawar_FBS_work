class BankAccount{

	//Attributes

	int accountNumber;
 	String holderName;
 	double currentBalance;
 	int interestRate;

	void setAccNumber(int accNum){
		this.accountNumber = accNum;
	}

	void setHolderName(String name){
		this.holderName = name;
	}

	void setCurrBalance(double curBal){
		this.currentBalance = curBal;
	}

	void setInterestRate(int i){
		this.interestRate = i;
	}

	//getters

	int getAccNumber(){
		return this.accountNumber;
	}

	String getHolderName(){
		return this.holderName;
	}

	double getCurrBalance(){
		return this.currentBalance;
	}

	int getInterestRate(){
		return this.interestRate;
	}

	void display(){
		System.out.println("\nAccount Number: " + accountNumber);
		System.out.println("Account Holder Name: " + holderName);
		System.out.println("Current Balance: " + currentBalance + "rs");
		System.out.println("Interest Rate: " + interestRate + "%");
	}


}// BankAccount class ends here

class Test8{

	public static void main(String args[]){

		BankAccount ba1 = new BankAccount(); //reference

		//HashCode
		System.out.println("HashCode: " + ba1);

		//initialization
		ba1.setAccNumber(800810695);
		ba1.setHolderName("Ranveer Sharma");
		ba1.setCurrBalance(41000);
		ba1.setInterestRate(10);


		//display information
		System.out.println("\nAccount Number: " + ba1.getAccNumber());
		System.out.println("Account Holder Name: " + ba1.getHolderName());
		System.out.println("Current Balance: " + ba1.getCurrBalance() + "rs");
		System.out.println("Interest Rate: " + ba1.getInterestRate() + "%");

		ba1.display();

	}//main ends here
}