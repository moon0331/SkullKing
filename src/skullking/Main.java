//https://github.com/moon0331/SkullKing

package skullking;

public class Main {
	final int NUMBER_OF_CARD=65; //맞나?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameStarter newgame=new GameStarter();
		newgame.setNumOfPlayer(); //사람 수 결정
		
		int numOfPlayer=newgame.getNumOfPlayer(); //사람수
		
		newgame.makePlayer(); //플레이어 생성 (나중에 이름 받을거면 parameter 수정가능)
		
		System.out.println("Game Start!");
		for(int round=1;round<=10;round++) {
			Game game=new Game(newgame);
			int winner=game.playGame(round); //round장 뽑아서 게임 진행
			// 우승자 가리고
			// 점수계산
		}
		//우승자 가리기
		//종료
	}

}
