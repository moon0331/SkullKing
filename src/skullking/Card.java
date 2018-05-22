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
	
	//getter setter 다시 수정함.
	
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
			card_type='escape'; 
		} 
		
		else if(idx<=13)
		{
			card_type='gold';//1~13 gold
		}
		
		else if(idx<=26)
		{
			card_type='red'; //14~26 red
		}
		
		else if(idx<=39)
		{
			card_type='blue'; //27~39 blue
		}
		
		else if(idx<=52)
		{
			card_type='black';//40~52 black
		}
		
		else if(idx==53)
		{
			card_type='mermaid';
		} 
		
		else if(idx==54)
		{
			card_type='pirate';
		}
		
		else if(idx==55)
		{
			card_type='scarymarry'; //이거 comparator 에서 처리할 때 조
		}
		
		else 
		{
			card_type='skullking'; //idx =56일 때 스컬
		}
		
	}
	
    /*public Card(String Card_type, int Card_num) //카드 생성자 Card_type은 스컬킹, 해적,인어, 골드 ,레드 등등 종류를 받을거고 Card_num은 카드번호 예를 들면 블루 12 이렇게 1~13의 값을 가질 수 있도록 
    {
    	this.card_type=card_type; 
    	this.card_num=card_num;
    } 
    
    public Card(String Card_type)//스컬킹이나 해적같은 경우는 숫자카드들이랑 다르게 숫자가 없으므로 생성자를 두 개 만들어서 직관성을 높임 
    {
    	this.Card_type=Card_type; 
        this.Card_num=0; 
    } */
    
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
	
	//보너스 점수
	
   /*if(Card_type='skullking')
   {
	   Card_num=16; //생각해봤는데 카드넘버로 세기 비교가능해 숫자카드들은 1~13이고 인어는 14 해적은 15 스컬킹은 16 이렇게 하면 딱 세기 비교 가능하니까 
   } 
   
   if(Card_type='pirate')
   {
	   Card_num=15;
   }
   
   if(Card_type='mermaid')
   {
	   Card_num=14;
   } 
   
   if(Card_type='scarymarry')//이 카드는 생성된 이후에 pirate로도 쓸 수 있고 escape으로도 쓸 수 있으니까 Card_num을 1로 넣으면 pirate로 취급하고 0으로 넣으면 escape으로 취급하도록 
   {
	   if(Card_num==1)
	   {
		   Card_num=15;
	   }
	   else 
	   {
		   Card_num=0;
	   }
	   
   }
   
   if(Card_type='escape')
   {
	   Card_num=0;
   }*/
   
   
   
   
	//public boolean hasBonusScore() {
		//return grade==SKULLKING;
		//return grade==100;
	//} 보너스 점수를 얻는 건 카드 클래스에서 차ㅓ리할 수 있는 부분이 아닌 것 같음 예를 들면 스컬킹이 다른 해적들 삼켰을 때 해적 한 마리당 보너스 점수 30점씩을 얻는건데 다른 사람들 카드도 알아야하고 또 자기가 예측한 승수가 실승수랑 같을 때만 얻는거라 
}
