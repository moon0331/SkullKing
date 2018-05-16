package skullking;

public interface ComparatorInfo {
	public void setCard(int owner, Card card); //카드 놓기
	public void compare(); //현재 카드와 놓은 카드 비교, 승자 결정
	public int getWinner();
	public boolean stronger();
}
