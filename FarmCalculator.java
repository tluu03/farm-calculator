import java.util.Scanner;

public class FarmCalculator
{
	private static void percentageChangeInWater() {
		System.out.println("Which house?");
		System.out.println("Enter last flock consumption (gallons):");
		var last = 0.0;
		System.out.println("Enter current flock consumption (gallons):");
		var current = 0.0;
		var percentageChange = 0.0; // Do your math here.
		System.out.printf("Last flock consumption: %.2f \n", last); 
		System.out.printf("Current flock consumption: %.2f \n", current); 
		System.out.printf("Percentage-change in water: %.2f \n", percentageChange); 
	}

	private static void avgWaterConsumptionInAllHouses() {
		System.out.println("Enter avg water consumption target for a \"successful\" batch (gallons):");
		System.out.println("Enter flock consumption for house 1 (gallons):");
		System.out.println("Enter flock consumption for house 2 (gallons):");
		System.out.println("Enter flock consumption for house 3 (gallons):");
		System.out.println("Enter flock consumption for house 4 (gallons):");
		System.out.println("Enter flock consumption for house 5 (gallons):");
		System.out.println("Enter flock consumption for house 6 (gallons):");
		System.out.println("Enter flock consumption for house 7 (gallons):");
		System.out.println("Average water consumption among all houses (gallons):");
		System.out.println("Your batch was successful!");
		System.out.println("Your batch was failed.");
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Pick an option:\n(1): %-change in water consumption\n(2): average water consumption\n(3): project 3\n(4): project 4\n(5): project 5\n(6): Exit.");
			var opt = in.nextInt();

			switch (opt) {
				case 1:
					percentageChangeInWater();
					break;
				case 2:
					avgWaterConsumptionInAllHouses();
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("Exiting...");
					return;
				default:
					System.out.println("Invalid option, try again.");
					break;
			}
		}
	}
}
