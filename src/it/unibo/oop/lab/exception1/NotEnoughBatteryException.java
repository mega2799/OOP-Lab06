package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends IllegalStateException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 487318561761L;
	final private double batteryLevel;
	final private double necessary;

	public NotEnoughBatteryException(final double batteryLevel, 
			final double necessary){
		this.necessary = necessary;
		this.batteryLevel = batteryLevel;
	}
	@Override
	public String toString() {
		return "NotEnoughBatteryException, current: " + batteryLevel + 
			" needed: " + necessary;
	}
	
	 @Override
	    public String getMessage() {
	        return this.toString();
	    }
}
