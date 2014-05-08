/**
 * This is an interesting class because it it used to display a book.
 * Note that all of the actual displaying is abstracted out (refereshPage, refreshDetails, etc.)
 */
public class Display {
	private Book activeBook;
	private User activeUser;
	private int pageNumber = 0;


	public void displayUser(User user) {
		activeUser = user;
		refreshUsername();
	}

	public void displayBook(Book book) {
		pageNumber = 0;
		activeBook = book;
		refreshTitle();
		refreshDetails();
		refreshPage();
	}

	public void turnPageForward() {
		pageNumber++;
	}

	public void turnPageBackward() {
		pageNumber--;
	}
}