package com.novabank.view;

import com.novabank.model.*;

import java.time.LocalDate;
import java.util.Scanner;

import com.novabank.controller.AccountController;

public class BankApplicationView {

	AccountController accountController; 
	Scanner sc = new Scanner(System.in);
	
	public BankApplicationView(AccountController accountController){
		this.accountController = accountController;
	}
	
	public void startApplication() {
		System.out.println("\n\t=================================");
		System.out.println("\t|    🙏🏻Welcome to NovaBank🙏🏻    |");
		System.out.println("\t |...... together we can.......|");
		System.out.println("\t=================================\n");
		showMainMenu();
	}
	
	void showMainMenu() {
		
		int choice;
		
		do {
			System.out.println("\n--------------------------------------|");
			System.out.println("        Select Your Service           |");
			System.out.println("--------------------------------------|");
			System.out.println("\t1.Open Account                |");
			System.out.println("\t2.Deposit Money               |");
			System.out.println("\t3.Withdraw Money              |");
			System.out.println("\t4.Fetch Interest Information  |");
			System.out.println("\t5.Account Closure Request     |");
			System.out.println("\t6.Daily Transaction Report    |");
			System.out.println("\t7.Close Application           |");
			System.out.println("------------------------------------- |");
			System.out.println("\nEnter Your Choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			
				case 1:{
					openAccount();	
					break;
				}
				case 2:{
					depositMoney();
					break;
				}
				case 3:{
					withdrawMoney();
					break;
				}
				case 4:{
					closeAccount();
					break;
				}
				case 5:{
					calculateInterest();
					break;
				}
				case 6:{
					showDailyTransactions();
					break;
				}
				case 7:{
					System.out.println("\n\n\t===========================================");
					System.out.println("\t|  🙏🏻Thankyou For Using Our Services🙏🏻    |");
					System.out.println("\t |........... together we can............|");
					System.out.println("\t===========================================");
					break;	
				}
			
			}
			
		}while(choice != 7);
		
		sc.close();
	}
	
	void openAccount() {
		
		int choice;
		
		System.out.println("\n\t==========================================");
		System.out.println("\t| 	 Account Opening Form (AOF)      |");
		System.out.println("\t==========================================\n");
		
		sc.nextLine();
		System.out.println("Enter your Name: ");
		String holderName = sc.nextLine();
		
		System.out.println("\nEnter your phone number: ");
		String phoneNumber = sc.nextLine();
		
		System.out.println("\nEnter your mail Id: ");
		String mailId = sc.nextLine();
		
		System.out.println("\nChoose the type of account -");
		System.out.println("\n--------------------------------------|");
		System.out.println("        Account Menu                  |");
		System.out.println("--------------------------------------|");
		System.out.println("\t1.Saving Account              |");
		System.out.println("\t2.Current Account             |");
		System.out.println("\t3.Loan Account                |");
		System.out.println("\t4.Salary Account              |");
		System.out.println("\t5.Back to Main Menu           |");
		System.out.println("--------------------------------------|");
		System.out.println("\nEnter Your Choice: ");
		choice = sc.nextInt();
			
		switch(choice) {
			
			case 1: {
				
				System.out.println("\nMinimum amount to deposit - 10000rs");
				System.out.println("\nEnter Amount to deposit: ");
				double currBalance = sc.nextDouble();
					
				SavingAccount savingAccount = new SavingAccount(
						holderName, 
						phoneNumber,
						mailId,
						LocalDate.now(), 
						null, 
						0, 
						currBalance
				);
				
				if(accountController.openAccount(savingAccount)) {
					System.out.println("\n\t=============================================");
					System.out.println("\t|          🙏🏻Welcome to NovaBank🙏🏻          |");
					System.out.println("\t |......Account Created Successfully.......|");
					System.out.println("\t=============================================\n");
					System.out.println("\n" + savingAccount);
				}
				
				break;
			}
					
			case 2: {
				CurrentAccount currentAccount = new CurrentAccount(
						holderName, 
						phoneNumber,
						mailId,
						LocalDate.now(), 
						null, 
						0, 
						0, 
						0
				);
				
				if(accountController.openAccount(currentAccount)) {
					System.out.println("\n\t=============================================");
					System.out.println("\t|          🙏🏻Welcome to NovaBank🙏🏻          |");
					System.out.println("\t |......Account Created Successfully.......|");
					System.out.println("\t=============================================\n");
				}
				
				break;
			}
				
			case 3: {
				
				System.out.println("\nEnter amount you want to loan: ");
				double loanAmount = sc.nextDouble();
				System.out.println("Loan Repay Duration in months: ");
				int loanTermMonths = sc.nextInt();
				
				LoanAccount loanAccount = new LoanAccount(
						holderName, 
						phoneNumber,
						mailId,
						LocalDate.now(), 
						null, 
						0, 
						loanAmount, 
						loanAmount, 
						loanTermMonths
				);
				
				if(accountController.openAccount(loanAccount)) {
					System.out.println("\n\t=============================================");
					System.out.println("\t|          🙏🏻Welcome to NovaBank🙏🏻          |");
					System.out.println("\t |......Account Created Successfully.......|");
					System.out.println("\t=============================================\n");
				}
				
				break;
			}
					
			case 4: {
				SalaryAccount salaryAccount = new SalaryAccount(
						holderName, 
						phoneNumber,
						mailId,
						LocalDate.now(), 
						null, 
						0, 
						0, 
						LocalDate.now()
				);
				
				if(accountController.openAccount(salaryAccount)) {
					System.out.println("\n\t=============================================");
					System.out.println("\t|          🙏🏻Welcome to NovaBank🙏🏻          |");
					System.out.println("\t |......Account Created Successfully.......|");
					System.out.println("\t=============================================\n");
					
				}
				
				break;
			}
				
			case 5: {
				break;
			}
		}	
	}
	
	void depositMoney() {
		
	}
	
	void withdrawMoney() {
		
	}
	
	void closeAccount() {
		
	}
	
	void calculateInterest() {
		
	}
	
	void showDailyTransactions() {
		
	}
}
