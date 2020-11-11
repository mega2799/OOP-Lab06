package it.unibo.oop.lab.exception2;

public class NotEnoughFoundsException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6519651L;
	final private double currentMoney;
	final private double amount;
	
	public NotEnoughFoundsException(final double currentMoney, 
			final double amount) {
		this.currentMoney = currentMoney;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "NotEnoughFoundsException the balance is " + currentMoney +
				"so we cant withdraw: " + amount; 
	}

}
