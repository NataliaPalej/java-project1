package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PartTwo extends JFrame implements ActionListener {
	
	// Create container
	Container cp;
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	
	public PartTwo() {
		// Setting frame to exit on window close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// Set title
		setTitle("Natalia Palej A00279259 - Part 1");
				
		// Add action to buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
				
		// Set buttons size
		b1.setPreferredSize(new Dimension(50, 20));
		b2.setPreferredSize(new Dimension(50, 20));
		b3.setPreferredSize(new Dimension(50, 20));
				
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
				
		cp = getContentPane();
		cp.setLayout(gridBag);
		
		// Set horizontal placement
		c.fill = GridBagConstraints.HORIZONTAL;
		
		// Set placement of buttons 1-3
		c.gridx = 0;
		c.gridy = 0;
		gridBag.setConstraints(b1, c);
		cp.add(b1);
				
		c.gridx = 1;
		c.gridy = 1;
		gridBag.setConstraints(b2, c);
		cp.add(b2);
				
		c.gridx = 3;
		c.gridy = 0;
		gridBag.setConstraints(b3, c);
		cp.add(b3);
				
		setVisible(true);
		setSize(400, 400);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
