//https://github.com/moon0331/SkullKing

package skullking;

public class Main {
	final int NUMBER_OF_CARD=65; //�³�?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameStarter newgame=new GameStarter();
		newgame.setNumOfPlayer(); //��� �� ����
		
		int numOfPlayer=newgame.getNumOfPlayer(); //�����
		
		newgame.makePlayer(); //�÷��̾� ���� (���߿� �̸� �����Ÿ� parameter ��������)
		
		System.out.println("Game Start!");
		for(int round=1;round<=10;round++) {
			Game game=new Game(newgame);
			int winner=game.playGame(round); //round�� �̾Ƽ� ���� ����
			// ����� ������
			// �������
		}
		//����� ������
		//����
	}

}
