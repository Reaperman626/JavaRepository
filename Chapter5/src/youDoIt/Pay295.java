//MAAS
//Pay
//5-1-17
package youDoIt;

import javax.swing.JOptionPane;

public class Pay295 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what skill level the worker is
		//options for insurance
		
		
	}
	public static void skill()
	{
		String insuranceLevelString;
		String skillLevelString;
		String hoursWorkedString;
		String retirementString;
		int skillLevelInt;
		int skillAnswer = 0;
		int insuranceLevelInt;
		double hoursWorkedDouble;
		double totalGrossPay;
		double totalNetPay;
		double deductions;
		double retirementCost;
		
		skillLevelString = JOptionPane.showInputDialog(null, "What skill level are you 1, 2, 0r 3?");
		skillLevelInt = Integer.parseInt(skillLevelString);
		
		if(skillLevelInt == 1)
		{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay);
				
		}
		if(skillLevelInt == 2)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(insuranceLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 making your total net pay equal " + totalNetPay);
				
			}
			if(insuranceLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 making your total net pay equal " + totalNetPay);
			}
			if(insuranceLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 making your total net pay equal " + totalNetPay);
		}
		if(skillLevelInt == 3)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(insuranceLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 making your total net pay equal " + totalNetPay);
				
			}
			if(insuranceLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 making your total net pay equal " + totalNetPay);
			}
			if(insuranceLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null,"How many hours did you work?");
				hoursWorkedDouble = Double.parseDouble(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 making your total net pay equal " + totalNetPay);
			}
				retirementString = JOptionPane.showInputDialog(null, "3% retirement Option Yes or No?");
				if(retirementString.equals("Yes"));
				{
					retirementCost = totalGrossPay * .03;
					JOptionPane.showMessageDialog(null, "Your retirement will cost " + retirementCost + ".");
				}
				if(retirementString.equals("No"));
				{
					JOptionPane.showMessageDialog(null, " ");
				}
		}
	}
}
	
	public static void overtime()
	{
		
	}
}
