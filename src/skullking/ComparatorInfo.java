package skullking;

public interface ComparatorInfo {
	public void setCard(int owner, Card card); //ī�� ����
	public void compare(); //���� ī��� ���� ī�� ��, ���� ����
	public int getWinner();
	public boolean stronger();
}
