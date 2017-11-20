package theGame;

public class Card {

	private String suit;
	private String val;
	
	
	public Card(String a, String b) {
		suit = a;
		val = b;
	}

	public String getSuit(){
		return suit;
	}
	
	public String getVal(){
		return val;
	}
	
	public String toString(){
		return "Suit : " + suit + "\t" + "Value : " + val  + "\n";
	}
	
}
