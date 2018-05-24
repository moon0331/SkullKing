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
		
		if(idx<=0) //escape은 5개 -4~0까지 
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
		
		else if(i==53|i==54) //two mermaid
		{
			card_type="mermaid";
		} 
		
		else if(i<=59)//55,56,57,58,59 pirate 5 cards
		{
			card_type="pirate";
		}
		
		else if(i==60)//60 scarymarry just one
		{
			card_type="scarymarry"; //�̰� comparator ���� ó���� �� ��
		}
		
		else //61->skullking
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
