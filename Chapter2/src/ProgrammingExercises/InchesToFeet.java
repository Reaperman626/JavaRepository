package ProgrammingExercises;
import javax.swing.JOptionPane;
public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		int feet;
		int inchesRemainder;
		String inchesInput;
		final int inchesToFeet = 12;
		
		inchesInput = JOptionPane.showInputDialog(null, "How many inches do you have?", JOptionPane.QUESTION_MESSAGE);
		
		feet = Integer.parseInt(inchesInput) / inchesToFeet;
		
		inchesRemainder = Integer.parseInt(inchesInput) % inchesToFeet;
		
		JOptionPane.showMessageDialog(null, "There are " + feet + " feet and " + inchesRemainder + " inches.");
	}

}
