package references;
// Created by Avinesh

// Semi Car Rental System

public class Program {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		Car[] obj = { (new Car("smallLocker 1", true, 20, 1)), (new Car("smallLocker 2", false, 20, 2)),
				(new Car("smallLocker 3", true, 20, 3)) };

		// Print out all Lockers available (Debug usage)
		// System.out.println("All car details\n---------------");
		// for(Car x:obj){
		// System.out.println(x);
		// }

		// Printout Available Car
		carsAvailable(obj);

//		carSelection(obj, carName, rentHours);

	}

// 		Checkout Price.
//	public static void carSelection(Car[] arr, String carName, int hours) {
//		int count = 0;
//		for (Car x : arr) {
//			if (carName.equals(x.name) && x.isAvailable) {
//				System.out.println("\nThe car you selected is: " + x.name);
//				System.out.println("Your charges would be approx: $" + (x.pricePerHour) * hours);
//				System.out.println("Your car will be delivered to your location soon.\nWe wish you a happy journey!!");
//				break;
//			} else
//				count++;
//		}
//		if (count == 5) {
//			System.out.println("\nSorry, the car name you entered is not available at the moment.");
//		}
//	}

// 		Check Availablity
	public static void carsAvailable(Car[] arr) {
		int found = 0;
		// int foundSmall = 0;
		// int foundMed = 0;
		// int foundLarge = 0;
		System.out.println("\nAvailable Lockers\n-----------------");
		for (Car x : arr) {
			if (x.isAvailable)
				found++;
		}
		System.out.println(found);
	}
}

class Car {
	String name;
	boolean isAvailable;
	int pricePerHour; // price in $
	int id;

	public Car(String name, boolean isAvailable, int pricePerHour, int id) {
		this.name = name;
		this.isAvailable = isAvailable;
		this.pricePerHour = pricePerHour;
		this.id = id;
	}

	public String toString() {
		return "Name: " + name + "\nAvailable: " + isAvailable + "\nPrice per hour: $" + pricePerHour
				+ "\n+–----------------+";
	}
}

//	Other Codes
/*
 * for (int x : small.availability) { if (x == userid) { found = true; break; }
 * System.out.println(found); }
 */