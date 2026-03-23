package com.novabank.dao;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;

public interface AccountDAO {
	
	boolean addAccount(Account account) throws SavingAccountMinimumLimitException;
	Account getAccountByNumber(String accountNumber);
	boolean updateAccount(Account account);
	boolean deleteAccount(String accountNumber);
	Account[] getAllAccounts();
	
}
