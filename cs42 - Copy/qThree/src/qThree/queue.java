package qThree;

//November 2022 42 question 3
public class queue {
	public static Integer[] queue = new Integer[100];
	public static Integer HeadPointer = -1;
	public static Integer TailPointer = 0;

	public static void main(String args[]) {
		Boolean success = false;
		for (Integer count = 1; count <= 20; count++) {
			success = Enqueue(count);
		}
		if (success == false) {
			System.out.println("Unsuccessful ");
		} else {
			System.out.println("Successful ");
		}

	}

	public static Boolean Enqueue(Integer Data) {
		if (TailPointer < 100) {
			if (HeadPointer == -1) {
				HeadPointer = 0;
			}
			queue[TailPointer] = Data;
			TailPointer = TailPointer + 1;
			return true;
		}
		return false;
	}

	public static Integer RecursiveOutput(Integer Start) {
		if (Start == 0) {
			return queue[Start];
		} else {
			return queue[Start] + RecursiveOutput(Start - 1);
		}
	}
}
