package com.novabank.model;

import java.time.LocalDate;

public class SavingAccount extends Account {
	
	static final double MINIMUM_BALANCE = 10000;

	public SavingAccount(String accountHolderName, String mobileNumber, String mailId, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance) {
		
		super(accountHolderName, mobileNumber, mailId, accountOpeningDate, accountClosingDate, interestRate, currentBalance);
		
	}
	
	//Getter

	public static double getMinimumBalance() {
		return MINIMUM_BALANCE;
	}


	@Override
	public boolean deposit(double amount) {
		
		if(accountStatus == AccountStatus.ACTIVE) {
			
			if(amount > 0) {
				
				currentBalance += amount;
				return true;
				
			} else 
				System.out.println("Please Enter a Valid Amount");
		
		} else 
			System.out.println("Your Account is Freezed or Not Active.. Please Contact with Bank");
		
		return false;
	}

	@Override
	public
	boolean withdraw(double amount) {
		
		if(accountStatus == AccountStatus.ACTIVE) {
			
			if(amount > 0) {
					
				if((currentBalance - amount) >= MINIMUM_BALANCE) {
						
						currentBalance -= amount;
						return true;
						
					}else
						System.out.println("Sufficient Balance is Not Avilable for withdrawal");
				
			} else 
				System.out.println("Please Enter a Valid Amount");
		
		} else 
			System.out.println("Your Account is Freezed or Not Active.. Please Contact with Bank");
		
		return false;
	}

	@Override
	public double calculateInterest() {
		
		if(accountStatus == AccountStatus.ACTIVE) {
				
			return currentBalance * interestRate;
				
		} else 
			System.out.println("Your Account is Freezed or Not Active.. Please Contact with Bank");
		
		return 0;
	}

}
