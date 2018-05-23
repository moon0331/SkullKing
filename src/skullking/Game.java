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
		Scanner s=new Scanner(System.in);
		for(int i=0; i<p.length; i++) { //for all player
			for(int j=0; i<round; j++) {
				p[i].addCard(deck.pickCard()); //each player pick card in deck round times
			}
			
			System.out.println("player "+ i +" turn to predict win: ");
			int win=s.nextInt(); // exception needed!!!!!!!!!!!!!!!!!!!!!
			p[i].setPredictWin(win); //prediction
		} 
		//now, each player has their own card in p.cardDeck, and all players predicted their number to win.
		
		for(int i=0; i<p.length; i++) {
			System.out.println("put the card! : Player"+i);
			Card c=p[i].playCard(i); //each player play a card 
			comparator.setCard(i,c); //on comparator
		}
		winner=comparator.getWinner();
		
		s.close();
	}
	public void setWinner(int p) {
		winner=p;
	}
	public int getWinner() {
		return winner;
	}
}
