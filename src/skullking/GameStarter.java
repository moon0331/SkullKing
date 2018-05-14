package skullking;

import java.util.Scanner;

public class GameStarter {
	public int setNumOfPlayer() {
		Scanner s=new Scanner(System.in);
		int numOfPlayer;
		while(true) {
			System.out.println("Input the number of player : ");
			try {
				numOfPlayer=s.nextInt();
				if(numOfPlayer>=1 && numOfPlayer<=5)
					break;
				else
					System.out.println("Unavailable number of player.");;
			} catch(Exception e) {
				System.out.println("NOT NUMBER");
			}
		}
		s.close();
		return numOfPlayer;
	}
}
