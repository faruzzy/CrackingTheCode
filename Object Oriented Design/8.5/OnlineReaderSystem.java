/**
 * This is the body of our program. Note that most of the designs we've
 * undertaken have have always had a body. This is important as it
 * typically routes the actions between the classes we've decided to make.
 */
public class OnlineReaderSystem {
	private Library library;
	private UserManager userManager;
	private Display display;
	private Book activeBook;
	private User activeUser;

	public OnlineReaderSystem() {
		userManager = new UserManager();
		library = new Library();
		display = new Display();
	}

	public Library getLibrary() { return library; }

	public Display getDisplay() { return display; }

	public UserManager getUserManager() { return userManager; }

	
}