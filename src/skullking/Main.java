package skullking;

public class Main {
	int numOfCard=65; //맞나?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game newgame=new Game();
		int numOfPlayer=newgame.setNumOfPlayer(); //사람 수 결정
		for(int i=0; i<numOfPlayer; i++) {
			newgame.makePlayer(i); //플레이어 생성
		}
		System.out.println("Game Start!");
		for(int i=0;i<10;i++) {
			int winner=newgame.playGame(i);
			// 우승자 가리고
			// 점수계산
		}
		//우승자 가리기
		//종료
	}

}
