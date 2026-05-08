package com.novabank.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.novabank.exceptions.SavingAccountMinimumLimitException;
import com.novabank.model.Account;
import com.novabank.model.BankBranch;
import com.novabank.model.CurrentAccount;
import com.novabank.model.LoanAccount;
import com.novabank.model.SalaryAccount;
import com.novabank.model.SavingAccount;

public class AccountDaoDS implements AccountDAO{
	
	BankBranch bankBranch;
	DataBaseConnection dbc;
	
	public AccountDaoDS(BankBranch bankBranch) {
		this.bankBranch = bankBranch;
	}
	
	public static void main(String[] args) {
		
		TempDDL();
	
		
	}
	
	static public void TempDDL() {
		
		try {
			DataBaseConnection dbc = new DataBaseConnection();
			
			Statement statement = dbc.getStatement();
			
			ResultSet res = statement.executeQuery("select * from account");
			
			ResultSetMetaData metaData = res.getMetaData();
		
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean DDL() {
		
		try {
			dbc = new DataBaseConnection();
			
			Statement statement = dbc.getStatement();
			

			// ACCOUNT TABLE
			statement.execute(
			    "CREATE TABLE IF NOT Exists account ("
			    + "account_number VARCHAR(20) PRIMARY KEY, "
			    + "account_holder_name VARCHAR(100), "
			    + "mobile_number VARCHAR(15), "
			    + "mail_id VARCHAR(100), "
			    + "account_opening_date DATE, "
			    + "account_closing_date DATE, "
			    + "interest_rate DOUBLE, "
			    + "current_balance DOUBLE, "
			    + "account_status VARCHAR(30)"
			    + ")"
			);


			// SAVING ACCOUNT TABLE
			statement.execute(
			    "CREATE TABLE IF NOT Exists saving_account ("
			    + "account_number VARCHAR(20) PRIMARY KEY, "
			    + "minimum_balance DOUBLE DEFAULT 10000, "
			    + "FOREIGN KEY (account_number) REFERENCES account(account_number)"
			    + ")"
			);


			// SALARY ACCOUNT TABLE
			statement.execute(
			    "CREATE TABLE IF NOT Exists salary_account ("
			    + "account_number VARCHAR(20) PRIMARY KEY, "
			    + "last_transaction_date DATE, "
			    + "FOREIGN KEY (account_number) REFERENCES saving_account(account_number)"
			    + ")"
			);


			// CURRENT ACCOUNT TABLE
			statement.execute(
			    "CREATE TABLE IF NOT Exists current_account ("
			    + "account_number VARCHAR(20) PRIMARY KEY, "
			    + "max_overdraft_limit DOUBLE, "
			    + "FOREIGN KEY (account_number) REFERENCES account(account_number)"
			    + ")"
			);


			// LOAN ACCOUNT TABLE
			statement.execute(
			    "CREATE TABLE IF NOT Exists loan_account ("
			    + "account_number VARCHAR(20) PRIMARY KEY, "
			    + "loan_amount DOUBLE, "
			    + "loan_term_months INT, "
			    + "installment_amount DOUBLE, "
			    + "interest_type VARCHAR(30), "
			    + "FOREIGN KEY (account_number) REFERENCES account(account_number)"
			    + ")"
			);


			// TRANSACTION TABLE
			statement.execute(
			    "CREATE TABLE IF NOT Exists transaction_table ("
			    + "transaction_id VARCHAR(20) PRIMARY KEY, "
			    + "account_number VARCHAR(20), "
			    + "transaction_type VARCHAR(30), "
			    + "amount DOUBLE, "
			    + "transaction_date DATETIME, "
			    + "FOREIGN KEY (account_number) REFERENCES account(account_number)"
			    + ")"
			);

			return true;
			
		} catch (SQLException e) {
			System.out.println("Connection Could Not be Established Please try again...!");
			return false;
		}
		
	}

	@Override
	public boolean addAccount(Account account) throws SavingAccountMinimumLimitException {

	    DDL();

	    try {
	    	dbc = new DataBaseConnection();
	        Statement statement = dbc.getStatement();

	        
	        // ================= ACCOUNT TABLE =================

	        String accountQuery =
	                "INSERT INTO account "
	              + "(account_number, account_holder_name, mobile_number, mail_id, "
	              + "account_opening_date, account_closing_date, interest_rate, "
	              + "current_balance, account_status) "
	              + "VALUES ('"
	              + account.getAccountNumber() + "', '"
	              + account.getAccountHolderName() + "', '"
	              + account.getMobileNumber() + "', '"
	              + account.getMailId() + "', '"
	              + account.getAccountOpeningDate() + "', "
	              + (account.getAccountClosingDate() == null
	                    ? "NULL"
	                    : "'" + account.getAccountClosingDate() + "'")
	              + ", "
	              + account.getInterestRate() + ", "
	              + account.getCurrentBalance() + ", '"
	              + account.getAccountStatus()
	              + "')";

	        statement.execute(accountQuery);



	        // ================= SAVING ACCOUNT =================

	        if(account instanceof SavingAccount) {

	            SavingAccount savingAccount = (SavingAccount) account;

	            String savingQuery =
	                    "INSERT INTO saving_account "
	                  + "(account_number, minimum_balance) "
	                  + "VALUES ('"
	                  + savingAccount.getAccountNumber() + "', "
	                  + SavingAccount.getMinimumBalance()
	                  + ")";

	            statement.execute(savingQuery);
	        }



	        // ================= SALARY ACCOUNT =================

	        if(account instanceof SalaryAccount) {

	            SalaryAccount salaryAccount = (SalaryAccount) account;

	            String salaryQuery =
	                    "INSERT INTO salary_account "
	                  + "(account_number, last_transaction_date) "
	                  + "VALUES ('"
	                  + salaryAccount.getAccountNumber() + "', '"
	                  + salaryAccount.getLastTransactionDate()
	                  + "')";

	            statement.execute(salaryQuery);
	        }



	        // ================= CURRENT ACCOUNT =================

	        if(account instanceof CurrentAccount) {

	            CurrentAccount currentAccount = (CurrentAccount) account;

	            String currentQuery =
	                    "INSERT INTO current_account "
	                  + "(account_number, max_overdraft_limit) "
	                  + "VALUES ('"
	                  + currentAccount.getAccountNumber() + "', "
	                  + currentAccount.getMaxOverdraftLimit()
	                  + ")";

	            statement.execute(currentQuery);
	        }



	        // ================= LOAN ACCOUNT =================

	        if(account instanceof LoanAccount) {

	            LoanAccount loanAccount = (LoanAccount) account;

	            String loanQuery =
	                    "INSERT INTO loan_account "
	                  + "(account_number, loan_amount, loan_term_months, "
	                  + "installment_amount, interest_type) "
	                  + "VALUES ('"
	                  + loanAccount.getAccountNumber() + "', "
	                  + loanAccount.getLoanAmount() + ", "
	                  + loanAccount.getLoanTermMonths() + ", "
	                  + loanAccount.getInstallmentAmount() + ", '"
	                  + loanAccount.getInterestType()
	                  + "')";

	            statement.execute(loanQuery);
	        }

	        return true;

	    } 
	    catch (Exception e) {
	        e.printStackTrace();
	    }

	    return false;
	}

	@Override
	public Account getAccountByNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(String accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account[] getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
