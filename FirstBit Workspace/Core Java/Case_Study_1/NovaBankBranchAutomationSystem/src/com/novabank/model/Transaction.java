package com.novabank.model;

import java.time.LocalDateTime;

public class Transaction {
	
	String transactionId;
	TransactionType transactionType;
	double amount;
	LocalDateTime transactionDate;
	
	public Transaction(String transactionId, TransactionType transactionType, double amount,
			LocalDateTime transactionDate) {

		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}
	
	//Getters

	public String getTransactionId() {
		return transactionId;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	@Override
	public String toString() {
		return "TransactionId: " + transactionId + "transaction Type: " + transactionType + ", amount: "
				+ amount + ", Transaction Date: " + transactionDate;
	}
	
}
