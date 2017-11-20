package theGame;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> deck = new ArrayList<Card>();
	private int numCards = 52;

	public Deck() {
		String[] vals = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] suit = { "Spade", "Diamond", "Heart", "Club" };
		for (int s = 0; s < 4; s++) {
			for (int i = 0; i < 13; i++) {
				deck.add(new Card(suit[s], vals[i]));
			}
		}
	}

	public void shuffle() {
		int numShuffles = 52;
		for (int i = 0; i < numShuffles; i++) {
			Card temp = deck.remove((int) (Math.random() * deck.size()));
			deck.add((int) (Math.random() * deck.size()), temp);
		}
	}

	public Card deal() {
		Card temp = null;
		temp = (deck.get(0));
		deck.remove(0);
		return temp;
	}

	public String toString() {
		String cards = "";
		for (int i = 0; i < deck.size(); i++) {
			cards += deck.get(i).toString();
		}
		return cards;
	}

}
