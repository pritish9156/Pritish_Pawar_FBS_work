package com.novabank.model;

import com.novabank.exceptions.SavingAccountMinimumLimitException;

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
	
	public boolean addAccount(Account account) throws SavingAccountMinimumLimitException {
		
		if(account instanceof SavingAccount) {
			if(account.getCurrentBalance() < 10000)
				throw new SavingAccountMinimumLimitException();
		}
		
		if(account != null && accountCount<accountArray.length) {
			accountArray[accountCount++] = account;
			return true;
		}
		
		return false;
	}
	
	public Account getAccountByNumber(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {
			for(int i=0; i<accountCount; i++) {
				  if(accountArray[i].getAccountNumber().equals(accountNumber)) {
					  return accountArray[i];
				  }
			}
		}
		
		return null;
		
	}
	
	public boolean updateAccount(Account account) {
		
		return false;
	}
	
	public boolean deleteAccount(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {
			for(int i=0; i<accountCount; i++) {
				  
				if(accountArray[i].getAccountNumber().equals(accountNumber)) {
					  
					  for(int j=i; j<accountCount-1; j++) 
						  accountArray[j] = accountArray[j+1];
					  
					  accountCount--;
					  accountArray[accountCount] = null;
					  return true;
				  }
			}
		}
		
		return false;
	}
	
	public Account[] getAllAccounts() {
		
		Account[] result = new Account[accountCount];
		
		if(accountArray != null) {
			for(int i=0; i<accountCount; i++) {
				result[i] = accountArray[i];
			}
		}
		
		return result;
	}
	
}
