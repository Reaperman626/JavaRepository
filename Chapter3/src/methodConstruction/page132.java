package methodConstruction;

public class page132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 350.00;
		double startingWage = 720.00;
		System.out.println("Demonstrating some raises");
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(startingWage);
	}
public static void predictRaise(double salary)
{
	double newSalary;
	final double RAISE_RATE = 1.50;
	newSalary = salary * RAISE_RATE;
	System.out.println("Current salary: " + salary + "  After raise: " + newSalary);
	
}
}
