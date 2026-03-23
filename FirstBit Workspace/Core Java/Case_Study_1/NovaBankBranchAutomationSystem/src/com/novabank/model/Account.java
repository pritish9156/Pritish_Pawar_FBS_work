package com.novabank.model;

import java.time.LocalDate;

public abstract class Account {
	
	String accountNumber;
	String accountHolderName;
	String mobileNumber;
	String mailId;
	LocalDate accountOpeningDate;
	LocalDate accountClosingDate;
	double interestRate;
	double currentBalance;
	AccountStatus accountStatus;
	Transaction[] transactionArray;
	int transactionCount;
	static int accNumber = 100;

	public Account(String accountHolderName, String mobileNumber, String mailId, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance) {
	
		this.accountNumber = "ACC" + System.currentTimeMillis() + accNumber++;
		this.accountHolderName = accountHolderName;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
		this.accountOpeningDate = accountOpeningDate;
		this.accountClosingDate = accountClosingDate;
		this.interestRate = interestRate;
		this.currentBalance = currentBalance;
		this.accountStatus = AccountStatus.ACTIVE;
		this.transactionArray = new Transaction[50];
		this.transactionCount = 0;
	}

	
	//Getters and Setters
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}

	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}

	public LocalDate getAccountClosingDate() {
		return accountClosingDate;
	}

	public void setAccountClosingDate(LocalDate accountClosingDate) {
		this.accountClosingDate = accountClosingDate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Transaction[] getTransactionArray() {
		return transactionArray;
	}

	public void setTransactionArray(Transaction[] transactionArray) {
		this.transactionArray = transactionArray;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	//toString
	
	@Override
	public String toString() {
		return "Account Number: " + accountNumber + "\nAccount Holder Name: " + accountHolderName
				+ "\nCurrent Balance: " + currentBalance + "\nAccount Status: " + accountStatus;
	}
	
	
	public abstract boolean deposit(double amount);
	public abstract boolean withdraw(double amount);
	public abstract double calculateInterest();
	
	public final boolean addTransaction(Transaction t) {
		
		if(t!=null && transactionCount < transactionArray.length) {
			transactionArray[transactionCount++] = t;
			return true;
		}
		
		return false;
		
	}


	public Transaction[] getTransactionsByDate(LocalDate date) {
		
		Transaction[] temp = new Transaction[transactionCount];
		int count = 0;
		
		if(date!=null) {
			for(int i=0; i<transactionCount; i++) {
				if(transactionArray[i].getTransactionDate().equals(date)) {
					temp[count] = transactionArray[i];
					count++;
				}
			}
		
		
			Transaction[] result = new Transaction[count];
			
			for(int i=0; i<count; i++) {
				result[i] = temp[i];
			}
			
			return result;
		}
		
		return null;
	}

	public Transaction[] getAllTransactions() {
		return transactionArray;
	}
}
