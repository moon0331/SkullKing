package skullking;

public class Card implements CardInfo {
	private int idx;
	private String card_type;//카드 타입 string꼴로 표현하든지 아님 int로 표현하든지
	private int card_num;  
	/*  
	 * (skullking, 
	 * pirate, 
	 * scarymarry-해적으로도 쓸 수 있고 항복기로도 쓸 수 있는, 
	 * mermaid, 
	 * black, 
	 * gold, red, blue, 
	 * escape)
	 * 
	 * enum 나중에 사용할수도 있음
	*/
	
	/* 반복문으로 연속적으로 생성자를 불러오기 때문에, 생성자는 하나의 모양으로 통일해야 함. public Card(int i)로 idx=i로 만든 후, 
	 * i의 범위에 따라 카드의 특징을 분류(if절 활용)해야 함. 
	 * (Ex: 0번은 escape, 1~13은 red, 14~26은 blue, ..., n번은 skullking으로 한다면,
	 * 각각의 범위에 따라 card_num가 card_type가 달라질 것임)
	 * idx가 primary key의 역할을 한다 보면 됨. (필요없어지면 지울거임)
	 */
	
	public Card(int i) {
		idx=i;
		
		if(idx==0)
		{
			card_type="escape"; 
		} 
		
		else if(i<=13)
		{
			card_type="gold";//1~13 gold
			card_num=i%13+1;
		}
		
		else if(i<=26)
		{
			card_type="red"; //14~26 red
			card_num=i%13+1;
		}
		
		else if(i<=39)
		{
			card_type="blue"; //27~39 blue
			card_num=i%13+1;
		}
		
		else if(i<=52)
		{
			card_type="black";//40~52 black
			card_num=i%13+1;
		}
		
		else if(i==53)
		{
			card_type="mermaid";
		} 
		
		else if(i==54)
		{
			card_type="pirate";
		}
		
		else if(i==55)
		{
			card_type="scarymarry"; //이거 comparator 에서 처리할 때 조
		}
		
		else 
		{
			card_type="skullking"; //idx =56일 때 스컬
		}
		
	}
    
	public String getType() {
		return card_type;
	}
	
	public void setType(String type) {
		card_type=type;
	}
	
	public int getNum() {
		return card_num;
	}
	
	public void setNum(int num) {
		card_num=num;
	}
	
}
