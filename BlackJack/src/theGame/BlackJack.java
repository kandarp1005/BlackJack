package theGame;

import java.util.*;

public class BlackJack {
	public static void main(String[] args) {

		Player player = new Player();
		Player dealer = new Player();
		Scanner kbd = new Scanner(System.in);
		System.out.println("Welcome to the game of BlackJack :)");
		String p = "", d = "";
		System.out.println("this is your  hand :  ");
		System.out.println(player.getHand());
		System.out.println("This is the dealer's hand : ");
		System.out.println(dealer.getHand());
		boolean meDone = false, dDone = false;
		while (!meDone || !dDone || player.isBusted()) {
			if (!meDone) {
				System.out.println("Hit or Stand (Enter H or S) : ");
				p = kbd.nextLine();
				if (p.equalsIgnoreCase("H")) {
					System.out.println("Your Hand is : ");
					player.playRound(p);
					System.out.println("Your Score is : "
							+ player.getHand().getPlayerScore());
					meDone = player.isBusted() || player.isBJ();

				} else {
					System.out.println("Your Score is : ");
					player.playRound("S");
					meDone = true;
				}
				if (!dDone) {
					if (dealer.getHand().getPlayerScore() < 17) {
						System.out.println("The dealer hits");
						System.out.println("The dealer's hand : ");
						dealer.playRound("H");
						System.out.println("Dealer Score : "
								+ dealer.getHand().getPlayerScore());
						dDone = dealer.isBusted() || dealer.isBJ();
					} else {
						//
						System.out.println("The dealer stays");
						dDone = true;
					}
				}
				if (player.isBusted())
					dDone = true;
				if (dealer.isBusted())
					meDone = true;
			}
		}
		if ((player.getHand().getPlayerScore() > dealer.getHand().getPlayerScore() && player.getHand().getPlayerScore() <= 21) || dealer.isBusted()) {
			System.out.println("You Win!!! :)");
		} else if ((dealer.getHand().getPlayerScore() > player.getHand().getPlayerScore() && dealer.getHand().getPlayerScore() <= 21) || player.isBusted()) {
			System.out.println("The dealer's Score : "
					+ dealer.getHand().getPlayerScore());
			System.out.println("The Dealer Wins :(");
		}
		if (player.getHand().getPlayerScore() == dealer.getHand() .getPlayerScore()) {
			System.out.println("It's a draw(AAAAAAAHHHHHHH)");
		}

		kbd.close();

	}

}
