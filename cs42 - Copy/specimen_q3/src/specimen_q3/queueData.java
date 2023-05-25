package specimen_q3;

import java.util.Scanner;
import java.io.*;

public class queueData {

	static String[] QueueData = new String[20];
	static int startPointer = 0;
	static int endPointer = 0;

	public static void main(String args[]) {
		int n = ReadFile();
		if (n == 2) {
			System.out.println("The queue was full");
		}
		if (n == 1) {
			System.out.println("All items were added to the queue");
		}
		if (n == -1) {
			System.out.println("The file was not found");
		}
		System.out.println(Remove());

	}

	public static boolean Enqueue(String dataAdded) {

		if (endPointer >= 19) {
			return false;
		} else {
			QueueData[endPointer] = dataAdded;
			endPointer = endPointer + 1;
			return true;
		}

	}

	public static int ReadFile() {
		System.out.println("Please enter a file name:");
		Scanner scanner = new Scanner(System.in);
		String fileInput = scanner.nextLine();
		String lineStringPlaceHolder;
		int lineNumber = 0;
		try {
			FileReader x = new FileReader(fileInput);
			BufferedReader in = new BufferedReader(x);
			while (in.ready()) {
				lineStringPlaceHolder = in.readLine();
				lineNumber = lineNumber + 1;
			}
		} catch (Exception e) {
			return -1;
		}

		if (lineNumber > 20) {
			return 2;
		}
		

		try {
			FileReader f = new FileReader(fileInput);
			BufferedReader Reader = new BufferedReader(f);
			String s = "";

			for (int i = 0; i < 20; i++) {
				QueueData[i] = Reader.readLine();
				endPointer = endPointer + 1;
			}
			return 1;
		} catch (IOException ex) {
			return -1;
		}
	}

	public static String Remove() {
		String returnRemove = "";
		if ((endPointer - startPointer) > 2) {
			returnRemove = QueueData[startPointer] + " " + QueueData[startPointer + 1];
			startPointer = startPointer + 2;
		} else {
			returnRemove = "No Items";
		}

		return returnRemove;
	}
}
