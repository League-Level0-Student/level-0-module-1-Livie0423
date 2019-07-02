package _07_riddler;

import javax.swing.JOptionPane;

public class Riddler {
public static void main(String[] args) {
	
	
	
int score = 0;
	
String bone = JOptionPane.showInputDialog("Why are skeletons so calm?");
	 String skele = "because nothing gets under there skin";
if( bone.equals(skele)) { 
	JOptionPane.showMessageDialog(null, "Correct"); 
	score++; 
	JOptionPane.showMessageDialog(null, "score " + score);
}
else { 
	JOptionPane.showMessageDialog(null, "Wrong"); 
	JOptionPane.showMessageDialog(null, "The answer is because nothing gets under there skin");
}
}
}
