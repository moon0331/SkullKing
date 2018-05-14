package skullking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game newgame=new Game();
		int numOfPlayer=newgame.setNumOfPlayer(); //사람 수 결정
		for(int i=0; i<numOfPlayer; i++) {
			newgame.makePlayer(i);
		}
	}

}
