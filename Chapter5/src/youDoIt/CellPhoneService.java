//MAAS
//Cell phone
//4-24-17
package youDoIt;
import java.util.Scanner;
public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		textplan();
		dataplan();
		
	}
	public static void textplan()
	{
		
		String textchoice;
		String choiceFinal;
		String choiceFinal2;
		String choiceFinal3;
		String choiceFinal4;

		Scanner input = new Scanner(System.in);
		
		System.out.print("What plan would you like to examine? Plan A, Plan B, Plan C, or Plan D?>>>");
		textchoice = input.nextLine();
		if(textchoice.equals("a")||textchoice.equals("A"))
		{
			System.out.print("Plan A is primarily suited for people who need less than 500 minutes of talk and comes with no data or text for a price of $49 a month.");
			System.out.print("\nIs this what you would like? Yes or No?>>>");
			choiceFinal = input.nextLine();
			if(choiceFinal.equals("yes")||choiceFinal.equals("Yes"))
			{
				System.out.print("The plan will start after the proper paperwork has been filled. Thank you and have a nice day!");
			}

		}
		if(textchoice.equals("b")||textchoice.equals("B"))
		{
			System.out.print("Plan B is primarily suited for people who need less than 500 minutes of talk and needs text messages, but not data for a price of $55 a month.");
			System.out.print("\nIs this what you would like? Yes or No?>>>");
			choiceFinal2 = input.nextLine();
			if(choiceFinal2.equals("yes")||choiceFinal2.equals("Yes"))
			{
				System.out.print("The plan will start after the proper paperwork has been filled. Thank you and have a nice day!");
			}
		}
		if(textchoice.equals("c")||textchoice.equals("C"))
		{
			System.out.print("Plan C is suited for people who need 500 or more minutes of talk with up to 100 text messages with no data at a price of $61 a month.");
			System.out.print("\nIs this what you would like? Yes or No?>>>");
			choiceFinal3 = input.nextLine();
			if(choiceFinal3.equals("yes")||choiceFinal3.equals("Yes"))
			{
				System.out.print("The plan will start after the proper paperwork has been filled. Thank you and have a nice day!");
			}

		}
		if(textchoice.equals("d")||textchoice.equals("D"))
		{
			System.out.print("Plan D is suited for people who need more than 500 minutes talk with 100 or more text messages and no data at $70 a month.");
			System.out.print("\nIs this what you would like? Yes or No?>>>");
			choiceFinal4 = input.nextLine();
			if(choiceFinal4.equals("yes")||choiceFinal4.equals("Yes"))
			{
				System.out.print("The plan will start after the proper paperwork has been filled. Thank you and have a nice day!");
			}

		}
	}
	public static void dataplan()
	{
		String datachoice;
		String decision1;
		String decision2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nWhat data plan would you like to examine? Plan E, or Plan F?>>>");
		datachoice = input.nextLine();
		if(datachoice.equals("e")||datachoice.equals("E"))
		{
			System.out.print("Plan E offers 2 gigabytes at $79.");
			System.out.print("\nIs this what you would like? Yes or No?>>>");
			decision1 = input.nextLine();
			if(decision1.equals("yes")||decision1.equals("Yes"))
			{
				System.out.print("The plan will start after the proper paperwork has been filled. Thank you and have a nice day!");
			}
		}
		if(datachoice.equals("f")||datachoice.equals("F"))
		{
			System.out.print("Plan F offers 2 or more gigabytes at $87.");
			System.out.print("\nIs this what you would like? Yes or No?>>>");
			decision2 = input.nextLine();
			if(decision2.equals("yes")||decision2.equals("Yes"))
			{
				System.out.print("The plan will start after the proper paperwork has been filled. Thank you and have a nice day!");
			}
		}
	}
}
