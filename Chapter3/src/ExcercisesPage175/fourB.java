package ExcercisesPage175;
import java.util.Scanner;
public class fourB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Pick a number >>>");
		num1 = inputDevice.nextInt();
		
		System.out.println("Pick another number >>>");
		num2 = inputDevice.nextInt();
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2);
		
	}
	public static void displayTwiceTheNumber(int num1, int num2)
	{
		int factor = 2;
		System.out.println(num1 + " times " + factor + " is " + (num1 * factor));
		System.out.println(num2 + " times " + factor + " is " + (num2 * factor));
	}
	public static void displayNumberPlusFive(int num1, int num2)
	{
		int factor = 5;
		System.out.println(num1 + " plus " + factor + " is " + (num1 + factor));
		System.out.println(num2 + " plus " + factor + " is " + (num2 + factor));

	}
	public static void displayNumberSquared(int num1, int num2)
	{
		System.out.println(num1 + " squared is " + (num1 * num1));
		System.out.println(num2 + " squared is " + (num1 * num2));
	}
	}
	