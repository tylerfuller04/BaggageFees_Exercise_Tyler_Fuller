import java.util.Scanner; // Import Scanner for user input

public class BaggageFees_Exercise_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define variables
		int length, width, depth, sumOfDimensions, weight;
		double additionalCharge;
		
		// Prompt user to input dimensions in inches (e.g. 108)
		System.out.println("Enter length, width, and depth of the baggage: ");
		Scanner input = new Scanner(System.in);
		length = input.nextInt();
		width = input.nextInt();
		depth = input.nextInt();
		
		// Prompt user to input weight of the baggage
		System.out.println("Enter weight of the baggage: ");
		weight = input.nextInt();
		input.close();
		
		// Calculate sum of the dimensions
		sumOfDimensions = length + width + depth;
		
		// Test the dimensions and weight
		if (sumOfDimensions > 108 || weight > 50)
			additionalCharge = 50.0;
		else additionalCharge = 0;
		
		// Print additional charge to the console
		System.out.print("Additioanl charges: $ " + additionalCharge);
		
	}
}