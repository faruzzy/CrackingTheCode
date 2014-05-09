import java.util.ArrayList;

public class Directory extends Entry {
	/**
	 * A directory or a file can be represented by entry. Hence we have an ordered list (ArrayList) of
	 * the contents of a directory, which is made up of entries.
	 */
	protected ArrayList<Entry> contents;

	public Directory(String n, Directory p) {
		super(n, p);
		contents = new Arraylist<Entry>():
	}

	/**
	 * We override entries abstract method, size
	 */
	public int size() {
		int size = 0;
		for (Entry e : contents) {
			size += e.size();
		}
		return size;
	}

	public int numberOfFiles() {
		int count = 0;
		for (Entry e : contents) {
			if (e instance of Directory) {
				count++; // Count directory as a file
				Directory d = (Directory) e;
				count += d.numberOfFiles();
			} else if (e instance of File) {
				count++;
			}
		}
		return count;
	}

	public boolean deleteEntry(Entry e) {
		contents.remove(e);
	}

	public void addEntry(Entry e) {
		contents.add(e);
	}

	protected ArrayList<Entry> getContents() { return contents; }
}