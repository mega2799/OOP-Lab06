package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 487318561761L;
	


	@Override
	public String toString() {
		return "NotEnoughBatteryException";
	}
	
	 @Override
	    public String getMessage() {
	        return this.toString();
	    }
}
