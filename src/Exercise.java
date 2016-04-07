import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise {
		JFrame frame;
		public Exercise(){
			
			this.frame = new JFrame("Tic-Tac-Toe");
			this.frame.setLayout(new BorderLayout());
			this.frame.setSize(500, 300);
			
			Buttons buttons = new Buttons();
			//add(buttons, BorderLayout.SOUTH);

			Field field = new Field();
			//add(field);
		
			Display window = new Display();
			//Label playerLabel = new Label();
			Game game = new Game();
			
			//add(window, BorderLayout.CENTER);
			this.frame.add(game, BorderLayout.CENTER);
			
			//setContentPane(board);
			this.frame.setLocation(10, 10);
			this.frame.setVisible(true);
			this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	public static class Field extends JPanel {
		JPanel panel;
		public Field(){
			this.panel = new JPanel();
			this.panel.setLayout(new BorderLayout());
			this.panel.setSize(500, 250);
		
			TextField textField = new TextField();
			add(textField, BorderLayout.CENTER);
		}
	
	}

	public static class TextField extends JTextField {

		TextField() {
			setText("This is us");
		}
	} 
	
	private static class Display extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Player 1 Name: _________________", 130, 80);
			g.drawString("Player 2 Name: _________________", 130, 110);
			g.drawString("Best of: _________________", 178, 140);
		}
	}
	
	/*public static class Board extends JPanel {

		Board() {
			setLayout(new BorderLayout());
			setSize(300, 300);
		
			Game game = new Game();
			add(game);
		}
	
	}*/
	
	public static class Buttons extends JPanel implements ActionListener{
		JPanel panel;
		public Buttons() {
			this.panel = new JPanel();
			this.panel.setLayout(new GridLayout(1, 2));
			this.panel.setPreferredSize(new Dimension(100, 50));
			this.panel.setMaximumSize(new Dimension(100, 50));
			
			JButton okButton = new JButton("OK");
			JButton cancelButton = new JButton("Cancel");
			
			this.panel.add(okButton);
			this.panel.add(cancelButton);
			
			okButton.addActionListener(this);
			cancelButton.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}
	
	public static class Game extends JPanel{
		JButton G1, G2, G3, G4, G5, G6, G7, G8, G9;
		private boolean player = false;
		JPanel panel;
		
		Game() {
			this.panel = new JPanel();
			this.panel.setLayout(new GridLayout(3, 3));
		}

	}
	
	public static void main(String[] args) {
		Exercise exer = new Exercise();
	}
}
