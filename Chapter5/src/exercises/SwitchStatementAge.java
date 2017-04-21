package exercises;
import java.util.Scanner;
public class SwitchStatementAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user;
		int choice;
		Scanner input = new Scanner(System.in);
		do{
		System.out.print("Who is this? >>> ");
		user = input.nextInt();
		switch(user)
		{
		case 138992:
			System.out.println("This student is Dusty.");
			break;
		case 131193:
			System.out.println("This student is Evan.");
			break;
		case 122190:
			System.out.println("This student is Brandon.");
			break;
		case 308508:
			System.out.println("This student is AshLynn.");
			break;
		case 304275:
			System.out.println("This student is Gairren.");
			break;
		case 112006:
			System.out.println("This student is Nick.");
			break;
		case 138076:
			System.out.println("This student is Alex.");
			break;
		
		}
			System.out.println("Want to scan again? 1 Yes or 2 No.");
			choice = input.nextInt();
		}while(choice == 1);
	}

}
