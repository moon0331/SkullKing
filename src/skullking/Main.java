package skullking;

public class Main {
	int numOfCard=65; //�³�?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game newgame=new Game();
		int numOfPlayer=newgame.setNumOfPlayer(); //��� �� ����
		for(int i=0; i<numOfPlayer; i++) {
			newgame.makePlayer(i); //�÷��̾� ����
		}
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
