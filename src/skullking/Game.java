package skullking;

import java.util.Scanner;

public class Game{
	private Player[] p;
	int winner; //승자
	
	public Game(GameStarter st) { //게임정보 받음
		p=st.getPlayerInfo();
	}
	
	public int playGame(int round) { // n번째 턴에 대하여 게임 시작. n장 카드 뽑고 시작해야.
		//각 플레이어가 n장 카드 뽑는 과정 필요
		int win_player=-1;
		for(int i=1; i<=round; i++) {
			//카드를 뽑아주세요
			//승리를 예측해주세요
			System.out.println("1,2,3!");
			//예측 결과 출력
			//카드를 놓아주세요 (플레이어마다 하나씩)
			//
			//카드를 놓는다
			//comparator가 카드 족보 계산한다 -> comparator에서 계산필요
			//최종 winner를 win_player에 저장한다.
			setWinner(win_player);
		}
		return getWinner();
	}
	public void setWinner(int p) {
		winner=p;
	}
	public int getWinner() {
		return winner;
	}
}
