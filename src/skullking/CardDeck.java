package skullking;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class CardDeck {
	private final int NUM_OF_CARD=55;
	private List<Card> list;
	
	public CardDeck(int num) {
		list=new ArrayList<Card>();
		for(int i=0; i<num; i++) {
			list.add(new Card(i));
		}
		//card update
	}
	public Card pickCard() {
		Random random=new Random();
		int idx=random.nextInt() % list.size();
		Card picked=list.get(idx); 
		list.remove(idx);
		return picked; //randomly pick card to player
	}
}
