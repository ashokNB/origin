/*
 	University of Mary Hardin-Baylor
	Master of Science in Information Systems Curriculum
	BCIS 6360 - Applied Programming

	Programming Exercise based on:

	McGrath, Mike "Java in easy steps, 6th ed"
	c 2014 Easy Steps Ltd. Warwickshire, UK

*/

// remember the x in javax.swing.*

import javax.swing.*;
import java.awt.event.*; // Added in Actions.java

class Actions extends JFrame implements ActionListener { // modified in Actions.java

	JPanel pnl = new JPanel(); // new panel object
        // statements below  added in Actions.java
	//****************************************
	JButton btn1 = new JButton("Button 1"); 
        JButton btn2 = new JButton("Button 2"); 
	JTextArea txtArea = new JTextArea(5,38); 

	
	public Actions() { // builds the window attributes

		super("Swing Window");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);

		// Added in Actions.java
		//**********************
        	pnl.add(btn1);
        	pnl.add(btn2);
        	pnl.add(txtArea);

        	btn2.setEnabled(false);
        	txtArea.setText("Button 2 is disabled");
		btn1.addActionListener(this);
		btn2.addActionListener(this); }

	public void actionPerformed(ActionEvent event) {
		txtArea.setText(event.getActionCommand()+"Clicked and Disabled");
		if (event.getSource() == btn1) {btn2.setEnabled(true);btn1.setEnabled(false);}
		if (event.getSource() == btn2) {btn1.setEnabled(true);btn2.setEnabled(false);} }

		// Through here
		//*************

	public static void main(String[] args) {

		Actions gui = new Actions(); // instantiates the window

	System.out.println("   ");

	}

}
