package skullking_test;

import javax.swing.*;

public class Card extends JButton{
	private int idx;
	private String card_type;//represent card type either string or int
	private int card_num;  
	/*  
	 * (skullking, 
	 * pirate, 
	 * scarymarry- either pirate(?) or escape
	 * mermaid, 
	 * black, 
	 * gold, red, blue, 
	 * escape)
	 * 
	 * enum may be used
	*/
	
	public Card(int i) {
		idx=i;
		
		if(idx<=4) //5 cards for escape 
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
			card_type="red"; //18~30 red
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
		
		else if(i==57 || i==58) //two mermaid
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
	
    public static boolean isEscape(int val){
    	return val<=4;
    }
    
    public static boolean isGold(int val){
    	return val>=5 && val<=17;
    }
    
    public static boolean isRed(int val){
    	return val>=18 && val<=30;
    }
    
    public static boolean isBlue(int val){
	    return val>=31 && val<=43;
    }
    
    public static boolean isBlack(int val){
    	return val>=44 && val<=56;
    }
    
    public static boolean isMermaid(int val){
    	return val>=57 && val<=58; 
    }   
    
    public static boolean isPirate(int val){
    	return val>=59 && val<=63;
    }   
    
    public static boolean isScarymarry(int val){
    	return val==64;
    } 

    public static boolean isSkullking(int val){
	    return val==65;
    }  
    
    public static boolean isSpecial(int val) {
    	return val<=4 || val>=57;
    } 
    
    public static boolean isNormalCard(int val) {
    	return val>=5 && val<=56;
    }
    
    
    }