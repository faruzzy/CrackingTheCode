/**
 * You have a call center with three levels of employees: respondent,
 * manager and director. An incoming telephone call must first be allocated
 * to a respondant who is free. If the respondant can't handle this call
 * he or she must escalate the call to a manager. If the a manager is not free or
 * unable to handle it the call should be escalated to a director.
 * 
 * Design the classes and data structures for this problem. Implement a method
 * dispatchCall() which assigns a call to the first availible employee.
 */


/**
 * CallHandler is a singleton class that handles the routing of the class
 * Calls through extensions of the class Employee.
 */
public class CallHandler {
	private static instance CallHandler instance;

	/* 3 levels of employees: respondants, managers, directors */
	private final int levels = 3;

	private final int NUM_RESPONDANTS = 10;
	private final int NUM_MANAGERS = 4;
	private final int NUM_DIRECTORS = 2;

	/**
	 * List of employees by level
	 * employeeLevels[0] = respondants
	 * employeeLevels[1] = managers
	 * employeeLevels[2] = directors
	 */
	List<List<Employee>> employeeLevels;
	List<List<Call>> callQueues;

	// Singleton, private constructor
	private CallHandler() {

	}

	// The get instance method for a singleton is two lines long! Neat!
	public static CallHandler getInstance() {
		if (instance == null) instance = new CallHandler();
		return instance;
	}

	/* Gets the first availible employee who can handle this call */
	public Employee getHandlerForCall(Call call) {...};

	/** 
	 * Routes the call to an availible employee or saves in a queue if no
	 * employees is availible
	 */
	public void dispatchCall(Caller caller) {
		Call call = new Call(caller);
		dispatchCall(call);
	}

	/**
	 * Route sthe call to an availible employee or saves it in queue if no
	 * employees availible
	 */
	public void dispatchCall(Call call) {
		/* Try to route the call to an employee with minimum rank */
		Employee emp = getHandlerForCall(call);
		if (emp != null) {
			emp.receiveCall(call);
			emp.setHandler(emp);
		} else {
			/* Place the call into a correspdoning queue according to its rank */
			call.reply("Please wait.");
			callQueues.get(Call.getRank().getValue().add(call));
		}
	}
}