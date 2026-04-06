package com.novabank.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.BankBranch;

public class AccountDAOFileHandling implements AccountDAO{
	
	BankBranch bankBranch;
	ArrayList<Account> accArray = new ArrayList<Account>();
	
	public AccountDAOFileHandling(BankBranch bankBranch){
		this.bankBranch = bankBranch;
	}
	
	public BufferedWriter fileWriter() {
		try {
			
			FileWriter accountFile = new FileWriter("E:\\Pritish_Pawar_FBS_work\\FirstBit Workspace\\Core Java\\Case_Study_1\\NovaBankBranchAutomationSystem\\src\\com\\novabank\\dao\\Bank_Accounts_Information\\Customer_Details", true);
			BufferedWriter accountWriter = new BufferedWriter(accountFile);
			return accountWriter;
			
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
		

	@Override
	public boolean addAccount(Account account) throws SavingAccountMinimumLimitException {
		
		if(account != null) {
			accArray.add(account);
			BufferedWriter accountWriter = fileWriter();
			if(accountWriter != null) {
				try {
					accountWriter.write(account.toString());
					accountWriter.newLine();
					accountWriter.write("-----------------------------------------");
					accountWriter.newLine();
					accountWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			return true;
		}
		
		return false;
	}

	@Override
	public Account getAccountByNumber(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {
			
			for(int i=0; i<accArray.size(); i++) {
				if(accArray.get(i).getAccountNumber().equals(accountNumber))
					return accArray.get(i);
			}
		}
		
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		
		return false;
	}

	@Override
	public boolean deleteAccount(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {	
			for(int i=0; i<accArray.size(); i++) {
				if(accArray.get(i).getAccountNumber().equals(accountNumber))
					accArray.remove(i);
					return true;
			}
		}
		
		return false;
	}

	@Override
	public Account[] getAllAccounts() {
		
		Account[] result = new Account[accArray.size()];
		
		for(int i=0; i<accArray.size(); i++) {
			result[i] = accArray.get(i);
		}

		return result;
	}

}
