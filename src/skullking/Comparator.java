package skullking;

public class Comparator implements ComparatorInfo { //����ü �ʿ�?
	//ī�带 ���� ������ ������
	Card present_card;
	int present_card_owner;
	Card strongest_card;
	int strongest_card_owner;
	int constraint;
	// int winner;
	
	public void setCard(int owner, Card card) {
		present_card=card;
		present_card_owner=owner;
		//if() constraint= �������� �ɸ��� ��
	}
	public void compare() {
		if(strongest_card==null) {
			strongest_card=present_card;
			strongest_card_owner=present_card_owner;
		}else {
			if(stronger()) { //���� ���� ���ϴ�
				//��ü
			}
		}
	}
	public int getWinner() {
		return strongest_card_owner;
	}
	public boolean stronger() { //ī�� ���� ��
		return false;
	}
}
