package skullking;

import java.util.Scanner;

public class GameStarter {
	
	private int numOfPlayer;
	private Player[] player;
	private String[] NameList= {"Momo", "Joy", "Kei", "Solar", "Jisoo"};
	
	public void setNumOfPlayer() {
		Scanner s=new Scanner(System.in);
		int numOfPlayer=0;
		while(true) {
			System.out.println("Input the number of player : ");
			try {
				numOfPlayer=s.nextInt();
				if(numOfPlayer>=1 && numOfPlayer<=5)
					break;
				else
					System.out.println("Unavailable number of player.");
			} catch(Exception e) {
				System.out.println("NOT NUMBER");
			}
		}
		s.close();
	}
	
	public int getNumOfPlayer() {
		return numOfPlayer;
	}
	
	public void makePlayer() {
		player=new Player[numOfPlayer];
		for(int i=0; i<player.length; i++) {
			player[i].name=NameList[i]; //이름 결정(나중에 입력할지?), 나머지 값들은 0으로 초기화됨
		}
	}
	
	public Player[] getPlayerInfo() {
		return player;
	}

}
