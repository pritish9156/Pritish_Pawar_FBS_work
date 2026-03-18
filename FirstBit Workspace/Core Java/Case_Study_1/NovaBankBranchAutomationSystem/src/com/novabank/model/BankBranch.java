package com.novabank.model;

public class BankBranch {
	
	//Attributes
	
	int branchId;
	String branchName;
	String branchAddress;
	Account[] accountArray;
	int accountCount;
	
	//Parameterized Constructor

	public BankBranch(int branchId, String branchName, String branchAddress) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.accountArray = new Account[50];
		this.accountCount = 0;
	}
	
	
	//Getters and Setters

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Account[] getAccountArray() {
		return accountArray;
	}

	public void setAccountArray(Account[] accountArray) {
		this.accountArray = accountArray;
	}

	public int getAccountCount() {
		return accountCount;
	}

	public void setAccountCount(int accountCount) {
		this.accountCount = accountCount;
	}
	
	//To String Method

	@Override
	public String toString() {
		return "Branch Name: " + branchName + "\nBranch Address: " + branchAddress
				+ "\nTotal Number of Accounts in Branch: " + accountCount;
	}
	
}
