//MAAS
//Right triangle
//5-2-17
package pythagoras;
import java.util.Scanner;
public class Rtriangle {

	public static void main(String[] args)
	{
		sideMath();
		trianglePerimeter(double sideA, sideB, sideC);
		triangleArea();
	}
		
	public static void sideMath()
	{	
		double sideA;
		double sideB;
		double sideC;
		
		String sideChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What side of the triangle are you looking for? Side A, Side B, or Side C? >>>");
		sideChoice = input.nextLine();
		if(sideChoice.equals("side A")||sideChoice.equals("side a"))
		{
			System.out.print("What is the measure of side B?");
			sideB = input.nextInt();
			System.out.print("What is the measure of side C?");
			sideC = input.nextInt();
			System.out.println("Side A equals");
			System.out.println(Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideB, 2)));
		}
		if(sideChoice.equals("side B")||sideChoice.equals("side b"))
		{
			System.out.print("What is the measure of side A?");
			sideA = input.nextInt();
			System.out.print("What is the measure of side C?");
			sideC = input.nextInt();
			System.out.println("Side B equals");
			System.out.println(Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2)));
		}
		if(sideChoice.equals("side C")||sideChoice.equals("side c"))
		{
			System.out.print("What is the measure of side B?");
			sideB = input.nextInt();
			System.out.print("What is the measure of side A?");
			sideA = input.nextInt();
			System.out.println("Side C equals");
			System.out.println(Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)));
		}
	}
	public static void trianglePerimeter(double sideA, double sideB, double sideC)
	{
		
		double perimeter;
		
		perimeter = sideA + sideB + sideC;
		System.out.print("The perimeter of the triangle " + perimeter + ".");
		
	}
	public static void triangleArea()
	{
		double area;
		
		
	}
}
