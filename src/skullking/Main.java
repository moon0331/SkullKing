//https://github.com/moon0331/SkullKing

//https://www.grandpabecksgames.com/copy-of-rules-cya

//https://boardgamegeek.com/boardgame/150145/skull-king

//http://allg.tistory.com/17 무한루프 문제

//http://egloos.zum.com/LucasLee/v/571015 무한루프 문제 2

package skullking;


public class Main {
	final int NUMBER_OF_CARD=66;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GameStarter newgame=new GameStarter();
		newgame.setNumOfPlayer(); //determine the number of player
		Player[] player=newgame.makePlayer(); //make player data
		
		System.out.println("Game Start!");
		for(int round=1;round<=10;round++) {
			Game game=new Game(player); //play round
			game.playGame(round); //real game process
			int winner=game.getWinner();
			/* need process to calculate scores!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			 * int winner_score=____________________;
			 * */
			for(int i=0; i<player.length; i++) {
				player[i].calScore_predict(round);
			}
			// calculate scores
			System.out.println("\n\n=====round "+ round +" end.======\n");
		}
		for(Player p : player) {
			System.out.println(p.getScore());
		}
	}

}

