/**
 * The Jukebox class represents the body of the system. Many of the interactions
 * between components of the system, or between the system and the user take place
 * here.
 */
public class Jukebox {
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollection;
	private SongSelector ts;

	public Jukebox(CDPlayer cdPlayer, User user,
		Set<CD> cdCollection, SongSelector ts) {
		...
	}

	public Song getCurrentSong() {
		return ts.getCurrentSong();
	}

	public void setUser(User u) {
		user = u;
	}

	public void getUser() {
		return user;
	}
}