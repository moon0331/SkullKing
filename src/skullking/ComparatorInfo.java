package skullking;

public interface ComparatorInfo {
	public void setCard(int owner, Card card); //put card from player to comparators
	public void compare(); //compare card
	public int getWinner(); //
	public boolean stronger();
}
