public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	

	public ParkingSpot(Level lvl, int r, int n, VehicleSize s) {...}

	// This is a great way to handle returns instead of having an if condition
	public boolean isAvailible() { return vehicle == null; }
}