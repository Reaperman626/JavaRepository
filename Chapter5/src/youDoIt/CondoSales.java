//MAAS
//Condos
//4-24-17
package youDoIt;
import java.util.Scanner;
public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int viewType;
		int garageType;
		int PARK_VIEW_PRICE= 150000;
		int GOLF_VIEW_PRICE= 170000;
		int LAKE_VIEW_PRICE= 210000;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What type of condo would you like? 1 for Golf view, 2 for Lake view, or  3 for Park view >>>");
		viewType = input.nextInt();
		if(viewType == 1)
		{
			System.out.print("Golf view condos are " + GOLF_VIEW_PRICE + ".");	
		}
		if(viewType == 2)
		{
			System.out.print("Lake view condos are " + LAKE_VIEW_PRICE + ".");	
		}
		if(viewType == 3)
		{
			System.out.print("Park view condos are " + PARK_VIEW_PRICE + ".");
		}
		if(viewType >= 4)
		{
			System.out.print("Unknown condo type. Please verify with realtor.");
		}
		System.out.print("\nWould you like a condo with some extra space? 1 for garage, or 2 for parking space >>>");
		garageType = input.nextInt();
		if(garageType == 1)
		{
			System.out.print("Park view condos with garages will be $155,000.");
			System.out.print("\nGolf view condos with garages will be $175,000.");
			System.out.print("\nLake view condos with garages will be $215,000.");
		}
		if(garageType == 2)
		{
			System.out.print("Park view condos with parking space will be $150,000.");
			System.out.print("\nGolf view condos with parking space will be $170,000.");
			System.out.print("\nLake view condos with parking space will be $210,000.");
		}
		if(viewType >= 3)
		{
			System.out.print("Unknown condo type. Please verify with realtor.");
		}

	}

}
