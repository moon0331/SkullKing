package skullking;

import java.util.Scanner;

public class Game{
	private Player[] p;
	int winner; //����
	
	public Game(GameStarter st) { //�������� ����
		p=st.getPlayerInfo();
	}
	
	public int playGame(int round) { // n��° �Ͽ� ���Ͽ� ���� ����. n�� ī�� �̰� �����ؾ�.
		//�� �÷��̾ n�� ī�� �̴� ���� �ʿ�
		int win_player=-1;
		for(int i=1; i<=round; i++) {
			//ī�带 �̾��ּ���
			//�¸��� �������ּ���
			System.out.println("1,2,3!");
			//���� ��� ���
			//ī�带 �����ּ��� (�÷��̾�� �ϳ���)
			//
			//ī�带 ���´�
			//comparator�� ī�� ���� ����Ѵ� -> comparator���� ����ʿ�
			//���� winner�� win_player�� �����Ѵ�.
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
