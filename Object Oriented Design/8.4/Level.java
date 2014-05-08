/**
 * Represents a level in a parking garage.
 */
public class Level {
	private int floor;
	/**
	 * Here we have modelled each parking spot as an element in an array.
	 */
	private ParkingSpot[] spots;
	private int availibleSpots = 0; // Number of free spots
	private static final int SPOTS_PER_ROW = 10;

	public Level(int flr, int numberSpots) {...}

	public int availibleSpots() { return availibleSpots; }

	/**
	 * Find a place to park this vehicle. Return false if failed.
	 */
	public boolean parkVehicle(Vehicle vehicle) {...}

	/**
	 * Find a place to park a vehicle starting at a certain spot
	 */
	private boolean parkStartingAtSpot(Vehicle vehicle, int num) {...}

	public void spotFreed() {
		availibleSpots++:
	}
}