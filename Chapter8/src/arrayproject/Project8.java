//MAAS
//Projects 8.1,8.2,8.3
//5-4-17
package arrayproject;

public class Project8 {

	public static void main(String[] args) 
	{
		int[] numbers = {2, 6, 14, 23, 35, 47};
		int sum = 0;
		int highest = 0;
		int lowest = 100;
		for(int x = 0; x < 6; x = x + 1)
		{
			sum = sum + numbers[x];
			if(highest < numbers[x])
			{
				highest = numbers[x];
			}
			if(lowest > numbers[x])
			{
				lowest = numbers[x];
			}
		}
		System.out.println("\n The average is " + (sum / 6));	
		System.out.println("\n The highest number is " + highest);
		System.out.println("\n The lowest number is " + lowest);
	}

}
