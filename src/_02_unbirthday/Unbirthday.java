package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String bday = JOptionPane.showInputDialog("When is your birthday? (mm/dd)");
		if (bday.equals("11/06")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday!");
		}
		// TODO Auto-generated method stub

	}

}
