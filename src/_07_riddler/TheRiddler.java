package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		int score = 0;
		String answer1 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		if (answer1.equals("A coin.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		String answer2 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if (answer2.equals("A stamp.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		String answer3 = JOptionPane.showInputDialog("During which month do people sleep the least?");
		if (answer3.equals("February.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		String answer4 = JOptionPane.showInputDialog("What is made of water but if you put it into water it will die?");
		if (answer4.equals("An ice cube.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		String answer5 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		if (answer5.equals("A candle.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		String answer6 = JOptionPane.showInputDialog("What kind of room has no doors or windows?");
		if (answer6.equals("A mushroom.")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
		JOptionPane.showMessageDialog(null, "You got " + score + "points!");

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

