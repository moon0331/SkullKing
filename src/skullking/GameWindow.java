package skullking;

import javax.swing.*;

public class GameWindow extends JFrame{
	Game game;
	public GameWindow() {
		setBounds(200,200,600,600);
		setVisible(true);
	}
	public void setGame(Player[] player) {
		game=new Game(player);
	}
	public void gameStart(int round) {
		game.playGame(round);
	}
}
