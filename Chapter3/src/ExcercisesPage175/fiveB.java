package ExcercisesPage175;

import java.util.Scanner;

public class fiveB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Pick a number >>>");
		num1 = inputDevice.nextInt();
		
		System.out.println("Pick another number >>>");
		num2 = inputDevice.nextInt();
		computePercent(num1, num2);
	}

	public static void computePercent(double num1, double num2)
	{
		System.out.println(num1 + " is the percent of " + num2 + " = " + (num1 / num2));
	}
	}
	
