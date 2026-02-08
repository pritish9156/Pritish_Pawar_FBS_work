class BankAccount{

	//Attributes

	int accountNumber;
 	String holderName;
 	double currentBalance;
 	int interestRate;

}// BankAccount class ends here

class Test8{

	public static void main(String args[]){

		BankAccount ba1 = new BankAccount(); //reference

		//HashCode
		System.out.println("HashCode: " + ba1);

		//initialization
		ba1.accountNumber = 800810695;
		ba1.holderName = "Ranveer Sharma";
		ba1.currentBalance = 41000;
		ba1.interestRate = 10;


		//display information
		System.out.println("\nAccount Number: " + ba1.accountNumber);
		System.out.println("Account Holder Name: " + ba1.holderName);
		System.out.println("Current Balance: " + ba1.currentBalance + "rs");
		System.out.println("Interest Rate: " + ba1.interestRate + "%");

	}//main ends here
}