package gameZone;
import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color, wordEST, bodyPartPlural, animal, noun, pluralNoun;
		int a, b, c;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Welcome!");
		
		System.out.println("Enter a color>> ");
		color = inputDevice.nextLine();
		
		System.out.println("Enter a word ending in EST>> ");
		wordEST = inputDevice.nextLine();
		
		System.out.println("Enter a bodyPartPlural>> ");
		bodyPartPlural = inputDevice.nextLine();
		
		System.out.println("Enter an animal>> ");
		animal = inputDevice.nextLine();
		
		System.out.println("Enter noun>> ");
		noun = inputDevice.nextLine();
		
		System.out.println("Enter a pluralNoun>> ");
		pluralNoun = inputDevice.nextLine();
		
		System.out.println("Enter a number>>> ");
		a = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("Enter a number less than the previous>>> ");
		b = inputDevice.nextInt();
		inputDevice.nextLine();
		c = a -b;
		
		System.out.println("The " + color + " Dragon is the " + wordEST + " Dragon of all. \n It has " + bodyPartPlural + ",and a " + animal + " shaped like a " + noun + ". \n It loves to eat " + pluralNoun + ", although it will feast on nearly anything.");
	}

}
