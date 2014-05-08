public class UserManager {
	private Hashtable<Integer, User> users;

	public User addUser(int id, String details, int accountType) {
		if (users.containsKey(id)) return null;

		User user = new User(id, details, accountType);
		users.put(id, user);
		return user;
	}

	public boolean removeUser(User u) {
		if (!users.containsKey(u.getID())) return false;

		users.remove(u.getID());
		return true;
	}

	public User find (int id) {
		return users.get(id);
	}
}