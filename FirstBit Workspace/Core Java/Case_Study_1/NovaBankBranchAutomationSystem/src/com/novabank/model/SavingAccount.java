package com.novabank.model;

import java.time.LocalDate;

public class SavingAccount extends Account {
	
	static final double MINIMUM_BALANCE = 10000;

	public SavingAccount(String accountNumber, String accountHolderName, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance) {
		
		super(accountNumber, accountHolderName, accountOpeningDate, accountClosingDate, interestRate, currentBalance);
		
	}
	
	//Getter

	public static double getMinimumBalance() {
		return MINIMUM_BALANCE;
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
