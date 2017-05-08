//MAAS
//DELGATO'S
//4-20-17
package MingsRice;
import java.util.Scanner;
public class Mingsrice {

private static double absoluteTotal;
private static Scanner inputDevice;

public static void main(String[] args)
{
	// TODO Auto-generated method stub
	mingsBanner();
	menuDisplay();
	mingsShack();
	orderingMenu();
	mingsMath(absoluteTotal);
}
	public static void menuDisplay()
	{
		System.out.println("Rices: White Rice $2.50, Fried Rice $3.50.");	
		System.out.println("Soups: Eggdrop Soup $4.50, Sizzling Rice Soup $4.50.");
		System.out.println("Side Dishes:Eggrolls $5.00, Crab Rangoon $5.00.");
		System.out.println("Main Dishes: Lo Mein $7.50, Garlic Chicken $7.50.");
		System.out.println("Water $2.00.");
	}
	public static void orderingMenu()
	{
		double FricePrice = 3.50;
		double WricePrice = 2.50;
		double EggrollPrice = 5.00;
		double EggdropPrice = 4.50;
		double SizzlingricePrice = 4.50;
		double CrabRangoonPrice = 5.00;
		double LoMeinPrice = 7.50;
		double GarlicChknPrice = 7.50;
		double Water = 2.00;
		double [] mingu = {3.50, 2.50, 5.00, 4.50, 4.50, 5.00, 7.50, 7.50, 2.00};
		double RiceOrder;
		double SoupOrder;
		double SideOrder;
		double MainOrder;
		double RicetotalPrice= 0, SouptotalPrice= 0, SidetotalPrice= 0, MaintotalPrice = 0;
		String order;
		String choice;
		
		inputDevice = new Scanner(System.in);
		
		

		System.out.println("Would you like to order? Yes or No?>>>");
		choice = inputDevice.nextLine();

			if(choice.equals("yes")||choice.equals("Yes")||choice.equals("Y")||choice.equals("y"))
			{
				System.out.println("What would you like to order? >>>");
				order = inputDevice.nextLine();
				
				if(order.equals("white rice")||order.equals("White Rice"))
				{
					System.out.println("How many orders? >>>");
					RiceOrder = inputDevice.nextDouble();
					RicetotalPrice = RiceOrder * WricePrice;
				}
				if(order.equals("Fried Rice")||order.equals("fried rice"))
				{
					System.out.println("How many orders? >>>");
					RiceOrder = inputDevice.nextDouble();
					RicetotalPrice = RiceOrder * mingu[0];
				}
			
				if(order.equals("eggdrop soup")||order.equals("Eggdrop Soup"))
				{
					System.out.println("How many orders? >>>");
					SoupOrder = inputDevice.nextDouble(); 
					SouptotalPrice = SoupOrder * EggdropPrice;
				}
				if(order.equals("sizzling rice soup")||order.equals("Sizzling Rice Soup"))
				{
					System.out.println("How many orders? >>>");
					SoupOrder = inputDevice.nextDouble(); 
					SouptotalPrice = SoupOrder * SizzlingricePrice;
				}
				if(order.equals("eggrolls")||order.equals("Eggrolls")||order.equals("Eggroll")||order.equals("eggroll"))
				{
					System.out.println("How many orders? >>>");
					SideOrder = inputDevice.nextDouble(); 
					SidetotalPrice = SideOrder * EggrollPrice;
				}
				if(order.equals("Crab Rangoons")||order.equals("crab rangoons")||order.equals("crab rangoon")||order.equals("Crab Rangoon"))
				{
					System.out.println("How many orders? >>>");
					SideOrder = inputDevice.nextDouble();
					SidetotalPrice = SideOrder * CrabRangoonPrice;
				}
				if(order.equals("lo mein")||order.equals("Lo Mein"))
				{
					System.out.println("How many orders? >>>");
					MainOrder = inputDevice.nextDouble();
					MaintotalPrice = MainOrder * LoMeinPrice;
				}
				else if(order.equals("garlic chicken")||order.equals("Garlic Chicken"))
				{
					System.out.println("How many orders? >>>");
					MainOrder = inputDevice.nextDouble();
					MaintotalPrice = MainOrder * GarlicChknPrice;
				}
			
			System.out.println("Water will be " + Water + ".");
			}
		absoluteTotal = SouptotalPrice + SidetotalPrice + RicetotalPrice + MaintotalPrice + Water;
		}
		
	
	public static void mingsShack()
	{
		System.out.println("        ******************************************");
		System.out.println("        *                  Ming's Shack          *");
		System.out.println("        *             Home to Premium Chinese    *");
		System.out.println("        *                                        *");
		System.out.println("        *                                        *");
		System.out.println("        *                                        *");
		System.out.println("        ******************                  ******");
		System.out.println("        *  o  *     o    *                  *  o *");
		System.out.println("        *  I  *     I    *                  *  I *");
		System.out.println("        ******************************************");
		System.out.println("        *                                        *");
		System.out.println("        ******************************************");
	}
	
	public static void mingsBanner()
	{
		System.out.println("        ****************************************************");
		System.out.println("        *                  Ming's Shack                    *");
		System.out.println("        *         Home to Premium and Cheap Chinese        *");
		System.out.println("        *                                                  *");
		System.out.println("        ****************************************************");
		
	}
	
	public static void mingsMath( double absoluteTotal)
	{
		double totalandTax;
		double totalTax;
		final double salesTax = .07;
		totalTax = absoluteTotal * salesTax;
		totalandTax = absoluteTotal + totalTax;
		System.out.println("Total with tax is " + totalandTax);
	
	}
			
}

