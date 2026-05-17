package com.novabank.view;

import com.novabank.model.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.novabank.controller.AccountController;

public class BankApplicationView {

	AccountController accountController;
	Scanner sc = new Scanner(System.in);
	int count=0;

	public BankApplicationView(AccountController accountController){
		this.accountController = accountController;
	}

	public void startApplication() {

		System.out.println("\n\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
		System.out.println("\t\t\t║                                                              ║");
		System.out.println("\t\t\t║           ███╗   ██╗ ██████╗ ██╗   ██╗ █████╗                ║");
		System.out.println("\t\t\t║           ████╗  ██║██╔═══██╗██║   ██║██╔══██╗               ║");
		System.out.println("\t\t\t║           ██╔██╗ ██║██║   ██║██║   ██║███████║               ║");
		System.out.println("\t\t\t║           ██║╚██╗██║██║   ██║╚██╗ ██╔╝██╔══██║               ║");
		System.out.println("\t\t\t║           ██║ ╚████║╚██████╔╝ ╚████╔╝ ██║  ██║               ║");
		System.out.println("\t\t\t║           ╚═╝  ╚═══╝ ╚═════╝   ╚═══╝  ╚═╝  ╚═╝               ║");
		System.out.println("\t\t\t║                                                              ║");
		System.out.println("\t\t\t║                    🏦 NOVABANK SYSTEM                        ║");
		System.out.println("\t\t\t║                                                              ║");
		System.out.println("\t\t\t║              Together We Can Grow Financially                ║");
		System.out.println("\t\t\t║                                                              ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

		loadingAnimation("Initializing Secure Banking Services");

		showMainMenu();
	}

	void showMainMenu() {

		int choice;

		do {

			System.out.println("\n\n");

			System.out.println("\t\t\t╔══════════════════════════════════════════════════════════════╗");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║                    🏦 NOVABANK DASHBOARD                     ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t╠══════════════════════════════════════════════════════════════╣");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [1] 📝 Open New Account                                     ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [2] 💰 Deposit Money                                        ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [3] 💸 Withdraw Money                                       ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [4] 🔍 Fetch Account Details                                ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [5] ❌ Account Closure Request                              ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [6] 📊 Daily Transaction Report                             ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [7] 📋 Show All Accounts                                    ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t║   [8] 🚪 Close Application                                    ║");
			System.out.println("\t\t\t║                                                              ║");
			System.out.println("\t\t\t╚══════════════════════════════════════════════════════════════╝");

			System.out.print("\n\t\t\t👉 Enter Your Choice : ");

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
					showAllAccDetails();
					break;
				}

				case 8:{

					loadingAnimation("Saving All Banking Data");

					showSuccessBox("DATA SAVED SUCCESSFULLY");

					System.out.println("\n");

					loadingAnimation("🔄 REDIRECTING TO LOGIN");
					
					for(int i=0; i<120; i++) {
						System.out.println("\n");
					}
		        
			        LoginView loginView = new LoginView();
			        loginView.showLoginPage();

					break;
				}
			}

		}while(choice != 8);

		sc.close();
	}

	void showAllAccDetails() {

		Account[] acc = accountController.getAllAccounts();

		System.out.println("\n");

		System.out.println("\t╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
		System.out.println("\t║                                                     🏦 ALL ACCOUNT DETAILS                                                      ║");
		System.out.println("\t╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");

		if(acc == null || acc.length == 0) {

			showErrorBox("NO ACCOUNT RECORDS FOUND");
			return;
		}

		System.out.println();

		System.out.println("==========================================================================================================================================================================");
		System.out.printf("%-15s %-20s %-15s %-20s %-15s %-15s\n",
				"ACCOUNT NO",
				"HOLDER NAME",
				"BALANCE",
				"ACCOUNT TYPE",
				"STATUS",
				"INTEREST");

		System.out.println("==========================================================================================================================================================================");

		for(int i=0; i<acc.length; i++) {

			String type = "";

			if(acc[i] instanceof SalaryAccount)
				type = "SALARY";

			else if(acc[i] instanceof SavingAccount)
				type = "SAVING";

			else if(acc[i] instanceof CurrentAccount)
				type = "CURRENT";

			else if(acc[i] instanceof LoanAccount)
				type = "LOAN";

			System.out.printf("%-15s %-20s %-15.2f %-20s %-15s %-15.2f\n",

					acc[i].getAccountNumber(),
					acc[i].getAccountHolderName(),
					acc[i].getCurrentBalance(),
					type,
					acc[i].getAccountStatus(),
					acc[i].getInterestRate()
			);
		}

		System.out.println("==========================================================================================================================================================================");

		sc.nextLine();
		pauseScreen();
	}

	void openAccount() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║              📝 OPEN ACCOUNT                 ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t👤 Enter Full Name : ");
		String holderName = sc.nextLine();

		System.out.print("\n\t\t\t📱 Enter Phone Number : ");
		String phoneNumber = sc.nextLine();

		System.out.print("\n\t\t\t📧 Enter Mail ID : ");
		String mailId = sc.nextLine();

		System.out.println("\n");

		System.out.println("\t\t\t[1] Saving Account");
		System.out.println("\t\t\t[2] Current Account");
		System.out.println("\t\t\t[3] Loan Account");
		System.out.println("\t\t\t[4] Salary Account");

		System.out.print("\n\t\t\t👉 Select Account Type : ");

		int choice = sc.nextInt();

		switch(choice) {

			case 1:{

				System.out.print("\n\t\t\t💰 Enter Initial Deposit : ");
				double currBalance = sc.nextDouble();

				if(currBalance < 10000) {

					showErrorBox("SAVING ACCOUNT REQUIRES\nMINIMUM BALANCE OF 10000");

					sc.nextLine();
					pauseScreen();
					return;
				}

				loadingAnimation("Creating Saving Account");

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

					showSuccessBox("ACCOUNT CREATED\nSUCCESSFULLY");

					System.out.println("\n" + savingAccount);

				}else {

					showErrorBox("FAILED TO CREATE ACCOUNT");
				}

				break;
			}

			case 2:{

				loadingAnimation("Creating Current Account");

				CurrentAccount currentAccount = new CurrentAccount(
						holderName,
						phoneNumber,
						mailId,
						LocalDate.now(),
						null,
						0,
						0,
						50000
				);

				if(accountController.openAccount(currentAccount)) {

					showSuccessBox("CURRENT ACCOUNT CREATED");

					System.out.println("\n" + currentAccount);

				}else {

					showErrorBox("FAILED TO CREATE ACCOUNT");
				}

				break;
			}

			case 3:{

				System.out.print("\n\t\t\t💰 Enter Loan Amount : ");
				double loanAmount = sc.nextDouble();

				if(loanAmount <= 0) {

					showErrorBox("INVALID LOAN AMOUNT");

					sc.nextLine();
					pauseScreen();
					return;
				}

				System.out.print("\n\t\t\t📅 Loan Duration Months : ");
				int loanTermMonths = sc.nextInt();

				loadingAnimation("Processing Loan Account");

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

					showSuccessBox("LOAN ACCOUNT CREATED");

					System.out.println("\n" + loanAccount);

				}else {

					showErrorBox("FAILED TO CREATE ACCOUNT");
				}

				break;
			}

			case 4:{

				loadingAnimation("Creating Salary Account");

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

					showSuccessBox("SALARY ACCOUNT CREATED");

					System.out.println("\n" + salaryAccount);

				}else {

					showErrorBox("FAILED TO CREATE ACCOUNT");
				}

				break;
			}
		}

		sc.nextLine();
		pauseScreen();
	}

	void depositMoney() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║              💰 DEPOSIT MONEY                ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t🏦 Enter Account Number : ");
		String accNumber = sc.nextLine();

		Account acc = accountController.fetchAccount(accNumber);

		if(acc == null) {

			showErrorBox("ACCOUNT NOT FOUND");
			pauseScreen();
			return;
		}

		System.out.print("\n\t\t\t💵 Enter Amount : ");
		double amount = sc.nextDouble();

		if(amount <= 0) {

			showErrorBox("DEPOSIT AMOUNT MUST\nBE POSITIVE");

			sc.nextLine();
			pauseScreen();
			return;
		}
		
		if(acc instanceof SalaryAccount) {

			SalaryAccount salary = (SalaryAccount) acc;

			if(salary.getLastTransactionDate()
					.plusMonths(2)
					.isBefore(LocalDate.now())) {

				showErrorBox(
						"SALARY ACCOUNT FROZEN\nWITHDRAWAL NOT POSSIBLE"
				);

				sc.nextLine();
				pauseScreen();
				return;
			}
		}

		if(acc instanceof SalaryAccount) {

			SalaryAccount sal = (SalaryAccount) acc;

			if(sal.getLastTransactionDate()
					.plusMonths(2)
					.isBefore(LocalDate.now())) {

				showErrorBox(
						"SALARY ACCOUNT FROZEN\nNO TRANSACTION FOR 2 MONTHS"
				);

				sc.nextLine();
				pauseScreen();
				return;
			}
		}

		loadingAnimation("Processing Deposit");

		if(accountController.deposit(accNumber, amount)) {

			showSuccessBox("AMOUNT DEPOSITED\nSUCCESSFULLY");

		}else {

			showErrorBox("DEPOSIT FAILED");
		}

		sc.nextLine();
		pauseScreen();
	}

	void withdrawMoney() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║             💸 WITHDRAW MONEY                ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t🏦 Enter Account Number : ");
		String accNumber = sc.nextLine();

		Account acc = accountController.fetchAccount(accNumber);

		if(acc == null) {

			showErrorBox("ACCOUNT NOT FOUND");
			pauseScreen();
			return;
		}

		System.out.print("\n\t\t\t💵 Enter Amount : ");
		double amount = sc.nextDouble();

		if(amount <= 0) {

			showErrorBox("WITHDRAW AMOUNT MUST\nBE POSITIVE");

			sc.nextLine();
			pauseScreen();
			return;
		}
		
		if(acc instanceof LoanAccount) {

			showErrorBox(
					"WITHDRAWAL NOT ALLOWED\nIN LOAN ACCOUNT"
			);

			sc.nextLine();
			pauseScreen();
			return;
		}

		if(acc instanceof CurrentAccount) {

			CurrentAccount current = (CurrentAccount) acc;

			double allowedLimit =
					acc.getCurrentBalance()
					+ current.getMaxOverdraftLimit();

			if(amount > allowedLimit) {

				showErrorBox("OVERDRAFT LIMIT EXCEEDED");

				sc.nextLine();
				pauseScreen();
				return;
			}
		}

		loadingAnimation("Processing Withdrawal");

		if(accountController.withdraw(accNumber, amount)) {

			showSuccessBox("WITHDRAW SUCCESSFUL");

		}else {

			showErrorBox("WITHDRAW FAILED");
		}

		sc.nextLine();
		pauseScreen();
	}

	void closeAccount() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║             ❌ CLOSE ACCOUNT                 ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t🏦 Enter Account Number : ");
		String accNumber = sc.nextLine();

		System.out.println("\n");
		System.out.println("\t\t\t⚠ ARE YOU SURE ?");
		System.out.println("\n\t\t\t1. YES");
		System.out.println("\t\t\t2. NO");

		System.out.print("\n\t\t\t👉 Enter Choice : ");

		int confirm = sc.nextInt();

		if(confirm == 2) {
			return;
		}

		loadingAnimation("Closing Account");

		if(accountController.closeAccount(accNumber)) {

			showSuccessBox("ACCOUNT CLOSED");

		}else {

			showErrorBox("FAILED TO CLOSE ACCOUNT");
		}

		sc.nextLine();
		pauseScreen();
	}

	void fetchAccount() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║            🔍 FETCH ACCOUNT DETAILS          ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t🏦 Enter Account Number : ");
		String accNumber = sc.nextLine();

		loadingAnimation("Fetching Account Details");

		Account acc = accountController.fetchAccount(accNumber);

		if(acc != null) {

			showSuccessBox("ACCOUNT FOUND");

			System.out.println("\n" + acc);

		}else {

			showErrorBox("ACCOUNT NOT FOUND");
		}

		pauseScreen();
	}

	void showDailyTransactions() {

		System.out.println("\n\n");

		System.out.println("\t\t\t╔══════════════════════════════════════════════╗");
		System.out.println("\t\t\t║          📊 DAILY TRANSACTION REPORT         ║");
		System.out.println("\t\t\t╚══════════════════════════════════════════════╝");

		sc.nextLine();

		System.out.print("\n\t\t\t📅 Enter Date (dd-MM-yyyy) : ");
		String inputDate = sc.nextLine();

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate date = LocalDate.parse(inputDate, dateFormat);

		loadingAnimation("Generating Report");

		Transaction[] dailyReport = accountController.showDailyTransactions(date);

		if(dailyReport.length > 0) {

			showSuccessBox("TRANSACTION REPORT GENERATED");

			for(Transaction report : dailyReport) {

				System.out.println("\n" + report);
			}

		}else {

			showErrorBox("NO TRANSACTIONS AVAILABLE");
		}

		pauseScreen();
	}

	void showSuccessBox(String msg) {

		System.out.println("\n");

		System.out.println("\t\t\t╔══════════════════════════════════════╗");
		System.out.println("\t\t\t║             ✅ SUCCESS               ║");
		System.out.println("\t\t\t╠══════════════════════════════════════╣");

		String[] lines = msg.split("\n");

		for(String line : lines) {

			System.out.printf(
					"\t\t\t║ %-36s ║\n",
					line
			);
		}

		System.out.println("\t\t\t╚══════════════════════════════════════╝");
	}

	void showErrorBox(String msg) {

		System.out.println("\n");

		System.out.println("\t\t\t╔══════════════════════════════════════╗");
		System.out.println("\t\t\t║              ❌ ERROR                ║");
		System.out.println("\t\t\t╠══════════════════════════════════════╣");

		String[] lines = msg.split("\n");

		for(String line : lines) {

			System.out.printf(
					"\t\t\t║ %-36s ║\n",
					line
			);
		}

		System.out.println("\t\t\t╚══════════════════════════════════════╝");
	}

	void loadingAnimation(String text) {

		System.out.print("\n\t\t" + text + " ");
		int limit;
		
		if(count==0)
			limit = 20;
		else
			limit = 6;
		
		count = count+1;

		for(int i=0; i<limit; i++) {

			try {
				Thread.sleep(300);
			}
			catch(Exception e) {

			}

			System.out.print("● ");
		}

		System.out.println();
	}

	void pauseScreen() {

		System.out.println("\n");
		System.out.print("\t\t\tPress Enter To Continue...");
		sc.nextLine();
	}
}