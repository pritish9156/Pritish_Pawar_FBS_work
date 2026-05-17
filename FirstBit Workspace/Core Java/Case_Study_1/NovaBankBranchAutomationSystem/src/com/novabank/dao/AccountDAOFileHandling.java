package com.novabank.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.BankBranch;
import com.novabank.model.CurrentAccount;
import com.novabank.model.LoanAccount;
import com.novabank.model.SalaryAccount;
import com.novabank.model.SavingAccount;

public class AccountDAOFileHandling implements AccountDAO, FileHandlingDAO{
	
	BankBranch bankBranch;
	ArrayList<Account> accArray = new ArrayList<Account>();
	
	public AccountDAOFileHandling(BankBranch bankBranch){
		
		this.bankBranch = bankBranch;
		
		File file = new File("E:\\Pritish_Pawar_FBS_work\\FirstBit Workspace\\Core Java\\Case_Study_1\\NovaBankBranchAutomationSystem\\src\\com\\novabank\\dao\\Bank_Accounts_Information\\Customer_Details");
	
		try {
			
			if(file.exists() && file.length() > 0) {
				
				FileInputStream myInputStream = new FileInputStream(file);
				ObjectInputStream myObjInputStream = new ObjectInputStream(myInputStream);
				
				accArray = (ArrayList<Account>) myObjInputStream.readObject();
				
				myObjInputStream.close();
			}
			else {
				
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
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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
				
				if(accArray.get(i)
						.getAccountNumber()
						.equals(accountNumber))
					
					return accArray.get(i);
			}
		}
		
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		
		if(account != null) {
			
			for(int i=0; i<accArray.size(); i++) {
				
				if(accArray.get(i)
						.getAccountNumber()
						.equals(account.getAccountNumber())) {
					
					accArray.set(i, account);
					
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean deleteAccount(String accountNumber) {
		
		if(accountNumber != null && !accountNumber.isEmpty()) {	
			
			for(int i=0; i<accArray.size(); i++) {
				
				if(accArray.get(i)
						.getAccountNumber()
						.equals(accountNumber)) {
					
					accArray.remove(i);
					
					return true;
				}
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
	
	@Override
	public boolean isSoftwareClosing(boolean isClosing) {
		
		File file = new File("E:\\Pritish_Pawar_FBS_work\\FirstBit Workspace\\Core Java\\Case_Study_1\\NovaBankBranchAutomationSystem\\src\\com\\novabank\\dao\\Bank_Accounts_Information\\Customer_Details");
		
		try {
			
			FileOutputStream myStream = new FileOutputStream(file);
			
			ObjectOutputStream myObjStream = new ObjectOutputStream(myStream);
		
			myObjStream.writeObject(accArray);
			
			myObjStream.close();
			
			return true;
			
		} catch (IOException e) {
			
			System.out.println("File Not Found..! ");
			
			return false;
		}
	}
}