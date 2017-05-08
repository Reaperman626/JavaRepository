//MAAS
//Bowling team continued
//5-3-17
package youDoIt;
import java.util.*;
public class BowlingTeamCont 
{
public static void main(String[] args)
{
	String name;
	BowlingTeam bowlTeam = new BowlingTeam();
	int x;
	final int NUM_TEAM_MEMBERS = 4;
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter team name here >> ");
	name = input.nextLine();
	bowlTeam.setTeamName(name);
	
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
		System.out.print("Enter team member's name here >> ");
		name = input.nextLine();
		bowlTeam.setMember(0, name);
		}
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			System.out.print(bowlTeam.getMember(x) + " ");
			System.out.println();
		}
		
	}
}
