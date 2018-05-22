package skullking;

public class Comparator implements ComparatorInfo { 
	//where people put card
	Card present_card;
	int present_card_owner;
	Card strongest_card;
	int strongest_card_owner;
	int constraint;
	
	public void setCard(int owner, Card card) {
		present_card=card;
		present_card_owner=owner;
		//if() constraint= 제약조건 걸리는 때
	}
	public void compare() {
		if(strongest_card==null) {
			strongest_card=present_card;
			strongest_card_owner=present_card_owner;
		}else {
			if(true) { //real compare card (if condition may change)
				//교체
			}
		}
	}
	public int getWinner() {
		return strongest_card_owner;
	}
	public boolean stronger() { //카드 세기 비교
		return false;
	}
}
