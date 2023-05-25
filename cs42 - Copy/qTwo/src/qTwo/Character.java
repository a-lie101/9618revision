package qTwo;

import java.io.*;
import java.util.Scanner;

//November 2022 42 question 2
public class Character {
	private String name;
	private int x;
	private int y;

	public Character(String Namep, int xCoord, int yCoord) {
		name = Namep;
		x = xCoord;
		y = yCoord;
	}

	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void changePosition(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

	public static void main(String[] args) {
		
		String TextFile = "Characters.txt";
		String Name;
		int Xcoord = 0;
		int Ycoord = 0;
		boolean flag = false;
		String input;
		String inputMovement;
		int inputIndex = 0;
		Scanner scanner = new Scanner(System.in);
		Character[] character = new Character[10];
		boolean flag2 = false;

		try {
			FileReader f = new FileReader(TextFile);
			BufferedReader Reader = new BufferedReader(f);
			for (Integer X = 0; X < 10; X++) {
				Name = Reader.readLine();
				Xcoord = Integer.parseInt(Reader.readLine());
				Ycoord = Integer.parseInt(Reader.readLine());
				character[X] = new Character(Name,Xcoord,Ycoord);
			}
			Reader.close();
		}  catch (IOException ex) {
			System.out.println("No file found");
		}

		

		do {
			System.out.println("Enter a character to find from the array:");
			input = scanner.nextLine();
			for (int i = 0; i < 10; i++) {
				if (input.equals(character[i].getName())) {
					inputIndex = i;
					flag = true;
				}
			}

		} while (flag == false);

		do {
			System.out.println("Where would you like the player to move");
			inputMovement = scanner.nextLine();
			if (inputMovement.equals("W")) {
				character[inputIndex].changePosition(0,1);
				flag2 = true;
			}
			if (inputMovement.equals("A")) {
				
				character[inputIndex].changePosition(-1, 0);
				flag2 = true;
			}
			if (inputMovement.equals("S")) {
				character[inputIndex].changePosition(0,-1);
				flag2 = true;
			}
			if (inputMovement.equals("W")) {
				character[inputIndex].changePosition(1,0);
				flag2 = true;
			}

		} while (flag2 == false);
		System.out.println(character[inputIndex].getName() + " has changed coordinates to X = " + character[inputIndex].getX() + " Y = " + character[inputIndex].getY());
	}
	
}
