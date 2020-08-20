import java.util.Scanner;

public class FarmCalculator
{
	private static void percentageChangeInWater() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Which house?");
		int house = reader.nextInt();

		System.out.println("Enter last flock consumption (gallons):");
		int last = reader.nextInt();

		System.out.println("Enter current flock consumption (gallons):");
		int current = reader.nextInt();

		int percentageChange = ((current - last) * 100) / last;
		System.out.println("Last flock consumption: " + last); 
		System.out.println("Current flock consumption: " + current); 
		System.out.println("Percentage-change in water: " + percentageChange + "%");  

	}

	private static void avgWaterConsumptionInAllHouses() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter avg water consumption target for a \"successful\" batch (gallons):");
		int successful = reader.nextInt();
		System.out.println("Enter flock consumption for house 1 (gallons):");
		int house1 = reader.nextInt();
		System.out.println("Enter flock consumption for house 2 (gallons):");
		int house2 = reader.nextInt();
		System.out.println("Enter flock consumption for house 3 (gallons):");
		int house3 = reader.nextInt();
		System.out.println("Enter flock consumption for house 4 (gallons):");
		int house4 = reader.nextInt();
		System.out.println("Enter flock consumption for house 5 (gallons):");
		int house5 = reader.nextInt();
		System.out.println("Enter flock consumption for house 6 (gallons):");
		int house6 = reader.nextInt();
		System.out.println("Enter flock consumption for house 7 (gallons):");
		int house7 = reader.nextInt();

		int avgCons = (house1+house2+house3+house4+house5+house6+house7) / 7;
		System.out.println("Average water consumption among all houses (gallons):" + avgCons);
		if (avgCons >= successful) {
			System.out.println("Your batch was successful!");
		}
		else {
			System.out.println("Your batch was failed.");
		}
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
