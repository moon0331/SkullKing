package skullking;

import java.util.Scanner;

public class Game extends GameStarter {
	int prevWinner; //�ٷ� �� �� �̱� ���
	
	public Game() {
		super();
	}
	
	public void makePlayer(int i) {
		super.numOfPlayer=0;
	}
	public int playGame(int n) { // n��° �Ͽ� ���Ͽ� ���� ����. n�� ī�� �̰� �����ؾ�.
		//�� �÷��̾ n�� ī�� �̴� ���� �ʿ�
		for(int i=0; i<n; i++) {
			prevWinner=playGameTurn();
			//�¸�ó��
		}
		return prevWinner;
	}
	private int playGameTurn() {
		int winner=-1;
		return winner;
	}
}
