package application;

/*
 * This Main.java File will be divided into 4 Parts Handling:
 * 1) Sign In
 * 2) User Dashboard
 * 3) Locker Rent UI
 * 4) Checkout UI
 * */

public class Main {
	public static void main(String[] args) {

//		int a = 0;
//		Hardcode The Owner
		/**/
//		Make 3 Owner Object, their own name, pin 
//		the owner will take their own locker hardcode

//		Owner owner1 = new Owner("testing", 123, 011100, 123, "testing", 45.0);
//		Owner owner2 = new Owner("testing", 1234, 011100, 123, "testing", 45.0);
//		Owner owner3 = new Owner("testing", 12345, 011100, 123, "testing", 45.0);
		Owner owner = new Owner("Stringing", 123, 011101010, 123, "3", 0.0);

//		largeLocker large = new largeLocker();
//		System.out.println("Number of Doors: " + large.door);
//		System.out.println(large.getDoor());
//		int a = large.door;
//		System.out.println(a);

//		owner1("testing", 123, 011100, 123, "testing", 45.0);

		smallLocker small = new smallLocker();
//		System.out.println("The Price: " + small.price);
		System.out.println(!small.availability); // Output: false (not available)
		System.out.println(small.availability); // Output: true (available)
		System.out.println();

//		System.out.print(Arrays.toString(small.availability)); // Check value of Availability
//		for (int i = 0; i > small.availability.length; i++) {
//		}
//		small.getColor();
//		System.out.println();
//		smallLocker[] small = new smallLocker[3];
//		System.out.println(Arrays.toString(small));

	}
}
