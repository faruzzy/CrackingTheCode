public class CDPlayer {
	private Playlist p;
	private CD c;

	public CDPlayer(Playlist p) {
		this.p = p;
	}

	public CDPlayer(CD c) {
		this.c = c;
	}

	// Below is an example of chain calling constructors. Very useful.
	public CDPlayer(Playlist p, CD c) {
		this(p);
		this(c);
	}

	public void playSong(Song s) {...}

	/**
	 * Getters and setters are always a good thing to have to help fill
	 * your classes out as you work through problems
	 */
	public Playlist getPlaylist() {
		return p;
	}

	public void setPlaylist(Playlist p) {
		this.p = p;
	}

}