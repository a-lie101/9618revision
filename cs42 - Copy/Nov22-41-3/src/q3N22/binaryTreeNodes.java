
package q3N22;

public class binaryTreeNodes {
	public static int[][] arrayNodes = new int[20][3];

	public static void main(String args[]) {
		int leftPointer = -1;
		int rightPointer = -1;
		int data = -1;
		int freeNode = 6;
		int rootPointer = 0;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 3; j++) {
				arrayNodes[i][j] = -1;
			}
		}

		arrayNodes[0][0] = 1;
		arrayNodes[0][1] = 20;
		arrayNodes[0][2] = 5;
		arrayNodes[1][0] = 2;
		arrayNodes[1][1] = 15;
		arrayNodes[1][2] = -1;
		arrayNodes[2][0] = -1;
		arrayNodes[2][1] = 3;
		arrayNodes[2][2] = 3;
		arrayNodes[3][0] = -1;
		arrayNodes[3][1] = 9;
		arrayNodes[3][2] = 4;
		arrayNodes[4][0] = -1;
		arrayNodes[4][1] = 10;
		arrayNodes[4][2] = -1;
		arrayNodes[5][0] = -1;
		arrayNodes[5][1] = 58;
		arrayNodes[5][2] = -1;
		
		System.out.println("found at " + searchValue(rootPointer, 15));
		postOrder(rootPointer);

	}
	public static int searchValue(int root, int valueToFind) {
		if (root == -1) {
			return -1;
		}
		//root[][1] is right data
		else {
			if (arrayNodes[root][1] == valueToFind) {
				return root;
			}
			else if (arrayNodes[root][1] == -1) {
				return -1;
			}
		}
		if (arrayNodes[root][1] > valueToFind) {
			return searchValue(arrayNodes[root][0], valueToFind);// recursion with left side pointer as the root
		}
		if (arrayNodes[root][1] < valueToFind) {
			return searchValue(arrayNodes[root][2], valueToFind);//recursion with the right hand side pointer as the root
		}
		return -1;
	}//so initial search with everything is for -1, == value, >, < and the search is with valueToFind and the data
	
	/* 
	 * searchValue in binary trees is recursion
	 * 
	 */
	public static void postOrder(int root) {
		if (arrayNodes[root][0] != -1) {
			postOrder(arrayNodes[root][0]);
		}
		if (arrayNodes[root][2] != -1) {
			postOrder(arrayNodes[root][2]);
		}
		System.out.println(arrayNodes[root][1]);
	}

}

