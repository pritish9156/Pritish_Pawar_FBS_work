package com.novabank.exceptions;

public class SavingAccountMinimumLimitException extends Exception{

	public SavingAccountMinimumLimitException() {
		super("Minimum Deposit of 10000rs needed to open a Saving Account");
	}
}
