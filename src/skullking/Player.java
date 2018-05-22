package skullking;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Player implements PlayerInfo {
	private String name;
	private int score;
	private int predict_num_of_win;
	private boolean won_previous_game;
	private List<Card> deck;
	
	public void setName(String s) {
		name=s;
	}
	
	public void addCard(Card c) { //add card from game-deck
		deck.add(c);
	}
	public Card playCard(int constraint) { //play a card
		Scanner s=new Scanner(System.in);
		int val=-1;
		while(true) {
			val=s.nextInt(); //exception needed!!!!!!!!!!!
			if(true) /*in this case, you should modify the condition that only pick the right card*/
				break; 
		}
		s.close();
		return deck.get(val);
	}
	public void setPredictWin(int numOfWin) { //predict the number of win
		predict_num_of_win=numOfWin;
	}
	public void calScore(int score) { //plus(or minus) score
		this.score+=score;
	}
}
