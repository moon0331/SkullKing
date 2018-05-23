//https://github.com/moon0331/SkullKing

//https://www.grandpabecksgames.com/copy-of-rules-cya

//https://boardgamegeek.com/boardgame/150145/skull-king

package skullking;

public class Main {
	final int NUMBER_OF_CARD=65;

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
				/*if(i==winner) player[i].calScore(winner_score);
				else player[i].calScore(______);*/
			}
			// calculate scores
		}
		//int final_player_winner=-1; //represent real winner
		//System.out.println("Winner is : "+player_winner);
	}

}
