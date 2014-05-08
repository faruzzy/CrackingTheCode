/**
 * User is a simple data storage class related to storing user information.
 */
public class User {
	private int userID
	private String details;
	private int accountType;

	public void renewMembership() {...}

	public User(int id, String details, int accountType) {
		userID = id;
		this.details = details;
		this.accountType = accountType;
	}

	/* Getters and Setters */
	public int getID() { return userID; }
}