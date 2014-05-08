public class Call {
	/* Minimal rank of employee who can handle this call */
	private Rank rank;

	/* The person who is call */
	private Caller caller;

	/* Employee who is handling call */
	private Employee handler;

	public Call(Caller c) 	{
		rank = Rank.Responder;
		caller = c;
	}

	public void reply(String message) {...}
	public Rank getRank() { return rank; }
	public Rank setRank(Rank rank) { this.rank = rank; }
	public Caller getCaller() { return caller; }
}