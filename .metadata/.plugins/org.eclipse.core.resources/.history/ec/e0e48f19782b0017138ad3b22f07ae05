//MAAS
//Pay
//4-25-17
package youDoIt;
import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		skillLevelinsurance();
		overTime();
		paytotalbfDeductions();
		deductions();
		finalpayCheck();
		
	}
	public static void skillLevelinsurance()
	{
		int hours;
		double pay;
		double pay2;
		double pay3;
		double SKILL_PAY_1 = 17.00;
		double SKILL_PAY_2 = 20.00;
		double SKILL_PAY_3 = 22.00;
		double MED_INS = 32.50;
		double DENT_INS = 20.00;
		double LT_DIS_INS = 10.00;
		double retireCost;
		double nrmlPayTotal;
		double insTotal1;
		double insTotal2;
		double lastTotal;
		String choice;
		String insChoice;
		String retChoice;
		
		inputDevice = new Scanner(System.in);
		
		System.out.print("What skill level are you? 1, 2, 3?>>>");
		choice = input.nextLine();
		if(choice.equals("1"))
		{
			System.out.print("How many hours did you work?>>>");
			hours = inputDevice.nextDouble();
			pay = hours * SKILL_PAY_1;
		}
		if(choice.equals("2"))
		{
			System.out.print("How many hours did you work?>>>");
			hours = inputDevice.nextDouble();
			pay2 = hours * SKILL_PAY_2;
			System.out.print("What insurance would you like? 1 Medical, 2 Dental, or 3 Long-term disability?>>>");
			insChoice = input.nextLine();
				if(insChoice.equals("1"))
				{
					insTotal1 = pay2 - MED_INS;
				}
				if(insChoice.equals("2"))
				{
					insTotal1 = pay2 - DENT_INS;
				}
				if(insChoice.equals("3"))
				{
					insTotal1 = pay2 - LT_DIS_INS;
				}
		}
		if(choice.equals("3"))
		{
			System.out.print("How many hours did you work?>>>");
			hours = inputDevice.nextDouble();
			pay3 = hours * SKILL_PAY_3;
			System.out.print("What insurance would you like? 1 Medical, 2 Dental, or 3 Long-term disability?>>>");
			insChoice = input.nextLine();
				if(insChoice.equals("1"))
				{
					insTotal2 = pay3 - MED_INS;
				}
				if(insChoice.equals("2"))
				{
					insTotal2 = pay3 - DENT_INS;
				}
				if(insChoice.equals("3"))
				{
					insTotal2 = pay3 - LT_DIS_INS;
				}
			System.out.print("Would you like to participate in the retirement plan?>>>");
			retChoice = input.nextLine();
				if(retChoice.equals("yes")||retChoice.equals("Yes")||retChoice.equals("Y")||retChoice.equals("y"))
				{
					retireCost = pay3 * .03;
					lastTotal = insTotal2 - retireCost;
				}
		}
	}
	public static void overTime(double pay, double pay2, double pay3)
	{
		final double overtime = 1.5;
		double overtimepay;
		String hoursOvertime;
		String levelChoice;
		
		System.out.print("What skill level? 1, 2, or 3?>>>");
		levelChoice = input.nextLine();
			if(levelChoice.equals("1"))
			{
				
				overtimepay = pay * overtime;
			}
			if(levelChoice.equals("2"))
			{
				
				hoursOvertime = input.nextLine();
				overtimepay = pay2 * overtime;
			}
			if(levelChoice.equals("1"))
			{
				
				hoursOvertime = input.nextLine();
				overtimepay = pay3 * overtime;
			}
	}
}
