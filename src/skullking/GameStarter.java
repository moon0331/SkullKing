package skullking;

import java.util.Scanner;

public class GameStarter {
	
	private int numOfPlayer;
	private Player[] player;
	private String[] NameList= {"Momo", "Joy", "Kei", "Solar", "Jisoo", "Yuju", "YooA"};
	
	public void setNumOfPlayer() {
		Scanner s=new Scanner(System.in);
		numOfPlayer=0;
		while(true) {
			try {
				System.out.print("Input the number of player : ");
				numOfPlayer=Integer.parseInt(s.nextLine());
				if(numOfPlayer>=2 && numOfPlayer<=6) //this game can be played with 2 people. 
					break;
				else
					System.out.println("Unavailable number of player.");
			} catch(Exception e) {
				s.nextLine(); // flush buffer
				System.out.println("NOT NUMBER");
			}
		}
		s.close();
	}
	
	public int getNumOfPlayer() {
		return numOfPlayer;
	}
	
	public Player[] makePlayer() {
		player=new Player[numOfPlayer];
		for(int i=0; i<numOfPlayer; i++) {
			player[i]=new Player();
			player[i].setName(NameList[i]); 
		}
		return player;
	}

}
