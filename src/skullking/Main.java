//https://github.com/moon0331/SkullKing

package skullking;

public class Main {
	int numOfCard=65; //�³�?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameStarter newgame=new GameStarter();
		newgame.setNumOfPlayer(); //��� �� ����
		
		int numOfPlayer=newgame.getNumOfPlayer();
		
		newgame.makePlayer(); //�÷��̾� ���� (���߿� �̸� �����Ÿ� parameter ��������)
		
		System.out.println("Game Start!");
		for(int i=0;i<10;i++) {
			int winner=newgame.playGame(i);
			// ����� ������
			// �������
		}
		//����� ������
		//����
	}

}
