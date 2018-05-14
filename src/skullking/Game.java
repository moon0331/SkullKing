package skullking;

import java.util.Scanner;

public class Game extends GameStarter {
	int prevWinner; //바로 전 판 이긴 사람
	
	public Game() {
		super();
	}
	
	public void makePlayer(int i) {
		super.numOfPlayer=0;
	}
	public int playGame(int n) { // n번째 턴에 대하여 게임 시작. n장 카드 뽑고 시작해야.
		//각 플레이어가 n장 카드 뽑는 과정 필요
		for(int i=0; i<n; i++) {
			prevWinner=playGameTurn();
			//승리처리
		}
		return prevWinner;
	}
	private int playGameTurn() {
		int winner=-1;
		return winner;
	}
}
