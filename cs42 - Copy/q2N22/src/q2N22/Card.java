package q2N22;


public class Card {
	private int number;
	private String colour;
	
	public Card(int Number1, String Colour1) {
		setNumber(Number1);
		setColour(Colour1);
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
	