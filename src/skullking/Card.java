package skullking;

public class Card implements CardInfo {
	public int grade; 
	public int number; //�Ϲ�ī�� ��� ����
	/*��� 
	 * (skullking, 
	 * pirate, 
	 * changeable, 
	 * mermaid, 
	 * black, 
	 * gold, red, blue, 
	 * escape)
	 * 
	 * enum���� ó������ ������
	*/
	
	public boolean hasBonusScore() {
		//return grade==SKULLKING;
		return grade==100;
	}
}
