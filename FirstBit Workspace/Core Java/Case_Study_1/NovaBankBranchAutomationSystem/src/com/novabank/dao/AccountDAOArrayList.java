package com.novabank.dao;

import java.util.ArrayList;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.BankBranch;

public class AccountDAOArrayList implements AccountDAO{
	
	BankBranch bankBranch;
	ArrayList<Account> accArray = new ArrayList<Account>();
	
	public AccountDAOArrayList(BankBranch bankBranch){
		this.bankBranch = bankBranch;
	}

	@Override
	public boolean addAccount(Account account) throws SavingAccountMinimumLimitException {
		
		if(account != null) {
			accArray.add(account);
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
