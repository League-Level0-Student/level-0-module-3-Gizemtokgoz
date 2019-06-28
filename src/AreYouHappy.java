import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		 String answer = JOptionPane.showInputDialog("Are you happy ?");
		 
		 if (answer.equalsIgnoreCase("yes")) {
			 JOptionPane.showMessageDialog(null, "Keep doing what you're doing then :)");
		 }
		 
		 if (answer.equalsIgnoreCase("no")) {
			 String part2 = JOptionPane.showInputDialog("Do you want to be happy ?");
			 
			 if (part2.equalsIgnoreCase("yes")) {
				 JOptionPane.showMessageDialog(null, "Change something then!");
			 }
			 
			 if (part2.equalsIgnoreCase("no")) {
				 JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing then! >:(");
			 }
		 }
	}
}
