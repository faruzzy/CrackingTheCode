/**
 * A child is running up a stair case with n steps and can either hop
 * 1 step, 2 steps or 3 steps at a time. Implement a method to count how many
 * possible ways the child can run up the stairs.
 */
public class InterviewQuestion {

	public static int[] numberOfSteps = new int[100];

	public static void main(String[] args) {
		System.out.println("The number of ways the child can run up the stairs is "
			+ waysToRunUpStairs(Integer.parseInt(args[0])));
		System.out.println("The number of ways the child can run up the stairs with DP is "
			+ dpWaysToRunUpStairs(Integer.parseInt(args[0])));
	}

	public static int waysToRunUpStairs(int steps) {
		if (steps < 0) return 0;
		if (steps == 0) return 1;

		return waysToRunUpStairs(steps - 1) + waysToRunUpStairs(steps - 2) + waysToRunUpStairs(steps - 3);
	}

	public static int dpWaysToRunUpStairs(int steps) {
		if (steps < 0) return 0;
		if (steps == 0) return 1;
		if (numberOfSteps[steps] != 0) return numberOfSteps[steps];
		numberOfSteps[steps] = waysToRunUpStairs(steps - 1) + waysToRunUpStairs(steps - 2) + waysToRunUpStairs(steps - 3);
		return numberOfSteps[steps];		
	}
}