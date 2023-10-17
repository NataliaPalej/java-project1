package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


@SuppressWarnings("serial")
public class PartTwo extends JFrame implements ActionListener {
	
	// Create container
	Container cp;
	
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	
	JCheckBox cb1 = new JCheckBox("Give Colors", false);
	
	public PartTwo() {
		// Setting frame to exit on window close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		// Set title
		setTitle("Natalia Palej A00279259 - Part 2");
				
		// Add action to checkbox
		cb1.addActionListener(this);
				
		// Set buttons size
		b1.setPreferredSize(new Dimension(50, 20));
		b2.setPreferredSize(new Dimension(50, 20));
		b3.setPreferredSize(new Dimension(50, 20));
				
		GridBagLayout gridBag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
				
		cp = getContentPane();
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
				
		c.gridx = 2;
		c.gridy = 0;
		gridBag.setConstraints(b3, c);
		cp.add(b3);
		
		c.gridx = 3;
		c.gridy = 0;
		gridBag.setConstraints(cb1, c);
		cp.add(cb1);
				
		setVisible(true);
		setSize(400, 400);
	}

	public static void main(String[] args) {
		new PartTwo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(cb1)){
			if (cb1.isSelected()) {
				b1.setBackground(Color.green);
				b2.setBackground(Color.blue);
				b3.setBackground(Color.red);
			}
			else {
				b1.setBackground(Color.lightGray);
				b2.setBackground(Color.lightGray);
				b3.setBackground(Color.lightGray);
			}
		}	
	}
}
