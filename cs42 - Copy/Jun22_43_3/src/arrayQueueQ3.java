import java.util.Scanner;

public class arrayQueueQ3 {
	static int head = 0;
	static int tail = 0;
	static int items = 0;

	public static void main(String[] args) {

		String input;
		String[] queueArray = new String[10];
		System.out.println("Add 11 data items to the array");
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 11; i++) {
			input = scanner.nextLine();

			if (enqueue(queueArray, input) == true) {
				System.out.println("The addition was successful");
			} else {
				System.out.println("The addition was NOT successful");
			}
		}

		
		System.out.println(Dequeue(queueArray));
		System.out.println(Dequeue(queueArray));

	}

	public static boolean enqueue(String[] queueArr, String dataToAdd) {
		if (items == 10) {
			return false;
		}
		queueArr[tail] = dataToAdd;
		if (tail >= 9) {
			tail = 0;
		} else {
			tail = tail + 1;
		}
		items = items + 1;
		return true;
	}

	public static String Dequeue(String[] queueArr) {
		
		if (items == 0) {
			return "FALSE";
		} else {
			items = items - 1;

			if (head >= 9) {
				head = 0;
			}
			head = head + 1;
			if (head == 1) {
				return queueArr[0];
			}
			return queueArr[head]; 
			
			
		}
	}

}
