import java.util.*;

public class balloon {
	private String DefenseItem;
	private int health;
	private String colour;
	public balloon(String DefenseItem, String colour) {
		this.DefenseItem = DefenseItem;
		this.colour = colour;
		health = 100;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the defence item:");
		String defenseItemInput = (scanner.nextLine());
		System.out.println("Input the colour:");
		String colourInput = (scanner.nextLine());
		balloon Balloon1 = new balloon(defenseItemInput,colourInput);
		Defend(Balloon1);
		
	}
	
	
	public static balloon Defend(balloon ball)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the strength of the opponent");
		int strengthOpponent = scanner.nextInt();
		ball.changeHealth(ball.getHealth()-strengthOpponent);
		System.out.println(ball.getDefenseItem());
		if (ball.getHealth() > 0) {
			System.out.println("You still have health remaining");
		}
		else {
			System.out.println("You have no health remaining");
		}
		return ball;
	}
	public int getHealth() {
		return health;
	}
	public void changeHealth(int health) {
		this.health = health;
	}
	public boolean CheckHealth() {
		if (health <= 0)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

	public String getDefenseItem() {
		return DefenseItem;
	}

	public void setDefenseItem(String defenseItem) {
		DefenseItem = defenseItem;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
}
