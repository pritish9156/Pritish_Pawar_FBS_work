package com.novabank.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Transaction {
	
	String transactionId;
	TransactionType transactionType;
	double amount;
	LocalDateTime transactionDate;
	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
	
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
		return "TransactionId: " + transactionId + "\ntransaction Type: " + transactionType + "\namount: "
				+ amount + "\nTransaction Date: " + formatDate.format(transactionDate) + "\n";
	}
	
}
