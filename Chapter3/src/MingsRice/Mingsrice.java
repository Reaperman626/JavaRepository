package MingsRice;
import java.util.Scanner;
public class Mingsrice {

private static double absoluteTotal;
private static Scanner inputDevice;

public static void main(String[] args)
{
	// TODO Auto-generated method stub
	orderingMenu();
	mingsShack();
	mingsBanner();
	mingsMath(absoluteTotal);
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
		double RiceOrder;
		double SoupOrder;
		double SideOrder;
		double MainOrder;
		double RicetotalPrice= 0, SouptotalPrice= 0, SidetotalPrice= 0, MaintotalPrice = 0;
		String order;
		
		
		inputDevice = new Scanner(System.in);
		
		
		
	System.out.println("What order do you want? >>>");
	order = inputDevice.nextLine();
	
		if(order.equals("white")||order.equals("White"))
		{
			System.out.println("How many orders? >>>");
			RiceOrder = inputDevice.nextDouble();
			RicetotalPrice = RiceOrder * WricePrice;
		}
		if(order.equals("Fried")||order.equals("fried"))
		{
			System.out.println("How many orders? >>>");
			RiceOrder = inputDevice.nextDouble();
			RicetotalPrice = RiceOrder * FricePrice;
		}
	
		if(order.equals("eggdrop")||order.equals("Eggdrop"))
		{
			System.out.println("How many orders? >>>");
			SoupOrder = inputDevice.nextDouble(); 
			SouptotalPrice = SoupOrder * EggdropPrice;
		}
		else if(order.equals("sizzling")||order.equals("Sizzling"))
		{
			System.out.println("How many orders? >>>");
			SoupOrder = inputDevice.nextDouble();
			SouptotalPrice = SoupOrder * SizzlingricePrice;
			
		}
	
		if(order.equals("eggroll")||order.equals("Eggroll"))
		{
			System.out.println("How many orders? >>>");
			SideOrder = inputDevice.nextDouble();
			SidetotalPrice = SideOrder * EggrollPrice;
		}
		if(order.equals("Crab Rangoon")||order.equals("crab rangoon"))
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
		final double salesTax = .7;
		totalandTax = absoluteTotal * salesTax;
		System.out.println("Total with tax is " + totalandTax);
	}
}

