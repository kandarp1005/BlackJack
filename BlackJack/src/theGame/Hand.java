package theGame;

import java.util.ArrayList;

public class Hand {

	private int playerScore;
	private ArrayList<Card> hand = new ArrayList<Card>();

	public Hand(Card a, Card b) {
		playerScore = 0;
		hand.add(a);
		hand.add(b);

	}

	public void addCardToHand(Card c) {
		hand.add(c);
	}

	public int getPlayerScore() {

		playerScore = 0;
		int a = 0, count = 0;
		for (int h  = 0; h < hand.size(); h++) {
			if (hand.get(h).getVal().equalsIgnoreCase("A")) {
				count ++;
			}
			
		}
		for (int i = 0; i < hand.size(); i++) {
			if (hand.get(i).getVal().equalsIgnoreCase("10") ||hand.get(i).getVal().equalsIgnoreCase("J") || hand.get(i).getVal().equals("Q") || hand.get(i).getVal().equalsIgnoreCase("K")) {
				playerScore += 10;
			}else if (hand.get(i).getVal().equalsIgnoreCase("2")){
				playerScore += 2;
			}else if (hand.get(i).getVal().equalsIgnoreCase("3")){
				playerScore += 3;
			}else if (hand.get(i).getVal().equalsIgnoreCase("4")) {
				playerScore += 4;
			} else if (hand.get(i).getVal().equalsIgnoreCase("5")) {
				playerScore += 5;
			} else if (hand.get(i).getVal().equalsIgnoreCase("6")) {
				playerScore += 6;
			} else if (hand.get(i).getVal().equalsIgnoreCase("7")) {
				playerScore += 7;
			} else if (hand.get(i).getVal().equalsIgnoreCase("8")) {
				playerScore += 8;
			} else if (hand.get(i).getVal().equalsIgnoreCase("9")) {
				playerScore += 9;
			} 
			if (count >= 2 && playerScore >= 11) {
				a = 1; 
			}else if (count < 2 && playerScore < 11) {
				a = 11;
			} else if(count < 2 && playerScore >= 11) {
				a = 1;
			}
			
		}		
		a *= count;

		return playerScore += a;
	}

	public String toString() {
		String cards = "";
		for (int i = 0; i < hand.size(); i++) {
			cards += hand.get(i).toString();
		}
		return cards;
	}

}

