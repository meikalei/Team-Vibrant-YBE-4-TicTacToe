public class Player {
	private String name;
	private char playerLetter;
	private int points = 0;
	private boolean myTurn;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPoint() {
		this.points += 1;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public void setMyTurn(boolean turn){
		this.myTurn = turn;
	}
	
	public boolean getMyTurn() {
		return this.myTurn;
	}
}
