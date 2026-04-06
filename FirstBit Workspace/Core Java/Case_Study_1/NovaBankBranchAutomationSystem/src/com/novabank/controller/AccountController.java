package com.novabank.controller;

import java.time.LocalDate;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.Transaction;
import com.novabank.service.AccountService;

public class AccountController {

	AccountService accountService;
	
	public AccountController(AccountService accountService){
		this.accountService = accountService;
	}
	
	public boolean openAccount(Account account) {	
		return accountService.openAccount(account);
	}
	
	public boolean deposit(String accountNumber, double amount) {
		return accountService.depositMoney(accountNumber, amount);
	}
	
	public boolean withdraw(String accountNumber, double amount) {
		return accountService.withdrawMoney(accountNumber, amount);
	}
	
	public Account fetchAccount(String accountNumber) {
		return accountService.fetchAccount(accountNumber);
	}
	
	public boolean closeAccount(String accountNumber) {
		return accountService.closeAccount(accountNumber);
	}
	
	public double calculateInterest(String accountNumber) {
		return accountService.calculateInterest(accountNumber);
	}
	
	public Transaction[] showDailyTransactions(LocalDate date) {
		return accountService.generateDailyTransactionReport(date);
	}
}
