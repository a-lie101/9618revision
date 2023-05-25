package jun_21_41_1;

public class node {
	public int data = 0;
	public int nextNode = 0;

	public node(int data, int nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public static void main(String args[]) {
		node[] linkedList = new node[10];

		linkedList[0] = new node(1, 1);
		linkedList[1] = new node(5, 4);
		linkedList[2] = new node(6, 7);
		linkedList[3] = new node(7, -1);
		linkedList[4] = new node(2, 2);
		linkedList[5] = new node(0, 6);
		linkedList[6] = new node(0, 8);
		linkedList[7] = new node(56, 3);
		linkedList[8] = new node(0, 9);
		linkedList[9] = new node(0, -1);

		int startPointer = 0;
		int emptyList = 5;

		outputNodes(linkedList, startPointer);
		System.out.println("added: " + addNode(linkedList, startPointer, emptyList, 5));
		outputNodes(linkedList, startPointer);
	}

	public static void outputNodes(node[] linkedList, Integer startPointer) {

		while (startPointer != -1) {
			System.out.println(linkedList[startPointer].data);
			startPointer = linkedList[startPointer].nextNode;
		}
	}

	public static boolean addNode(node[] arr, int startPointer, int emptyList, int inputData) {
		if (emptyList < 0 || emptyList > 9) {
			return false;
		}
		int prevPointer;
		node newNode;
		newNode = new node(inputData, -1);
		arr[emptyList] = newNode;
		prevPointer = 0;
		while (startPointer != -1) {
			prevPointer = startPointer;
			startPointer = arr[startPointer].nextNode;
		}
		arr[prevPointer].nextNode = emptyList;
		emptyList = arr[emptyList].nextNode;
		return true;
	}

}
