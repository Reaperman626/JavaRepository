package ProgrammingExercises;
import javax.swing.JOptionPane;
public class QuartsToGallons {
//page.115
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int quarts;
			int gallons;
			int quartsRemainder;
			String quartInput;
			final int quartsToGallon = 4;
			
			quartInput = JOptionPane.showInputDialog(null,"How many quarts do you want? ", JOptionPane.QUESTION_MESSAGE);
			
			gallons = Integer.parseInt(quartInput) / quartsToGallon;
			
			quartsRemainder = Integer.parseInt(quartInput) % quartsToGallon;
			
			JOptionPane.showMessageDialog(null, "There are " + gallons + " gallons and " + quartsRemainder + " quarts");
			
			
	}

}
