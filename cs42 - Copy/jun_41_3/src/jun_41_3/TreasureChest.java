package jun_41_3;

import java.io.*;
import java.util.Scanner;

public class TreasureChest {
	private String question;
	private static int answer;
	private static int points;
	private static TreasureChest[] arrayTreasure = new TreasureChest[5];
	public TreasureChest(String question, int answer, int points) {
		this.question = question;
		this.answer = (answer);
		this.points = points;
	}


	public static void main(String args[]) {
		readData();
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		int input;
		int Qinput;
		TreasureChest q = new TreasureChest("", 0, 0);
		do {
			System.out.println("Enter the question number between 1 and 5");
			Qinput = scanner.nextInt();
			
			System.out.println("question: " + arrayTreasure[Qinput-1].getQuestion());
			input = scanner.nextInt();
			
			if (arrayTreasure[Qinput-1].checkAnswer(input)) {
				flag = true;
			}

			attempts = attempts + 1;
		} while (flag == false);
		
		System.out.println("you were awarded " + arrayTreasure[Qinput-1].getPoints(attempts) + " points!");
	}

	public static void readData() {
		String fileName = "TreasureChestData.txt";
		TreasureChest questions1 = new TreasureChest("", 0, 0);
		TreasureChest questions2 = new TreasureChest("", 0, 0);
		TreasureChest questions3 = new TreasureChest("", 0, 0);
		TreasureChest questions4 = new TreasureChest("", 0, 0);
		TreasureChest questions5 = new TreasureChest("", 0, 0);
		try {
			FileReader f = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(f);
			for (int i = 0; i < 3; i++) {
				questions1.question = reader.readLine();
				questions1.answer = reader.read();
				questions1.points = reader.read();
				
			}
			for (int i = 0; i < 3; i++) {
				questions2.question = reader.readLine();
				questions2.answer = reader.read();
				questions2.points = reader.read();
			}
			for (int i = 0; i < 3; i++) {
				questions3.question = reader.readLine();
				questions3.answer = reader.read();
				questions3.points = reader.read();
			}
			for (int i = 0; i < 3; i++) {
				questions4.question = reader.readLine();
				questions4.answer = reader.read();
				questions4.points = reader.read();
			}
			for (int i = 0; i < 3; i++) {
				questions5.question = reader.readLine();
				questions5.answer = reader.read();
				questions5.points = reader.read();
			}

		} catch (IOException e) {
			System.err.println("Error reading or processing file " + fileName);
			System.exit(-1);
		}
		
		arrayTreasure[0] = questions1;
		arrayTreasure[1] = questions2;
		arrayTreasure[2] = questions3;
		arrayTreasure[3] = questions4;
		arrayTreasure[4] = questions5;
		
	}

	public String getQuestion() {
		return question;
	}

	public static boolean checkAnswer(int inputAnswer) {
		if (inputAnswer == answer) {
			return true;
		} else {
			return false;
		}
	}

	public static int getPoints(int numOfAttempts) {
		if (numOfAttempts == 0) {
			return points;
		}
		if (numOfAttempts == 2) {
			return (points / 2);
		}
		if (numOfAttempts == 3 || numOfAttempts == 4) {
			return (points / 4);
		}
		return 0;
	}
}
