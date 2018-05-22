//https://github.com/moon0331/SkullKing

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
			Game game=new Game(player);
			game.playGame(round); //real game process
			int winner=game.getWinner();
			// calculate scores
		}
		int player_winner=-1;//represent winner (name can be changed)
		System.out.println("Winner is : "+player_winner);
	}

}
