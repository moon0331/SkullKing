package skullking;



class Database{		// should be modified
	private int player_num;
	private int score;
	public Database(int num) {
		player_num=num;
	}  
	public void setScore(int s) {
		score=s;
	}

	public int getScore() {
		return score;
	} 
	
	public void setPlayer(int s) {
		player_num=s;
	}

	public int getPlayer() {
		return player_num ;
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
	    
		int update_score = DB[player_num].getScore()+gained_score; 
		DB[player_num].setScore(update_score);
	}
}
