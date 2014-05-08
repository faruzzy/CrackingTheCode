/**
 * Employee is an abstract call that should never be instantiated directly.
 * Classes director, respondant and manager will extend this class.
 * 
 * Note that there is no abstract methods they are forced to implement.
 */
public abstract class Employee {
	private Call currentCall = null;
	protected Rank rank;

	public Employee() {...}

	public void receiveCall(Call call) {...}


}