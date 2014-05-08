/**
 * Class used to store data related to books. Since this
 * class is storing data it is very simple.
 */
public class Book {
	private int bookID;
	private String details;

	public Book(int id, String det) {
		bookId = id;
		details = det;
	}

	public int getID() { return bookID; }
	public void setID(int id) { bookID = id; }
	public String getDetails() { return details; }
	public void setDetails(String d) { details = d; }
}