package ProgrammingExercises;
import javax.swing.JOptionPane;
public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eggInput;
		double priceperDozen, priceperEgg;
		int eggs;
		int dozen;
		int eggsRemainder;
		final double PRICE_PER_DOZEN = 3.25;
		final double PRICE_PER_EGG = .45;
		final int eggsToDozen = 12; 
		
		
		eggInput = JOptionPane.showInputDialog(null,"How many eggs?", "Egg dialog 1", JOptionPane.INFORMATION_MESSAGE);
		
		dozen = Integer.parseInt(eggInput) / eggsToDozen;
		
		priceperDozen = dozen * PRICE_PER_DOZEN;
		
		eggsRemainder = Integer.parseInt(eggInput) % eggsToDozen;
		
		priceperEgg = eggsRemainder * PRICE_PER_EGG;
		
		JOptionPane.showMessageDialog(null, "You ordered " + dozen + " dozen eggs and the price is $" + priceperDozen + " with " + eggsRemainder + " individual eggs left, with their price being $" + priceperEgg + ".");
		
		
	}

}
