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
	
	public Player() {
		deck=new ArrayList<Card>();
	}
	
	public void setName(String s) {
		name=s;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCard(Card c) { //add card from game-deck
		System.out.println("player "+ name +" adds Card.");
		deck.add(c);
		//System.out.println(deck.size()+"==size of deck");
	}
	public Card playCard(int constraint) { //play a card
		
		/*
		 * 앞사람이 낸 카드가 숫자카드가 아닌 경우 아무거나 내도 됨, 앞사람이 숫자카드를 낸 경우에는 자기는 그 색의 숫자 또는 특수카드를 내야함 다만 그 색이 없다면 아무거나 내도 됨
		 * */
		System.out.println("input number to pick");
		int val;
		val=0;
		
		/*while(true){
			Scanner s=new Scanner(System.in);
			try {
				val=s.nextInt();
				if(val>=0 && val<deck.size()) break;
			} catch(Exception e){
				System.out.println("Exception : unvalid input");
			}finally {
				s.close();
			}
		}*/
		Card c=deck.get(val);
		deck.remove(val);
		return c;
	}
	public void setPredictWin(int round) { //predict the number of win
		System.out.println(name +"'s turn to predict win: ");
		Scanner s=new Scanner(System.in);
		predict_num_of_win=0;
		/*try {
			predict_num_of_win=s.nextInt(); // why NoSuchElementException ?????
			if(predict_num_of_win<0 || predict_num_of_win>round) {
				System.out.println("Not Valid number of win. Set prediction to zero.");
				predict_num_of_win=0;
			}
		} catch(Exception e){
			System.out.println("win number: "+predict_num_of_win);
			System.out.println("Exception! Set the number of win zero.");
			predict_num_of_win=0;
		}*/
		s.close();
	}
	public void calScore(int score) { //plus(or minus) score
		this.score+=score;
	}
	public int getScore() {
		return score;
	}
	public void setWinner(boolean val) {	// need to make won_previous_game false
		won_previous_game=val;
	}
}
