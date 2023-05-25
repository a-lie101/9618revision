package sorts;

public class sort {
	public static void main(String args[]) {
		int[] arr = { 10, 14, 28, 11, 7, 16, 30, 50, 25, 18};
		bubbleSort(arr);
		insertionSort(arr);
		for (int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] intArray) {
		int temp = 0;

		for (int i = 0; i < intArray.length; i++) {

			for (int j = 1; j < (intArray.length - i); j++) {
				if (intArray[j - 1] > intArray[j]) {
				
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;

				}

			}
		} 

	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int pos = i;
			while (pos > 0 && arr[pos - 1] > key) {
				arr[pos] = arr[pos - 1];
				pos = pos - 1;
			}
			arr[pos] = key;
		}
	}

}
