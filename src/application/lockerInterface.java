package application;

public interface lockerInterface {
	String getColor();
//  Get the lockers Color

	int getDoor();
//  Get the Locker Doors Number

	int getAvalability();
//  Get how many locker still available for signed in user to rent.
//    This will apply to small, medium and large locker.

	int setAvailability();
//  Default: 1
//  Rented: 'User's ID Number'
//  For loop will check for the number, if '0' then it will be shown to "Rent Locker" UI, if have ID number then it will shown in "User"s UI

	String toString();
//  This will be use to debug in the programmer's console, just printout all the current Locker status for debug purpose.
}
