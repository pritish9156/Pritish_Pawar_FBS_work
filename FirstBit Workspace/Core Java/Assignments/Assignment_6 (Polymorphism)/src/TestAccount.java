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
	
	String showCurrentBalance() {
		return "Current Balance" + "\nAccount Number: " + this.accountNumber + "\nAccount Holder Name: " + this.accountHolder + "\nTotal Balance: " + this.balance;
	}

	@Override
	public String toString() {
		return "accountHolder=" + accountHolder + "\naccountNumber=" + accountNumber + "\nbankName=" + bankName
				+ "\nbalance=" + balance + "\naccountType=" + accountType;
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
	
	String showCurrentBalance() {
		return "Current Balance" + "\nAccount Number: " + this.accountNumber + "\nAccount Holder Name: " + this.accountHolder + "\nInterest Rate: " + this.interestRate + "\nTotal Balance: " + this.calTotalBalance();
	}
	
	double calTotalBalance() {
		return this.balance + this.interestRate;
	}

	@Override
	public String toString() {
		return super.toString()+"\ninterestRate=" + interestRate + "\nminimumBalance=" + minimumBalance;
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

	String showCurrentBalance() {
		return "Current Balance" + "\nAccount Number: " + this.accountNumber + "\nAccount Holder Name: " + this.accountHolder + "\nOverdraft Limit: " + this.overdraftLimit + "\nTotal Balance: " + this.balance;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\noverdraftLimit=" + overdraftLimit + "\nbusinessType=" + businessType;
	}
}

public class TestAccount{
	public static void main(String[] args) {
		
		Account[] acc = new Account[5];
		
		acc[0]=new SavingAccount("Pritish", 12345678901L, "SBI", 50000, "Saving", 3.5, 1000);		
		acc[1]=new CurrentAccount("Ramesh", 98765432101L, "HDFC", 75000, "Current", 20000, "Shop");
		acc[4]=new CurrentAccount("Manisha", 9876543301L, "SBI", 45000, "Saving", 20000, "Shop");
//		SavingAccount s1 = new SavingAccount("Pritish", 12345678901L, "SBI", 50000, "Saving", 3.5, 1000);
//		CurrentAccount c1 = new CurrentAccount("Ramesh", 98765432101L, "HDFC", 75000, "Current", 20000, "Shop");
		
		for(int i=0; i<acc.length; i++) {
			if(acc[i]!=null) {
				System.out.println(acc[i].showCurrentBalance());
				System.out.println();
			}
		}
	}	
}
