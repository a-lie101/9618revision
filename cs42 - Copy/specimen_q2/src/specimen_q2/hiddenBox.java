package specimen_q2;

import java.util.Scanner;

public class hiddenBox {
	private String boxName;
	private String creator;
	private String dateHidden;
	private String gameLocation;
	private String[][] lastFinds = new String[10][2];
	private boolean active;

	// box name, creator, date hidden and game location as parameters
	public hiddenBox(String boxNAME, String CREATOR, String dateHIDDEN, String gameLOCATION) {
		this.boxName = boxNAME;
		this.creator = CREATOR;
		this.dateHidden = dateHIDDEN;
		this.gameLocation = gameLOCATION;
		this.active = false;

		for (int i = 0; i < 9; i++) {
			for (int c = 0; c < 1; c++) {
				lastFinds[i][c] = "";
			}
		}
	}

	public String getBoxName() {
		return boxName;
	}

	public String getGameLocation() {
		return gameLocation;
	}

	public static void main(String args[]) {
		hiddenBox[] theBoxes = new hiddenBox[10000];
		int numBoxes = 10000;
		numBoxes = NewBox(theBoxes, numBoxes);

	}

	public static int NewBox(hiddenBox[] TheBoxes, int NumBoxes) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the box");
		String BoxName = scanner.nextLine();
		System.out.println("Enter the creator’s name");
		String Creator = scanner.nextLine();
		System.out.println("Enter the location of the box");
		String Location = scanner.nextLine();
		System.out.println("Enter the date the box was hidden");
		String DateHidden = scanner.nextLine();
		TheBoxes[NumBoxes] = new hiddenBox(BoxName, Creator, DateHidden, Location);

		return (NumBoxes + 1);
	}
}
