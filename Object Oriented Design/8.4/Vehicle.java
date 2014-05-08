/**
 * Defining an enum is very very easy.
 * <Access Modifier> enum <Name> { Type1, Type2, Type3 }
 */
public enum VehicleSize { Motorcycle, Compact, Large }

/**
 * Abstract class vehicle from which car, bus, truck and motorcycle
 * will inherit. 
 */
public abstract class Vehicle {
	private String licensePlate;
	private int spotsNeeded;
	protected VehicleSize size;
	protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();


	public int getSpotsNeeded() { return spotsNeeded; }

	public VehicleSize getVehicleSize() { return size; }

	public void parkInSpot(ParkingSpot s) {...}

	public void clearSpots() {...}

	/**
	 * Checks if the spot size is big enough for the vehicle
	 */
	public abstract boolean canFitInSpot(ParkingSpot spot);
}