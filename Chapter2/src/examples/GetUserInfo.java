package examples;
import java.util.Scanner;
public class GetUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
		Scanner blahBlah = new Scanner(System.in);
		System.out.print("Please enter your name>> ");
		name = blahBlah.nextLine();
		System.out.println("Enter your age >>");
		age = blahBlah.nextInt();
		System.out.print("Your name is " + name + " and you are " + age + " years old.");
		
	}

}
