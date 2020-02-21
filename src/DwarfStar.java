/*
 The DwarfStar is an abstract class which just provies the implementation of certain methods for classes which
 would extend it. It has two additional properties pressure and fusion rate
 */

public abstract class DwarfStar extends Star {
	private int pressure;
	private double fusionRate;

	// getter and setter methods for the DwarfStar abstract class properties
	public double getFusionRate() {
		return fusionRate;
	}

	public void setFusionRate(double fusionRate) {
		this.fusionRate = fusionRate;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	/*
	 * These two methods are abstract methods which just provide a blueprint for the
	 * classes will inherit the DwarfStar. The actual implementation of these
	 * methods would be provided in the BlackDwarf and WhiteDwarf Classes
	 */
	public abstract int calculatePressure();

	public abstract void getDetails();

}
