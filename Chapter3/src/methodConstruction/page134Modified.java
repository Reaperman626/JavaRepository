package methodConstruction;
import javax.swing.JOptionPane;
public class page134Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valueString;
		char vType = 'S';
		int value;
		double commRate;
		
		valueString = JOptionPane.showInputDialog(null, "Enter the value of your vehicle.");
		value = Integer.parseInt(valueString);
		valueString = JOptionPane.showInputDialog(null, "Enter the commission rate.");
		commRate = Integer.parseInt(valueString);
		computeCommission(value, commRate, vType);
		computeCommission(40000, 0.10, 'L');
	
	}
public static void computeCommission(int value, double rate, char vehicle)
{
		double commission;
		commission = value * rate;
		System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
		System.out.println("With " + (rate * 100) + "% commission rate, the commission is $" + commission);
}
}
