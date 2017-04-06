package ProgrammingExercises;
import javax.swing.JOptionPane;
public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String initialsInput;
		
		initialsInput = JOptionPane.showInputDialog(null,"What are your initials? ", JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Your initials are " + initialsInput + ".");
		
	}

}
