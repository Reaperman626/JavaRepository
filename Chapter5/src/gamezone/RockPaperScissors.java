//MAAS
//Rock,paper, scissors
//4-19-17
package gamezone;
import java.util.*;

import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String choice;
		String userChoice;
		int option;
		int rock;
		int paper;
		int scissors;
		int revolver;
		int gameChoice;
		final int GAME_CHOICES = 4;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to play? Yes or No>>>");
		choice = input.nextLine();
		if(choice.equals("yes")||choice.equals("Yes")||choice.equals("Y")||choice.equals("y"))
		{
			
			System.out.print("Pick rock, paper, or scissors.");
			userChoice = input.nextLine();
			
			System.out.print("Rock, paper, scissors SHOOT!");
			gameChoice = ((int)(Math.random() * 10) % GAME_CHOICES + 1);
			
			if(gameChoice == 1)
			{
				System.out.print(" Rock!");
					if(userChoice.equals("rock"))
					{
						System.out.print(" Tie.");
					}
					if(userChoice.equals("paper"))
					{
						System.out.print(" Winner!");
					}
					if(userChoice.equals("scissors"))
					{
						System.out.print(" Loser.");
					}
			}
			if(gameChoice == 2)
			{
				System.out.print(" Scissors!");
					if(userChoice.equals("rock"))
					{
						System.out.print(" Winner!");
					}
					if(userChoice.equals("paper"))
					{
						System.out.print(" Loser.");
					}
					if(userChoice.equals("scissors"))
					{
						System.out.print(" Tie.");
					}
			}
			if(gameChoice == 3)
			{
				System.out.print(" Paper!");
					if(userChoice.equals("rock"))
					{
						System.out.print(" Loser.");
					}
					if(userChoice.equals("paper"))
					{
						System.out.print(" Tie.");
					}
					if(userChoice.equals("scissors"))
					{
						System.out.print(" Winner.");
					}
			}
			if(gameChoice == 4)
			{
				System.out.print(" BANG Revolver. Shoulda' been quicker on the draw.");
			}
		}
	}
}




