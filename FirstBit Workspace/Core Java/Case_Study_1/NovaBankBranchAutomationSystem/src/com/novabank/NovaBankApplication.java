package com.novabank;

import com.novabank.model.BankBranch;
import com.novabank.controller.AccountController;
import com.novabank.dao.*;
import com.novabank.service.AccountService;
import com.novabank.view.BankApplicationView;

public class NovaBankApplication {

	public static void main(String[] args) {
		
		BankBranch bankBranch = new BankBranch(1, "Pune", "Lohegaon khese Park Pune 411032");

		final AccountDAO accountDAO = new AccountDAOFileHandling(bankBranch);
		final AccountService accountService = new AccountService(accountDAO);
		final AccountController accountController = new AccountController(accountService);
		final BankApplicationView accountView = new BankApplicationView(accountController);
		
		accountView.startApplication();
	}

}
