package gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class PartOne extends JFrame {
	
	// Create container for buttons
	Container cp;
	
	// Create three buttons
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	
	/**
	 * Constructor
	 */
	public PartOne() {
		// Setting frame to exit on window close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set title
		setTitle("Natalia Palej A00279259 - Part 1");
		
		// Set buttons size
		b1.setPreferredSize(new Dimension(50, 20));
		b2.setPreferredSize(new Dimension(50, 20));
		b3.setPreferredSize(new Dimension(50, 20));
		
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		// Assign cp to getContentPane() for better efficiency  
		cp = getContentPane();
		// Set layout to grid bag layout
		cp.setLayout(gridBag);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
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
		new PartOne();
	}
}
