package ProgrammingExercises;
import javax.swing.JOptionPane;
public class NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nauticalmiles;
		double kilometers;
		double miles;
		String nauticalmileInput;
		final double milesToNauticalMiles = 1.150779;
		final double kilometersToNauticalMiles = 1.852;
		
		nauticalmileInput = JOptionPane.showInputDialog(null, "How many knots captain? ", JOptionPane. QUESTION_MESSAGE);
		
		kilometers = Integer.parseInt(nauticalmileInput) / kilometersToNauticalMiles;
		
		miles = Integer.parseInt(nauticalmileInput) / milesToNauticalMiles;
		
		JOptionPane.showMessageDialog(null, "There are " + kilometers + " kilometers and " + miles + " miles.");
		
		
	}

}
