package qOne;
//November 2022 42 question 1
public class jobs {
	static int[][] jobs = new int[100][2];
	static int numberOfJobs = 0;

	public static void main(String args[]) {
		initialise();
		addJob(12, 10);
		addJob(526, 9);
		addJob(33, 8);
		addJob(12, 9);
		addJob(78, 1);
		insertionSort(jobs);
		printArray();
	}

	public static void initialise() {
		numberOfJobs = 0;
		for (int i = 0; i < 100; i++) {
			for (int c = 0; c < 2; c++) {
				jobs[i][c] = -1;
			}
		}
	}

	public static void addJob(int jobN, int priority) {

		if (numberOfJobs == 100) {
			System.out.println("Not Added");
		} else {
			jobs[numberOfJobs][0] = jobN;
			jobs[numberOfJobs][1] = priority;
			numberOfJobs += 1;
			System.out.println("Job added");
		}

	}

	public static void insertionSort(int[][] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i][1];
			int keyy = arr[i][0];
			int pos = i;
			while (pos > 0 && arr[pos - 1][1] > key) {
				arr[pos][1] = arr[pos - 1][1];
				arr[pos][0] = arr[pos - 1][0];
				pos = pos - 1;
			}
			arr[pos][1] = key;
			arr[pos][0] = keyy;
		}
	}

	public static void printArray() {
		for (int i = 0; i < 100; i++) {
			if (jobs[i][0] != -1) {
				System.out.println(jobs[i][0] + " priority " + jobs[i][1]);
			}
			
		}
	}

}
