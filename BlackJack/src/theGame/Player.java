package theGame;

public class Player {

	private Hand pHand;
	private boolean isDealer;
	private Deck deck = new Deck();
		
	public Player () {
		deck.shuffle();
		pHand = new Hand (deck.deal(), deck.deal());
		isDealer = false;
	}
	
	public void playRound (String s) {
		if (s.equalsIgnoreCase("H")){
			pHand.addCardToHand(deck.deal());
			//System.out.println("Your Hand is : ");
			System.out.println(this.getHand());
			//System.out.println("Your Score is : " + pHand.getPlayerScore());

		}else if (s.equalsIgnoreCase("S")) {
			System.out.println(" " + pHand.getPlayerScore());
		}
		if (this.isBusted()) {
			System.out.println ("Busted!");
		}
		
	}
	public boolean isBusted (){
		if (pHand.getPlayerScore() > 21) {
			return true;
		}
		return false;
		
	}
	public boolean isBJ() {
		if (pHand.getPlayerScore() == 21) {
			return true;
		}
		return false;
	}
	
	public Hand getHand () {
		return pHand;
	}
	
}