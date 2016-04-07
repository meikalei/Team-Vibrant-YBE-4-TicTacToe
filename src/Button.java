import javax.swing.JButton;
import java.awt.event.*;

public class Button extends JButton{
	private Player player;
	private boolean turn;

	public Button(String name) {
		JButton aButton = new JButton(name);
	}
	
	public void actionPerformed(ActionEvent e) {
		changeChar(this, player);
		switchPlayer(turn, player);
		this.setEnabled(false);
	}
	
	public void changeChar(JButton button, Player turn) {
		if (turn.getMyTurn() == true) {
			button.setText("X");
		}
		else if (turn.getMyTurn() == false) {
			button.setText("O");
		}
	}
		
	public void switchPlayer(boolean turn, Player player) {
		if (turn == true) {
			player.setMyTurn(false);
		}
		else if (turn == false) {
			player.setMyTurn(true);
		}
	}
}
