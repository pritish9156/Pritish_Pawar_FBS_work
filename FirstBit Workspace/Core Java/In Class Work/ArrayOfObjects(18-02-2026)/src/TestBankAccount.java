import java.util.Scanner;

class BankAccount{

	//Attributes

	int accountNumber;
 	String holderName;
 	double currentBalance;
 	double interestRate;

        //constructors
	//default
	
	BankAccount(){
		this.accountNumber = 0;
		this.holderName = "not available";
		this.currentBalance = 0;
		this.interestRate = 0;
	}

	//Parameterized

	BankAccount(int accNum, String hn, double currBal, double i){
		this.accountNumber = accNum;
		this.holderName = hn;
		this.currentBalance = currBal;
		this.interestRate = i;
	}


	void setAccNumber(int accNum){
		this.accountNumber = accNum;
	}

	void setHolderName(String name){
		this.holderName = name;
	}

	void setCurrBalance(double curBal){
		this.currentBalance = curBal;
	}

	void setInterestRate(double i){
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

	double getInterestRate(){
		return this.interestRate;
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

		Scanner sc = new Scanner(System.in);
		
		BankAccount[] bankArray = new BankAccount[3];
		
		for(int i=0; i<bankArray.length; i++) {
			bankArray[i] = new BankAccount();
			System.out.println(bankArray[i]);
		}
		
		bankArray[0] = new BankAccount(101, "pritish", 1000, 10);
		System.out.println(bankArray[0]);
		
		System.out.println("\nEnter Bank Account number: ");
		int accToSearch = sc.nextInt();
		
		for(int i=0; i<bankArray.length; i++) {
			if(accToSearch == bankArray[i].getAccNumber()) {
				bankArray[i].display();
			}
		}
		
		sc.close();

	}//main ends here
}