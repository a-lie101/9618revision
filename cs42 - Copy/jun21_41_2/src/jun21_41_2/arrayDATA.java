package jun21_41_2;
import java.lang.reflect.Array;
import java.util.Scanner;
public class arrayDATA {
	public static int[] arrayData = new int[10];
	public static void main(String args[]) {
	
		arrayData[0] = 10;
		arrayData[1] = 5;
		arrayData[2] = 6;
		arrayData[3] = 7;
		arrayData[4] = 1;
		arrayData[5] = 12;
		arrayData[6] = 13;
		arrayData[7] = 15;
		arrayData[8] = 21;
		arrayData[9] = 8;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number to find in the array");
		int input = scanner.nextInt();
		System.out.println("Data found: " + linearSearch(input));
		
		bubbleSort();
		outputArray();
	}
	public static boolean linearSearch(int dataToFind) {
		boolean returnValue = false;
		for (int i = 0; i<arrayData.length; i++) {
			if (arrayData[i] == dataToFind) {
				returnValue = true;
			}
		}
		return returnValue;
	}
	
	public static void bubbleSort() {
		int temp = 0;
		for (int x = 0; x<arrayData.length;x++) {
			for (int y = 1; y<arrayData.length-x; y++) {
				if (arrayData[y] > arrayData[y-1]) {
					temp = arrayData[y];
					arrayData[y] = arrayData[y-1];
					arrayData[y-1] = temp;
							
				}
				
			}
		}
	}
	
	public static void outputArray() {
		for (int i = 0; i< arrayData.length;i++) {
			System.out.println(arrayData[i]);
		}
	}
	
	
}
