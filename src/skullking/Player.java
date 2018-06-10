package skullking_test;

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
	public Card playCard(int round, int constraint) { //play a card ,?뿬湲곗꽌 ?꼫媛? ?뜥?넃?? constraint媛? 洹? ?닽?옄移대뱶 ?굹?삤硫? ?궡?뒗 移대뱶 ?젣?븳?떆?궎?뒗 洹멸굅?씪怨? ?깮媛곹븿 constraint= standard_card(game class ?뿉 ?엳?뒗)
		System.out.println(round+"round : "+this.name+" to pick card");
		/*
		 * ?븵?궗?엺?씠 ?궦 移대뱶媛? ?닽?옄移대뱶媛? ?븘?땶 寃쎌슦 ?븘臾닿굅?굹 ?궡?룄 ?맖, ?븵?궗?엺?씠 ?닽?옄移대뱶瑜? ?궦 寃쎌슦?뿉?뒗 ?옄湲곕뒗 洹? ?깋?쓽 ?닽?옄 ?삉?뒗 ?듅?닔移대뱶瑜? ?궡?빞?븿 ?떎留? 洹? ?깋?씠 ?뾾?떎硫? ?븘臾닿굅?굹 ?궡?룄 ?맖
		 * */
		System.out.println("input number to pick(constraint="+constraint+")");
		int check_non_constraint=deck.size();
		for(int i=0;i<deck.size();i++)
		{
			Card pick = deck.get(i);  
			int val=pick.getNum(); 
			if (Card.isGold(constraint))
		    {
		    	if( Card.isGold(val) || Card.isSpecial(val)) continue;   //val>=57遺??꽣?뒗 ?듅?닔移대뱶?씠誘?濡? 癒쇱? ?궦 ?닽?옄移대뱶?? ?긽愿??뾾?씠 ?궪 ?닔 ?엳?쓬 0~5?룄 escape,?듅?닔移대뱶?씠誘?濡? 
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
			for(int i=0;i<deck.size();i++)
			{
				deck.get(i).setValidity(true);
			}

		}
		
		
			
		int val=-1;
		for (int i=0;i<deck.size(); i++) {
			Scanner s = new Scanner(System.in);
			val = i;
			Card c = deck.get(val);
			if (c.getValidity()) {
				System.out.println(c.getNum()+"뽑음");
				break;
			}
			else {
				System.out.println("u can not play it, do it one more");
			}
		} // ?삱諛붾Ⅸ 移대뱶 ?궪 ?븣源뚯? val媛믪쓣 怨꾩냽 諛쏆쓬 ?씠嫄? ?굹以묒뿉 泥섎━?빐?꽌 諛붽퓭?룄
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
		System.out.println(name+"??"+round+"?뿉?꽌"+val+"?쉷?뱷");
		score+=val;
	} 
	
   
}
