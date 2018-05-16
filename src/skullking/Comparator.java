package skullking;

public class Comparator implements ComparatorInfo { //구조체 필요?
	//카드를 내는 곳으로 정의함
	Card present_card;
	int present_card_owner;
	Card strongest_card;
	int strongest_card_owner;
	int constraint;
	// int winner;
	
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
			if(stronger()) { //실제 세기 비교하는
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
