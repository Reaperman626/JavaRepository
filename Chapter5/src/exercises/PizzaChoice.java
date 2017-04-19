// MAAS
// PIZZA
//4-19-17
package exercises;
import java.util.Scanner;
public class PizzaChoice 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String choice1;
		int answer;
		int choice2;
		int choice3;
		int choice4;
		int toppingChoice;
		double large = 9.99;
		double medium = 6.99;
		double small = 3.99;
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Would you like a pizza? Yes or No>>>");
		choice1 = input.nextLine();
		do{
			if(choice1.equals("yes")||choice1.equals("Yes")||choice1.equals("Y")||choice1.equals("y"))
			{
				System.out.print("You said " + choice1 + " to a pizza.");
				System.out.print("Please choose a topping. 1 for Supreme, 2 for Cheese, and 3 for Meatlovers.");
				toppingChoice = input.nextInt();
				if(toppingChoice == 1){
					System.out.print("You wanted a Supreme, what size? Size 1, Size 2, or Size 3?");
					choice2 = input.nextInt();
					if(choice2==1){
						System.out.print("That'll be " + small + ".");
					}
				if(choice2==2){
					System.out.print("That'll be " + medium + ".");
				}
				if(choice2==3){
					System.out.print("That'll be " + large + ".");
				}
			
			
				if(toppingChoice == 2)
				{
					System.out.print("You wanted a Cheese, what size? Size 1, Size 2, or Size 3?");
					choice3 = input.nextInt();
					if(choice3==1){
							System.out.print("That'll be " + small + ".");
						}
						if(choice3==2){
							System.out.print("That'll be " + medium + ".");
						}
						if(choice3==3){
						System.out.print("That'll be " + large + ".");
						}
				}
		
				if(toppingChoice == 3)
				{
					System.out.print("You wanted a Meatlovers, what size? Size 1, Size 2, or Size 3?");
					choice4 = input.nextInt();
					if(choice4==1){
						System.out.print("That'll be " + small + ".");
						}			
					if(choice4==2)			{
					System.out.print("That'll be " + medium + ".");
						}
					if(choice4==3){
					System.out.print("That'll be " + large + ".");
					}
					
			
				}
		
				
			}
			
		}
			System.out.println("Would you like to order again? 1 yes 2 no.");
			answer = input.nextInt();
		}while(answer == 1);	
	}
	
}

	

		
	

			
		
	

