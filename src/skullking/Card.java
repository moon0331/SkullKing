package skullking;

public class Card implements CardInfo {
	public int grade; 
	public int number; //일반카드 경우 숫자
	/*등급 
	 * (skullking, 
	 * pirate, 
	 * changeable, 
	 * mermaid, 
	 * black, 
	 * gold, red, blue, 
	 * escape)
	 * 
	 * enum으로 처리할지 생각중
	*/
	
	public boolean hasBonusScore() {
		//return grade==SKULLKING;
		return grade==100;
	}
}
