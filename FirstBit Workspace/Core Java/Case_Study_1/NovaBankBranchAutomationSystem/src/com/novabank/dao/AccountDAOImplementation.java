package com.novabank.dao;

import java.util.ArrayList;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.BankBranch;

public class AccountDAOImplementation implements AccountDAO{
	
	BankBranch branch;
	
	ArrayList<Account> accArray = new ArrayList<>();
	
	public AccountDAOImplementation(BankBranch branch){
		this.branch = branch;
	}
	
	@Override
	public boolean addAccount(Account account) throws SavingAccountMinimumLimitException {
		
		if(account != null) {
			return branch.addAccount(account);
		}
		
		return false;
	}

	@Override
	public Account getAccountByNumber(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {
			return branch.getAccountByNumber(accountNumber);
		}
		
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		
		if(account != null) {
			return branch.updateAccount(account);
		}
		
		return false;
	}

	@Override
	public boolean deleteAccount(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isBlank()) {
			return branch.deleteAccount(accountNumber);
		}
		
		return false;
	}

	@Override
	public Account[] getAllAccounts() {

		return branch.getAllAccounts();
	
	}

}
