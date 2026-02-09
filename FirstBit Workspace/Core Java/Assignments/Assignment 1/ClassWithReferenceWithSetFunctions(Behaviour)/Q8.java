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
		System.out.println("\nAccount Number: " + ba1.accountNumber);
		System.out.println("Account Holder Name: " + ba1.holderName);
		System.out.println("Current Balance: " + ba1.currentBalance + "rs");
		System.out.println("Interest Rate: " + ba1.interestRate + "%");

	}//main ends here
}