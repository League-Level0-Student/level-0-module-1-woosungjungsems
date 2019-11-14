package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String urName = JOptionPane.showInputDialog("Whats your name?");
	if (urName.equals("Joe")) {
		JOptionPane.showMessageDialog(null, "Joe is awesome at swimming!");
	}
	else if (urName.equals("Daniel")){
		JOptionPane.showMessageDialog(null, "Daniel is good at videogames!");
	}
	else {
		JOptionPane.showMessageDialog(null, "I don't know you.");
	}

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

