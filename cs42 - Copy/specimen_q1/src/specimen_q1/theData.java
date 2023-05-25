package specimen_q1;
import java.io.*;
import java.util.Scanner;
public class theData {
	static int[] theData = new int[9];

	public static void main(String[] args) {

		theData[0] = 20;
		theData[1] = 3;
		theData[2] = 4;
		theData[3] = 8;
		theData[4] = 12;
		theData[5] = 99;
		theData[6] = 4;
		theData[7] = 26;
		theData[8] = 4;
		System.out.println("Here is the unsorted array:");
		printArray();
		insertionSort();
		System.out.println("");
		System.out.println("");
		System.out.println("Here is the sorted array:");
		printArray();
		
		System.out.println(findNumber());
		System.out.println(findNumber());
	}
	
	public static void printArray() {
		for (int i = 0; i<theData.length;i++) {
			System.out.println(theData[i]);
		}
	}
	
	public static boolean findNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to find:");
		int input = scanner.nextInt();
		boolean check = false;
		for (int c = 0; c<theData.length; c++) {
			if (theData[c] == (input)) {
				check = true;
			}
		}
		return check;
	}

	public static void insertionSort() {
		int temp = 0;

		for (int i = 0; i < theData.length; i++) {

			for (int j = 1; j < (theData.length - i); j++) {
				if (theData[j - 1] > theData[j]) {
					// swap the elements!
					temp = theData[j - 1];
					theData[j - 1] = theData[j];
					theData[j] = temp;

				}

			}
		}

	}
	
	

}
