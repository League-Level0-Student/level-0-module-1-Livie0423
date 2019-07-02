package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String user = JOptionPane.showInputDialog("when is your birthday?"); 
	if(user.equals("07/02")) { 
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	} 
	else { 
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
}
}
