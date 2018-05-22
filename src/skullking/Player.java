package skullking;

import java.util.List;
import java.util.ArrayList;

public class Player implements PlayerInfo {
	String name;
	int score;
	int predict_num_of_win;
	boolean won_previous_game;
	private List<Card> deck;
	
	public void addCard(Card c) { //add card from game-deck
		deck.add(c);
	}
	public Card playCard(int i) { //play a card
		return deck.get(i);
	}
	public void setPredictWin(int numOfWin) { //predict the number of win
		predict_num_of_win=numOfWin;
	}
	public void calScore(int score) { //plus(or minus) score
		this.score+=score;
	}
}
