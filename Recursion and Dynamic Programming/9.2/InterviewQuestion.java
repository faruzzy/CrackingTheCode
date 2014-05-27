/**
 * Get a robot from (0,0) to (X,Y) given that certain spots are off limits
 * and the robot can only move down or right.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {

	}

	public static boolean getPath(int x, int y, ArrayPath<Point> path,
		Hashtable<Point, Boolean> cache) {

		Point p = new Point(x, y);
		if (cache.containsKey(p)) { // Already visited
			return cache.get(p);
		}

		if (x==0 && y ==0) return true;

		boolean success = false;
		if (x >= 1 && isFree(x-1, y)) { 
			success = getPath(x-1, y, path, cache); // Free, go right
		}

		if (!sucess && y >= 1 && isFree(x, y-1)) {
			success = getPath(x, y-1, path, cache); // Free, go down
		}

		// Right way add to path
		if (success) path.add(p);

		cache.put(p, success);
		return success;
	}
}