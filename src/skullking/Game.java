package skullking;

import java.util.Scanner;

public class Game{
	private Player[] p;
	//private int numOfPlayer;
	private int winner; //winner of the game
	private CardDeck deck;
	private Comparator comparator;
	private final int NUM_OF_CARD=66; // 66 
	private int standard_card=-1;//게임마다 처음 등장한 숫자카드 뒤에 코드를 위해 나올 수 없는 값인 -1로 설정함 
	
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
			Card c=p[i].playCard(round, standard_card); //each player play a card 
			int cardNum=c.getNum();
		    if(standard_card==-1 && cardNum>=5 && cardNum<=56)//기준이 되는 카드가 없고 내려놓은 카드가 숫자카드일 경우,escape 카드는 0부터 4까지
		    {
		       standard_card=cardNum;
		    }
			
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
