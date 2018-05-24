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
		
		if(idx<=4) //escape은 5개 0~4까지 
		{
			card_type="escape"; 
		} 
		
		else if(i<=17)
		{
			card_type="gold";//5~17 gold
			card_num=i%13+1;
		}
		
		else if(i<=30)
		{
			card_type="red"; //17~30 red
			card_num=i%13+1;
		}
		
		else if(i<=43)
		{
			card_type="blue"; //31~43 blue
			card_num=i%13+1;
		}
		
		else if(i<=56)
		{
			card_type="black";//44~56 black
			card_num=i%13+1;
		}
		
		else if(i==57|i==58) //two mermaid
		{
			card_type="mermaid";
		} 
		
		else if(i<=63)//59~63 pirate 5 cards
		{
			card_type="pirate";
		}
		
		else if(i==64)//64 scarymarry just one
		{
			card_type="scarymarry"; //�̰� comparator ���� ó���� �� ��
		}
		
		else //65->skullking
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
