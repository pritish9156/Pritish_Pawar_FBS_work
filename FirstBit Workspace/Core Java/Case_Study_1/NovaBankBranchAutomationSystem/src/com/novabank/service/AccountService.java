package com.novabank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.novabank.dao.AccountDAO;
import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.*;

public class AccountService {

	AccountDAO accountDAO;
	
	public AccountService(AccountDAO accountDAO){
		this.accountDAO = accountDAO;
	}
	
	public boolean openAccount(Account account) {
		
		if(account!=null) {
			
			try {
				return accountDAO.addAccount(account);
			} catch (SavingAccountMinimumLimitException e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		return false;
	}
	
	String generateTransactionId() {
		String txnId = "Txn" + System.currentTimeMillis();
		return txnId;
	}
	
	public boolean depositMoney(String accountNumber, double amount) {
		
		if(accountNumber != null && !accountNumber.isEmpty() && amount > 0) {
			
			Account acc = accountDAO.getAccountByNumber(accountNumber);
			
			if(acc != null) {
				
				boolean isDeposited = acc.deposit(amount);
				
				if(isDeposited) {
					
					Transaction t = new Transaction(
							generateTransactionId(), 
							TransactionType.DEPOSIT, 
							amount, 
							LocalDateTime.now());
					
					acc.addTransaction(t);
					return true;
				}
			}
		}
			
		return false;
	}
	
	public boolean withdrawMoney(String accountNumber, double amount) {
		
		if(accountNumber != null && !accountNumber.isEmpty() && amount > 0) {
			
			Account acc = accountDAO.getAccountByNumber(accountNumber);
			
			if(acc != null) {
				
				boolean isWithdraw = acc.withdraw(amount);
				
				if(isWithdraw) {
					
					Transaction t = new Transaction(
							generateTransactionId(), 
							TransactionType.WITHDRAW, 
							amount, 
							LocalDateTime.now());
					
					acc.addTransaction(t);
					return true;
				}
			}
		}
		
		return false;
	}
	 
	 
	public boolean closeAccount(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {
			
			if(accountDAO.deleteAccount(accountNumber))
				return true;
		}
		return false;
	}
	
	 public double calculateInterest(String accountNumber) {
		 
		 if(accountNumber != null && !accountNumber.isEmpty()) {
			 
			 Account acc = accountDAO.getAccountByNumber(accountNumber);
			 
			 if(acc != null) {
				 
				 return acc.calculateInterest();
			 
			 }
		 }	 
		 return -1;	 
	 }
	 
	 public Transaction[] generateDailyTransactionReport(LocalDate date) {
		 
		 if(date != null) {
			 	 
			 Account[] allAccounts = accountDAO.getAllAccounts();	 
			 
			 Transaction[] temp = new Transaction[100];
			 int count = 0;
			 
			 if(allAccounts != null) {
				 
				 for(Account acc: allAccounts) {
					 
					 Transaction[] txn = acc.getTransactionsByDate(date);
					 
					 for(Transaction t: txn) {
						 
						 temp[count] = t;
						 count++;
						 
					 } 
				 }
			 
				 Transaction[] result = new Transaction[count];
				 
				 for(int i=0; i<count; i++) {
					 result[i] = temp[i];
				 }
				 
				 return result;
			 } 
		 }	 
		 return null;
	 }

}
