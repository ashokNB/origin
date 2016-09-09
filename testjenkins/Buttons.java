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

class Buttons extends JFrame {

	JPanel pnl = new JPanel(); // new panel object

        ClassLoader ldr = this.getClass().getClassLoader();
        java.net.URL tickURL = ldr.getResource("tick.png");
        java.net.URL crossURL = ldr.getResource("cross.png");

	ImageIcon tick = new ImageIcon(tickURL);
	ImageIcon cross = new ImageIcon(crossURL);

	JButton btn = new JButton("Click me");
	JButton tickBtn = new JButton(tick);
	JButton crossBtn = new JButton("STOP",cross);

	public Buttons() { // builds the window attributes

		super("Swing Window");
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(pnl);
		setVisible(true);
		pnl.add(btn);
		pnl.add(tickBtn);
		pnl.add(crossBtn); }

	public static void main(String[] args) {
		
		Buttons gui = new Buttons(); // instantiates the window

	System.out.println("   ");

	}

}
