package com.novabank.model;

import java.time.LocalDate;

public class SalaryAccount extends SavingAccount {
	
	LocalDate lastTransactionDate;

	public SalaryAccount(String accountNumber, String accountHolderName, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance, LocalDate lastTransactionDate) {
		
		super(accountNumber, accountHolderName, accountOpeningDate, accountClosingDate, interestRate, currentBalance);
		this.lastTransactionDate = lastTransactionDate;
	}

	public LocalDate getLastTransactionDate() {
		return lastTransactionDate;
	}
	
	@Override
	public boolean deposit(double amount) {
		
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		
		return false;
	}
	
	void checkAccountInactivity() {
		
	}

}
