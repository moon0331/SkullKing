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
		val=0;
		
		while(true){
			Scanner s=new Scanner(System.in);
			try {
		        while(true)
		        {
		        	val=Integer.parseInt(s.nextLine()); 
		        	if (constraint>=5&&constraint<=17)
				    {
				    	if( (val>=5 && val<=17) ||val>=57|| val<=4) break;   //val>=57부터는 특수카드이므로 먼저 낸 숫자카드와 상관없이 낼 수 있음 0~5도 escape,특수카드이므로 
				    	else 
				    		System.out.println("u can not play it");
				    }
				    
				    else if(constraint>=18&&constraint<=30)
				    {
				    	if((val>=18 && val<=30)||val>=57|| val<=4) break;  
				    	else 
				    		System.out.println("u can not play it");

				    }
				    
				    else if(constraint>=31&&constraint<=43)
				    {
				    	if((val>=31 && val<=43)||val>=57|| val<=4) break;  
				    	else 
				    		System.out.println("u can not play it");

				    } 
				    
				    else if(constraint>=44&&constraint<=56)
				    {
				    	if((val>=44 && val<=56)||val>=57|| val<=4) break;  
				    	else 
				    		System.out.println("u can not play it");

				    } 
				    else 
				    	break;
		        }//올바른 카드 낼 때까지 val값을 계속 받음 이건 나중에 처리해서 바꿔도 
				
				
				
				
				val=Integer.parseInt(s.nextLine());
				System.out.println(val+"picked");
			 
				if(val>=0 && val<deck.size()) break;
				
			} catch(Exception e){
				System.out.println("Exception : unvalid input");
				setValidity(); //cardValidity 체크해서 되는것 임의로 고르게 해야 함 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11
				val=0; //임시방편 (룰에 맞는 카드 내도록 해야 함)
				break;
			}finally {
				s.close();
			}
		}
		Card c=deck.get(val);
		deck.remove(val);
		return c;
	}
	public void setPredictWin(int round) { //predict the number of win
		System.out.print(name +"'s turn to predict win: ");
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		//predict_num_of_win=0;
		predict_num_of_win=r.nextInt(round);
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
		if(predict_num_of_win==0) {
			if(num_of_win==0) score+=10*round;
			else score-=10*round;
		}
		else if(predict_num_of_win==num_of_win) {
			score+=20*predict_num_of_win;
		}
		else {
			int diff=predict_num_of_win-num_of_win;
			if(diff<0) diff*=-1;
			score-=20*diff;
		}
	}
}
