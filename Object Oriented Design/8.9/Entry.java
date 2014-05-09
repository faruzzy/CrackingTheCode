/**
 * Recall that an abstract class can't be instantiated.
 */
public abstract class Entry {
	// Each file or directory will have a parents
	protected Directory parent;

	// Basic properties of a directory/file
	protected long created;
	protected long lastUpdated;
	protected long lastAccessed;
	protected String name;

	public Entry (String n, Directory p) {
		name = n;
		parent = p;
		created = System.currentTimeMillis();
		lastUpdated = System.currentTimeMillis();
		lastAccessed = System.currentTimeMillis();
	}	

	public boolean delete () {
		if (parent == null) return false;
		return parent.deleteEntry(this);
	}

	/**
	 * Size is a method each subclass will be forced to and should implement
	 * on their own.
	 */
	public abstract int size();

	public String getFullPath() {
		if (parent == null) return name;
		return parent.getFullPath() + "/" + name;
	}

	/* Getters and setters for class memebers */
	public void setParentDirectory(Directory p) { parent = p; }
	public Directory getParentDirectory() { return parent; }
	public void setlastUpdated(long lu) { lastUpdated = lu; }
	public long getLastUpdated() { return lastUpdated; }
	public void setName(String n) { name = n; }
	public String getName() { return name; }
	public String getCreated() { return created; }
}