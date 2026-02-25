class Account{
	String accountHolder;
	long accountNumber;
	String bankName;
	double balance;
	String accountType;
	
	public Account() {
		this.accountHolder = "Not Given";
		this.accountNumber = 0;
		this.bankName = "Not Given";
		this.balance = 0;
		this.accountType = "Not Given";
	}

	Account(String accountHolder, long accountNumber, String bankName, double balance, String accountType) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.balance = balance;
		this.accountType = accountType;
	}

	void display() {
		System.out.println("Account Holder: " + this.accountHolder);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Bank Name: " + this.bankName);
		System.out.println("Balance: " + this.balance);
		System.out.println("Account Type: " + this.accountType);
	}
}

class SavingAccount extends Account{
	double interestRate;
	double minimumBalance;
	
	public SavingAccount() {
		super();
		this.interestRate = 0;
		this.minimumBalance = 0;
	}

	SavingAccount(String accountHolder, long accountNumber, String bankName, double balance, String accountType, double interestRate, double minimumBalance) {
		super(accountHolder, accountNumber, bankName, balance, accountType);
		this.interestRate = interestRate;
		this.minimumBalance = minimumBalance;
	}

	void display() {
		super.display();
		System.out.println("Interest Rate: " + this.interestRate);
		System.out.println("Minimum Balance: " + this.minimumBalance);
	}
}

class CurrentAccount extends Account{
	double overdraftLimit;
	String businessType;
	
	public CurrentAccount() {
		super();
		this.overdraftLimit = 0;
		this.businessType = "Not Given";
	}

	CurrentAccount(String accountHolder, long accountNumber, String bankName, double balance, String accountType, double overdraftLimit, String businessType) {
		super(accountHolder, accountNumber, bankName, balance, accountType);
		this.overdraftLimit = overdraftLimit;
		this.businessType = businessType;
	}

	void display() {
		super.display();
		System.out.println("Overdraft Limit: " + this.overdraftLimit);
		System.out.println("Business Type: " + this.businessType);
	}
}

public class TestAccount{
	public static void main(String[] args) {
		
		SavingAccount s1 = new SavingAccount("Pritish", 12345678901L, "SBI", 50000, "Saving", 3.5, 1000);
		CurrentAccount c1 = new CurrentAccount("Ramesh", 98765432101L, "HDFC", 75000, "Current", 20000, "Shop");
		
		s1.display();
		System.out.println();
		c1.display();
	}
}