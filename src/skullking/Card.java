package skullking;

public class Card implements CardInfo {
	private int idx;
	private String card_type;//ī�� Ÿ�� string�÷� ǥ���ϵ��� �ƴ� int�� ǥ���ϵ���
	private int card_num; 
	/*
	 * (skullking, 
	 * pirate, 
	 * scarymarry-�������ε� �� �� �ְ� �׺���ε� �� �� �ִ�, 
	 * mermaid, 
	 * black, 
	 * gold, red, blue, 
	 * escape)
	 * 
	 * enum ���߿� ����Ҽ��� ����
	*/
	
	/* �ݺ������� ���������� �����ڸ� �ҷ����� ������, �����ڴ� �ϳ��� ������� �����ؾ� ��. public Card(int i)�� idx=i�� ���� ��, 
	 * i�� ������ ���� ī���� Ư¡�� �з�(if�� Ȱ��)�ؾ� ��. 
	 * (Ex: 0���� escape, 1~13�� red, 14~26�� blue, ..., n���� skullking���� �Ѵٸ�,
	 * ������ ������ ���� card_num�� card_type�� �޶��� ����)
	 * idx�� primary key�� ������ �Ѵ� ���� ��. (�ʿ�������� �������)
	 */
	
	public Card(int i) {
		idx=i;
		
		if(idx==0)
		{
			card_type="escape"; 
		} 
		
		else if(idx<=13)
		{
			card_type="gold";//1~13 gold
		}
		
		else if(idx<=26)
		{
			card_type="red"; //14~26 red
		}
		
		else if(idx<=39)
		{
			card_type="blue"; //27~39 blue
		}
		
		else if(idx<=52)
		{
			card_type="black";//40~52 black
		}
		
		else if(idx==53)
		{
			card_type="mermaid";
		} 
		
		else if(idx==54)
		{
			card_type="pirate";
		}
		
		else if(idx==55)
		{
			card_type="scarymarry"; //�̰� comparator ���� ó���� �� ��
		}
		
		else 
		{
			card_type="skullking"; //idx =56�� �� ����
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
