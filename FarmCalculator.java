import java.util.Scanner;

public class FarmCalculator {
	private static void percentageChangeInWater() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Which house?");

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

		int avgCons = (house1 + house2 + house3 + house4 + house5 + house6 + house7) / 7;
		System.out.println("Average water consumption among all houses (gallons):" + avgCons);
		if (avgCons >= successful) {
			System.out.println("Your batch was successful!");
		} else {
			System.out.println("Your batch was failed.");
		}
	}

	private static void avgCullRate() {
		System.out.println("Enter total # of houses:");
		var totalHouses = 0;
		var someArbitraryHouse = 0;
		System.out.println("Enter total chickens in house " + someArbitraryHouse + ":");
		System.out.println("Enter total culled chickens in house " + someArbitraryHouse + ":");
		var someCalculatedCullRate = 0;
		System.out.println("Cull rate for house " + someArbitraryHouse + ":" + someCalculatedCullRate);
		var avgCullRate = 0;
		System.out.println("Average cull rate for ALL " + totalHouses + " houses: " + avgCullRate);
	}

	private static void farmMeasurements() {
		System.out.println("Enter length of a house:");
		System.out.println("Enter width of a house:");
		double area = 0;
		System.out.println("Area of house is: " + area);

		System.out.println("Enter radius of feed cylinder:");
		System.out.println("Enter height of feed cylinder:");
		double volume = 0;
		System.out.println("Volume of feed cylinder is: " + volume);
	}

	private static void comparePerformance() {
		System.out.println("Enter total # of houses:");
		var totalHouses = 0;
		System.out.println("Generating random water consumption values for " + totalHouses + " houses...");

		var someArbitraryHouse = 0;
		System.out.println("Enter current flock water consumption for house " + someArbitraryHouse + ":");

		System.out.println("Current flock water consumption is > previous flock for house " + someArbitraryHouse + ":");
		System.out.println("Current flock water consumption is < previous flock for house " + someArbitraryHouse + ":");
		System.out.println("Current flock water consumption is = previous flock for house " + someArbitraryHouse + ":");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Pick an option:\n(1): %-change in water consumption\n(2): average water consumption\n(3): average cull rate\n(4): farm measurements\n(5): performance comparison\n(6): Exit.");
			var opt = in.nextInt();

			switch (opt) {
				case 1:
					percentageChangeInWater();
					break;
				case 2:
					avgWaterConsumptionInAllHouses();
					break;
				case 3:
					avgCullRate();
					break;
				case 4:
					farmMeasurements();
					break;
				case 5:
					comparePerformance();
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
