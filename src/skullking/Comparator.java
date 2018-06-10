package skullking;

public class Comparator{ 
	//where people put card
	private Card present_card;
	private int present_card_owner;
	private Card strongest_card;
	private int strongest_card_owner;
	private int constraint; //constraint to set a card
	
	/*public void setCard(int owner, Card card) {
		present_card=card;
		present_card_owner=owner;
		   if(){ //check that the card can included
		 * 
		 * }
		 * 
	}*/
	public void compare(Card present_card, Card strongest_card) {
		if(strongest_card==null) {
			strongest_card=present_card;
			strongest_card_owner=present_card_owner;
		}else {
			if(stronger(present_card,strongest_card)) {  
				strongest_card=present_card;
				strongest_card_owner=present_card_owner;
			}
		}
	}
	public int getWinner() {
		return strongest_card_owner;
	}
	public boolean stronger(Card present_card, Card strongest_card) { //modify
	    if(Card.isEscape(strongest_card.getNum()))//가장 쎈 카드가 escape인 경우 무슨 카드를 내도 변하지 않음(심지어 escape을 낸다고 해도)
	    {
	    	return false; 
	    }
		
		else if(Card.isGold(strongest_card.getNum()))// 낸 카드가 골 숫자 카드인경우 같은 골드 숫자카드를 내서 숫자가 더 크거나 검정숫이상의 카드를 낸 경우 strongest 카드가 바
		{
			if(Card.isGold(present_card.getNum()))
			{
				if(present_card.getNum()>strongest_card.getNum())
				{
					return true;
				}
			} 
			else if(present_card.getNum()>=44)
				return true; 
			else 
				return false;
		} 
		
		else if(Card.isBlue(strongest_card.getNum()))//낸 카드가 파 숫자 카드인경우 같은 파란 숫자카드를 내서 숫자가 더 크거나 검정숫이상의 카드를 낸 경우 strongest 카드가 바
		{
			if(Card.isBlue(present_card.getNum()))
			{
				if(present_card.getNum()>strongest_card.getNum())
				{
					return true;
				}
			} 
			else if(present_card.getNum()>=44)
				return true; 
			else 
				return false;
		} 
		
		else if(Card.isRed(strongest_card.getNum()))//낸 카드가 빨 숫자 카드인경우 같은 빨간 숫자카드를 내서 숫자가 더 크거나 검정숫이상의 카드를 낸 경우 strongest 카드가 바
		{
			if(Card.isRed(present_card.getNum()))
			{
				if(present_card.getNum()>strongest_card.getNum())
				{
					return true;
				}
			} 
			else if(present_card.getNum()>=44)
				return true; 
			else 
				return false;
		} 
		
		else if(Card.isBlack(strongest_card.getNum()))//낸 카드가 검정 숫자 카드인경우 같은 검정 숫자카드를 내서 숫자가 더 크거나 인어이상의 카드를 낸 경우 strongest 카드가 바
		{
			if(Card.isBlack(present_card.getNum()))
			{
				if(present_card.getNum()>strongest_card.getNum())
				{
					return true;
				}
			} 
			else if(present_card.getNum()>=57)
				return true; 
			else 
				return false;
		} 
		
		else if(Card.isMermaid(strongest_card.getNum()))//제일 쎈 카드가 인어인 경우 해적을 내거나 scarymarry 카드를 해적으로 낸 경우 stroungest 카드가 바
		{
			if(isPirate(present_card.getNum())) 
			{
				return true;
			} 
			else if(isScarymarry(present_card.getNum()))
			{
				return ture;
			} 
			else 
				return false;
		} 
		
		else if(Card.isPirate(strongest_card.getNum()))//제일 쎈 카드가 해적인 경우 스컬킹을 낸 경우에만 strongest카드가 바
		{
			if(Card.isSkullking(present_card.getNum()))
				return true; 
			else 
				return false;
		} 
		
		
		
		else if(Card.isSkullking(strongest_card.getNum()))//제일 쎈 카드가 스컬킹일 경우 인어를 낸 경우에만 strongest 카드가 바
		{
			if(Card.isMermaid(present_card.getNum())) 
				return true; 
			else 
				return false;
		}

		
	}
	public int getConstraint() {
		return constraint;
	}
}
