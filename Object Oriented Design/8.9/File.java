public class File extends Entry {
	// Store the data in the file as plain text. This is a design decision of utmost importance
	private String content;
	private int size;

	/**
	 * This constructor is very important! It takes two arguments and calls
	 * to the superclass's constructor which sets the name and directory for the given
	 * file. Since size is to be implemented by subclasses we set size to our member variable
	 * size.
	 */
	public File(String n, Directory p, int sz) {
		super(n, p); // Very important call after subclassing
		size = sz;s
	}

	public String getContents() { return content; }
	public void setContents(String c) { content = c; }

	/**
	 * Here we have overriden an abstract method in our superclass, Entry.
	 * Note that we remove the abstract modifer from the method signature and
	 * add an override tag.
	 */
	@Override
	public int size() { return size; }
}