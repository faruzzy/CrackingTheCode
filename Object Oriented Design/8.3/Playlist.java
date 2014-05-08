/**
 * The playlist manages the current and next songs to play. It works as a wrapper.
 * Note that as you design classes try to incorporte datastructures that naturally
 * model the real life situation you're designing around.
 * 
 * For instance in a Playlist there is a queue of songs.
 */
public class Playlist {

	private Song song;
	private Queue<Song> queue;

	public Playlist(Song song) {
		queue.add(song);
	}

	public Playlist(Queue<Song> queue) {
		this.queue.add(queue.elements());
	}

	public Song checkNextSong() {
		return queue.peek();
	}

	public void queueUpSong(Song s) {
		queue.add(s);
	}

}