//MAAS
//Tech Manager
//5-9-17
package finalProject;

import java.util.Scanner;

public class ReggiesRoom {

	public static void main(String[] args) 
	{
		String doorChoice;
		String dialogueChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Once outside Reggie's office Chad notices that the lights are still on.");
		System.out.print("\nReggie, or Regginald as he prefers, is Blue Ring's tech manager. Although well liked no one really listens to him.");
		System.out.print("\nIn fact unless something brakes around the office Reggie is often forgotten.");
		System.out.print("\nWhat was I talking about again? Oh yeah, Reggie.");
		System.out.print("\nIf we want a key card we either get it from him or the boss's office.");
		System.out.print("OPEN DOOR or KEEP GOING? >>>");
		doorChoice = input.nextLine();
		 if(doorChoice.equals("OPEN DOOR")||doorChoice.equals("open door"))
		 {
			 System.out.print("Chad opens the door to find Reggie tinkering away at some mechanical doodad.");
			 System.out.print("Reggie: Hello Chad, working late I see.");
			 System.out.print("You know it wouldn't hurt to say something to the man.");
			 System.out.print("Right you're one of those silent protagonists. That would explain why you're just staring at him.");
			 System.out.print("I guess I'll just do the talking then, Reggie?");
			 System.out.print("Reggie: Who's there?");
			 System.out.print("");

		 }
		 if(doorChoice.equals("KEEP GOING")||doorChoice.equals("keep going"))
		 {
			 
		 }

	}

}
