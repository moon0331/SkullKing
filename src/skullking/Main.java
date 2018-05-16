//https://github.com/moon0331/SkullKing

package skullking;

public class Main {
	int numOfCard=65; //맞나?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameStarter newgame=new GameStarter();
		newgame.setNumOfPlayer(); //사람 수 결정
		
		int numOfPlayer=newgame.getNumOfPlayer();
		
		newgame.makePlayer(); //플레이어 생성 (나중에 이름 받을거면 parameter 수정가능)
		
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
