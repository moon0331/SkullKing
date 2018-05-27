package skullking;

import java.util.Scanner;

public class GameStarter {
	
	private int numOfPlayer;
	private Player[] player;
	private String[] NameList= {"(1)Momo", "(2)Joy", "(3)Kei", "(4)Solar", "(5)Jisoo", "(6)Yuju", "(7)YooA"};
	
	public void setNumOfPlayer() {
		Scanner s=new Scanner(System.in);
		numOfPlayer=0;
		while(true) {
			try {
				System.out.print("Input the number of player : ");
				numOfPlayer=s.nextInt();
				if(numOfPlayer>=2 && numOfPlayer<=6) //this game can be played with 2 people. 
					break;
				else
					System.out.println("Unavailable number of player.");
			} catch(Exception e) {
				s.nextLine(); // flush buffer
				System.out.println("NOT NUMBER");
			}
		}s.nextLine();
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
