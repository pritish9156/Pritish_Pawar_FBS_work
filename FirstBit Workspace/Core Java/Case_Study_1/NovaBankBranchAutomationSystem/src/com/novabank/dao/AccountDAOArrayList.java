package com.novabank.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.BankBranch;
import com.novabank.model.CurrentAccount;
import com.novabank.model.LoanAccount;
import com.novabank.model.SalaryAccount;
import com.novabank.model.SavingAccount;

public class AccountDAOArrayList implements AccountDAO{
	
	BankBranch bankBranch;
	ArrayList<Account> accArray = new ArrayList<Account>();
	
	public AccountDAOArrayList(BankBranch bankBranch){
		this.bankBranch = bankBranch;
		
		// ================= SAVING ACCOUNT =================

		accArray.add(

			new SavingAccount(

				"Rahul Sharma",
				"9876543210",
				"rahul@gmail.com",
				LocalDate.of(2024, 1, 10),
				null,
				4.5,
				25000
			)
		);



		// ================= CURRENT ACCOUNT =================

		accArray.add(

			new CurrentAccount(

				"Amit Patil",
				"9988776655",
				"amit@gmail.com",
				LocalDate.of(2023, 5, 15),
				null,
				2.5,
				120000,
				50000
			)
		);



		// ================= LOAN ACCOUNT =================

		accArray.add(

			new LoanAccount(

				"Sneha Joshi",
				"9001122334",
				"sneha@gmail.com",
				LocalDate.of(2022, 3, 20),
				null,
				8.5,
				500000,
				500000,
				60
			)
		);



		// ================= SALARY ACCOUNT =================

		accArray.add(

			new SalaryAccount(

				"Priya Verma",
				"9123456780",
				"priya@gmail.com",
				LocalDate.of(2025, 1, 1),
				null,
				3.0,
				55000,
				LocalDate.now()
			)
		);
		
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
