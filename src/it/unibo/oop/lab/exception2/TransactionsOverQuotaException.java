package it.unibo.oop.lab.exception2;

import java.util.Arrays;

public class TransactionsOverQuotaException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7158961L;

	@Override
	public String toString() {
		return "TransactionsOverQuotaException []";
	}
}
