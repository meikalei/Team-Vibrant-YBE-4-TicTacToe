import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise { 
	JFrame frame = new JFrame("Tic-Tac-Toe");
		
	//added labels and text fields
	JLabel label1 = new JLabel("Player 1 Name: ");
	JTextField p1name = new JTextField(20);
	JLabel label2 = new JLabel("Player 2 Name: ");
	JTextField p2name = new JTextField(20);
	JLabel label3 = new JLabel("Best of: ");
	JTextField bestOf = new JTextField(20);
	JLabel player1 = new JLabel("");
	JLabel player2 = new JLabel("");

	JPanel panel = new JPanel();
	
	//buttons
	JButton okButton = new JButton("Ok");
	JButton cancelButton = new JButton("Cancel");
	JPanel buttonPanel = new JPanel();

	int best;

	public Exercise() {
		//created frame
		this.frame.setLayout(new BorderLayout());
		this.frame.setPreferredSize(new Dimension(500,300));

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

		buttonPanel.setLayout(new FlowLayout());
		
		okButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {     
            	String playerOne = p1name.getText();
            	String playerTwo = p2name.getText();
            	int intBest = Integer.parseInt(bestOf.getText());  // it must be edited

            	player1.setText(playerOne);
            	player2.setText(playerTwo);
            	
            	if (intBest % 2 == 0) {
            		JOptionPane.showMessageDialog(null, "It must be an odd number");
            	} else {
	            	System.out.println("");  // get the integer input
	            }
            }
        });

		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
			
		this.frame.add(buttonPanel,BorderLayout.SOUTH);

		this.frame.setLocation(10, 10);
		this.frame.setVisible(true);
		this.frame.setResizable(false);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.pack();
	}
	
}
