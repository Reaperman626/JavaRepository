package gamezone;
import java.util.Scanner;
public class DoorChoice 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int doorChoice; //
		int Choice;
		Scanner input = new Scanner(System.in);
			do{
				System.out.println("Please pick a door. 1 2 3 >>>");
				doorChoice = input.nextInt();
			
				if(doorChoice == 1)
				{
					System.out.println("Sucks to be you! EMPTY");
				}
				if(doorChoice == 2)
				{
					System.out.println("Sucks to be you! CLOSET CANNON BOOM");
				}
				if(doorChoice == 3)
				{
					System.out.println("Winner! Two bucks and ahhh....50 cents, some pocket lint, and a Werther's Original from 1972.");
				}
				if(doorChoice >= 4)
				{
					System.out.println("There are only 3 doors, pick one!");
				}
				System.out.println("Would you like to go again? 1 yes 2 no.");
				Choice = input.nextInt();
			}while(Choice == 1);
	}
}