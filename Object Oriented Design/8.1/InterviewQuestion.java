/**
 * Design the data structures for a generic deck of cards. Explain how you would
 * subclass data structures to implement black jack.
 */


/**
 * Since suits are constant values an enumerated type works well to represent them.
 * Each card is has a suit which contains a value.
 */
public enum Suit {
	Club (0), Diamond (1), Heart (2), Spade (3);
	private int value;
	private Suit(int v) { value = v; }
	public int getSuit { return value; }
	public static Suit getSuitFromValue(int value) { ... }
}


/**
 * Deck is a class that takes a class that extends Card.
 */
public class Deck <T extends Card> {
	private ArrayList<T> cards; // all card dealt or not
	private int deltIndex; // marks the delt order of the card

	public void setDeckOfCards(<ArrayList<T> deckOfCards) {...}

	public void shuffle() {...}

	public int remainingCards() {
		return cards.size() - dealtIndex;
	}

	public T[] dealHand(int dealtIndex) { ... }
	public T dealCard() { ... }
}

/**
 * Abstract class: must be extended can't be instantiated.
 */
public abstract class Card {
	private boolean available = true;

	// Number or face that is on the card
	protected int faceValue;
	// Makes use of our enumerated type, suit
	protected Suit suit;

	public Card(int c, Suit s) {
		suit = s;
		faceValue = c;
	}

	public abstract intValue();

	public Suit suit() { return suit; }

	public boolean isAvailible { return available };
	public void makeUnavailible { available = false };
	public void markAvailible { available = true };
}

/**
 * Hand is an object that take a type that extends cards.
 */
public class Hand <T extends Card> {
	protected ArrayList<T> cards = new ArrayList<T>();

	public int score() {
		int score = 0;
		for (T card : cards) {
			score += card.value();
		}
		return score;
	}

	public void addCard(T card) {
		cards.add(card);
	}
}

/**
 * Factory design pattern below.
 */
public class Game {
	public Game(Players player) {
		dealCards();
	}

	protected int dealInitialCards() {
		return 10;
	}
}

public class BlackJackGame extends Game {

	@Override
	protected int dealInitialCards() {
		return 2;
	}
}