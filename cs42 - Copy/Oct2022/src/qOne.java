import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

public class qOne {
	static int[] dataArray = new int[100];
	static int i = 0;
	static int input = 0;

	static int c = 0;

	public static void main(String args[]) {
		readFile("IntegerData.txt");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number you want to find in the array:");
		input = scanner.nextInt();

		System.out.println("The number " + input + " appeared " + findValues() + " times in the file.");
		bubbleSort();
	}

	public static void readFile(String fileName) {
		BufferedReader in = null;

		try {
			in = new BufferedReader(new FileReader(fileName));
			String s;

			while (in.ready()) {
				s = in.readLine();
				dataArray[i] = Integer.parseInt(s);
				System.out.println(dataArray[i]);
				i = i + 1;
			}

		} catch (IOException e) {
			System.err.println("Error reading or processing file " + fileName);
			System.exit(-1);
		}

	}

	public static Integer findValues() {
		int inputN = 0;
		for (int i = 0; i < 100; i++) {
			if (dataArray[i] == input) {
				inputN += 1;
			}
		}
		return inputN;
	}

	public static void bubbleSort() {
		Integer Temp = 0;
		for (Integer I = 0; I < 100 - 1; I++) {
			for (Integer J = 0; J < 100 - I - 1; J++) {
				if (dataArray[J] > dataArray[J + 1]) {
					Temp = dataArray[J];
					dataArray[J] = dataArray[J + 1];
					dataArray[J + 1] = Temp;
				}
			}
		}
		for (Integer X = 0; X < 100; X++) {
			System.out.println(dataArray[X]);
		}
	}

}
