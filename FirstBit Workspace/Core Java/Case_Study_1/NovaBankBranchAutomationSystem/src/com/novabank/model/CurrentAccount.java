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
		
		return false;
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		return false;
	}
	
	@Override
	public double calculateInterest() {
		
		return 0;
	}

}
