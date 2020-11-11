package it.unibo.oop.lab.exception2;

import java.util.Arrays;

public class TransactionsOverQuotaException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7158961L;
	final private int transactions;
	final private double allowedTransactions;
	
	public TransactionsOverQuotaException(final	int transactions,
			final double allowedTransactions) {
		super();
		this.transactions = transactions;
		this.allowedTransactions = allowedTransactions;
	}

	public String toString() {
		return "TransactionsOverQuotaException transactions already done: " 
	+ transactions + ", allowedTransactions="
				+ allowedTransactions;
	}
	
}
