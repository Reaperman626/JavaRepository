package MingsRice;
import java.util.Scanner;
public class Mingsrice {

public static void main(String[] args)
{
	// TODO Auto-generated method stub
	orderingMenu();
	mingsShack();
	mingsBanner();
	
}
	public static void orderingMenu()
	{
		double FricePrice = 3.50;
		double WricePrice = 2.50;
		double EggrollPrice = 5.00;
		double EggdropPrice = 4.50;
		double SizzlingricePrice = 4.50;
		double CrabRangoonPrice = 5.00;
		double GeneralTsoPrice = 7.50;
		double LoMeinPrice = 7.50;
		double GarlicChknPrice = 7.50;
		double Water = 5.50;
		double RiceOrder;
		double SoupOrder;
		double SideOrder;
		double MainOrder;
		double WaterOrder;
		double RicetotalPrice, SouptotalPrice, SidetotalPrice, MaintotalPrice, WatertotalPrice;
		String riceChoice, sideChoice, soupChoice, mainChoice;
		
		
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("What Rice would you like? >>>");
		riceChoice = inputDevice.nextLine();
		if(riceChoice.equals("white")||riceChoice.equals("White"))
		{
			System.out.println("How many orders? >>>");
			RiceOrder = inputDevice.nextDouble();
		}
		else 
		{
			System.out.println("How many orders? >>>");
			RiceOrder = inputDevice.nextDouble();
			RicetotalPrice = RiceOrder * FricePrice;
		}
		System.out.println("What soup would you like? >>>");
		soupChoice = inputDevice.nextLine();
		if(soupChoice.equals("eggdrop")||soupChoice.equals("Eggdrop"))
		{
			System.out.println("How many orders? >>>");
			SoupOrder = inputDevice.nextDouble(); 
		}
		else
		{
			System.out.println("How many orders? >>>");
			SoupOrder = inputDevice.nextDouble();
			SouptotalPrice = SoupOrder * SizzlingricePrice;
			
		}
		System.out.println("What side would you like? >>>");
		sideChoice = inputDevice.nextLine();
		if(sideChoice.equals("eggroll")||sideChoice.equals("Eggroll"))
		{
			System.out.println("How many orders? >>>");
			SideOrder = inputDevice.nextDouble();
		}
		else
		{
			System.out.println("How many orders? >>>");
			SideOrder = inputDevice.nextDouble();
			SidetotalPrice = SideOrder * CrabRangoonPrice;
		}
		System.out.println("What main dish would you like? >>>");
		mainChoice = inputDevice.nextLine();
		if(mainChoice.equals("lo mein")||mainChoice.equals("Lo Mein"))
		{
			System.out.println("How many orders? >>>");
			MainOrder = inputDevice.nextDouble();
		}
		else
		{
			System.out.println("How many orders? >>>");
			MainOrder = inputDevice.nextDouble();
			MaintotalPrice = MainOrder * GarlicChknPrice;
		}}
		System.out.println("Water will be " + Water + ".");
		
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

public static void MingsDialog()
{
}
