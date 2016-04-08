import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JButton implements ActionListener{
	private boolean turn;
	private int turnNumber = 0;

	public Square(String name, JPanel base) {
		JButton aButton = new JButton(name);
		aButton.addActionListener(this);
		base.add(aButton);
	}
	
	public void changeChar(JButton button, int turnNumber) {
		if (turnNumber%2 == 1) {
			button.setText("X");
		}
		else if (turnNumber%2 == 0) {
			button.setText("O");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		this.turnNumber = this.turnNumber + 1;
		System.out.println(turnNumber);
	}
	
}
