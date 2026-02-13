class BankAccount{

	//Attributes

	String accountNumber;
 	String holderName;
 	double currentBalance;
 	int interestRate;

        //constructors
	//default
	
	BankAccount(){
		this.accountNumber = "not avilable";
		this.holderName = "not avilable";
		this.currentBalance = 100;
		this.interestRate = 5;
	}

	//parametarised

	BankAccount(String accNum, String hn, double currBal, int i){
		this.accountNumber = accNum;
		this.holderName = hn;
		this.currentBalance = currBal;
		this.interestRate = i;
	}


	void setAccNumber(String accNum){
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

	String getAccNumber(){
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

		BankAccount ba1 = new BankAccount("800810695", "Ranveer Sharma", 41000, 10); //reference
		BankAccount ba2 = new BankAccount();

		ba1.display();
		ba2.display();

	}//main ends here
}