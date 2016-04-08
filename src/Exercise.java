import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise implements ActionListener{ 
		JFrame frame1 = new JFrame("Tic-Tac-Toe");
		JPanel frame = new JPanel();
		JPanel game = new JPanel();
		
		JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
		private boolean correct = false;
		private int turn;
		
		//added labels and text fields
		JLabel label1 = new JLabel("Player 1 Name: ");
		JTextField p1name = new JTextField(20);
		JLabel label2 = new JLabel("Player 2 Name: ");
		JTextField p2name = new JTextField(20);
		JLabel label3 = new JLabel("Best of: ");
		JTextField bestOf = new JTextField(20);
		JPanel panel = new JPanel();
		
		JPanel bottom;
		JLabel playerOne, playerTwo, gameRounds;
			
		public Exercise(){
			//created frame
			this.frame1.setLayout(new CardLayout());
			this.frame1.setPreferredSize(new Dimension(500,300));
			frame.setLayout(new BorderLayout());

			//layout
			panel.setLayout(new GridBagLayout());
			GridBagConstraints boxes = new GridBagConstraints();

			boxes.gridx = 0;
			boxes.gridy = 0;
			panel.add(label1,boxes);
			
			boxes.gridx = 1;
			boxes.gridy = 0;
			panel.add(p1name,boxes);
			
			boxes.gridx = 0;
			boxes.gridy = 1;
			panel.add(label2,boxes);
			
			boxes.gridx = 1;
			boxes.gridy = 1;
			panel.add(p2name,boxes);
			
			boxes.gridx = 0;
			boxes.gridy = 2;
			panel.add(label3,boxes);
			
			boxes.gridx = 1;
			boxes.gridy = 2;
			panel.add(bestOf,boxes);
			
			this.frame.add(panel,BorderLayout.CENTER);
			//buttons
			JButton okButton = new JButton("Ok");
			JButton cancelButton = new JButton("Cancel");
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new FlowLayout());
			buttonPanel.add(okButton);
			buttonPanel.add(cancelButton);
			
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String player1 = p1name.getText(); //getText from text field
					String player2 = p2name.getText();
					int intBest = Integer.parseInt(bestOf.getText());
					
					playerOne = new JLabel();
					playerTwo = new JLabel();
					gameRounds = new JLabel();
					
					playerOne.setText(player1 + " (P1): ");
					gameRounds.setText("Game __ out of " + intBest);
					playerTwo.setText(player2 + " (P2): ");
					
					bottom.add(playerOne);
					bottom.add(gameRounds);
					bottom.add(playerTwo);
					if (intBest % 2 == 0)
						JOptionPane.showMessageDialog(null, "It must be an odd integer");
					//else if (intBest == null)
						//JOptionPane.showMessageDialog(null, "Input an integer");
					else
						correct = true;
				
					//show second board
					if(correct == true) {
						frame.setVisible(false);
						game.setVisible(true);
					}
				}
			});
			
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			//panel.add(playerOne);
			
			this.frame.add(buttonPanel,BorderLayout.SOUTH);
			
			JPanel buttons = new JPanel();
		
			game.setLayout(new BorderLayout());
			buttons.setLayout(new GridLayout(3,3));
		
			button1 = new JButton(" ");
			button1.setBackground(Color.lightGray);
			button2 = new JButton(" ");
			button2.setBackground(Color.lightGray);
			button3 = new JButton(" ");
			button3.setBackground(Color.lightGray);
			button4 = new JButton(" ");
			button4.setBackground(Color.lightGray);
			button5 = new JButton(" ");
			button5.setBackground(Color.lightGray);
			button6 = new JButton(" ");
			button6.setBackground(Color.lightGray);
			button7 = new JButton(" ");
			button7.setBackground(Color.lightGray);
			button8 = new JButton(" ");
			button8.setBackground(Color.lightGray);
			button9 = new JButton(" ");
			button9.setBackground(Color.lightGray);
			
			buttons.add(button1);
			buttons.add(button2);
			buttons.add(button3);
			buttons.add(button4);
			buttons.add(button5);
			buttons.add(button6);
			buttons.add(button7);
			buttons.add(button8);
			buttons.add(button9);
			
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			button4.addActionListener(this);
			button5.addActionListener(this);
			button6.addActionListener(this);
			button7.addActionListener(this);
			button8.addActionListener(this);
			button9.addActionListener(this);
			
			game.add(buttons, BorderLayout.CENTER);
			
			bottom = new JPanel();
			bottom.setLayout(new FlowLayout(10, 30, 30));
			game.add(bottom, BorderLayout.SOUTH);
			
			JPanel right = new JPanel();
			right.setLayout(new FlowLayout(10, 65, 30));
			game.add(right, BorderLayout.EAST);

			JPanel top = new JPanel();
			top.setLayout(new FlowLayout(10, 20, 25));
			
			//JLabel topInfo = new JLabel("Turn no_of_game_rounds: player_name");
			//game.add(topInfo);
			game.add(top, BorderLayout.NORTH);

			JPanel left = new JPanel();
			left.setLayout(new FlowLayout(10, 65, 30));
			game.add(left, BorderLayout.WEST);
			
			this.frame1.add(game);
			this.frame1.add(frame);
			
			frame.setVisible(true);
			game.setVisible(false);

			this.frame1.setLocation(50, 50);
			this.frame1.setVisible(true);
			this.frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.frame1.setResizable(false);
			this.frame1.pack();
		}
		
		public void actionPerformed(ActionEvent e) {
			this.turn += 1;
			JButton pressed = (JButton) e.getSource();
			
			if (pressed == button1) {
				setText(button1, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button2) {
				setText(button2, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button3) {
				setText(button3, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button4) {
				setText(button4, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button5) {
				setText(button5, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button6) {
				setText(button6, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button7) {
				setText(button7, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button8) {
				setText(button8, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
			else if (pressed == button9) {
				setText(button9, turn);
				//switchPlayer(player);
				pressed.setEnabled(false);
			}
		}

		
		public void setText(JButton button, int turn) {
			if (turn%2 == 1) {
				button.setText("O");
			}
			else if (turn%2 == 0) {
				button.setText("X");
			}
		}
		/*public void switchPlayer(boolean play) {
			if (play == true) {
				player = false;
			}
			else if (play == false) {
				player = true;
			}
		}*/
		
}
