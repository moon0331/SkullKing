package skullking;

import java.util.Scanner;

public class Game{
	private Player[] p;
	private int numOfPlayer;
	private int winner; //winner of the game
	private CardDeck deck;
	private Comparator comparator;
	
	public Game(Player[] player) { //player setting, make comparator
		p=player;
		comparator=new Comparator();
	}
	
	public int playGame(int round) { //game process
		Scanner s=new Scanner(System.in);
		for(int i=0; i<p.length; i++) {
			for(int j=0; i<round; i++) {
				p[i].addCard(deck.pickCard()); //each player pick card in deck round times
			}
			
			System.out.println("player "+ i +" turn to predict win: ");
			int win=s.nextInt(); // exception needed!!!!!!!!!!!!!!!!!!!!!
			p[i].setPredictWin(win); //prediction
		}
		
		for(int i=0; i<p.length; i++) {
			System.out.println("put the card!");
			
		}
		s.close();
		return getWinner();
	}
	public void setWinner(int p) {
		winner=p;
	}
	public int getWinner() {
		return winner;
	}
}
