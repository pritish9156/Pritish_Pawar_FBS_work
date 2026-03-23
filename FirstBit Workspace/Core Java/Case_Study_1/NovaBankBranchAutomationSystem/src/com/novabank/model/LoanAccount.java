package com.novabank.model;

import java.time.LocalDate;

public class LoanAccount extends Account{
	
	final double loanAmount;
	int loanTermMonths;
	double installmentAmount;
	InterestType interestType;
	
	public LoanAccount(String accountHolderName, String mobileNumber, String mailId, LocalDate accountOpeningDate,
			LocalDate accountClosingDate, double interestRate, double currentBalance, double loanAmount,
			int loanTermMonths) {
		
		super(accountHolderName, mobileNumber, mailId, accountOpeningDate, accountClosingDate, interestRate, currentBalance);
		this.loanAmount = loanAmount;
		this.loanTermMonths = loanTermMonths;
		this.installmentAmount = loanAmount/ (double)loanTermMonths;
		this.interestType = InterestType.FIXED;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public int getLoanTermMonths() {
		return loanTermMonths;
	}

	public double getInstallmentAmount() {
		return installmentAmount;
	}

	public InterestType getInterestType() {
		return interestType;
	}

	@Override
	public String toString() {
		return super.toString() + "\nloanAmount: " + loanAmount + "\nloanTermMonths: " + loanTermMonths + "\ninstallmentAmount: "
				+ installmentAmount + "\ninterestType: " + interestType;
	}
	
	@Override
	public boolean deposit(double amount) {
		
		if(accountStatus == AccountStatus.ACTIVE) {
			
			if(amount > 0) {
				
				if(currentBalance != 0) {
					
					if(amount >= currentBalance) {
						
						//in future -->  refund()
						System.out.println(amount - currentBalance + "Refunded..");
						currentBalance = 0;
						accountStatus = AccountStatus.CLOSED;
						return true;
						
					}else {
						currentBalance -= amount;
						return true;
					}
					
				} else
					System.out.println("Loan is already settled");
					
			} else 
				System.out.println("Please Enter a Valid Amount");
		
		} else 
			System.out.println("Your Account is Freezed or Not Active.. Please Contact with Bank");
		
		return false;	
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		return false;
	}
	
	@Override
	public double calculateInterest() {
	
		if(currentBalance != 0) {
			
			switch(interestType) {
			
			case FIXED:
				
				return loanAmount * interestRate;	
				
			case FLOATING:
				
				return currentBalance * interestRate;
				
			case REDUCING:
				
				return currentBalance * interestRate;
				
			}
					
		}	
		return 0;
	}

}
