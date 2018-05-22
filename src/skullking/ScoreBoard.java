package skullking;

class Database{		// should be modified
	private int player_num;
	private int score;
}

public class ScoreBoard implements ScoreBoardInfo  {
	Database[] DB;
	public ScoreBoard(int num) {
		DB=new Database[num];
	}
	public void update(int player_num, int gained_score) {
		//blahblah
	}
}
