package skullking;

class Database{		// should be modified
	private int player_num;
	private int score;
	public Database(int num) {
		player_num=num;
	}
}

public class ScoreBoard implements ScoreBoardInfo  {
	Database[] DB;
	public ScoreBoard(int num) {
		DB=new Database[num];
		for(int i=0; i<num; i++) {
			DB[i]=new Database(i);
		}
	}
	public void update(int player_num, int gained_score) {
		DB[player_num].score+=gained_score;
	}
}
