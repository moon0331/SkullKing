package skullking;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class CardDeck {
	private List<Card> list;
	
	public CardDeck(int num) {
		list=new ArrayList<Card>();
		for(int i=0; i<num; i++) {
			
		}
		//ī�� ������Ʈ
	}
	public Card pickCard() {
		Random random=new Random();
		int idx=random.nextInt() % list.size();
		Card picked=list.get(idx); //get�� �³�?
		list.remove(idx);
		return picked;
	}
}
