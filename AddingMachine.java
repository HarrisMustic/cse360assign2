// Assignment #: 2
//         Name: Harris Mustic
//    StudentID: 1209221893
//  Lab Lecture: Wednesday 9:40-10:30
//  Description: Learn how to use github

package cse360assign2;

public class AddingMachine {

		// added allTotals to keep a list of all integer values of the calculations made.
	
	private int total;
	private int[] allTotals;
	
		// My Adding Machine is made up of a runtime current total integer value, and a integer list of all
		// the values that have been passed through into this machine.
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		allTotals = new int[0];

	}
	
		// returns the total value.
	public int getTotal () {
		return total;
	}
		// added to the total value of the machine by value ammount. 
		// adds value into the total array.
		// this is done by creating a temp array with the size of the current total array plus 1.
	public void add (int value) {
		total += value;
		
		int[] temp = new int[allTotals.length + 1];
		int i = 0;
		for(i = 0; i < allTotals.length; i++) {
			temp[i] = allTotals[i];
		}
		temp[i] = value;
		
		allTotals = temp;
		
	}
		// subtracts to the total value of the machine by value ammount. 
		// adds value into the total array.
		// this is done by creating a temp array with the size of the current total array plus 1.
	public void subtract (int value) {
		total -= value;
		
		int[] temp = new int[allTotals.length + 1];
		int i = 0;
		for(i = 0; i < allTotals.length; i++) {
			temp[i] = allTotals[i];
		}
		temp[i] = value * -1;
		
		allTotals = temp;
	}
		// Prints the string of all the operations done to the machine, using the values added to the total array.
	public String toString () {
		String answer = "0";
		
		for(int i = 0; i < allTotals.length; i++) {
			if(allTotals[i] < 0) {
				answer += (" - " +String.valueOf(-1 * allTotals[i]) );
			}
			else {
				answer += (" + " +String.valueOf(allTotals[i]) );
			}
		}
		
		return answer;
		}

	public void clear() {
	
	}
}
