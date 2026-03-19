package com.novabank.model;

import java.time.LocalDate;

public class CurrentAccount extends Account{
	
	double maxOverdraftLimit;

	public CurrentAccount(String accountNumber, String accountHolderName, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance, double maxOverdraftLimit) {
		
		super(accountNumber, accountHolderName, accountOpeningDate, accountClosingDate, interestRate, currentBalance);
		this.maxOverdraftLimit = maxOverdraftLimit;
	}
	
	
	//Getters and Setters
	
	public double getMaxOverdraftLimit() {
		return maxOverdraftLimit;
	}

	public void setMaxOverdraftLimit(double maxOverdraftLimit) {
		this.maxOverdraftLimit = maxOverdraftLimit;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nMax Overdraft Limit: " + maxOverdraftLimit;
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
	public boolean withdraw(double amount) {
		
		if(accountStatus == AccountStatus.ACTIVE) {
			
			if(amount > 0) {
				
				if((currentBalance - amount) >= (-maxOverdraftLimit)) {
					
					currentBalance -= amount;
					return true;
					
				}
				else
					System.out.println("Overdraft limit exceeded");
				
			} else 
				System.out.println("Please Enter a Valid Amount");
		
		} else 
			System.out.println("Your Account is Freezed or Not Active.. Please Contact with Bank");
		
		return false;
	}
	
	@Override
	public double calculateInterest() {
		
		return 0;
	}

}
