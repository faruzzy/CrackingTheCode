/**
 * Acts as a wrapper class for an array of levels. 
 * 
 * We made a design decision to separate parking lot from Levels in order
 * to separate out logic that deals with actually finding free spots and
 * parking cars out from the broader actions of the parking lot.
 */
public class ParkingLot {
	private Level[] levels;
	private final int NUM_LEVELS = 5;

	public ParkingLot() {...}

	/**
	 * Park the vehicle in a spot (or multiple spots), returns false
	 * if failed.
	 */
	public boolean parkVehicle(Vehicle vehicle) {...}
}