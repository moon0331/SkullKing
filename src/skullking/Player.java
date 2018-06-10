package skullking;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Player implements PlayerInfo {
	private String name;
	private int score;
	private int predict_num_of_win;
	private int num_of_win;
	private boolean won_previous_game;
	private List<Card> deck;
	private List<Boolean> cardValidity;
	
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
		System.out.println("=============================");
		System.out.println("player "+ name +" adds Card.");
		deck.add(c);
		//System.out.println(deck.size()+"==size of deck");
	}
	public Card playCard(int round, int constraint) { //play a card ,여기서 너가 써놓은 constraint가 그 숫자카드 나오면 내는 카드 제한시키는 그거라고 생각함 constraint= standard_card(game class 에 있는)
		System.out.println(round+"round : "+this.name+" to pick card");
		/*
		 * 앞사람이 낸 카드가 숫자카드가 아닌 경우 아무거나 내도 됨, 앞사람이 숫자카드를 낸 경우에는 자기는 그 색의 숫자 또는 특수카드를 내야함 다만 그 색이 없다면 아무거나 내도 됨
		 * */
		System.out.println("input number to pick(constraint="+constraint+")");
		int val; 
		int check_non_constraint=deck.length();
		for(i=0;i<deck.length();i++)
		{
			Card pick = deck.get(i);  
			int val=pick.getNum(); 
			if (Card.isGold(constraint))
		    {
		    	if( Card.isGold(val) || Card.isSpecial(val)) continue;   //val>=57부터는 특수카드이므로 먼저 낸 숫자카드와 상관없이 낼 수 있음 0~5도 escape,특수카드이므로 
		    	else 
		    	{
		    		pick.setValidity(false); 
		    		check_non_constraint--;
		    	}
		    		
		    }
		    
		    else if(Card.isRed(constraint))
		    {
		    	if( Card.isRed(val) || Card.isSpecial(val)) continue;  
		    	else 
		    	{
		    		pick.setValidity(false); 
		    		check_non_constraint--;
		    	}

		    }
		    
		    else if(Card.isBlue(constraint))
		    {
		    	if( Card.isBlue(val) || Card.isSpecial(val)) continue;  
		    	else 
		    	{
		    		pick.setValidity(false); 
		    		check_non_constraint--;
		    	}
		    } 
		    
		    else if(Card.isBlack(constraint))
		    {
		    	if( Card.isBlack(val) || Card.isSpecial(val)) continue;  
		    	else 
		    	{
		    		pick.setValidity(false); 
		    		check_non_constraint--;
		    	}
		    } 
		    else 
		    	continue; 
		} 
		
		if(check_non_constraint==0)//In that case, all cards in my hand consists of non-constraint number cards and special cards
		{
			for(i=0;i<deck.length();i++)
			{
				pick.setValidity(true);
			}

		}
		
		
			
			
		while (true) {
			Scanner s = new Scanner(System.in);
			val = Integer.parseInt(s.nextLine());
			Card c = deck.get(val);
			if (c.getValidity())
				break;
			else
				System.out.println("u can not play it, do it one more");
		} // 올바른 카드 낼 때까지 val값을 계속 받음 이건 나중에 처리해서 바꿔도

		System.out.println(val + "picked");
		Card c=deck.get(val);
		deck.remove(val);
		return c;
	}
	public void setPredictWin(int round) { //predict the number of win
		System.out.print(name +"'s turn to predict win: ");
		Scanner s=new Scanner(System.in); 
		
		try {
			predict_num_of_win=s.nextInt(); // why NoSuchElementException ?????
			if(predict_num_of_win<0 || predict_num_of_win>round) {
				System.out.println("Not Valid number of win. Set prediction to zero.");
				predict_num_of_win=0;
			}
		} catch(Exception e){
			System.out.println("win number: "+predict_num_of_win);
			System.out.println("Exception! Set the number of win zero.");
			predict_num_of_win=0;
		}
		s.close();
		System.out.println(predict_num_of_win+"wins");
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
	public void setValidity(int current_card) { //카드 번호가 들어감
		for(int i=0; i<cardValidity.size(); i++) { //각 카드가 낼 수 있는지 확인...................
			
		}
	}
	public void calScore_predict(int round) {
		int val=0;
		if(predict_num_of_win==0) {
			if(num_of_win==0) val=10*round; //score+=10*round; //plus
			else val=(-10*round);//score-=10*round; //minus
		}
		else if(predict_num_of_win==num_of_win) {
			val=20*predict_num_of_win;
			//score+=20*predict_num_of_win; //plus
		}
		else {
			int diff=predict_num_of_win-num_of_win;
			if(diff<0) diff*=-1;
			val=(-20*diff);
			//score-=20*diff; //minus
		}
		System.out.println(name+"은"+round+"에서"+val+"획득");
		score+=val;
	} 
	
   
}
