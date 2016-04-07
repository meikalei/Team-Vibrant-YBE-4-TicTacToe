public class Player {
	private String name;
	private char playerLetter;
	private int points = 0;
	private boolean myTurn;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void playerTurn(String[] board) { //mode is plyer 1 or player 2 num is turn number
	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addPoint() {
		this.points += 1;
	}
	
	public void setMyTurn(boolean turn){
		this.myTurn = turn;
	}
	
	public boolean getMyTurn() {
		return this.myTurn;
	}
}
