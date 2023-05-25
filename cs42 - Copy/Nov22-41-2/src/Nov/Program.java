package Nov;


public class Program {
	public static void main(String args[]) {
		Card red1 = new Card(1, "red");
		Card red2 = new Card(2, "red");
		Card red3 = new Card(3, "red");
		Card red4 = new Card(4, "red");
		Card red5 = new Card(5, "red");
		Card blue1 = new Card(1, "blue");
		Card blue2 = new Card(2, "blue");
		Card blue3 = new Card(3, "blue");
		Card blue4 = new Card(4, "blue");
		Card blue5 = new Card(5, "blue");
		Card yellow1 = new Card(1, "yellow");
		Card yellow2 = new Card(2, "yellow");
		Card yellow3 = new Card(3, "yellow");
		Card yellow4 = new Card(4, "yellow");
		Card yellow5 = new Card(5, "yellow");

		Hand player1 = new Hand(red1, red2, red3, red4, yellow1);
		Hand player2 = new Hand(yellow2, yellow3, yellow4, yellow5, blue1);
		if (CalculateValue(player1) > CalculateValue(player2)) {
			System.out.println("player 1 has a higher score");
		}
		else if (CalculateValue(player1) < CalculateValue(player2)){
			System.out.println("player 2 has a higher score");
		}
		else {
			System.out.println("draw! both players have the same score.");
		}

	}

	public static int CalculateValue(Hand Player) {
		int Score = 0;
		String Colour;
		Card CardGot;
		for (int X = 0; X < 5; X++) {
			CardGot = Player.getCard(X);
			Score = Score + CardGot.getNumber();
			Colour = CardGot.getColour();
			if (Colour == "red") {
				Score = Score + 5;
			} else if (Colour == "blue") {
				Score = Score + 10;
			} else {
				Score = Score + 15;
			}
		}
		return Score;
	}
}
