import java.util.Scanner;

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
		this.currentBalance = 0;
		this.interestRate = 0;
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

class TestBankAccount{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter Account Number: ");
		String accNum = sc.nextLine();
		
		System.out.println("Enter Holder Name: ");
		String holderName = sc.nextLine();
		
		System.out.println("Enter Amount to deposit: ");
		double deposit = sc.nextDouble();
		
		System.out.println("Enter Interest Rate: ");
		int interestRate = sc.nextInt();
		
		BankAccount ba1 = new BankAccount(accNum, holderName, deposit, interestRate);
		BankAccount ba2 = new BankAccount();
		
		ba1.display();
		ba2.display();
		
		sc.close();

	}//main ends here
}