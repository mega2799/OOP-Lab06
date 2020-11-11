package it.unibo.oop.lab.exception2;

public class WrongAccountHolderException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1287361L;
	private final int actual;
	private final int expected;

	public WrongAccountHolderException(final int actual, final int expected) {
		this.actual = actual;
		this.expected = expected;
	}

	public String toString() {
		return "WrongAccountHolderException " + actual +
				" was not the" + "owner, expected: " + expected;
	}

}
