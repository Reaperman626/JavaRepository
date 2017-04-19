package exercises;
import java.util.Scanner;
public class AgeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age; //
		int choice;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Please enter your age >>>");
			age = input.nextInt();
		if(age <= 18)
		{
			System.out.println("User is younger than 18.");
		}
		if(age >= 18 & age <= 30)
		{
			System.out.println("User is between 18 & 30.");
		}
		if(age >= 31 & age <= 50)
		{
			System.out.println("User is between 31 & 50.");
		}
		if(age >= 51 & age <= 65)
		{
			System.out.println("User is between 51 & 65.");
		}
		if(age >= 66 & age <= 100)
		{
			System.out.println("User is between 66 & 100.");
		}
		
		System.out.println("Would you like to go again? 1 yes 2 no.");
		choice = input.nextInt();
			}while(choice == 1);
	}
}
		
	
