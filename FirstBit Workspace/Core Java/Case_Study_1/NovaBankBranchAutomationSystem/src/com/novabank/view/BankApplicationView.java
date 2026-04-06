package com.novabank.view;

import com.novabank.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
			System.out.println("\t4.Fetch Account Information   |");
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
					fetchAccount();
					break;
				}
				case 5:{
					closeAccount();
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
				int flag=0;
				System.out.println("\nMinimum amount to deposit - 10000rs");
				
				do {
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
							
							flag=1;
						}else {
							System.out.println("\n\t1.Retry to deposit");
							System.out.println("\t2.Exit");
							System.out.println("\nEnter your choice: ");
							int subChoice = sc.nextInt();
							
							if(subChoice==2)
								flag=1;
						}
					
				}while(flag!=1);
				
				
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
					System.out.println("\n" + currentAccount);
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
					System.out.println("\n" + loanAccount);
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
					System.out.println("\n" + salaryAccount);
				}
				
				break;
			}
				
			case 5: {
				break;
			}
		}	
	}
	
	void depositMoney() {
		System.out.println("\n\t==========================================");
		System.out.println("\t|     	   Account Deposit Section      |");
		System.out.println("\t==========================================\n");
		
		int flag = 0;
		
		do {
			sc.nextLine();
			System.out.println("Enter your account number: ");
			String accNumber = sc.nextLine();
			
			System.out.println("\nEnter Amount: ");
			double amount = sc.nextDouble();
			
			if(accountController.deposit(accNumber, amount)) {
				System.out.println("\n\t=============================================");
				System.out.println("\t |......Amount Deposited Successfully........|");
				System.out.println("\t=============================================\n");
				flag = 1;
			}
			else {
				System.out.println("\n\t1.Retry to deposit");
				System.out.println("\t2.Exit");
				System.out.println("\nEnter your choice: ");
				int subChoice = sc.nextInt();
				
				if(subChoice==2)
					flag=1;
			}
			
		}while(flag!=1);
		
	}
	
	void withdrawMoney() {
		System.out.println("\n\t==========================================");
		System.out.println("\t|     	   Account Withdraw Section      |");
		System.out.println("\t==========================================\n");
		
		int flag = 0;
		
		do {
			sc.nextLine();
			System.out.println("Enter your account number: ");
			String accNumber = sc.nextLine();
			
			System.out.println("\nEnter Amount: ");
			double amount = sc.nextDouble();
			
			if(accountController.withdraw(accNumber, amount)) {
				System.out.println("\n\t=============================================");
				System.out.println("\t |......Amount Withdrawed Successfully........|");
				System.out.println("\t=============================================\n");
				flag = 1;
			}
			else {
				System.out.println("\n\t1.Retry to Withdraw");
				System.out.println("\t2.Exit");
				System.out.println("\nEnter your choice: ");
				int subChoice = sc.nextInt();
				
				if(subChoice==2)
					flag=1;
			}
			
		}while(flag!=1);
	}
	
	void closeAccount() {
		System.out.println("\n\t==========================================");
		System.out.println("\t|     	   Account Clouser Section      |");
		System.out.println("\t==========================================\n");
		
		int flag = 0;
		
		do {
			sc.nextLine();
			System.out.println("Enter your account number: ");
			String accNumber = sc.nextLine();
			
			if(accountController.closeAccount(accNumber)) {
				System.out.println("\n\t=============================================");
				System.out.println("\t |......Account Closed Successfully........|");
				System.out.println("\t=============================================\n");
				flag = 1;
			}
			else {
				System.out.println("\n\t1.Retry");
				System.out.println("\t2.Exit");
				System.out.println("\nEnter your choice: ");
				int subChoice = sc.nextInt();
				
				if(subChoice==2)
					flag=1;
			}
			
		}while(flag!=1);
	}
	
	void fetchAccount() {
		System.out.println("\n\t==========================================");
		System.out.println("\t|     	   Fetch Account Details          |");
		System.out.println("\t==========================================\n");
		
		sc.nextLine();
		System.out.println("Enter Account Number: ");
		String accNumber = sc.nextLine();
		
		Account acc = accountController.fetchAccount(accNumber);
		
		if(acc != null) {
			System.out.println("\n\t     	   Your Account Details          ");
			System.out.println("\t==========================================");
			
			System.out.println("\n" + acc);
		}else {
			System.out.println("\n\tPlease check your account details and try again");
			System.out.println("\t================================================");
		}
	}
	
	void showDailyTransactions() {
		System.out.println("\n\t==========================================");
		System.out.println("\t|     	   Daily Transaction Report      |");
		System.out.println("\t==========================================\n");
		
		sc.nextLine();
		System.out.println("Enter Date: ");
		String inputDate = sc.nextLine();
		
		DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate date = LocalDate.parse(inputDate, dateFormat);
		
		Transaction[] dailyReport = accountController.showDailyTransactions(date);
		
		if(dailyReport.length > 0) {
			for(Transaction report : dailyReport) {
				System.out.println("\n" + report);
			}
		}else
			System.out.println("\n\tTransactions Not Available for selected Date\n");
		
	}
}
