package com.novabank.model;

import java.time.LocalDate;

public class SalaryAccount extends SavingAccount {
	
	LocalDate lastTransactionDate;

	public SalaryAccount(String accountHolderName, String mobileNumber, String mailId, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance, LocalDate lastTransactionDate) {
		
		super(accountHolderName, mobileNumber, mailId, accountOpeningDate, accountClosingDate, interestRate, currentBalance);
		this.lastTransactionDate = lastTransactionDate;
	}

	public LocalDate getLastTransactionDate() {
		return lastTransactionDate;
	}
	
	@Override
	public boolean deposit(double amount) {
		
		if(checkAccountInactivity()) {
			return false;
		}
		
		if(amount > 0) {
			
			currentBalance += amount;
			
			lastTransactionDate = LocalDate.now();
			
			return true;
		}
		
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		
		if(checkAccountInactivity()) {
			return false;
		}
		
		if(amount > 0 && 
				(currentBalance - amount) >= getMinimumBalance()) {
			
			currentBalance -= amount;
			
			lastTransactionDate = LocalDate.now();
			
			return true;
		}
		
		return false;
	}
	
	boolean checkAccountInactivity() {
		
		if(lastTransactionDate
				.plusMonths(2)
				.isBefore(LocalDate.now())) {
			
			accountStatus = AccountStatus.FROZEN;
			
			return true;
		}
		
		return false;
	}

}
