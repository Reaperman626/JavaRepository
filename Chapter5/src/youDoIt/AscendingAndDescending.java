//MAAS
//P.294 #2
//4-21-2017
package youDoIt;
import java.util.Scanner;
public class AscendingAndDescending
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		String choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like to play? Yes or No>>>");
		choice = input.nextLine();
		if(choice.equals("yes")||choice.equals("Yes")||choice.equals("Y")||choice.equals("y"))
		{
			System.out.print("Choose a number.>>>");
			num1 = input.nextInt();
			System.out.print("Choose another number.>>>");
			num2 = input.nextInt();
			System.out.print("Choose a final number.>>>");
			num3 = input.nextInt();
			
			if(num1 > num2 & num1 > num3)
			{
				if(num2>num3)
				{
					System.out.println(num1 + num2 + num3);
				}
				if(num3>num2)
				{
					System.out.println(num1 + num3 + num2);
				}
			}
			if(num2 > num1 & num2 > num3)
			{
				if(num1>num3)
				{
					System.out.println(num2 + num1 + num3);
				}
				if(num3>num1)
				{
					System.out.println(num2 + num3 + num1);
				}
			}
			if(num3 > num1 & num3 > num2)
			{	
				if(num1>num2)
				{
					System.out.println(num3 + num1 + num2);
				}
				if(num2>num1)
				{
					System.out.println(num3 + num2 + num1);
				}
			}
		}
	}
	}