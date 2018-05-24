package skullking;

import java.util.Scanner;

public class Game{
	private Player[] p;
	//private int numOfPlayer;
	private int winner; //winner of the game
	private CardDeck deck;
	private Comparator comparator;
	private final int NUM_OF_CARD=55; // what is the number of card?
	
	public Game(Player[] player) { //player setting, make comparator
		p=player;
		comparator=new Comparator();
		deck=new CardDeck(NUM_OF_CARD);
	}
	
	public void playGame(int round) { //game process
		for(int i=0; i<p.length; i++) { //for all player
			for(int j=0; j<round; j++) {
				p[i].addCard(deck.pickCard()); //each player pick card in deck round times
			}
			p[i].setPredictWin(round); //prediction
		} 
		//now, each player has their own card in p.cardDeck, and all players predicted their number to win.
		
		for(int i=0; i<p.length; i++) {
			System.out.println("put the card! : Player"+i);
			Card c=p[i].playCard(comparator.getConstraint()); //each player play a card 
			comparator.setCard(i,c); //on comparator
		}
		winner=comparator.getWinner();
		//or use int[] calculatedScore=calScore(player); function that calculate gained/losed score
	}
	public void setWinner(int p) {
		winner=p;
	}
	public int getWinner() {
		return winner;
	}
}
