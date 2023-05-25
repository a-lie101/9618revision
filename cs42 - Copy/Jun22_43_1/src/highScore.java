import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;

public class highScore {

	public static void main(String[] args) {

		String scoresN = null;
		String scoresI = null;

		readHighScores("sort.txt", scoresN, scoresI);
		Boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name (3 letters):");
		do {
			scoresN = scanner.nextLine();

		} while (scoresN.length() != 3);
		System.out.println("Please enter your score (1 to 100000):");
		scoresI = scanner.nextLine();
		do {

			if ((Integer.parseInt(scoresI) < 100001) && (Integer.parseInt(scoresI) > 0)) {
				flag = false;
			} else {
				scoresI = scanner.nextLine();
			}
		} while (flag == true);

		readHighScores("sort.txt", scoresN, scoresI);

	}

	public static void readHighScores(String fileName, String iN, String iS) {

		int lineNumber = 0;
		BufferedReader in = null;
		String l;
		int i = 0;

		int indexN = 0;
		int indexS = 0;

		try {
			FileReader x = new FileReader(fileName);
			in = new BufferedReader(x);
			while (in.ready()) {
				l = in.readLine();
				lineNumber = lineNumber + 1;
			}
		} catch (IOException e) {
			System.exit(-1);
		}

		in = null;
		String[] names = new String[11];
		String[] scores = new String[11];

		try {
			in = new BufferedReader(new FileReader(fileName));
			String s;

			while (in.ready()) {
				s = in.readLine();

				if ((i % 2) == 0) {
					names[indexN] = s;
					indexN += 1;
				}
				if ((i % 2) != 0) {
					scores[indexS] = s;
					indexS += 1;
				}

				i = i + 1;

			}
			names[10] = iN;
			scores[10] = iS;

			sort_sub(scores, names, 10);
			OutputHighScores(names, scores);
			WriteTopTen(names, scores);

		} catch (IOException e) {
			System.err.println("Error reading or processing file " + fileName);
			System.exit(-1);
		}

	}

	public static void OutputHighScores(String[] names, String[] scores) {
		for (int f = 0; f < 11; f++) {

			System.out.println(names[f] + " " + scores[f]);

		}
	}

	public static String[] sort_sub(String array[], String arr[], int f) {
		String temp = "";
		String tempo = "";
		for (int i = 0; i < f; i++) {
			for (int j = i + 1; j < f; j++) {
				if (Integer.parseInt(array[i]) > Integer.parseInt((array[j]))) {
					temp = array[i];
					tempo = arr[i];
					array[i] = array[j];
					arr[i] = arr[j];
					array[j] = temp;
					arr[j] = tempo;
				}
			}
		}
		return array;
	}

	public static void WriteTopTen(String[] names, String[] scores) {
		String FileName = "NewHighScore.txt";
		try {
			FileWriter F = new FileWriter(FileName);
			BufferedWriter Out = new BufferedWriter(F);
			for (int k = 0; k < 10; k++) {
				Out.write(names[k]);
				Out.write(scores[k]);
			}
			Out.close();
		} catch (Exception e) {
			System.err.println("No file");
		}
	}

}
