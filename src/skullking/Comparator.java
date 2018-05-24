package skullking;

public class Comparator implements ComparatorInfo { 
	//where people put card
	private Card present_card;
	private int present_card_owner;
	private Card strongest_card;
	private int strongest_card_owner;
	private int constraint; //constraint to set a card
	
	public void setCard(int owner, Card card) {
		present_card=card;
		present_card_owner=owner;
		/* if(){ //check that the card can included
		 * 
		 * }
		 * */
	}
	public void compare() {
		if(strongest_card==null) {
			strongest_card=present_card;
			strongest_card_owner=present_card_owner;
		}else {
			if(stronger()) { //real compare card (if condition may change)
				//change winner card
			}
		}
	}
	public int getWinner() {
		return strongest_card_owner;
	}
	public boolean stronger() { //modify
		return false;
	}
	public int getConstraint() {
		return constraint;
	}
}
