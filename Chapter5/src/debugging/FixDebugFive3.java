//MAAS
//DEBUGGING3
//4-21-17
package debugging;
import java.util.Scanner;
public class FixDebugFive3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  int item;
	      String output;
	      final int LOW = 111;
	      final int HIGH = 999;
	      final int CUTOFF = 500;
	      
	      Scanner input = new Scanner (System.in);
	      
	      calculateOutPut(item, output, HIGH, LOW, CUTOFF);
	}
	 public static void calculateOutPut(int item, String output, int HIGH, int LOW, int CUTOFF)
	   {      
	      System.out.println("Please enter item number");
	      item = input.nextInt();
	      if(item <= LOW)
	      {
	         output = "Item number too low";
	      }
	      else if(item >= HIGH)
	      {
	          output = "Item number too high";
	      }
	        else if(item <= CUTOFF)
	      {
	          output = "Valid - in Automotive Department";
	      }
	          else
	      {
	             output = "Valid - Item in Housewares Department";
	       System.out.println(output);
	   }
}
}