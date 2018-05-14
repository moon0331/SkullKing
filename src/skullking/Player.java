package skullking;

import java.util.List;
import java.util.ArrayList;

public class Player implements PlayerInfo {
	String name;
	int score;
	int predict_num_of_win;
	boolean won_previous_game;
	private List<Card> deck;
}
