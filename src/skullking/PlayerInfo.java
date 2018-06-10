package skullking_test;

import java.util.Scanner;

public interface PlayerInfo {
	public void setName(String s);
	
	public void addCard(Card c);
	public Card playCard(int round, int constraint);
	public void setPredictWin(int numOfWin);
	public void calScore(int score);
}
